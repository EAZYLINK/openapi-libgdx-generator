package com.codegen.api;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequest;
import com.badlogic.gdx.net.HttpResponse;
import com.badlogic.gdx.net.HttpResponseListener;
import com.badlogic.gdx.utils.Json;

public class AuthenticationApiImpl implements AuthenticationApi {

    private final String baseUrl;
    private final Json json;

    public AuthenticationApiImpl(String baseUrl) {
        this.baseUrl = baseUrl;
        this.json = new Json();
    }

    @Override
    public void servicesAuthenticationAddUsernamePasswordGet(
            String user
                    String username
                    String email
                    String password
        ,
        Callback<String> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/addUsernamePassword";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();
            if (user != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("user=").append(java.net.URLEncoder.encode(String.valueOf(user), "UTF-8"));
            }
            if (username != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("username=").append(java.net.URLEncoder.encode(String.valueOf(username), "UTF-8"));
            }
            if (email != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("email=").append(java.net.URLEncoder.encode(String.valueOf(email), "UTF-8"));
            }
            if (password != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("password=").append(java.net.URLEncoder.encode(String.valueOf(password), "UTF-8"));
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
                        String result = json.fromJson(String.class, rawResponse);
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
    public void servicesAuthenticationAddUsernamePasswordPost(
            _services_authentication_addUsernamePassword_post_request servicesAuthenticationAddUsernamePasswordPostRequest
        ,
        Callback<String> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/addUsernamePassword";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("POST");
            request.setUrl(url);

            // Set request body if applicable
            String bodyJson = json.toJson(servicesAuthenticationAddUsernamePasswordPostRequest);
            request.setContent(bodyJson);
            request.setHeader("Content-Type", "application/json");

            // Send async request
            Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
                @Override
                public void handleHttpResponse(HttpResponse httpResponse) {
                    try {
                        String rawResponse = httpResponse.getResultAsString();
                        String result = json.fromJson(String.class, rawResponse);
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
    public void servicesAuthenticationLoginAnonymouslyGet(
,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/loginAnonymously";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

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
    public void servicesAuthenticationLoginAnonymouslyPost(
            Object body
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/loginAnonymously";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("POST");
            request.setUrl(url);

            // Set request body if applicable
            String bodyJson = json.toJson(body);
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
    public void servicesAuthenticationLoginWithCustomIdGet(
            String customId
                    String createIfNotExists
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/loginWithCustomId";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();
            if (customId != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("customId=").append(java.net.URLEncoder.encode(String.valueOf(customId), "UTF-8"));
            }
            if (createIfNotExists != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("createIfNotExists=").append(java.net.URLEncoder.encode(String.valueOf(createIfNotExists), "UTF-8"));
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
    public void servicesAuthenticationLoginWithCustomIdPost(
            _services_authentication_loginWithCustomId_post_request servicesAuthenticationLoginWithCustomIdPostRequest
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/loginWithCustomId";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("POST");
            request.setUrl(url);

            // Set request body if applicable
            String bodyJson = json.toJson(servicesAuthenticationLoginWithCustomIdPostRequest);
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
    public void servicesAuthenticationLoginWithEmailGet(
            String email
                    String password
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/loginWithEmail";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();
            if (email != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("email=").append(java.net.URLEncoder.encode(String.valueOf(email), "UTF-8"));
            }
            if (password != null) {
                if (queryBuilder.length() == 0) queryBuilder.append("?");
                else queryBuilder.append("&");
                queryBuilder.append("password=").append(java.net.URLEncoder.encode(String.valueOf(password), "UTF-8"));
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
    public void servicesAuthenticationLoginWithEmailPost(
            _services_authentication_loginWithEmail_post_request servicesAuthenticationLoginWithEmailPostRequest
        ,
        Callback<Entity_User> callback
    ) {
        try {
            String url = baseUrl + "/rest/services/authentication/loginWithEmail";

            // Replace path params

            // Build query params
            StringBuilder queryBuilder = new StringBuilder();

            url += queryBuilder.toString();

            // Build HTTP request
            HttpRequest request = new HttpRequest("POST");
            request.setUrl(url);

            // Set request body if applicable
            String bodyJson = json.toJson(servicesAuthenticationLoginWithEmailPostRequest);
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

    public interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}
