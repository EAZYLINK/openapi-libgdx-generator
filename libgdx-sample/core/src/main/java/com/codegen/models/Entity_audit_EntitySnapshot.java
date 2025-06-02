package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class Entity_audit_EntitySnapshot implements Json.Serializable {
	
    private String entityName;
    private String instanceName;
    private String snapshotXml;
    private OffsetDateTime snapshotDate;
    private OffsetDateTime createdDate;
    private String createdBy;
    private String fetchPlanXml;
    private String entityMetaClass;
    private String authorUsername;
    private String sysTenantId;
    private UUID id;

    public Entity_audit_EntitySnapshot() {
    }

    public String get() {
        return entityName;
    }

    public void set(String entityName) {
        this.entityName = entityName;
    }
    public String get() {
        return instanceName;
    }

    public void set(String instanceName) {
        this.instanceName = instanceName;
    }
    public String get() {
        return snapshotXml;
    }

    public void set(String snapshotXml) {
        this.snapshotXml = snapshotXml;
    }
    public OffsetDateTime get() {
        return snapshotDate;
    }

    public void set(OffsetDateTime snapshotDate) {
        this.snapshotDate = snapshotDate;
    }
    public OffsetDateTime get() {
        return createdDate;
    }

    public void set(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }
    public String get() {
        return createdBy;
    }

    public void set(String createdBy) {
        this.createdBy = createdBy;
    }
    public String get() {
        return fetchPlanXml;
    }

    public void set(String fetchPlanXml) {
        this.fetchPlanXml = fetchPlanXml;
    }
    public String get() {
        return entityMetaClass;
    }

    public void set(String entityMetaClass) {
        this.entityMetaClass = entityMetaClass;
    }
    public String get() {
        return authorUsername;
    }

    public void set(String authorUsername) {
        this.authorUsername = authorUsername;
    }
    public String get() {
        return sysTenantId;
    }

    public void set(String sysTenantId) {
        this.sysTenantId = sysTenantId;
    }
    public UUID get() {
        return id;
    }

    public void set(UUID id) {
        this.id = id;
    }

    @Override
    public void write(Json json) {
        json.write("entityName", entityName);
        json.write("instanceName", instanceName);
        json.write("snapshotXml", snapshotXml);
        json.write("snapshotDate", snapshotDate);
        json.write("createdDate", createdDate);
        json.write("createdBy", createdBy);
        json.write("fetchPlanXml", fetchPlanXml);
        json.write("entityMetaClass", entityMetaClass);
        json.write("authorUsername", authorUsername);
        json.write("sysTenantId", sysTenantId);
        json.write("id", id);
        

    @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("entityName", String.class, jsonData);
        instanceName = json.readValue("instanceName", String.class, jsonData);
        snapshotXml = json.readValue("snapshotXml", String.class, jsonData);
        snapshotDate = json.readValue("snapshotDate", OffsetDateTime.class, jsonData);
        createdDate = json.readValue("createdDate", OffsetDateTime.class, jsonData);
        createdBy = json.readValue("createdBy", String.class, jsonData);
        fetchPlanXml = json.readValue("fetchPlanXml", String.class, jsonData);
        entityMetaClass = json.readValue("entityMetaClass", String.class, jsonData);
        authorUsername = json.readValue("authorUsername", String.class, jsonData);
        sysTenantId = json.readValue("sysTenantId", String.class, jsonData);
        id = json.readValue("id", UUID.class, jsonData);
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
