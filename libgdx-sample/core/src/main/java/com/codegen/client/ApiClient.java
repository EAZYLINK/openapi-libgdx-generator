package com.codegen.client;

import com.codegen.api.*;
import com.codegen.client.Configuration;

public class ApiClient {
    private final Configuration config;
    private String baseUrl;

    public ApiClient(Configuration config) {
        this.config = config;
        this.baseUrl = config.getBaseUrl();
    }

    public com.codegen.api.UserApi getUserApi() {
        return new com.codegen.api.UserApiImpl(baseUrl);
    }

    public com.codegen.api.BanApi getBanApi() {
        return new com.codegen.api.BanApiImpl(baseUrl);
    }

    public com.codegen.api.DynatCategoryApi getDynatCategoryApi() {
        return new com.codegen.api.DynatCategoryApiImpl(baseUrl);
    }

    public com.codegen.api.AuditEntitySnapshotApi getAuditEntitySnapshotApi() {
        return new com.codegen.api.AuditEntitySnapshotApiImpl(baseUrl);
    }
}
