package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface UserApi {
    void entitiesUserEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesUserEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<EntityUser> callback);
    void entitiesUserEntityIdPut( String entityId, EntityUser entityUser, Callback<EntityUser> callback);
    void entitiesUserGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityUser>> callback);
    void entitiesUserPost( EntityUser entityUser, Callback<EntityUser> callback);
    void entitiesUserSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityUser>> callback);
    void entitiesUserSearchPost( EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<EntityUser>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}