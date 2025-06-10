package com.myapp.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
import java.util.*;

public class ServicesAuthenticationLoginWithEmailPostRequest implements Json.Serializable {
    private String email;
    private String password;

    public ServicesAuthenticationLoginWithEmailPostRequest() {
    }

   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void write(Json json) {
        json.writeValue("email", email);
        json.writeValue("password", password);
    }

        @Override
    public void read(Json json, JsonValue jsonData) {
        email = json.readValue("email", String.class, jsonData);
        password = json.readValue("password", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static servicesAuthenticationLoginWithEmailPostRequest fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(ServicesAuthenticationLoginWithEmailPostRequest.class, jsonString);
    }
}