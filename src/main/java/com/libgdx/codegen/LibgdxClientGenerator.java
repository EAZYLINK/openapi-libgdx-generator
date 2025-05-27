package com.libgdx.codegen;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenParameter;
import org.openapitools.codegen.CodegenType;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.AbstractJavaCodegen;
import org.openapitools.codegen.model.ModelMap;
import org.openapitools.codegen.model.OperationMap;
import org.openapitools.codegen.model.OperationsMap;

public class LibgdxClientGenerator extends AbstractJavaCodegen implements CodegenConfig {

    protected String sourceFolder = "src/api";
    protected String apiVersion = "1.0.0";

    public LibgdxClientGenerator() {
        super();

        // Set output folder for generated code
        outputFolder = "libgdx-sample/core";
        

        // Set API and model package names
        apiPackage = "api";
        modelPackage = "model";
        testPackage = "test.api";
        templateDir = "libgdx";

        // Java file suffix
        apiTemplateFiles.put("api.mustache", ".java");
        modelTemplateFiles.put("model.mustache", ".java");
        apiTestTemplateFiles.put("api_test.mustache", ".java");
        modelDocTemplateFiles.put("model_doc.mustache", ".java");
        apiDocTemplateFiles.put("api_doc.mustache", ".md");

        // Reserved words
        reservedWords = new HashSet<>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case"));

        // Language-specific types
        languageSpecificPrimitives = new HashSet<>(Arrays.asList(
            "String", "boolean", "Boolean", "Double", "Integer", "Long", "Float"
        ));

        // Type mapping (OpenAPI types to Java types)
        typeMapping.put("integer", "Integer");
        typeMapping.put("long", "Long");
        typeMapping.put("number", "Double");
        typeMapping.put("float", "Float");
        typeMapping.put("double", "Double");
        typeMapping.put("boolean", "Boolean");
        typeMapping.put("string", "String");
        typeMapping.put("array", "List");
        typeMapping.put("map", "Map");
        typeMapping.put("object", "Object");
        typeMapping.put("file", "File");

        // Package info passed to templates
        additionalProperties.put("apiVersion", apiVersion);
        additionalProperties.put("apiPackage", apiPackage);
        additionalProperties.put("modelPackage", modelPackage);
        additionalProperties.put("testPackage", testPackage);

        // Supporting files (optional)
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    @Override
    public String getName() {
        return "libgdx";
    }

    @Override
    public String getHelp() {
        return "Generates a LibGDX-compatible Java client using Gdx.net and Json utilities.";
    }

    @Override
    public String apiFileFolder() {
    	return outputFolder + "/" + sourceFolder + "/" + apiPackage().replace('.', File.separatorChar);
    }

    @Override
    public String modelFileFolder() {
        return outputFolder + "/" + sourceFolder + "/" + modelPackage().replace('.', File.separatorChar);
      }

    @Override
    public String apiTestFileFolder() {
        return outputFolder + "/" + sourceFolder + "/test/" + apiPackage().replace('.', File.separatorChar);
    }

    @Override
    public String escapeReservedWord(String name) {
        return "_" + name;
    }

    @Override
    public String escapeQuotationMark(String input) {
        return input.replace("\"", "\\\"");
    }

    @Override
    public String escapeUnsafeCharacters(String input) {
        return input.replace("*/", "*_/");
    }

    /**
     * Optional post-processing of operations. Add your custom logic here.
     */
    @Override
    public OperationsMap postProcessOperationsWithModels(OperationsMap objs, List<ModelMap> allModels) {
        OperationsMap results = super.postProcessOperationsWithModels(objs, allModels);
        OperationMap ops = results.getOperations();
        List<CodegenOperation> opList = ops.getOperation();

        for (CodegenOperation op : opList) {
            // Example modification: lowercase HTTP method
            op.httpMethod = op.httpMethod.toUpperCase(Locale.ROOT);

            // Normalize path (e.g., add /rest prefix)
            if (!op.path.startsWith("/rest")) {
                op.path = "/rest" + op.path;
            }

            // Handle query params for safe rendering
            if (op.queryParams != null) {
                for (CodegenParameter param : op.queryParams) {
                    if (param.isEnum) {
                        // Ensure enums are treated as strings
                        param.datatypeWithEnum = "String";
                        param.dataType = "String";
                    }
                }
            }
        }

        return results;
    }
}
