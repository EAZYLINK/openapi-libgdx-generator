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
    public String getLocaleNames() {
        return localeNames;
    }

    public void setLocaleNames(String localeNames) {
        this.localeNames = localeNames;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
    public OffsetDateTime getDeleteTs() {
        return deleteTs;
    }

    public void setDeleteTs(OffsetDateTime deleteTs) {
        this.deleteTs = deleteTs;
    }
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public OffsetDateTime getCreateTs() {
        return createTs;
    }

    public void setCreateTs(OffsetDateTime createTs) {
        this.createTs = createTs;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public OffsetDateTime getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(OffsetDateTime updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public void write(Json json) {
        json.writeValue("entityName", entityName);
        json.writeValue("instanceName", instanceName);
        json.writeValue("localeNames", localeNames);
        json.writeValue("updatedBy", updatedBy);
        json.writeValue("entityType", entityType);
        json.writeValue("version", version);
        json.writeValue("deletedBy", deletedBy);
        json.writeValue("special", special);
        json.writeValue("deleteTs", deleteTs);
        json.writeValue("isDefault", isDefault);
        json.writeValue("createdBy", createdBy);
        json.writeValue("name", name);
        json.writeValue("createTs", createTs);
        json.writeValue("id", id);
        json.writeValue("updateTs", updateTs);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("_entityName", String.class, jsonData);
        instanceName = json.readValue("_instanceName", String.class, jsonData);
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
}