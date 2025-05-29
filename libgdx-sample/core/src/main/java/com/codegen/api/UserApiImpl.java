package com.codegen.api;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequest;
import com.badlogic.gdx.net.HttpResponse;
import com.badlogic.gdx.net.HttpResponseListener;
import com.badlogic.gdx.utils.Json;

public class UserApiImpl implements UserApi {

    private final String baseUrl;
    private final Json json;

    public UserApiImpl(String baseUrl) {
        this.baseUrl = baseUrl;
        this.json = new Json();
    }

    @Override
    public void entitiesUserEntityIdDelete(
            String entityId
        ,
        Callback<Void> callback
    ) {
        try {
            String url = baseUrl + "/rest/entities/User/{entityId}";

            // Replace path params
            url = url.replace("entityId", String.valueOf(entityId));

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("DELETE");
            request.setUrl(url);

            // Set request body if applicable

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        callback.onSuccess(null);
                    } catch (Exception e) {
                        callback.onFailure(e);
                    }
                }

                @Override
                public void failed(Throwable t) {
                    callback.onFailure(new Exception(t));
                }

                @Override
                public void cancelled() {
                    callback.onFailure(new Exception("Request was cancelled"));
                }
            });

        } catch (Exception e) {
            callback.onFailure(e);
        }
    }
    @Override
    public void entitiesUserEntityIdGet(
            String entityId
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/entities/User/{entityId}";

            // Replace path params
            url = url.replace("entityId", String.valueOf(entityId));

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();
            if (dynamicAttributes != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("dynamicAttributes=").append(java.net.URLEncoder.encode(String.valueOf(dynamicAttributes), "UTF-8"));
            }
            if (returnNulls != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("returnNulls=").append(java.net.URLEncoder.encode(String.valueOf(returnNulls), "UTF-8"));
            }
            if (fetchPlan != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("fetchPlan=").append(java.net.URLEncoder.encode(String.valueOf(fetchPlan), "UTF-8"));
            }

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("GET");
            request.setUrl(url);

            // Set request body if applicable

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        Entity_User result = json.fromJson(Entity_User.class, rawResponse);
                        callback.onSuccess(result);
                    } catch (Exception e) {
                        callback.onFailure(e);
                    }
                }

                @Override
                public void failed(Throwable t) {
                    callback.onFailure(new Exception(t));
                }

                @Override
                public void cancelled() {
                    callback.onFailure(new Exception("Request was cancelled"));
                }
            });

        } catch (Exception e) {
            callback.onFailure(e);
        }
    }
    @Override
    public void entitiesUserEntityIdPut(
            String entityId
                    Entity_User entityUser
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/entities/User/{entityId}";

            // Replace path params
            url = url.replace("entityId", String.valueOf(entityId));

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("PUT");
            request.setUrl(url);

            // Set request body if applicable
            String bodyJson = json.toJson(entityUser);
            request.setContent(bodyJson);
            request.setHeader("Content-Type", "application/json");

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        Entity_User result = json.fromJson(Entity_User.class, rawResponse);
                        callback.onSuccess(result);
                    } catch (Exception e) {
                        callback.onFailure(e);
                    }
                }

                @Override
                public void failed(Throwable t) {
                    callback.onFailure(new Exception(t));
                }

                @Override
                public void cancelled() {
                    callback.onFailure(new Exception("Request was cancelled"));
                }
            });

        } catch (Exception e) {
            callback.onFailure(e);
        }
    }
    @Override
    public void entitiesUserGet(
            Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;Entity_User&gt;> callback
    ) {
        try {
            String url = baseUrl + "/rest/entities/User";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();
            if (returnCount != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("returnCount=").append(java.net.URLEncoder.encode(String.valueOf(returnCount), "UTF-8"));
            }
            if (offset != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("offset=").append(java.net.URLEncoder.encode(String.valueOf(offset), "UTF-8"));
            }
            if (limit != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("limit=").append(java.net.URLEncoder.encode(String.valueOf(limit), "UTF-8"));
            }
            if (sort != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("sort=").append(java.net.URLEncoder.encode(String.valueOf(sort), "UTF-8"));
            }
            if (dynamicAttributes != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("dynamicAttributes=").append(java.net.URLEncoder.encode(String.valueOf(dynamicAttributes), "UTF-8"));
            }
            if (returnNulls != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("returnNulls=").append(java.net.URLEncoder.encode(String.valueOf(returnNulls), "UTF-8"));
            }
            if (fetchPlan != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("fetchPlan=").append(java.net.URLEncoder.encode(String.valueOf(fetchPlan), "UTF-8"));
            }

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("GET");
            request.setUrl(url);

            // Set request body if applicable

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        java.util.ArrayList&lt;Entity_User&gt; result = json.fromJson(java.util.ArrayList&lt;Entity_User&gt;.class, rawResponse);
                        callback.onSuccess(result);
                    } catch (Exception e) {
                        callback.onFailure(e);
                    }
                }

                @Override
                public void failed(Throwable t) {
                    callback.onFailure(new Exception(t));
                }

                @Override
                public void cancelled() {
                    callback.onFailure(new Exception("Request was cancelled"));
                }
            });

        } catch (Exception e) {
            callback.onFailure(e);
        }
    }
    @Override
    public void entitiesUserPost(
            Entity_User entityUser
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/entities/User";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("POST");
            request.setUrl(url);

            // Set request body if applicable
            String bodyJson = json.toJson(entityUser);
            request.setContent(bodyJson);
            request.setHeader("Content-Type", "application/json");

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        Entity_User result = json.fromJson(Entity_User.class, rawResponse);
                        callback.onSuccess(result);
                    } catch (Exception e) {
                        callback.onFailure(e);
                    }
                }

                @Override
                public void failed(Throwable t) {
                    callback.onFailure(new Exception(t));
                }

                @Override
                public void cancelled() {
                    callback.onFailure(new Exception("Request was cancelled"));
                }
            });

        } catch (Exception e) {
            callback.onFailure(e);
        }
    }
    @Override
    public void entitiesUserSearchGet(
            String filter
                    Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;Entity_User&gt;> callback
    ) {
        try {
            String url = baseUrl + "/rest/entities/User/search";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();
            if (filter != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("filter=").append(java.net.URLEncoder.encode(String.valueOf(filter), "UTF-8"));
            }
            if (returnCount != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("returnCount=").append(java.net.URLEncoder.encode(String.valueOf(returnCount), "UTF-8"));
            }
            if (offset != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("offset=").append(java.net.URLEncoder.encode(String.valueOf(offset), "UTF-8"));
            }
            if (limit != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("limit=").append(java.net.URLEncoder.encode(String.valueOf(limit), "UTF-8"));
            }
            if (sort != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("sort=").append(java.net.URLEncoder.encode(String.valueOf(sort), "UTF-8"));
            }
            if (dynamicAttributes != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("dynamicAttributes=").append(java.net.URLEncoder.encode(String.valueOf(dynamicAttributes), "UTF-8"));
            }
            if (returnNulls != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("returnNulls=").append(java.net.URLEncoder.encode(String.valueOf(returnNulls), "UTF-8"));
            }
            if (fetchPlan != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("fetchPlan=").append(java.net.URLEncoder.encode(String.valueOf(fetchPlan), "UTF-8"));
            }

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("GET");
            request.setUrl(url);

            // Set request body if applicable

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        java.util.ArrayList&lt;Entity_User&gt; result = json.fromJson(java.util.ArrayList&lt;Entity_User&gt;.class, rawResponse);
                        callback.onSuccess(result);
                    } catch (Exception e) {
                        callback.onFailure(e);
                    }
                }

                @Override
                public void failed(Throwable t) {
                    callback.onFailure(new Exception(t));
                }

                @Override
                public void cancelled() {
                    callback.onFailure(new Exception("Request was cancelled"));
                }
            });

        } catch (Exception e) {
            callback.onFailure(e);
        }
    }
    @Override
    public void entitiesUserSearchPost(
            _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest
        ,
        Callback<java.util.ArrayList&lt;Entity_User&gt;> callback
    ) {
        try {
            String url = baseUrl + "/rest/entities/User/search";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("POST");
            request.setUrl(url);

            // Set request body if applicable
            String bodyJson = json.toJson(entitiesDynatCategorySearchPostRequest);
            request.setContent(bodyJson);
            request.setHeader("Content-Type", "application/json");

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        java.util.ArrayList&lt;Entity_User&gt; result = json.fromJson(java.util.ArrayList&lt;Entity_User&gt;.class, rawResponse);
                        callback.onSuccess(result);
                    } catch (Exception e) {
                        callback.onFailure(e);
                    }
                }

                @Override
                public void failed(Throwable t) {
                    callback.onFailure(new Exception(t));
                }

                @Override
                public void cancelled() {
                    callback.onFailure(new Exception("Request was cancelled"));
                }
            });

        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    public interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}
