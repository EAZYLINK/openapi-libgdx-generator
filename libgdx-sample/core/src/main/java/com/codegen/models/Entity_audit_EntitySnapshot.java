package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class Entity_audit_EntitySnapshot implements Json.Serializable {

    public Entity_audit_EntitySnapshot() {
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

    public static Entity_audit_EntitySnapshot fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(Entity_audit_EntitySnapshot.class, jsonString);
    }
}