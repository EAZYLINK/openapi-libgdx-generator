package com.codegen.api;

import java.util.ArrayList;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.codegen.models.*;
import java.util.*;

public class AuditEntitySnapshotApiImpl implements AuditEntitySnapshotApi {
    private final String baseUrl;
    private final Json json;

    public AuditEntitySnapshotApiImpl(String baseUrl) {
        this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
        this.json = new Json();
    }

    @Override
    public void entitiesAuditEntitySnapshotEntityIdDelete( String entityId, Callback<Void> callback) {
        String url = baseUrl + "/rest/entities/audit_EntitySnapshot/{entityId}";

        HttpRequestBuilder builder = new HttpRequestBuilder();
        Net.HttpRequest request = builder.newRequest()
                .method("DELETE")
                .url(url)
                .build();

        Gdx.net.sendHttpRequest(request, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                String responseData = httpResponse.getResultAsString();

                if (status == 200) {
                    callback.onSuccess(null);
                } else {
                    callback.onFailure(new Exception("HTTP " + status + ": " + responseData));
                }
            }

            @Override
            public void failed(Throwable t) {
                callback.onFailure(new Exception(t));
            }

            @Override
            public void cancelled() {
                callback.onFailure(new Exception("Request cancelled"));
            }
        });
    }
    @Override
    public void entitiesAuditEntitySnapshotEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<Entity_audit_EntitySnapshot> callback) {
        String url = baseUrl + "/rest/entities/audit_EntitySnapshot/{entityId}";

        HttpRequestBuilder builder = new HttpRequestBuilder();
        Net.HttpRequest request = builder.newRequest()
                .method("GET")
                .url(url)
                .build();

        Gdx.net.sendHttpRequest(request, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                String responseData = httpResponse.getResultAsString();

                if (status == 200) {
                    Entity_audit_EntitySnapshot result = json.fromJson(Entity_audit_EntitySnapshot.class, responseData);
                    callback.onSuccess(result);
                } else {
                    callback.onFailure(new Exception("HTTP " + status + ": " + responseData));
                }
            }

            @Override
            public void failed(Throwable t) {
                callback.onFailure(new Exception(t));
            }

            @Override
            public void cancelled() {
                callback.onFailure(new Exception("Request cancelled"));
            }
        });
    }
    @Override
    public void entitiesAuditEntitySnapshotEntityIdPut( String entityId, Entity_audit_EntitySnapshot entityAuditEntitySnapshot, Callback<Entity_audit_EntitySnapshot> callback) {
        String url = baseUrl + "/rest/entities/audit_EntitySnapshot/{entityId}";

        HttpRequestBuilder builder = new HttpRequestBuilder();
        Net.HttpRequest request = builder.newRequest()
                .method("PUT")
                .url(url)
                .build();

        Gdx.net.sendHttpRequest(request, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                String responseData = httpResponse.getResultAsString();

                if (status == 200) {
                    Entity_audit_EntitySnapshot result = json.fromJson(Entity_audit_EntitySnapshot.class, responseData);
                    callback.onSuccess(result);
                } else {
                    callback.onFailure(new Exception("HTTP " + status + ": " + responseData));
                }
            }

            @Override
            public void failed(Throwable t) {
                callback.onFailure(new Exception(t));
            }

            @Override
            public void cancelled() {
                callback.onFailure(new Exception("Request cancelled"));
            }
        });
    }
    @Override
    public void entitiesAuditEntitySnapshotGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_audit_EntitySnapshot>> callback) {
        String url = baseUrl + "/rest/entities/audit_EntitySnapshot";

        HttpRequestBuilder builder = new HttpRequestBuilder();
        Net.HttpRequest request = builder.newRequest()
                .method("GET")
                .url(url)
                .build();

        Gdx.net.sendHttpRequest(request, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                String responseData = httpResponse.getResultAsString();

                if (status == 200) {
                    java.util.ArrayList<Entity_audit_EntitySnapshot> result = json.fromJson(java.util.ArrayList.class, Entity_audit_EntitySnapshot.class, responseData);
                    callback.onSuccess(result);
                } else {
                    callback.onFailure(new Exception("HTTP " + status + ": " + responseData));
                }
            }

            @Override
            public void failed(Throwable t) {
                callback.onFailure(new Exception(t));
            }

            @Override
            public void cancelled() {
                callback.onFailure(new Exception("Request cancelled"));
            }
        });
    }
    @Override
    public void entitiesAuditEntitySnapshotPost( Entity_audit_EntitySnapshot entityAuditEntitySnapshot, Callback<Entity_audit_EntitySnapshot> callback) {
        String url = baseUrl + "/rest/entities/audit_EntitySnapshot";

        HttpRequestBuilder builder = new HttpRequestBuilder();
        Net.HttpRequest request = builder.newRequest()
                .method("POST")
                .url(url)
                .build();

        Gdx.net.sendHttpRequest(request, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                String responseData = httpResponse.getResultAsString();

                if (status == 201) {
                    Entity_audit_EntitySnapshot result = json.fromJson(Entity_audit_EntitySnapshot.class, responseData);
                    callback.onSuccess(result);
                } else {
                    callback.onFailure(new Exception("HTTP " + status + ": " + responseData));
                }
            }

            @Override
            public void failed(Throwable t) {
                callback.onFailure(new Exception(t));
            }

            @Override
            public void cancelled() {
                callback.onFailure(new Exception("Request cancelled"));
            }
        });
    }
    @Override
    public void entitiesAuditEntitySnapshotSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_audit_EntitySnapshot>> callback) {
        String url = baseUrl + "/rest/entities/audit_EntitySnapshot/search";

        HttpRequestBuilder builder = new HttpRequestBuilder();
        Net.HttpRequest request = builder.newRequest()
                .method("GET")
                .url(url)
                .build();

        Gdx.net.sendHttpRequest(request, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                String responseData = httpResponse.getResultAsString();

                if (status == 200) {
                    java.util.ArrayList<Entity_audit_EntitySnapshot> result = json.fromJson(java.util.ArrayList.class, Entity_audit_EntitySnapshot.class, responseData);
                    callback.onSuccess(result);
                } else {
                    callback.onFailure(new Exception("HTTP " + status + ": " + responseData));
                }
            }

            @Override
            public void failed(Throwable t) {
                callback.onFailure(new Exception(t));
            }

            @Override
            public void cancelled() {
                callback.onFailure(new Exception("Request cancelled"));
            }
        });
    }
    @Override
    public void entitiesAuditEntitySnapshotSearchPost( _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<Entity_audit_EntitySnapshot>> callback) {
        String url = baseUrl + "/rest/entities/audit_EntitySnapshot/search";

        HttpRequestBuilder builder = new HttpRequestBuilder();
        Net.HttpRequest request = builder.newRequest()
                .method("POST")
                .url(url)
                .build();

        Gdx.net.sendHttpRequest(request, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                String responseData = httpResponse.getResultAsString();

                if (status == 200) {
                    java.util.ArrayList<Entity_audit_EntitySnapshot> result = json.fromJson(java.util.ArrayList.class, Entity_audit_EntitySnapshot.class, responseData);
                    callback.onSuccess(result);
                } else {
                    callback.onFailure(new Exception("HTTP " + status + ": " + responseData));
                }
            }

            @Override
            public void failed(Throwable t) {
                callback.onFailure(new Exception(t));
            }

            @Override
            public void cancelled() {
                callback.onFailure(new Exception("Request cancelled"));
            }
        });
    }
}