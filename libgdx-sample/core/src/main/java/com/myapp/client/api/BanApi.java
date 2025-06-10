package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface BanApi {
    void entitiesBanEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesBanEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<EntityBan> callback);
    void entitiesBanEntityIdPut( String entityId, EntityBan entityBan, Callback<EntityBan> callback);
    void entitiesBanGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityBan>> callback);
    void entitiesBanPost( EntityBan entityBan, Callback<EntityBan> callback);
    void entitiesBanSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityBan>> callback);
    void entitiesBanSearchPost( EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<EntityBan>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}