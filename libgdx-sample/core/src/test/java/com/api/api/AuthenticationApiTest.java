package ;

import com.badlogic.gdx.Net.HttpResponseListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.api.api.AuthenticationApi;

public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    @Test
    public void testservicesAuthenticationAddUsernamePasswordGet() {
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
        api.servicesAuthenticationAddUsernamePasswordGet(user, username, email, password, callback);
    }
    @Test
    public void testservicesAuthenticationAddUsernamePasswordPost() {
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
        api.servicesAuthenticationAddUsernamePasswordPost(servicesAuthenticationAddUsernamePasswordPostRequest, callback);
    }
    @Test
    public void testservicesAuthenticationLoginAnonymouslyGet() {
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
        api.servicesAuthenticationLoginAnonymouslyGet(callback);
    }
    @Test
    public void testservicesAuthenticationLoginAnonymouslyPost() {
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
        api.servicesAuthenticationLoginAnonymouslyPost(body, callback);
    }
    @Test
    public void testservicesAuthenticationLoginWithCustomIdGet() {
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
        api.servicesAuthenticationLoginWithCustomIdGet(customId, createIfNotExists, callback);
    }
    @Test
    public void testservicesAuthenticationLoginWithCustomIdPost() {
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
        api.servicesAuthenticationLoginWithCustomIdPost(servicesAuthenticationLoginWithCustomIdPostRequest, callback);
    }
    @Test
    public void testservicesAuthenticationLoginWithEmailGet() {
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
        api.servicesAuthenticationLoginWithEmailGet(email, password, callback);
    }
    @Test
    public void testservicesAuthenticationLoginWithEmailPost() {
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
        api.servicesAuthenticationLoginWithEmailPost(servicesAuthenticationLoginWithEmailPostRequest, callback);
    }
}
