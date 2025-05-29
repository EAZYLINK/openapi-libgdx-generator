# AuthenticationApi

All URIs are relative to */rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**servicesAuthenticationAddUsernamePasswordGet**](AuthenticationApi.md#servicesAuthenticationAddUsernamePasswordGet) | **GET** /services/authentication/addUsernamePassword | authentication#addUsernamePassword |
| [**servicesAuthenticationAddUsernamePasswordPost**](AuthenticationApi.md#servicesAuthenticationAddUsernamePasswordPost) | **POST** /services/authentication/addUsernamePassword | authentication#addUsernamePassword |
| [**servicesAuthenticationLoginAnonymouslyGet**](AuthenticationApi.md#servicesAuthenticationLoginAnonymouslyGet) | **GET** /services/authentication/loginAnonymously | authentication#loginAnonymously |
| [**servicesAuthenticationLoginAnonymouslyPost**](AuthenticationApi.md#servicesAuthenticationLoginAnonymouslyPost) | **POST** /services/authentication/loginAnonymously | authentication#loginAnonymously |
| [**servicesAuthenticationLoginWithCustomIdGet**](AuthenticationApi.md#servicesAuthenticationLoginWithCustomIdGet) | **GET** /services/authentication/loginWithCustomId | authentication#loginWithCustomId |
| [**servicesAuthenticationLoginWithCustomIdPost**](AuthenticationApi.md#servicesAuthenticationLoginWithCustomIdPost) | **POST** /services/authentication/loginWithCustomId | authentication#loginWithCustomId |
| [**servicesAuthenticationLoginWithEmailGet**](AuthenticationApi.md#servicesAuthenticationLoginWithEmailGet) | **GET** /services/authentication/loginWithEmail | authentication#loginWithEmail |
| [**servicesAuthenticationLoginWithEmailPost**](AuthenticationApi.md#servicesAuthenticationLoginWithEmailPost) | **POST** /services/authentication/loginWithEmail | authentication#loginWithEmail |


<a id="servicesAuthenticationAddUsernamePasswordGet"></a>
# **servicesAuthenticationAddUsernamePasswordGet**
> String servicesAuthenticationAddUsernamePasswordGet(user, username, email, password)

authentication#addUsernamePassword

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String user = "user_example"; // String | 
    String username = "username_example"; // String | 
    String email = "email_example"; // String | 
    String password = "password_example"; // String | 
    try {
      String result = apiInstance.servicesAuthenticationAddUsernamePasswordGet(user, username, email, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationAddUsernamePasswordGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user** | **String**|  | |
| **username** | **String**|  | |
| **email** | **String**|  | |
| **password** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

<a id="servicesAuthenticationAddUsernamePasswordPost"></a>
# **servicesAuthenticationAddUsernamePasswordPost**
> String servicesAuthenticationAddUsernamePasswordPost(servicesAuthenticationAddUsernamePasswordPostRequest)

authentication#addUsernamePassword

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    ServicesAuthenticationAddUsernamePasswordPostRequest servicesAuthenticationAddUsernamePasswordPostRequest = new ServicesAuthenticationAddUsernamePasswordPostRequest(); // ServicesAuthenticationAddUsernamePasswordPostRequest | 
    try {
      String result = apiInstance.servicesAuthenticationAddUsernamePasswordPost(servicesAuthenticationAddUsernamePasswordPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationAddUsernamePasswordPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **servicesAuthenticationAddUsernamePasswordPostRequest** | [**ServicesAuthenticationAddUsernamePasswordPostRequest**](ServicesAuthenticationAddUsernamePasswordPostRequest.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

<a id="servicesAuthenticationLoginAnonymouslyGet"></a>
# **servicesAuthenticationLoginAnonymouslyGet**
> EntityUser servicesAuthenticationLoginAnonymouslyGet()

authentication#loginAnonymously

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      EntityUser result = apiInstance.servicesAuthenticationLoginAnonymouslyGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationLoginAnonymouslyGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EntityUser**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

<a id="servicesAuthenticationLoginAnonymouslyPost"></a>
# **servicesAuthenticationLoginAnonymouslyPost**
> EntityUser servicesAuthenticationLoginAnonymouslyPost(body)

authentication#loginAnonymously

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    Object body = null; // Object | 
    try {
      EntityUser result = apiInstance.servicesAuthenticationLoginAnonymouslyPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationLoginAnonymouslyPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

### Return type

[**EntityUser**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

<a id="servicesAuthenticationLoginWithCustomIdGet"></a>
# **servicesAuthenticationLoginWithCustomIdGet**
> EntityUser servicesAuthenticationLoginWithCustomIdGet(customId, createIfNotExists)

authentication#loginWithCustomId

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String customId = "customId_example"; // String | 
    String createIfNotExists = "createIfNotExists_example"; // String | 
    try {
      EntityUser result = apiInstance.servicesAuthenticationLoginWithCustomIdGet(customId, createIfNotExists);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationLoginWithCustomIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customId** | **String**|  | |
| **createIfNotExists** | **String**|  | |

### Return type

[**EntityUser**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

<a id="servicesAuthenticationLoginWithCustomIdPost"></a>
# **servicesAuthenticationLoginWithCustomIdPost**
> EntityUser servicesAuthenticationLoginWithCustomIdPost(servicesAuthenticationLoginWithCustomIdPostRequest)

authentication#loginWithCustomId

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    ServicesAuthenticationLoginWithCustomIdPostRequest servicesAuthenticationLoginWithCustomIdPostRequest = new ServicesAuthenticationLoginWithCustomIdPostRequest(); // ServicesAuthenticationLoginWithCustomIdPostRequest | 
    try {
      EntityUser result = apiInstance.servicesAuthenticationLoginWithCustomIdPost(servicesAuthenticationLoginWithCustomIdPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationLoginWithCustomIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **servicesAuthenticationLoginWithCustomIdPostRequest** | [**ServicesAuthenticationLoginWithCustomIdPostRequest**](ServicesAuthenticationLoginWithCustomIdPostRequest.md)|  | |

### Return type

[**EntityUser**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

<a id="servicesAuthenticationLoginWithEmailGet"></a>
# **servicesAuthenticationLoginWithEmailGet**
> EntityUser servicesAuthenticationLoginWithEmailGet(email, password)

authentication#loginWithEmail

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String email = "email_example"; // String | 
    String password = "password_example"; // String | 
    try {
      EntityUser result = apiInstance.servicesAuthenticationLoginWithEmailGet(email, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationLoginWithEmailGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**|  | |
| **password** | **String**|  | |

### Return type

[**EntityUser**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

<a id="servicesAuthenticationLoginWithEmailPost"></a>
# **servicesAuthenticationLoginWithEmailPost**
> EntityUser servicesAuthenticationLoginWithEmailPost(servicesAuthenticationLoginWithEmailPostRequest)

authentication#loginWithEmail

Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    ServicesAuthenticationLoginWithEmailPostRequest servicesAuthenticationLoginWithEmailPostRequest = new ServicesAuthenticationLoginWithEmailPostRequest(); // ServicesAuthenticationLoginWithEmailPostRequest | 
    try {
      EntityUser result = apiInstance.servicesAuthenticationLoginWithEmailPost(servicesAuthenticationLoginWithEmailPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#servicesAuthenticationLoginWithEmailPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **servicesAuthenticationLoginWithEmailPostRequest** | [**ServicesAuthenticationLoginWithEmailPostRequest**](ServicesAuthenticationLoginWithEmailPostRequest.md)|  | |

### Return type

[**EntityUser**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection. |  -  |
| **204** | No content. This status is returned when the service method was executed successfully but returns null or is of void type. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to invoke the service method. |  -  |

