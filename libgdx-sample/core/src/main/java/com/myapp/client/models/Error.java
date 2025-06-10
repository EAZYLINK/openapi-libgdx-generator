package com.myapp.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
import java.util.*;

public class error implements Json.Serializable {
    private String error;
    private String details;

    public error() {
    }

   
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public void write(Json json) {
        json.writeValue("error", error);
        json.writeValue("details", details);
    }

        @Override
    public void read(Json json, JsonValue jsonData) {
        error = json.readValue("error", String.class, jsonData);
        details = json.readValue("details", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static error fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(error.class, jsonString);
    }
}