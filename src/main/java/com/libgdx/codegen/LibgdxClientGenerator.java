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
import org.openapitools.codegen.CliOption;

public class LibgdxClientGenerator extends AbstractJavaCodegen implements CodegenConfig {

    protected String sourceFolder = "src/main/java";
    protected String packageName = "com.codegen";
    protected String apiVersion = "1.0.0";

    public LibgdxClientGenerator() {
        super();

        // Set output folder for generated code
        outputFolder = "libgdx-sample/core";
        

        // Set API and model package names
        apiPackage = "com.codegen.api";
        modelPackage = "com.codegen.model";
        testPackage = "com.codegen.api";
        templateDir = "libgdx";


        // Reserved words
        reservedWords = new HashSet<>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case"));

        // Language-specific types
        languageSpecificPrimitives = new HashSet<>(Arrays.asList(
            "String", "boolean", "Boolean", "Double", "Integer", "Long", "Float"
        ));

        // Type mapping (OpenAPI types to Java types)
        additionalProperties.put("isGwtCompatible", true);
        additionalProperties.put("java8", false);
        additionalProperties.put("libgdx", true);

        typeMapping.put("array", "java.util.ArrayList");
        typeMapping.put("map", "java.util.HashMap");
        typeMapping.put("List", "java.util.ArrayList");
        typeMapping.put("boolean", "Boolean");
        typeMapping.put("string", "String");
        typeMapping.put("integer", "Integer");
        typeMapping.put("float", "Float");
        typeMapping.put("number", "Float");
        typeMapping.put("DateTime", "String");
        typeMapping.put("date", "String");
        typeMapping.put("UUID", "String");

        importMapping.put("ArrayList", "java.util.ArrayList");
        importMapping.put("HashMap", "java.util.HashMap");

        instantiationTypes.put("array", "java.util.ArrayList");
        instantiationTypes.put("map", "java.util.HashMap");

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
    	return new File(outputFolder, sourceFolder + File.separator + apiPackage().replace('.', File.separatorChar)).getPath();
    }

    @Override
    public String modelFileFolder() {
    	return new File(outputFolder, sourceFolder + File.separator + modelPackage().replace('.', File.separatorChar)).getPath();
      }

    @Override
    public String apiTestFileFolder() {
        return new File(outputFolder, "test" + File.separator + testPackage().replace('.', File.separatorChar)).getPath();
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
    
    @Override
    public void processOpts() {
        super.processOpts();
        if (additionalProperties.containsKey("packageName")) {
            setPackageName((String) additionalProperties.get("packageName"));
        }
        if (invokerPackage == null) {
            invokerPackage = packageName + ".client";
        }
        apiTemplateFiles.put("api.mustache", ".java");
        apiTemplateFiles.put("apiImpl.mustache", "Impl.java");
        modelTemplateFiles.put("model.mustache", ".java");
        apiTestTemplateFiles.put("api_test.mustache", ".java");
        modelDocTemplateFiles.put("model_doc.mustache", ".md");
        apiDocTemplateFiles.put("api_doc.mustache", ".md");
        supportingFiles.add(new SupportingFile("configuration.mustache", 
        	    sourceFolder + File.separator + invokerPackage.replace('.', File.separatorChar), 
        	    "Configuration.java"));
        supportingFiles.add(new SupportingFile("apiClient.mustache",
        	    sourceFolder + File.separator + invokerPackage.replace('.', File.separatorChar), 
        	    "ApiClient.java"));
    }

    /**
     * Optional post-processing of operations. Add your custom logic here.
     */
    public void setPackageName(String packageName) {
    	if (packageName != null && !packageName.isBlank()) {
    		this.apiPackage = packageName + ".api";
    		this.modelPackage = packageName + ".model";
    		this.testPackage = packageName + ".test.api";
    		
    	}
    }
    
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
