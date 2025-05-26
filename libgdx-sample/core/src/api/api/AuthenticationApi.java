package api;

import com.badlogic.gdx.Net.HttpRequest;
import com.badlogic.gdx.Net.HttpRequestBuilder;
import com.badlogic.gdx.Net.HttpResponseListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Json;

import java.util.Map;
import java.util.HashMap;
import java.net.URLEncoder;

public class AuthenticationApi {

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
     * authentication#addUsernamePassword
     */
    public void servicesAuthenticationAddUsernamePasswordGet(
        String user, String username, String email, String password, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("user", user);
        queryParams.put("username", username);
        queryParams.put("email", email);
        queryParams.put("password", password);

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/addUsernamePassword" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("GET")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * authentication#addUsernamePassword
     */
    public void servicesAuthenticationAddUsernamePasswordPost(
        ServicesAuthenticationAddUsernamePasswordPostRequest servicesAuthenticationAddUsernamePasswordPostRequest, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/addUsernamePassword" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("POST")
            .url(url);
        
        builder.header("Content-Type", "application/json");
        builder.content(json.toJson(servicesAuthenticationAddUsernamePasswordPostRequest));

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * authentication#loginAnonymously
     */
    public void servicesAuthenticationLoginAnonymouslyGet(
        
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/loginAnonymously" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("GET")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * authentication#loginAnonymously
     */
    public void servicesAuthenticationLoginAnonymouslyPost(
        Object body, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/loginAnonymously" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("POST")
            .url(url);
        
        builder.header("Content-Type", "application/json");
        builder.content(json.toJson(body));

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * authentication#loginWithCustomId
     */
    public void servicesAuthenticationLoginWithCustomIdGet(
        String customId, String createIfNotExists, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("customId", customId);
        queryParams.put("createIfNotExists", createIfNotExists);

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/loginWithCustomId" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("GET")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * authentication#loginWithCustomId
     */
    public void servicesAuthenticationLoginWithCustomIdPost(
        ServicesAuthenticationLoginWithCustomIdPostRequest servicesAuthenticationLoginWithCustomIdPostRequest, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/loginWithCustomId" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("POST")
            .url(url);
        
        builder.header("Content-Type", "application/json");
        builder.content(json.toJson(servicesAuthenticationLoginWithCustomIdPostRequest));

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * authentication#loginWithEmail
     */
    public void servicesAuthenticationLoginWithEmailGet(
        String email, String password, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("email", email);
        queryParams.put("password", password);

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/loginWithEmail" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("GET")
            .url(url);
        

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }
    /**
     * authentication#loginWithEmail
     */
    public void servicesAuthenticationLoginWithEmailPost(
        ServicesAuthenticationLoginWithEmailPostRequest servicesAuthenticationLoginWithEmailPostRequest, 
        HttpResponseListener callback
    ) {
        Map<String, Object> queryParams = new HashMap<>();

        String query = buildQuery(queryParams);
        String url = "/rest/rest/services/authentication/loginWithEmail" + (query.isEmpty() ? "" : "?" + query);

        HttpRequestBuilder builder = new HttpRequestBuilder()
            .newRequest()
            .method("POST")
            .url(url);
        
        builder.header("Content-Type", "application/json");
        builder.content(json.toJson(servicesAuthenticationLoginWithEmailPostRequest));

        HttpRequest request = builder.build();
        Gdx.net.sendHttpRequest(request, callback);
    }

}

