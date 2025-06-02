package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class Entity_dynat_Category implements Json.Serializable {
	
    private String entityName;
    private String instanceName;
    private String localeNames;
    private String updatedBy;
    private String entityType;
    private Integer version;
    private String deletedBy;
    private String special;
    private OffsetDateTime deleteTs;
    private Boolean isDefault;
    private String createdBy;
    private String name;
    private OffsetDateTime createTs;
    private UUID id;
    private OffsetDateTime updateTs;

    public Entity_dynat_Category() {
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
        return localeNames;
    }

    public void set(String localeNames) {
        this.localeNames = localeNames;
    }
    public String get() {
        return updatedBy;
    }

    public void set(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String get() {
        return entityType;
    }

    public void set(String entityType) {
        this.entityType = entityType;
    }
    public Integer get() {
        return version;
    }

    public void set(Integer version) {
        this.version = version;
    }
    public String get() {
        return deletedBy;
    }

    public void set(String deletedBy) {
        this.deletedBy = deletedBy;
    }
    public String get() {
        return special;
    }

    public void set(String special) {
        this.special = special;
    }
    public OffsetDateTime get() {
        return deleteTs;
    }

    public void set(OffsetDateTime deleteTs) {
        this.deleteTs = deleteTs;
    }
    public Boolean get() {
        return isDefault;
    }

    public void set(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    public String get() {
        return createdBy;
    }

    public void set(String createdBy) {
        this.createdBy = createdBy;
    }
    public String get() {
        return name;
    }

    public void set(String name) {
        this.name = name;
    }
    public OffsetDateTime get() {
        return createTs;
    }

    public void set(OffsetDateTime createTs) {
        this.createTs = createTs;
    }
    public UUID get() {
        return id;
    }

    public void set(UUID id) {
        this.id = id;
    }
    public OffsetDateTime get() {
        return updateTs;
    }

    public void set(OffsetDateTime updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public void write(Json json) {
        json.write("entityName", entityName);
        json.write("instanceName", instanceName);
        json.write("localeNames", localeNames);
        json.write("updatedBy", updatedBy);
        json.write("entityType", entityType);
        json.write("version", version);
        json.write("deletedBy", deletedBy);
        json.write("special", special);
        json.write("deleteTs", deleteTs);
        json.write("isDefault", isDefault);
        json.write("createdBy", createdBy);
        json.write("name", name);
        json.write("createTs", createTs);
        json.write("id", id);
        json.write("updateTs", updateTs);
        

    @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("entityName", String.class, jsonData);
        instanceName = json.readValue("instanceName", String.class, jsonData);
        localeNames = json.readValue("localeNames", String.class, jsonData);
        updatedBy = json.readValue("updatedBy", String.class, jsonData);
        entityType = json.readValue("entityType", String.class, jsonData);
        version = json.readValue("version", Integer.class, jsonData);
        deletedBy = json.readValue("deletedBy", String.class, jsonData);
        special = json.readValue("special", String.class, jsonData);
        deleteTs = json.readValue("deleteTs", OffsetDateTime.class, jsonData);
        isDefault = json.readValue("isDefault", Boolean.class, jsonData);
        createdBy = json.readValue("createdBy", String.class, jsonData);
        name = json.readValue("name", String.class, jsonData);
        createTs = json.readValue("createTs", OffsetDateTime.class, jsonData);
        id = json.readValue("id", UUID.class, jsonData);
        updateTs = json.readValue("updateTs", OffsetDateTime.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static Entity_dynat_Category fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(Entity_dynat_Category.class, jsonString);
    }
