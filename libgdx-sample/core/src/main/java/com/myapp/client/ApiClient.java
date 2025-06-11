package com.myapp.client;

import com.myapp.client.api.*;
import com.myapp.client.Configuration;

import com.myapp.client.api.AuditEntitySnapshot.AuditEntitySnapshotApiImpl;
import com.myapp.client.api.AuditEntitySnapshot.AuditEntitySnapshotApi;
import com.myapp.client.api.Authentication.AuthenticationApiImpl;
import com.myapp.client.api.Authentication.AuthenticationApi;
import com.myapp.client.api.Ban.BanApiImpl;
import com.myapp.client.api.Ban.BanApi;
import com.myapp.client.api.DynatCategory.DynatCategoryApiImpl;
import com.myapp.client.api.DynatCategory.DynatCategoryApi;
import com.myapp.client.api.User.UserApiImpl;
import com.myapp.client.api.User.UserApi;

public class ApiClient {
    private final Configuration config;
    private String baseUrl;
    public ApiClient(Configuration config) {
        this.config = config;
        this.baseUrl = config.getBaseUrl();
    }

    public AuditEntitySnapshotApi getAuditEntitySnapshotApi() {
    	return new AuditEntitySnapshotApiImpl(baseUrl);
    }
    public AuthenticationApi getAuthenticationApi() {
    	return new AuthenticationApiImpl(baseUrl);
    }
    public BanApi getBanApi() {
    	return new BanApiImpl(baseUrl);
    }
    public DynatCategoryApi getDynatCategoryApi() {
    	return new DynatCategoryApiImpl(baseUrl);
    }
    public UserApi getUserApi() {
    	return new UserApiImpl(baseUrl);
    }
}
