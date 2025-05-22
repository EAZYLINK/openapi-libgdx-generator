package com.api.models;

import com.badlogic.gdx.utils.Json;

public class EntitiesDynatCategorySearchPostRequest {


    public EntitiesDynatCategorySearchPostRequest() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static EntitiesDynatCategorySearchPostRequest fromJson(String json) {
        return new Json().fromJson(EntitiesDynatCategorySearchPostRequest.class, json);
    }
}
