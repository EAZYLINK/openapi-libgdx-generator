package com.myapp.client.api;

import java.util.ArrayList;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public class BanApiImpl implements BanApi {
    private final String baseUrl;
    private final Json json;

    public BanApiImpl(String baseUrl) {
        this.baseUrl = baseUrl;
        this.json = new Json();
    }

    @Override
    public void entitiesBanEntityIdDelete( String entityId, Callback<Void> callback) {
        String url = baseUrl + "/rest/entities/Ban/{entityId}";

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
    public void entitiesBanEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<EntityBan> callback) {
        String url = baseUrl + "/rest/entities/Ban/{entityId}";

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
                    EntityBan result = json.fromJson(EntityBan.class, responseData);
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
    public void entitiesBanEntityIdPut( String entityId, EntityBan entityBan, Callback<EntityBan> callback) {
        String url = baseUrl + "/rest/entities/Ban/{entityId}";

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
                    EntityBan result = json.fromJson(EntityBan.class, responseData);
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
    public void entitiesBanGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityBan>> callback) {
        String url = baseUrl + "/rest/entities/Ban";

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
                    java.util.ArrayList<EntityBan> result = json.fromJson(java.util.ArrayList.class, EntityBan.class, responseData);
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
    public void entitiesBanPost( EntityBan entityBan, Callback<EntityBan> callback) {
        String url = baseUrl + "/rest/entities/Ban";

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
                    EntityBan result = json.fromJson(EntityBan.class, responseData);
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
    public void entitiesBanSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityBan>> callback) {
        String url = baseUrl + "/rest/entities/Ban/search";

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
                    java.util.ArrayList<EntityBan> result = json.fromJson(java.util.ArrayList.class, EntityBan.class, responseData);
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
    public void entitiesBanSearchPost( EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<EntityBan>> callback) {
        String url = baseUrl + "/rest/entities/Ban/search";

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
                    java.util.ArrayList<EntityBan> result = json.fromJson(java.util.ArrayList.class, EntityBan.class, responseData);
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