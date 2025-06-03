package com.codegen.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.*;

public class Entity_User implements Json.Serializable {
	private String entityName;
	private String instanceName;
	private String country;
	private String lastName;
	private String city;
	private String lastModifiedDate;
	private String timeZoneId;
	private BigDecimal latitude;
	private String lastModifiedBy;
	private Boolean active;
	private Array<> bans;
	private String customId;
	private Integer version;
	private String deletedBy;
	private String firstName;
	private String password;
	private String createdDate;
	private String createdBy;
	private String deletedDate;
	private String countryCode;
	private UUID id;
	private String email;
	private BigDecimal longitude;
	private String username;

    public Entity_User() {
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    public String getTimeZoneId() {
        return timeZoneId;
    }
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
    public BigDecimal getLatitude() {
        return latitude;
    }
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Array<Entity_Ban> getBans() {
        return bans;
    }
    public void setBans(Array<Entity_Ban> bans) {
        this.bans = bans;
    }
    public String getCustomId() {
        return customId;
    }
    public void setCustomId(String customId) {
        this.customId = customId;
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
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
    public String getDeletedDate() {
        return deletedDate;
    }
    public void setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BigDecimal getLongitude() {
        return longitude;
    }
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void write(Json json) {
        json.writeValue("entityName", entityName);
        json.writeValue("instanceName", instanceName);
        json.writeValue("country", country);
        json.writeValue("lastName", lastName);
        json.writeValue("city", city);
        json.writeValue("lastModifiedDate", lastModifiedDate);
        json.writeValue("timeZoneId", timeZoneId);
        json.writeValue("latitude", latitude);
        json.writeValue("lastModifiedBy", lastModifiedBy);
        json.writeValue("active", active);
        json.writeValue("bans", bans);
        json.writeValue("customId", customId);
        json.writeValue("version", version);
        json.writeValue("deletedBy", deletedBy);
        json.writeValue("firstName", firstName);
        json.writeValue("password", password);
        json.writeValue("createdDate", createdDate);
        json.writeValue("createdBy", createdBy);
        json.writeValue("deletedDate", deletedDate);
        json.writeValue("countryCode", countryCode);
        json.writeValue("id", id);
        json.writeValue("email", email);
        json.writeValue("longitude", longitude);
        json.writeValue("username", username);
    }

        @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("_entityName", String.class, jsonData);
        instanceName = json.readValue("_instanceName", String.class, jsonData);
        country = json.readValue("country", String.class, jsonData);
        lastName = json.readValue("lastName", String.class, jsonData);
        city = json.readValue("city", String.class, jsonData);
        lastModifiedDate = json.readValue("lastModifiedDate", String.class, jsonData);
        timeZoneId = json.readValue("timeZoneId", String.class, jsonData);
        latitude = json.readValue("latitude", BigDecimal.class, jsonData);
        lastModifiedBy = json.readValue("lastModifiedBy", String.class, jsonData);
        active = json.readValue("active", Boolean.class, jsonData);
        bans = json.readValue("bans", Array.class, Entity_Ban.class, jsonData);
        customId = json.readValue("customId", String.class, jsonData);
        version = json.readValue("version", Integer.class, jsonData);
        deletedBy = json.readValue("deletedBy", String.class, jsonData);
        firstName = json.readValue("firstName", String.class, jsonData);
        password = json.readValue("password", String.class, jsonData);
        createdDate = json.readValue("createdDate", String.class, jsonData);
        createdBy = json.readValue("createdBy", String.class, jsonData);
        deletedDate = json.readValue("deletedDate", String.class, jsonData);
        countryCode = json.readValue("countryCode", String.class, jsonData);
        id = json.readValue("id", UUID.class, jsonData);
        email = json.readValue("email", String.class, jsonData);
        longitude = json.readValue("longitude", BigDecimal.class, jsonData);
        username = json.readValue("username", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static Entity_User fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(Entity_User.class, jsonString);
    }
}