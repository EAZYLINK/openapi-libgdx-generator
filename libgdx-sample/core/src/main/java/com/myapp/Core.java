package com.myapp;

import com.badlogic.gdx.ApplicationAdapter;
import org.openapitools.client.api.UserApi;
import org.openapitools.client.*;
import org.openapitools.client.models.*;

public class Core extends ApplicationAdapter {
    private UserApi userApi;

    @Override
    public void create() {
        // Initialize userApi (e.g., via ApiClient)
        userApi = new ApiClient(new Configuration("https://api.example.com")).getUserApi();

        userApi.entitiesUserEntityIdGet(
            "123e4567-e89b-12d3-a456-426614174000",
            true,
            true,
            "default",
            new UserApi.Callback<Entity_User>() {
                @Override
                public void onSuccess(Entity_User result) {
                    // Handle success, e.g., log or process result
                    System.out.println("User retrieved: " + result);
                }

                @Override
                public void onFailure(Exception e) {
                    // Handle failure
                    System.err.println("Failed to retrieve user: " + e.getMessage());
                }
            }
        );
    }
}