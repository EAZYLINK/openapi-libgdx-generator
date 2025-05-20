package com.example.libgdx;

import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.DefaultGenerator;

public class LibgdxCodegenRunner {
    public static void main(String[] args) {
        CodegenConfigurator configurator = new CodegenConfigurator();
        configurator.setGeneratorName("libgdx");
        configurator.setInputSpec("openapiDetailed.json"); // relative to root
        configurator.setOutputDir("generated-client");
        configurator.addAdditionalProperty("apiPackage", "com.api");
        configurator.addAdditionalProperty("modelPackage", "com.api.models");

        new DefaultGenerator().opts(configurator.toClientOptInput()).generate();
    }
}
