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
    private java.util.ArrayList<Entity_Ban> bans;
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
        return country;
    }

    public void set(String country) {
        this.country = country;
    }
    public String get() {
        return lastName;
    }

    public void set(String lastName) {
        this.lastName = lastName;
    }
    public String get() {
        return city;
    }

    public void set(String city) {
        this.city = city;
    }
    public String get() {
        return lastModifiedDate;
    }

    public void set(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    public String get() {
        return timeZoneId;
    }

    public void set(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
    public BigDecimal get() {
        return latitude;
    }

    public void set(BigDecimal latitude) {
        this.latitude = latitude;
    }
    public String get() {
        return lastModifiedBy;
    }

    public void set(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    public Boolean get() {
        return active;
    }

    public void set(Boolean active) {
        this.active = active;
    }
    public java.util.ArrayList&lt;Entity_Ban&gt; get() {
        return bans;
    }

    public void set(java.util.ArrayList&lt;Entity_Ban&gt; bans) {
        this.bans = bans;
    }
    public String get() {
        return customId;
    }

    public void set(String customId) {
        this.customId = customId;
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
        return firstName;
    }

    public void set(String firstName) {
        this.firstName = firstName;
    }
    public String get() {
        return password;
    }

    public void set(String password) {
        this.password = password;
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
        return deletedDate;
    }

    public void set(String deletedDate) {
        this.deletedDate = deletedDate;
    }
    public String get() {
        return countryCode;
    }

    public void set(String countryCode) {
        this.countryCode = countryCode;
    }
    public UUID get() {
        return id;
    }

    public void set(UUID id) {
        this.id = id;
    }
    public String get() {
        return email;
    }

    public void set(String email) {
        this.email = email;
    }
    public BigDecimal get() {
        return longitude;
    }

    public void set(BigDecimal longitude) {
        this.longitude = longitude;
    }
    public String get() {
        return username;
    }

    public void set(String username) {
        this.username = username;
    }

    @Override
    public void write(Json json) {
        json.write("entityName", entityName);
        json.write("instanceName", instanceName);
        json.write("country", country);
        json.write("lastName", lastName);
        json.write("city", city);
        json.write("lastModifiedDate", lastModifiedDate);
        json.write("timeZoneId", timeZoneId);
        json.write("latitude", latitude);
        json.write("lastModifiedBy", lastModifiedBy);
        json.write("active", active);
        json.write("bans", bans);
        json.write("customId", customId);
        json.write("version", version);
        json.write("deletedBy", deletedBy);
        json.write("firstName", firstName);
        json.write("password", password);
        json.write("createdDate", createdDate);
        json.write("createdBy", createdBy);
        json.write("deletedDate", deletedDate);
        json.write("countryCode", countryCode);
        json.write("id", id);
        json.write("email", email);
        json.write("longitude", longitude);
        json.write("username", username);
        

    @Override
    public void read(Json json, JsonValue jsonData) {
        entityName = json.readValue("entityName", String.class, jsonData);
        instanceName = json.readValue("instanceName", String.class, jsonData);
        country = json.readValue("country", String.class, jsonData);
        lastName = json.readValue("lastName", String.class, jsonData);
        city = json.readValue("city", String.class, jsonData);
        lastModifiedDate = json.readValue("lastModifiedDate", String.class, jsonData);
        timeZoneId = json.readValue("timeZoneId", String.class, jsonData);
        latitude = json.readValue("latitude", BigDecimal.class, jsonData);
        lastModifiedBy = json.readValue("lastModifiedBy", String.class, jsonData);
        active = json.readValue("active", Boolean.class, jsonData);
        bans = json.readValue("bans", java.util.ArrayList&lt;Entity_Ban&gt;.class, jsonData);
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
