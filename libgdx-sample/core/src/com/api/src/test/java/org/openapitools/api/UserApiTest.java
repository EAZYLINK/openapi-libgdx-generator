package ;

import com.badlogic.gdx.Net.HttpResponseListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.openapitools.api.UserApi;

public class UserApiTest {

    private final UserApi api = new UserApi();

    @Test
    public void testentitiesUserEntityIdDelete() {
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
        api.entitiesUserEntityIdDelete(entityId, callback);
    }
    @Test
    public void testentitiesUserEntityIdGet() {
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
        api.entitiesUserEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesUserEntityIdPut() {
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
        api.entitiesUserEntityIdPut(entityId, entityUser, callback);
    }
    @Test
    public void testentitiesUserGet() {
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
        api.entitiesUserGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesUserPost() {
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
        api.entitiesUserPost(entityUser, callback);
    }
    @Test
    public void testentitiesUserSearchGet() {
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
        api.entitiesUserSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesUserSearchPost() {
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
        api.entitiesUserSearchPost(entitiesDynatCategorySearchPostRequest, callback);
    }
}
