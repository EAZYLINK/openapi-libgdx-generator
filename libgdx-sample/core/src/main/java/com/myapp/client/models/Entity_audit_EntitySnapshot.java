package com.myapp.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
import java.util.*;

public class Entity_audit_EntitySnapshot implements Json.Serializable {
    private String entityName;
    private String instanceName;
    private String snapshotXml;
    private String snapshotDate;
    private String createdDate;
    private String createdBy;
    private String fetchPlanXml;
    private String entityMetaClass;
    private String authorUsername;
    private String sysTenantId;
    private String id;

    public Entity_audit_EntitySnapshot() {
    }

   
    public String getEntityName() {
        return entityName;
    }
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    public String getInstanceName() {
        return instanceName;
    }
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
    public String getSnapshotXml() {
        return snapshotXml;
    }
    public void setSnapshotXml(String snapshotXml) {
        this.snapshotXml = snapshotXml;
    }
    public String getSnapshotDate() {
        return snapshotDate;
    }
    public void setSnapshotDate(String snapshotDate) {
        this.snapshotDate = snapshotDate;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getFetchPlanXml() {
        return fetchPlanXml;
    }
    public void setFetchPlanXml(String fetchPlanXml) {
        this.fetchPlanXml = fetchPlanXml;
    }
    public String getEntityMetaClass() {
        return entityMetaClass;
    }
    public void setEntityMetaClass(String entityMetaClass) {
        this.entityMetaClass = entityMetaClass;
    }
    public String getAuthorUsername() {
        return authorUsername;
    }
    public void setAuthorUsername(String authorUsername) {
        this.authorUsername = authorUsername;
    }
    public String getSysTenantId() {
        return sysTenantId;
    }
    public void setSysTenantId(String sysTenantId) {
        this.sysTenantId = sysTenantId;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void write(Json json) {
        json.writeValue("entityName", entityName);
        json.writeValue("instanceName", instanceName);
        json.writeValue("snapshotXml", snapshotXml);
        json.writeValue("snapshotDate", snapshotDate);
        json.writeValue("createdDate", createdDate);
        json.writeValue("createdBy", createdBy);
        json.writeValue("fetchPlanXml", fetchPlanXml);
        json.writeValue("entityMetaClass", entityMetaClass);
        json.writeValue("authorUsername", authorUsername);
        json.writeValue("sysTenantId", sysTenantId);
        json.writeValue("id", id);
    }

        @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("_entityName", String.class, jsonData);
        instanceName = json.readValue("_instanceName", String.class, jsonData);
        snapshotXml = json.readValue("snapshotXml", String.class, jsonData);
        snapshotDate = json.readValue("snapshotDate", String.class, jsonData);
        createdDate = json.readValue("createdDate", String.class, jsonData);
        createdBy = json.readValue("createdBy", String.class, jsonData);
        fetchPlanXml = json.readValue("fetchPlanXml", String.class, jsonData);
        entityMetaClass = json.readValue("entityMetaClass", String.class, jsonData);
        authorUsername = json.readValue("authorUsername", String.class, jsonData);
        sysTenantId = json.readValue("sysTenantId", String.class, jsonData);
        id = json.readValue("id", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static Entity_audit_EntitySnapshot fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(Entity_audit_EntitySnapshot.class, jsonString);
    }
}