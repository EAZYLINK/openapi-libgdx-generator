package com.codegen.model;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class EntityAuditEntitySnapshot implements Json.Serializable {

    public EntityAuditEntitySnapshot() {
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

    public static EntityAuditEntitySnapshot fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(EntityAuditEntitySnapshot.class, jsonString);
    }
}