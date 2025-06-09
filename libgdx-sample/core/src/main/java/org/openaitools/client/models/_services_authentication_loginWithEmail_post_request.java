package org.openaitools.client.models;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Array;
import java.util.*;

public class _services_authentication_loginWithEmail_post_request implements Json.Serializable {
<<<<<<< HEAD:libgdx-sample/core/src/main/java/org/openaitools/client/models/_services_authentication_loginWithEmail_post_request.java
=======
	
>>>>>>> parent of 43865dd (datatype fix):libgdx-sample/core/src/main/java/com/codegen/models/_services_authentication_loginWithEmail_post_request.java
    private String email;
    private String password;

    public _services_authentication_loginWithEmail_post_request() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void write(Json json) {
        json.writeValue("email", email);
        json.writeValue("password", password);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        email = json.readValue("email", String.class, jsonData);
        password = json.readValue("password", String.class, jsonData);
    }

    @Override
    public String toString() {
        Json json = new Json();
        return json.toJson(this);
    }

    public static _services_authentication_loginWithEmail_post_request fromJson(String jsonString) {
        Json json = new Json();
        return json.fromJson(_services_authentication_loginWithEmail_post_request.class, jsonString);
    }
}