package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class _services_authentication_loginWithEmail_post_request implements Json.Serializable {
	
    private String email;
    private String password;

    public _services_authentication_loginWithEmail_post_request() {
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

    public static _services_authentication_loginWithEmail_post_request fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(_services_authentication_loginWithEmail_post_request.class, jsonString);
    }
}