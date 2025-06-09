package libgdx.client.api;

import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.utils.Json;
import libgdx.client.models.*;
import java.util.*;

public interface AuditEntitySnapshotApi {
    void entitiesAuditEntitySnapshotEntityIdDelete( String entityId, Callback<Void> callback);
    void entitiesAuditEntitySnapshotEntityIdGet( String entityId, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<Entity_audit_EntitySnapshot> callback);
    void entitiesAuditEntitySnapshotEntityIdPut( String entityId, Entity_audit_EntitySnapshot entityAuditEntitySnapshot, Callback<Entity_audit_EntitySnapshot> callback);
    void entitiesAuditEntitySnapshotGet( Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_audit_EntitySnapshot>> callback);
    void entitiesAuditEntitySnapshotPost( Entity_audit_EntitySnapshot entityAuditEntitySnapshot, Callback<Entity_audit_EntitySnapshot> callback);
    void entitiesAuditEntitySnapshotSearchGet( String filter, Boolean returnCount, String offset, String limit, String sort, Boolean dynamicAttributes, Boolean returnNulls, String fetchPlan, Callback<java.util.ArrayList<Entity_audit_EntitySnapshot>> callback);
    void entitiesAuditEntitySnapshotSearchPost( _entities_dynat_Category_search_post_request entitiesDynatCategorySearchPostRequest, Callback<java.util.ArrayList<Entity_audit_EntitySnapshot>> callback);

    interface Callback<T> {
        void onSuccess(T result);
        void onFailure(Exception e);
    }
}