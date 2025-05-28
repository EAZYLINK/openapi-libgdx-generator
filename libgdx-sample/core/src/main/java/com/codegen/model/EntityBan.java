package com.codegen.model;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class EntityBan implements Json.Serializable {

    public EntityBan() {
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

    public static EntityBan fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(EntityBan.class, jsonString);
    }
}