package com.myapp;

import com.badlogic.gdx.ApplicationAdapter;
import com.myapp.client.api.UserApi;
import com.myapp.client.models.EntityUser;
import com.myapp.client.*;

public class Core extends ApplicationAdapter {
    private UserApi userApi;

    @Override
    public void create() {
        userApi = new ApiClient(new Configuration("https://platform.lurkers.io/rest/services/authentication/loginAnonymously")).getUserApi();

        userApi.entitiesUserEntityIdGet(
            "123e4567-e89b-12d3-a456-426614174000",
            true,
            true,
            "default",
            new UserApi.Callback<EntityUser>() {
                @Override
                public void onSuccess(EntityUser result) {
                    System.out.println("User retrieved: " + result);
                }

                @Override
                public void onFailure(Exception e) {
                    System.err.println("Failed to retrieve user: " + e.getMessage());
                }
            }
        );
    }
    
    @Override
    public void render() {
    }

    @Override
    public void dispose() {
    }
}