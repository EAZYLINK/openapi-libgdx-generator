package com.codegen.model;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class ServicesAuthenticationAddUsernamePasswordPostRequest implements Json.Serializable {

    public ServicesAuthenticationAddUsernamePasswordPostRequest() {
    }


    @Override
    public void write(Json json) {
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static ServicesAuthenticationAddUsernamePasswordPostRequest fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(ServicesAuthenticationAddUsernamePasswordPostRequest.class, jsonString);
    }
}