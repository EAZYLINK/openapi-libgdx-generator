package test.api;

import com.badlogic.gdx.Net.HttpResponseListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import api.DynatCategoryApi;

public class DynatCategoryApiTest {

    private final DynatCategoryApi api = new DynatCategoryApi();

    @Test
    public void testentitiesDynatCategoryEntityIdDelete() {
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
        api.entitiesDynatCategoryEntityIdDelete(entityId, callback);
    }
    @Test
    public void testentitiesDynatCategoryEntityIdGet() {
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
        api.entitiesDynatCategoryEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesDynatCategoryEntityIdPut() {
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
        api.entitiesDynatCategoryEntityIdPut(entityId, entityDynatCategory, callback);
    }
    @Test
    public void testentitiesDynatCategoryGet() {
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
        api.entitiesDynatCategoryGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesDynatCategoryPost() {
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
        api.entitiesDynatCategoryPost(entityDynatCategory, callback);
    }
    @Test
    public void testentitiesDynatCategorySearchGet() {
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
        api.entitiesDynatCategorySearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesDynatCategorySearchPost() {
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
        api.entitiesDynatCategorySearchPost(entitiesDynatCategorySearchPostRequest, callback);
    }
}
