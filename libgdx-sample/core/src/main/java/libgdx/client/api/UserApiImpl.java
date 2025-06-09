package libgdx.client.api;

import java.util.ArrayList;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import libgdx.client.models.*;
import java.util.*;

public class UserApiImpl implements UserApi {
    private final String baseUrl;
    private final Json json;

    public UserApiImpl(String baseUrl) {
        this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
        this.json = new Json();
    }

    @Override
    public void entitiesUserEntityIdDelete( String entityId, Callback<Void> callback) {
        String url = baseUrl + "/rest/entities/User/{entityId}";

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
    public void entitiesUserEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/entities/User/{entityId}";

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
                    Entity_User result = json.fromJson(Entity_User.class, responseData);
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
    public void entitiesUserEntityIdPut( String entityId, Entity_User entityUser, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/entities/User/{entityId}";

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
                    Entity_User result = json.fromJson(Entity_User.class, responseData);
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
    public void entitiesUserGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_User>> callback) {
        String url = baseUrl + "/rest/entities/User";

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
                    java.util.ArrayList<Entity_User> result = json.fromJson(java.util.ArrayList.class, Entity_User.class, responseData);
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
    public void entitiesUserPost( Entity_User entityUser, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/entities/User";

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
                    Entity_User result = json.fromJson(Entity_User.class, responseData);
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
    public void entitiesUserSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_User>> callback) {
        String url = baseUrl + "/rest/entities/User/search";

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
                    java.util.ArrayList<Entity_User> result = json.fromJson(java.util.ArrayList.class, Entity_User.class, responseData);
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
    public void entitiesUserSearchPost( _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<Entity_User>> callback) {
        String url = baseUrl + "/rest/entities/User/search";

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
                    java.util.ArrayList<Entity_User> result = json.fromJson(java.util.ArrayList.class, Entity_User.class, responseData);
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