package models;

import com.badlogic.gdx.utils.Json;

public class ServicesAuthenticationAddUsernamePasswordPostRequest {


    public ServicesAuthenticationAddUsernamePasswordPostRequest() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static ServicesAuthenticationAddUsernamePasswordPostRequest fromJson(String json) {
        return new Json().fromJson(ServicesAuthenticationAddUsernamePasswordPostRequest.class, json);
    }
}
