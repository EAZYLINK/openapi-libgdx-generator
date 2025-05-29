package com.codegen.api;

import com.badlogic.gdx.Net.HttpResponseListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.codegen.api.BanApi;

public class BanApiTest {

    private final BanApi api = new BanApi();

    @Test
    public void testentitiesBanEntityIdDelete() {
        // Arrange
        HttpResponseListener callback = new HttpResponseListener() {
            @Override
            public void handleHttpResponse(com.badlogic.gdx.Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                System.out.println("Status code: " + status);
                System.out.println("Response: " + httpResponse.getResultAsString());
                assertTrue(status >= 200 && status < 300);
            }

            @Override
            public void failed(Throwable t) {
                fail("Request failed: " + t.getMessage());
            }

            @Override
            public void cancelled() {
                fail("Request was cancelled.");
            }
        };

        // Act
        api.entitiesBanEntityIdDelete(entityId, callback);
    }
    @Test
    public void testentitiesBanEntityIdGet() {
        // Arrange
        HttpResponseListener callback = new HttpResponseListener() {
            @Override
            public void handleHttpResponse(com.badlogic.gdx.Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                System.out.println("Status code: " + status);
                System.out.println("Response: " + httpResponse.getResultAsString());
                assertTrue(status >= 200 && status < 300);
            }

            @Override
            public void failed(Throwable t) {
                fail("Request failed: " + t.getMessage());
            }

            @Override
            public void cancelled() {
                fail("Request was cancelled.");
            }
        };

        // Act
        api.entitiesBanEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesBanEntityIdPut() {
        // Arrange
        HttpResponseListener callback = new HttpResponseListener() {
            @Override
            public void handleHttpResponse(com.badlogic.gdx.Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                System.out.println("Status code: " + status);
                System.out.println("Response: " + httpResponse.getResultAsString());
                assertTrue(status >= 200 && status < 300);
            }

            @Override
            public void failed(Throwable t) {
                fail("Request failed: " + t.getMessage());
            }

            @Override
            public void cancelled() {
                fail("Request was cancelled.");
            }
        };

        // Act
        api.entitiesBanEntityIdPut(entityId, entityBan, callback);
    }
    @Test
    public void testentitiesBanGet() {
        // Arrange
        HttpResponseListener callback = new HttpResponseListener() {
            @Override
            public void handleHttpResponse(com.badlogic.gdx.Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                System.out.println("Status code: " + status);
                System.out.println("Response: " + httpResponse.getResultAsString());
                assertTrue(status >= 200 && status < 300);
            }

            @Override
            public void failed(Throwable t) {
                fail("Request failed: " + t.getMessage());
            }

            @Override
            public void cancelled() {
                fail("Request was cancelled.");
            }
        };

        // Act
        api.entitiesBanGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesBanPost() {
        // Arrange
        HttpResponseListener callback = new HttpResponseListener() {
            @Override
            public void handleHttpResponse(com.badlogic.gdx.Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                System.out.println("Status code: " + status);
                System.out.println("Response: " + httpResponse.getResultAsString());
                assertTrue(status >= 200 && status < 300);
            }

            @Override
            public void failed(Throwable t) {
                fail("Request failed: " + t.getMessage());
            }

            @Override
            public void cancelled() {
                fail("Request was cancelled.");
            }
        };

        // Act
        api.entitiesBanPost(entityBan, callback);
    }
    @Test
    public void testentitiesBanSearchGet() {
        // Arrange
        HttpResponseListener callback = new HttpResponseListener() {
            @Override
            public void handleHttpResponse(com.badlogic.gdx.Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                System.out.println("Status code: " + status);
                System.out.println("Response: " + httpResponse.getResultAsString());
                assertTrue(status >= 200 && status < 300);
            }

            @Override
            public void failed(Throwable t) {
                fail("Request failed: " + t.getMessage());
            }

            @Override
            public void cancelled() {
                fail("Request was cancelled.");
            }
        };

        // Act
        api.entitiesBanSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesBanSearchPost() {
        // Arrange
        HttpResponseListener callback = new HttpResponseListener() {
            @Override
            public void handleHttpResponse(com.badlogic.gdx.Net.HttpResponse httpResponse) {
                int status = httpResponse.getStatus().getStatusCode();
                System.out.println("Status code: " + status);
                System.out.println("Response: " + httpResponse.getResultAsString());
                assertTrue(status >= 200 && status < 300);
            }

            @Override
            public void failed(Throwable t) {
                fail("Request failed: " + t.getMessage());
            }

            @Override
            public void cancelled() {
                fail("Request was cancelled.");
            }
        };

        // Act
        api.entitiesBanSearchPost(entitiesDynatCategorySearchPostRequest, callback);
    }
}
