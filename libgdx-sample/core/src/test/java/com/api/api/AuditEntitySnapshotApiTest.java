package ;

import com.badlogic.gdx.Net.HttpResponseListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.api.api.AuditEntitySnapshotApi;

public class AuditEntitySnapshotApiTest {

    private final AuditEntitySnapshotApi api = new AuditEntitySnapshotApi();

    @Test
    public void testentitiesAuditEntitySnapshotEntityIdDelete() {
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
        api.entitiesAuditEntitySnapshotEntityIdDelete(entityId, callback);
    }
    @Test
    public void testentitiesAuditEntitySnapshotEntityIdGet() {
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
        api.entitiesAuditEntitySnapshotEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesAuditEntitySnapshotEntityIdPut() {
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
        api.entitiesAuditEntitySnapshotEntityIdPut(entityId, entityAuditEntitySnapshot, callback);
    }
    @Test
    public void testentitiesAuditEntitySnapshotGet() {
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
        api.entitiesAuditEntitySnapshotGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesAuditEntitySnapshotPost() {
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
        api.entitiesAuditEntitySnapshotPost(entityAuditEntitySnapshot, callback);
    }
    @Test
    public void testentitiesAuditEntitySnapshotSearchGet() {
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
        api.entitiesAuditEntitySnapshotSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan, callback);
    }
    @Test
    public void testentitiesAuditEntitySnapshotSearchPost() {
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
        api.entitiesAuditEntitySnapshotSearchPost(entitiesDynatCategorySearchPostRequest, callback);
    }
}
