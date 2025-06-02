package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class _entities_dynat_Category_search_post_request implements Json.Serializable {
	
    private String filter;
    private Boolean dynamicAttributes;
    private Boolean returnCount;
    private String offset;
    private Boolean returnNulls;
    private String limit;
    private String sort;
    private String fetchPlan;

    public _entities_dynat_Category_search_post_request() {
    }

    public String get() {
        return filter;
    }

    public void set(String filter) {
        this.filter = filter;
    }
    public Boolean get() {
        return dynamicAttributes;
    }

    public void set(Boolean dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }
    public Boolean get() {
        return returnCount;
    }

    public void set(Boolean returnCount) {
        this.returnCount = returnCount;
    }
    public String get() {
        return offset;
    }

    public void set(String offset) {
        this.offset = offset;
    }
    public Boolean get() {
        return returnNulls;
    }

    public void set(Boolean returnNulls) {
        this.returnNulls = returnNulls;
    }
    public String get() {
        return limit;
    }

    public void set(String limit) {
        this.limit = limit;
    }
    public String get() {
        return sort;
    }

    public void set(String sort) {
        this.sort = sort;
    }
    public String get() {
        return fetchPlan;
    }

    public void set(String fetchPlan) {
        this.fetchPlan = fetchPlan;
    }

    @Override
    public void write(Json json) {
        json.write("filter", filter);
        json.write("dynamicAttributes", dynamicAttributes);
        json.write("returnCount", returnCount);
        json.write("offset", offset);
        json.write("returnNulls", returnNulls);
        json.write("limit", limit);
        json.write("sort", sort);
        json.write("fetchPlan", fetchPlan);
        

    @Override
    public void read(Json json, JsonValue jsonData) {
        filter = json.readValue("filter", String.class, jsonData);
        dynamicAttributes = json.readValue("dynamicAttributes", Boolean.class, jsonData);
        returnCount = json.readValue("returnCount", Boolean.class, jsonData);
        offset = json.readValue("offset", String.class, jsonData);
        returnNulls = json.readValue("returnNulls", Boolean.class, jsonData);
        limit = json.readValue("limit", String.class, jsonData);
        sort = json.readValue("sort", String.class, jsonData);
        fetchPlan = json.readValue("fetchPlan", String.class, jsonData);
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
