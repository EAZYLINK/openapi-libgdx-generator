package com.myapp.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
import java.util.*;

public class servicesAuthenticationAddUsernamePasswordPostRequest implements Json.Serializable {
    private Entity_User user;
    private String username;
    private String email;
    private String password;

    public servicesAuthenticationAddUsernamePasswordPostRequest() {
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
        json.writeValue("user", user);
        json.writeValue("username", username);
        json.writeValue("email", email);
        json.writeValue("password", password);
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

    public static servicesAuthenticationAddUsernamePasswordPostRequest fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(servicesAuthenticationAddUsernamePasswordPostRequest.class, jsonString);
    }
}