package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class _services_authentication_addUsernamePassword_post_request implements Json.Serializable {
	
    private Entity_User user;
    private String username;
    private String email;
    private String password;

    public _services_authentication_addUsernamePassword_post_request() {
    }

    public Entity_User get() {
        return user;
    }

    public void set(Entity_User user) {
        this.user = user;
    }
    public String get() {
        return username;
    }

    public void set(String username) {
        this.username = username;
    }
    public String get() {
        return email;
    }

    public void set(String email) {
        this.email = email;
    }
    public String get() {
        return password;
    }

    public void set(String password) {
        this.password = password;
    }

    @Override
    public void write(Json json) {
        json.write("user", user);
        json.write("username", username);
        json.write("email", email);
        json.write("password", password);
        

    @Override
    public void read(Json json, JsonValue jsonData) {
        user = json.readValue("user", Entity_User.class, jsonData);
        username = json.readValue("username", String.class, jsonData);
        email = json.readValue("email", String.class, jsonData);
        password = json.readValue("password", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static _services_authentication_addUsernamePassword_post_request fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(_services_authentication_addUsernamePassword_post_request.class, jsonString);
    }
