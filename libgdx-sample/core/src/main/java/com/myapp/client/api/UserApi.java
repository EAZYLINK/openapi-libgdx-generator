package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface UserApi {
    void entitiesUserEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesUserEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<Entity_User> callback);
    void entitiesUserEntityIdPut( String entityId, Entity_User entityUser, Callback<Entity_User> callback);
    void entitiesUserGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_User>> callback);
    void entitiesUserPost( Entity_User entityUser, Callback<Entity_User> callback);
    void entitiesUserSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_User>> callback);
    void entitiesUserSearchPost( _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<Entity_User>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}