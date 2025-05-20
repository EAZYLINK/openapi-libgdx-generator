package com.example.libgdx;

import org.openapitools.codegen.languages.AbstractJavaCodegen;
import org.openapitools.codegen.*;

import java.util.*;

public class LibGdxCodegen extends AbstractJavaCodegen implements CodegenConfig {

    public LibGdxCodegen() {
        super();

        outputFolder = "generated-code/libgdx";
        apiPackage = "com.api";
        modelPackage = "com.api.models";
        templateDir = "libgdx";

        apiTemplateFiles.put("api.mustache", ".java");
        modelTemplateFiles.put("model.mustache", ".java");

        typeMapping.put("array", "Array");
        importMapping.put("Array", "com.badlogic.gdx.utils.Array");
    }

    @Override
    public String getName() {
        return "libgdx";
    }

    @Override
    public String getHelp() {
        return "Generates a GWT-compatible LibGDX API client.";
    }
}
