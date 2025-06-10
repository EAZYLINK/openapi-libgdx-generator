package com.myapp.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
import java.util.*;

public class EntityBan implements Json.Serializable {
    private String entityName;
    private String instanceName;
    private String reason;
    private String createdDate;
    private String createdBy;
    private String lastModifiedDate;
    private String deletedDate;
    private EntityUser bannedBy;
    private String lastModifiedBy;
    private String id;
    private EntityUser user;
    private String deletedBy;

    public EntityBan() {
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
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
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
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    public String getDeletedDate() {
        return deletedDate;
    }
    public void setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
    }
    public EntityUser getBannedBy() {
        return bannedBy;
    }
    public void setBannedBy(EntityUser bannedBy) {
        this.bannedBy = bannedBy;
    }
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public EntityUser getUser() {
        return user;
    }
    public void setUser(EntityUser user) {
        this.user = user;
    }
    public String getDeletedBy() {
        return deletedBy;
    }
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public void write(Json json) {
        json.writeValue("entityName", entityName);
        json.writeValue("instanceName", instanceName);
        json.writeValue("reason", reason);
        json.writeValue("createdDate", createdDate);
        json.writeValue("createdBy", createdBy);
        json.writeValue("lastModifiedDate", lastModifiedDate);
        json.writeValue("deletedDate", deletedDate);
        json.writeValue("bannedBy", bannedBy);
        json.writeValue("lastModifiedBy", lastModifiedBy);
        json.writeValue("id", id);
        json.writeValue("user", user);
        json.writeValue("deletedBy", deletedBy);
    }

        @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("_entityName", String.class, jsonData);
        instanceName = json.readValue("_instanceName", String.class, jsonData);
        reason = json.readValue("reason", String.class, jsonData);
        createdDate = json.readValue("createdDate", String.class, jsonData);
        createdBy = json.readValue("createdBy", String.class, jsonData);
        lastModifiedDate = json.readValue("lastModifiedDate", String.class, jsonData);
        deletedDate = json.readValue("deletedDate", String.class, jsonData);
        bannedBy = json.readValue("bannedBy", EntityUser.class, jsonData);
        lastModifiedBy = json.readValue("lastModifiedBy", String.class, jsonData);
        id = json.readValue("id", String.class, jsonData);
        user = json.readValue("user", EntityUser.class, jsonData);
        deletedBy = json.readValue("deletedBy", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static entityBan fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(EntityBan.class, jsonString);
    }
}