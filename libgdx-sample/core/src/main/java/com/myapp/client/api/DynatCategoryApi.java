package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface DynatCategoryApi {
    void entitiesDynatCategoryEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesDynatCategoryEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<EntityDynatCategory> callback);
    void entitiesDynatCategoryEntityIdPut( String entityId, EntityDynatCategory entityDynatCategory, Callback<EntityDynatCategory> callback);
    void entitiesDynatCategoryGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityDynatCategory>> callback);
    void entitiesDynatCategoryPost( EntityDynatCategory entityDynatCategory, Callback<EntityDynatCategory> callback);
    void entitiesDynatCategorySearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityDynatCategory>> callback);
    void entitiesDynatCategorySearchPost( EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<EntityDynatCategory>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}