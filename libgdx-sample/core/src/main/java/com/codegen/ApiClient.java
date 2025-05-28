package com.codegen;

import com.codegen.api.*;

public class ApiClient {
    private final Configuration config;

    public ApiClient(String baseUrl) {
        this.config = new Configuration(baseUrl);
    }

    public com.codegen.api.UserApi getUserApi() {
        return new com.codegen.api.UserApiImpl(config);
    }

    public com.codegen.api.BanApi getBanApi() {
        return new com.codegen.api.BanApiImpl(config);
    }

    public com.codegen.api.DynatCategoryApi getDynatCategoryApi() {
        return new com.codegen.api.DynatCategoryApiImpl(config);
    }

    public com.codegen.api.AuditEntitySnapshotApi getAuditEntitySnapshotApi() {
        return new com.codegen.api.AuditEntitySnapshotApiImpl(config);
    }
}
