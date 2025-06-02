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

    public Entity_User getUser() {
        return user;
    }

    public void setUser(Entity_User user) {
        this.user = user;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        json.write("user", user);
        json.write("username", username);
        json.write("email", email);
        json.write("password", password);
    }

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
}