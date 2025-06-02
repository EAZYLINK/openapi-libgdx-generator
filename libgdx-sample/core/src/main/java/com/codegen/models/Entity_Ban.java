package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class Entity_Ban implements Json.Serializable {
	
    private String entityName;
    private String instanceName;
    private String reason;
    private String createdDate;
    private String createdBy;
    private String lastModifiedDate;
    private String deletedDate;
    private Entity_User bannedBy;
    private String lastModifiedBy;
    private UUID id;
    private Entity_User user;
    private String deletedBy;

    public Entity_Ban() {
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
        return reason;
    }

    public void set(String reason) {
        this.reason = reason;
    }
    public String get() {
        return createdDate;
    }

    public void set(String createdDate) {
        this.createdDate = createdDate;
    }
    public String get() {
        return createdBy;
    }

    public void set(String createdBy) {
        this.createdBy = createdBy;
    }
    public String get() {
        return lastModifiedDate;
    }

    public void set(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    public String get() {
        return deletedDate;
    }

    public void set(String deletedDate) {
        this.deletedDate = deletedDate;
    }
    public Entity_User get() {
        return bannedBy;
    }

    public void set(Entity_User bannedBy) {
        this.bannedBy = bannedBy;
    }
    public String get() {
        return lastModifiedBy;
    }

    public void set(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    public UUID get() {
        return id;
    }

    public void set(UUID id) {
        this.id = id;
    }
    public Entity_User get() {
        return user;
    }

    public void set(Entity_User user) {
        this.user = user;
    }
    public String get() {
        return deletedBy;
    }

    public void set(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public void write(Json json) {
        json.write("entityName", entityName);
        json.write("instanceName", instanceName);
        json.write("reason", reason);
        json.write("createdDate", createdDate);
        json.write("createdBy", createdBy);
        json.write("lastModifiedDate", lastModifiedDate);
        json.write("deletedDate", deletedDate);
        json.write("bannedBy", bannedBy);
        json.write("lastModifiedBy", lastModifiedBy);
        json.write("id", id);
        json.write("user", user);
        json.write("deletedBy", deletedBy);
        

    @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("entityName", String.class, jsonData);
        instanceName = json.readValue("instanceName", String.class, jsonData);
        reason = json.readValue("reason", String.class, jsonData);
        createdDate = json.readValue("createdDate", String.class, jsonData);
        createdBy = json.readValue("createdBy", String.class, jsonData);
        lastModifiedDate = json.readValue("lastModifiedDate", String.class, jsonData);
        deletedDate = json.readValue("deletedDate", String.class, jsonData);
        bannedBy = json.readValue("bannedBy", Entity_User.class, jsonData);
        lastModifiedBy = json.readValue("lastModifiedBy", String.class, jsonData);
        id = json.readValue("id", UUID.class, jsonData);
        user = json.readValue("user", Entity_User.class, jsonData);
        deletedBy = json.readValue("deletedBy", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static Entity_Ban fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(Entity_Ban.class, jsonString);
    }
