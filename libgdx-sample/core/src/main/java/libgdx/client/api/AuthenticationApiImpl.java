package libgdx.client.api;

import java.util.ArrayList;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import libgdx.client.models.*;
import java.util.*;

public class AuthenticationApiImpl implements AuthenticationApi {
    private final String baseUrl;
    private final Json json;

    public AuthenticationApiImpl(String baseUrl) {
        this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
        this.json = new Json();
    }

    @Override
    public void servicesAuthenticationAddUsernamePasswordGet( String user, String username, String email, String password, Callback<String> callback) {
        String url = baseUrl + "/rest/services/authentication/addUsernamePassword";

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
                    String result = json.fromJson(String.class, responseData);
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
    public void servicesAuthenticationAddUsernamePasswordPost( _services_authentication_addUsernamePassword_post_request servicesAuthenticationAddUsernamePasswordPostRequest, Callback<String> callback) {
        String url = baseUrl + "/rest/services/authentication/addUsernamePassword";

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
                    String result = json.fromJson(String.class, responseData);
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
    public void servicesAuthenticationLoginAnonymouslyGet( Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/services/authentication/loginAnonymously";

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
    public void servicesAuthenticationLoginAnonymouslyPost( Object body, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/services/authentication/loginAnonymously";

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
    public void servicesAuthenticationLoginWithCustomIdGet( String customId, String createIfNotExists, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/services/authentication/loginWithCustomId";

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
    public void servicesAuthenticationLoginWithCustomIdPost( _services_authentication_loginWithCustomId_post_request servicesAuthenticationLoginWithCustomIdPostRequest, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/services/authentication/loginWithCustomId";

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
    public void servicesAuthenticationLoginWithEmailGet( String email, String password, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/services/authentication/loginWithEmail";

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
    public void servicesAuthenticationLoginWithEmailPost( _services_authentication_loginWithEmail_post_request servicesAuthenticationLoginWithEmailPostRequest, Callback<Entity_User> callback) {
        String url = baseUrl + "/rest/services/authentication/loginWithEmail";

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
}