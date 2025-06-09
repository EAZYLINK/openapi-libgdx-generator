package libgdx.client;

import libgdx.client.api.*;
import libgdx.client.Configuration;

public class ApiClient {
    private final Configuration config;
    private String baseUrl;

    public ApiClient(Configuration config) {
        this.config = config;
        this.baseUrl = config.getBaseUrl();
    }

    public libgdx.client.api.UserApi getUserApi() {
        return new libgdx.client.api.UserApiImpl(baseUrl);
    }

    public libgdx.client.api.BanApi getBanApi() {
        return new libgdx.client.api.BanApiImpl(baseUrl);
    }

    public libgdx.client.api.DynatCategoryApi getDynatCategoryApi() {
        return new libgdx.client.api.DynatCategoryApiImpl(baseUrl);
    }

    public libgdx.client.api.AuditEntitySnapshotApi getAuditEntitySnapshotApi() {
        return new libgdx.client.api.AuditEntitySnapshotApiImpl(baseUrl);
    }
}
