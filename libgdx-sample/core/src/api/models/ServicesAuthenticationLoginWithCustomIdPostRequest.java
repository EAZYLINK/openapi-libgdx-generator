package api.models;

import com.badlogic.gdx.utils.Json;

public class ServicesAuthenticationLoginWithCustomIdPostRequest {


    public ServicesAuthenticationLoginWithCustomIdPostRequest() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static ServicesAuthenticationLoginWithCustomIdPostRequest fromJson(String json) {
        return new Json().fromJson(ServicesAuthenticationLoginWithCustomIdPostRequest.class, json);
    }
}
