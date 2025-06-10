package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface DynatCategoryApi {
    void entitiesDynatCategoryEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesDynatCategoryEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<Entity_dynat_Category> callback);
    void entitiesDynatCategoryEntityIdPut( String entityId, Entity_dynat_Category entityDynatCategory, Callback<Entity_dynat_Category> callback);
    void entitiesDynatCategoryGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_dynat_Category>> callback);
    void entitiesDynatCategoryPost( Entity_dynat_Category entityDynatCategory, Callback<Entity_dynat_Category> callback);
    void entitiesDynatCategorySearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_dynat_Category>> callback);
    void entitiesDynatCategorySearchPost( _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<Entity_dynat_Category>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}