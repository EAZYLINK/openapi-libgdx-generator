package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class _entities_dynat_Category_search_post_request implements Json.Serializable {

    public _entities_dynat_Category_search_post_request() {
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

    public static _entities_dynat_Category_search_post_request fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(_entities_dynat_Category_search_post_request.class, jsonString);
    }
}