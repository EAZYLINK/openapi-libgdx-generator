package org.openaitools.client;

import org.openaitools.client.api.*;
import org.openaitools.client.Configuration;

public class ApiClient {
    private final Configuration config;
    private String baseUrl;

    public ApiClient(Configuration config) {
        this.config = config;
        this.baseUrl = config.getBaseUrl();
    }

    public org.openaitools.client.api.UserApi getUserApi() {
        return new org.openaitools.client.api.UserApiImpl(baseUrl);
    }

    public org.openaitools.client.api.BanApi getBanApi() {
        return new org.openaitools.client.api.BanApiImpl(baseUrl);
    }

    public org.openaitools.client.api.DynatCategoryApi getDynatCategoryApi() {
        return new org.openaitools.client.api.DynatCategoryApiImpl(baseUrl);
    }

    public org.openaitools.client.api.AuditEntitySnapshotApi getAuditEntitySnapshotApi() {
        return new org.openaitools.client.api.AuditEntitySnapshotApiImpl(baseUrl);
    }
}
