package com.codegen.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.codegen.models.*;
import java.util.*;

public interface AuthenticationApi {
    void servicesAuthenticationAddUsernamePasswordGet( String user, String username, String email, String password, Callback<String> callback);
    void servicesAuthenticationAddUsernamePasswordPost( _services_authentication_addUsernamePassword_post_request servicesAuthenticationAddUsernamePasswordPostRequest, Callback<String> callback);
    void servicesAuthenticationLoginAnonymouslyGet( Callback<Entity_User> callback);
    void servicesAuthenticationLoginAnonymouslyPost( Object body, Callback<Entity_User> callback);
    void servicesAuthenticationLoginWithCustomIdGet( String customId, String createIfNotExists, Callback<Entity_User> callback);
    void servicesAuthenticationLoginWithCustomIdPost( _services_authentication_loginWithCustomId_post_request servicesAuthenticationLoginWithCustomIdPostRequest, Callback<Entity_User> callback);
    void servicesAuthenticationLoginWithEmailGet( String email, String password, Callback<Entity_User> callback);
    void servicesAuthenticationLoginWithEmailPost( _services_authentication_loginWithEmail_post_request servicesAuthenticationLoginWithEmailPostRequest, Callback<Entity_User> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}