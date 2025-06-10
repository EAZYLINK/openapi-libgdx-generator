package com.myapp.client;

import com.myapp.client.api.*;
import com.myapp.client.Configuration;

public class ApiClient {
    private final Configuration config;
    private String baseUrl;

    public ApiClient(Configuration config) {
        this.config = config;
        this.baseUrl = config.getBaseUrl();
    }

    public UserApi getUserApi() {
        return new UserApiImpl(baseUrl);
    }

    public BanApi getBanApi() {
        return new BanApiImpl(baseUrl);
    }

    public DynatCategoryApi getDynatCategoryApi() {
        return new DynatCategoryApiImpl(baseUrl);
    }

    public AuditEntitySnapshotApi getAuditEntitySnapshotApi() {
        return new AuditEntitySnapshotApiImpl(baseUrl);
    }
}
