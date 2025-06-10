package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface BanApi {
    void entitiesBanEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesBanEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<Entity_Ban> callback);
    void entitiesBanEntityIdPut( String entityId, Entity_Ban entityBan, Callback<Entity_Ban> callback);
    void entitiesBanGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_Ban>> callback);
    void entitiesBanPost( Entity_Ban entityBan, Callback<Entity_Ban> callback);
    void entitiesBanSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_Ban>> callback);
    void entitiesBanSearchPost( _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<Entity_Ban>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}