package com.myapp.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import com.myapp.client.models.*;
import java.util.*;

public interface AuditEntitySnapshotApi {
    void entitiesAuditEntitySnapshotEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesAuditEntitySnapshotEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<EntityAuditEntitySnapshot> callback);
    void entitiesAuditEntitySnapshotEntityIdPut( String entityId, EntityAuditEntitySnapshot entityAuditEntitySnapshot, Callback<EntityAuditEntitySnapshot> callback);
    void entitiesAuditEntitySnapshotGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityAuditEntitySnapshot>> callback);
    void entitiesAuditEntitySnapshotPost( EntityAuditEntitySnapshot entityAuditEntitySnapshot, Callback<EntityAuditEntitySnapshot> callback);
    void entitiesAuditEntitySnapshotSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<EntityAuditEntitySnapshot>> callback);
    void entitiesAuditEntitySnapshotSearchPost( EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<EntityAuditEntitySnapshot>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}