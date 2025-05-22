package com.api.models;

import com.badlogic.gdx.utils.Json;

public class ServicesAuthenticationLoginWithEmailPostRequest {


    public ServicesAuthenticationLoginWithEmailPostRequest() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static ServicesAuthenticationLoginWithEmailPostRequest fromJson(String json) {
        return new Json().fromJson(ServicesAuthenticationLoginWithEmailPostRequest.class, json);
    }
}
