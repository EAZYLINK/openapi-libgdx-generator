package com.libgdx.codegen;

import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.*;
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
import org.openapitools.codegen.utils.ModelUtils;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class LibgdxClientGenerator extends AbstractJavaCodegen{

    protected String sourceFolder = "src/main/java";
    protected String testFolder = "src/test/java";
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
        invokerPackage = "com.codegen.client";
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

        importMapping.put("BigDecimal", "java.math.BigDecimal");
        importMapping.put("UUID", "java.util.UUID");
        importMapping.put("URI", "java.net.URI");
        importMapping.put("File", "java.io.File");
        importMapping.put("Date", "java.util.Date");
        importMapping.put("Timestamp", "java.sql.Timestamp");
        importMapping.put("Map", "java.util.Map");
        importMapping.put("HashMap", "java.util.HashMap");
        importMapping.put("Array", "java.util.List");
        importMapping.put("ArrayList", "java.util.ArrayList");
        importMapping.put("List", "java.util.*");
        importMapping.put("Set", "java.util.*");
        importMapping.put("LinkedHashSet", "java.util.LinkedHashSet");
        importMapping.put("DateTime", "org.joda.time.*");
        importMapping.put("LocalDateTime", "org.joda.time.*");
        importMapping.put("LocalDate", "org.joda.time.*");
        importMapping.put("LocalTime", "org.joda.time.*");

        // Package info passed to templates
        additionalProperties.put("apiVersion", apiVersion);
        additionalProperties.put("apiPackage", apiPackage);
        additionalProperties.put("modelPackage", modelPackage);
        additionalProperties.put("testPackage", testPackage);
        additionalProperties.put("invokerPackage", invokerPackage);

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
    public String toApiName(String name) {
        return initialCaps(name) + "Api";
    }

    @Override
    public String toModelName(String name) {
        return initialCaps(name);
    }

    private String initialCaps(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1);
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
        return new File(outputFolder, testFolder + File.separator + testPackage().replace('.', File.separatorChar)).getPath();
    }
    
    @Override
    public String modelTestFileFolder() {
        return new File(outputFolder, testFolder + File.separator + modelPackage().replace('.', File.separatorChar)).getPath();
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
         apiTemplateFiles.put("api.mustache", ".java");
        apiTemplateFiles.put("apiImpl.mustache", ".java");
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
    		this.testPackage = packageName + ".api";
    		this.invokerPackage = packageName + ".client";
    		
    	}
    }
    
    @Override
    public String getTypeDeclaration(Schema p) {
        if (ModelUtils.isArraySchema(p)) {
            Schema<?> items = p.getItems();
            return "java.util.ArrayList<" + getTypeDeclaration(items) + ">";
        } else if (ModelUtils.isMapSchema(p)) {
            Schema<?> inner = (Schema<?>) p.getAdditionalProperties();
            return "java.util.HashMap<String, " + getTypeDeclaration(inner) + ">";
        }
        return super.getTypeDeclaration(p);
    }

    
    @Override
    public OperationsMap postProcessOperationsWithModels(OperationsMap objs, List<ModelMap> allModels) {
        OperationsMap results = super.postProcessOperationsWithModels(objs, allModels);
        OperationMap ops = results.getOperations();
        List<CodegenOperation> opList = ops.getOperation();

        for (CodegenOperation op : opList) {
            // Existing logic
            op.httpMethod = op.httpMethod.toUpperCase(Locale.ROOT);
            if (!op.path.startsWith("/rest")) {
                op.path = "/rest" + op.path;
            }
            if (op.queryParams != null) {
                for (CodegenParameter param : op.queryParams) {
                    if (param.isEnum) {
                        param.datatypeWithEnum = "String";
                        param.dataType = "String";
                    }
                }
            }

            // Array return type handling
            String returnType = op.returnType;
            System.out.println("Operation: " + op.operationId + ", ReturnType: " + returnType); // Debug
            if (returnType != null && returnType.startsWith("java.util.ArrayList<")) {
                additionalProperties.put("collectionType", "java.util.ArrayList");
                String elementType = returnType.substring(20, returnType.length() - 1); // Start after '<'
                additionalProperties.put("elementType", elementType);
            } else {
                op.vendorExtensions.put("isArray", false);
            }
        }
        
        System.out.println("Logging model fields:");
        for (ModelMap model : allModels) {
            CodegenModel cm = model.getModel();
            String modelName = cm.getClassname();
            System.out.println("Model: " + modelName);

            List<CodegenProperty> properties = cm.getVars();
            List<CodegenProperty> vars = cm.getVars();
            additionalProperties.put("model", model);
        }
        return results;
    }
    
}
