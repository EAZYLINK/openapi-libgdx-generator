package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class Entity_Ban implements Json.Serializable {

    public Entity_Ban() {
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

    public static Entity_Ban fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(Entity_Ban.class, jsonString);
    }
}