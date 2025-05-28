package com.codegen.api;

import com.codegen.models.*;
import java.util.*;

public interface BanApi {
    void entitiesBanEntityIdDelete(
            String entityId
        ,
        Callback<Void> callback
    );
    void entitiesBanEntityIdGet(
            String entityId
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<EntityBan> callback
    );
    void entitiesBanEntityIdPut(
            String entityId
                    EntityBan entityBan
        ,
        Callback<EntityBan> callback
    );
    void entitiesBanGet(
            Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;EntityBan&gt;> callback
    );
    void entitiesBanPost(
            EntityBan entityBan
        ,
        Callback<EntityBan> callback
    );
    void entitiesBanSearchGet(
            String filter
                    Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;EntityBan&gt;> callback
    );
    void entitiesBanSearchPost(
            EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest
        ,
        Callback<java.util.ArrayList&lt;EntityBan&gt;> callback
    );

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}
