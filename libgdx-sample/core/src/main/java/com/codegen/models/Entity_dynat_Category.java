package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class Entity_dynat_Category implements Json.Serializable {
	VARS:

    public Entity_dynat_Category() {
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

    public static Entity_dynat_Category fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(Entity_dynat_Category.class, jsonString);
    }
}