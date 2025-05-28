package com.codegen.api;

import com.codegen.models.*;
import java.util.*;

public interface AuditEntitySnapshotApi {
    void entitiesAuditEntitySnapshotEntityIdDelete(
            String entityId
        ,
        Callback<Void> callback
    );
    void entitiesAuditEntitySnapshotEntityIdGet(
            String entityId
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<EntityAuditEntitySnapshot> callback
    );
    void entitiesAuditEntitySnapshotEntityIdPut(
            String entityId
                    EntityAuditEntitySnapshot entityAuditEntitySnapshot
        ,
        Callback<EntityAuditEntitySnapshot> callback
    );
    void entitiesAuditEntitySnapshotGet(
            Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;EntityAuditEntitySnapshot&gt;> callback
    );
    void entitiesAuditEntitySnapshotPost(
            EntityAuditEntitySnapshot entityAuditEntitySnapshot
        ,
        Callback<EntityAuditEntitySnapshot> callback
    );
    void entitiesAuditEntitySnapshotSearchGet(
            String filter
                    Boolean returnCount
                    String offset
                    String limit
                    String sort
                    Boolean dynamicAttributes
                    Boolean returnNulls
                    String fetchPlan
        ,
        Callback<java.util.ArrayList&lt;EntityAuditEntitySnapshot&gt;> callback
    );
    void entitiesAuditEntitySnapshotSearchPost(
            EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest
        ,
        Callback<java.util.ArrayList&lt;EntityAuditEntitySnapshot&gt;> callback
    );

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}
