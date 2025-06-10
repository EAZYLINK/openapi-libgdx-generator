package com.myapp.client.api;

import java.util.ArrayList;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public class DynatCategoryApiImpl implements DynatCategoryApi {
    private final String baseUrl;
    private final Json json;

    public DynatCategoryApiImpl(String baseUrl) {
        this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
        this.json = new Json();
    }

    @Override
    public void entitiesDynatCategoryEntityIdDelete( String entityId, Callback<Void> callback) {
        String url = baseUrl + "/rest/entities/dynat_Category/{entityId}";

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
    public void entitiesDynatCategoryEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<Entity_dynat_Category> callback) {
        String url = baseUrl + "/rest/entities/dynat_Category/{entityId}";

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
                    Entity_dynat_Category result = json.fromJson(Entity_dynat_Category.class, responseData);
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
    public void entitiesDynatCategoryEntityIdPut( String entityId, Entity_dynat_Category entityDynatCategory, Callback<Entity_dynat_Category> callback) {
        String url = baseUrl + "/rest/entities/dynat_Category/{entityId}";

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
                    Entity_dynat_Category result = json.fromJson(Entity_dynat_Category.class, responseData);
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
    public void entitiesDynatCategoryGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_dynat_Category>> callback) {
        String url = baseUrl + "/rest/entities/dynat_Category";

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
                    java.util.ArrayList<Entity_dynat_Category> result = json.fromJson(java.util.ArrayList.class, Entity_dynat_Category.class, responseData);
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
    public void entitiesDynatCategoryPost( Entity_dynat_Category entityDynatCategory, Callback<Entity_dynat_Category> callback) {
        String url = baseUrl + "/rest/entities/dynat_Category";

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
                    Entity_dynat_Category result = json.fromJson(Entity_dynat_Category.class, responseData);
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
    public void entitiesDynatCategorySearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_dynat_Category>> callback) {
        String url = baseUrl + "/rest/entities/dynat_Category/search";

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
                    java.util.ArrayList<Entity_dynat_Category> result = json.fromJson(java.util.ArrayList.class, Entity_dynat_Category.class, responseData);
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
    public void entitiesDynatCategorySearchPost( _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<Entity_dynat_Category>> callback) {
        String url = baseUrl + "/rest/entities/dynat_Category/search";

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
                    java.util.ArrayList<Entity_dynat_Category> result = json.fromJson(java.util.ArrayList.class, Entity_dynat_Category.class, responseData);
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