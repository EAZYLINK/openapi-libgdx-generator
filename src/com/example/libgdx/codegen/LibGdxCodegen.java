package com.example.libgdx.codegen;

import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.*;
import org.openapitools.codegen.model.ModelMap;
import org.openapitools.codegen.model.OperationsMap;
import org.openapitools.codegen.utils.ModelUtils;

import java.io.File;
import java.util.*;

public class LibGdxCodegen extends AbstractJavaCodegen {
    protected String sourceFolder = "src";
    protected String packageName = "com.example.api";

    public LibGdxCodegen() {
        super();
        embeddedTemplateDir = templateDir = "libgdx";
        sourceFolder = "src";
        invokerPackage = "com.example.api.client";
        apiPackage = "com.example.api";
        modelPackage = "com.example.api.model";
        outputFolder = "generated-code/libgdx";

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

        cliOptions.add(new CliOption("packageName", "Base package name for generated code").defaultValue("com.example.api"));
    }

    @Override
    public String getName() {
        return "libgdx";
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
    public void processOpts() {
        super.processOpts();
        if (additionalProperties.containsKey("packageName")) {
            setPackageName((String) additionalProperties.get("packageName"));
            invokerPackage = packageName + ".client";
        }

        apiTemplateFiles.put("api.mustache", ".java");
        apiTemplateFiles.put("apiImpl.mustache", "Impl.java");
        modelTemplateFiles.put("model.mustache", ".java");
        supportingFiles.add(new SupportingFile("configuration.mustache", "", "Configuration.java"));
        supportingFiles.add(new SupportingFile("apiClient.mustache", "", "ApiClient.java"));
    }

    @Override
    public String modelFileFolder() {
        return outputFolder + File.separator + sourceFolder + File.separator + modelPackage().replace('.', File.separatorChar);
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}