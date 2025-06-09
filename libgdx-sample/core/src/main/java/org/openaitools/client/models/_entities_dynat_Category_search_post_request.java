package org.openaitools.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
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

   
    public String getFilter() {
        return filter;
    }
    public void setFilter(String filter) {
        this.filter = filter;
    }
    public Boolean getDynamicAttributes() {
        return dynamicAttributes;
    }
    public void setDynamicAttributes(Boolean dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }
    public Boolean getReturnCount() {
        return returnCount;
    }
    public void setReturnCount(Boolean returnCount) {
        this.returnCount = returnCount;
    }
    public String getOffset() {
        return offset;
    }
    public void setOffset(String offset) {
        this.offset = offset;
    }
    public Boolean getReturnNulls() {
        return returnNulls;
    }
    public void setReturnNulls(Boolean returnNulls) {
        this.returnNulls = returnNulls;
    }
    public String getLimit() {
        return limit;
    }
    public void setLimit(String limit) {
        this.limit = limit;
    }
    public String getSort() {
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }
    public String getFetchPlan() {
        return fetchPlan;
    }
    public void setFetchPlan(String fetchPlan) {
        this.fetchPlan = fetchPlan;
    }

    @Override
    public void write(Json json) {
        json.writeValue("filter", filter);
        json.writeValue("dynamicAttributes", dynamicAttributes);
        json.writeValue("returnCount", returnCount);
        json.writeValue("offset", offset);
        json.writeValue("returnNulls", returnNulls);
        json.writeValue("limit", limit);
        json.writeValue("sort", sort);
        json.writeValue("fetchPlan", fetchPlan);
    }

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
}