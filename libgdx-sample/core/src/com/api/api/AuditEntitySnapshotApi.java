package com.api.api;

import com.badlogic.gdx.Net.HttpRequest;
import com.badlogic.gdx.Net.HttpRequestBuilder;
import com.badlogic.gdx.Net.HttpResponseListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Json;

import java.util.Map;
import java.util.HashMap;
import java.net.URLEncoder;

public class AuditEntitySnapshotApi {

    private final Json json = new Json();

    private String buildQuery(Map<String, Object> params) {
        StringBuilder query = new StringBuilder();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                if (query.length() > 0) query.append("&");
                query.append(entry.getKey()).append("=")
                     .append(URLEncoder.encode(entry.getValue().toString()));
            }
        }
        return query.toString();
    }

    /**
     * Deletes the entity: audit_EntitySnapshot
     */
    public void entitiesAuditEntitySnapshotEntityIdDelete(
        String entityId, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/entities/audit_EntitySnapshot/{entityId}" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("DELETE")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * Gets a single entity by identifier: audit_EntitySnapshot
     */
    public void entitiesAuditEntitySnapshotEntityIdGet(
        String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("dynamicAttributes", dynamicAttributes);
        queryParams.put("returnNulls", returnNulls);
        queryParams.put("fetchPlan", fetchPlan);

        String query = buildQuery(queryParams);
        String url = "/rest/rest/entities/audit_EntitySnapshot/{entityId}" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("GET")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * Updates the entity: audit_EntitySnapshot
     */
    public void entitiesAuditEntitySnapshotEntityIdPut(
        String entityId, EntityAuditEntitySnapshot entityAuditEntitySnapshot, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/entities/audit_EntitySnapshot/{entityId}" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("PUT")
            .url(url);
        
        builder.header("Content-Type", "application/json");
        builder.content(json.toJson(entityAuditEntitySnapshot));

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * Gets a list of entities: audit_EntitySnapshot
     */
    public void entitiesAuditEntitySnapshotGet(
        Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("returnCount", returnCount);
        queryParams.put("offset", offset);
        queryParams.put("limit", limit);
        queryParams.put("sort", sort);
        queryParams.put("dynamicAttributes", dynamicAttributes);
        queryParams.put("returnNulls", returnNulls);
        queryParams.put("fetchPlan", fetchPlan);

        String query = buildQuery(queryParams);
        String url = "/rest/rest/entities/audit_EntitySnapshot" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("GET")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * Creates new entity: audit_EntitySnapshot
     */
    public void entitiesAuditEntitySnapshotPost(
        EntityAuditEntitySnapshot entityAuditEntitySnapshot, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/entities/audit_EntitySnapshot" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("POST")
            .url(url);
        
        builder.header("Content-Type", "application/json");
        builder.content(json.toJson(entityAuditEntitySnapshot));

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * Find entities by filter conditions: audit_EntitySnapshot
     */
    public void entitiesAuditEntitySnapshotSearchGet(
        String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("filter", filter);
        queryParams.put("returnCount", returnCount);
        queryParams.put("offset", offset);
        queryParams.put("limit", limit);
        queryParams.put("sort", sort);
        queryParams.put("dynamicAttributes", dynamicAttributes);
        queryParams.put("returnNulls", returnNulls);
        queryParams.put("fetchPlan", fetchPlan);

        String query = buildQuery(queryParams);
        String url = "/rest/rest/entities/audit_EntitySnapshot/search" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("GET")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * Find entities by filter conditions: audit_EntitySnapshot
     */
    public void entitiesAuditEntitySnapshotSearchPost(
        EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/entities/audit_EntitySnapshot/search" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("POST")
            .url(url);
        
        builder.header("Content-Type", "application/json");
        builder.content(json.toJson(entitiesDynatCategorySearchPostRequest));

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }

}

