package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface AuthenticationApi {
    void servicesAuthenticationAddUsernamePasswordGet( String user, String username, String email, String password, Callback<String> callback);
    void servicesAuthenticationAddUsernamePasswordPost( ServicesAuthenticationAddUsernamePasswordPostRequest servicesAuthenticationAddUsernamePasswordPostRequest, Callback<String> callback);
    void servicesAuthenticationLoginAnonymouslyGet( Callback<EntityUser> callback);
    void servicesAuthenticationLoginAnonymouslyPost( Object body, Callback<EntityUser> callback);
    void servicesAuthenticationLoginWithCustomIdGet( String customId, String createIfNotExists, Callback<EntityUser> callback);
    void servicesAuthenticationLoginWithCustomIdPost( ServicesAuthenticationLoginWithCustomIdPostRequest servicesAuthenticationLoginWithCustomIdPostRequest, Callback<EntityUser> callback);
    void servicesAuthenticationLoginWithEmailGet( String email, String password, Callback<EntityUser> callback);
    void servicesAuthenticationLoginWithEmailPost( ServicesAuthenticationLoginWithEmailPostRequest servicesAuthenticationLoginWithEmailPostRequest, Callback<EntityUser> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}