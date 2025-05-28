package com.codegen.api;

import com.codegen.models.*;
import java.util.*;

public interface DynatCategoryApi {
    void entitiesDynatCategoryEntityIdDelete(
            String entityId
        ,
        Callback<Void> callback
    );
    void entitiesDynatCategoryEntityIdGet(
            String entityId
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<EntityDynatCategory> callback
    );
    void entitiesDynatCategoryEntityIdPut(
            String entityId
                    EntityDynatCategory entityDynatCategory
        ,
        Callback<EntityDynatCategory> callback
    );
    void entitiesDynatCategoryGet(
            Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;EntityDynatCategory&gt;> callback
    );
    void entitiesDynatCategoryPost(
            EntityDynatCategory entityDynatCategory
        ,
        Callback<EntityDynatCategory> callback
    );
    void entitiesDynatCategorySearchGet(
            String filter
                    Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;EntityDynatCategory&gt;> callback
    );
    void entitiesDynatCategorySearchPost(
            EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest
        ,
        Callback<java.util.ArrayList&lt;EntityDynatCategory&gt;> callback
    );

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}
