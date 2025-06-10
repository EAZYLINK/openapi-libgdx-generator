package com.myapp.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
import java.util.*;

public class servicesAuthenticationLoginWithCustomIdPostRequest implements Json.Serializable {
    private String customId;
    private Boolean createIfNotExists;

    public servicesAuthenticationLoginWithCustomIdPostRequest() {
    }

   
    public String getCustomId() {
        return customId;
    }
    public void setCustomId(String customId) {
        this.customId = customId;
    }
    public Boolean getCreateIfNotExists() {
        return createIfNotExists;
    }
    public void setCreateIfNotExists(Boolean createIfNotExists) {
        this.createIfNotExists = createIfNotExists;
    }

    @Override
    public void write(Json json) {
        json.writeValue("customId", customId);
        json.writeValue("createIfNotExists", createIfNotExists);
    }

        @Override
    public void read(Json json, JsonValue jsonData) {
        customId = json.readValue("customId", String.class, jsonData);
        createIfNotExists = json.readValue("createIfNotExists", Boolean.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static servicesAuthenticationLoginWithCustomIdPostRequest fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(servicesAuthenticationLoginWithCustomIdPostRequest.class, jsonString);
    }
}