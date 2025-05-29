# UserApi

All URIs are relative to */rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entitiesUserEntityIdDelete**](UserApi.md#entitiesUserEntityIdDelete) | **DELETE** /entities/User/{entityId} | Deletes the entity: User |
| [**entitiesUserEntityIdGet**](UserApi.md#entitiesUserEntityIdGet) | **GET** /entities/User/{entityId} | Gets a single entity by identifier: User |
| [**entitiesUserEntityIdPut**](UserApi.md#entitiesUserEntityIdPut) | **PUT** /entities/User/{entityId} | Updates the entity: User |
| [**entitiesUserGet**](UserApi.md#entitiesUserGet) | **GET** /entities/User | Gets a list of entities: User |
| [**entitiesUserPost**](UserApi.md#entitiesUserPost) | **POST** /entities/User | Creates new entity: User |
| [**entitiesUserSearchGet**](UserApi.md#entitiesUserSearchGet) | **GET** /entities/User/search | Find entities by filter conditions: User |
| [**entitiesUserSearchPost**](UserApi.md#entitiesUserSearchPost) | **POST** /entities/User/search | Find entities by filter conditions: User |


<a id="entitiesUserEntityIdDelete"></a>
# **entitiesUserEntityIdDelete**
> entitiesUserEntityIdDelete(entityId)

Deletes the entity: User

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    UserApi apiInstance = new UserApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    try {
      apiInstance.entitiesUserEntityIdDelete(entityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#entitiesUserEntityIdDelete");
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
| **entityId** | **String**| Entity identifier | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Entity was deleted. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to delete the entity |  -  |
| **404** | Not found. MetaClass for the entity with the given name not found. |  -  |

<a id="entitiesUserEntityIdGet"></a>
# **entitiesUserEntityIdGet**
> EntityUser entitiesUserEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan)

Gets a single entity by identifier: User

Gets a single entity by identifier

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    UserApi apiInstance = new UserApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      EntityUser result = apiInstance.entitiesUserEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#entitiesUserEntityIdGet");
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
| **entityId** | **String**| Entity identifier | |
| **dynamicAttributes** | **Boolean**| Specifies whether entity dynamic attributes should be returned. | [optional] |
| **returnNulls** | **Boolean**| Specifies whether null fields will be written to the result JSON. | [optional] |
| **fetchPlan** | **String**| Name of the fetchPlan which is used for loading the entity. | [optional] |

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
| **200** | Success. The entity is returned in the response body. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to read the entity. |  -  |
| **404** | Not found. MetaClass for the entity with the given name not found. |  -  |

<a id="entitiesUserEntityIdPut"></a>
# **entitiesUserEntityIdPut**
> EntityUser entitiesUserEntityIdPut(entityId, entityUser)

Updates the entity: User

Updates the entity. Only fields that are passed in the JSON object (the request body) are updated.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    UserApi apiInstance = new UserApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    EntityUser entityUser = new EntityUser(); // EntityUser | JSON object with the entity
    try {
      EntityUser result = apiInstance.entitiesUserEntityIdPut(entityId, entityUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#entitiesUserEntityIdPut");
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
| **entityId** | **String**| Entity identifier | |
| **entityUser** | [**EntityUser**](EntityUser.md)| JSON object with the entity | |

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
| **200** | Success. The updated entity is returned in the response body. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to update the entity. |  -  |
| **404** | Not found. MetaClass for the entity with the given name not found. |  -  |

<a id="entitiesUserGet"></a>
# **entitiesUserGet**
> List&lt;EntityUser&gt; entitiesUserGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Gets a list of entities: User

Gets a list of entities

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    UserApi apiInstance = new UserApi(defaultClient);
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityUser> result = apiInstance.entitiesUserGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#entitiesUserGet");
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
| **returnCount** | **Boolean**| Specifies whether the total count of entities should be returned in the &#39;X-Total-Count&#39; header. | [optional] |
| **offset** | **String**| Position of the first result to retrieve. | [optional] |
| **limit** | **String**| Number of extracted entities. | [optional] |
| **sort** | **String**| Name of the field to be sorted by. If the name is preceding by the &#39;+&#39; character, then the sort order is ascending, if by the &#39;-&#39; character then descending. If there is no special character before the property name, then ascending sort will be used. | [optional] |
| **dynamicAttributes** | **Boolean**| Specifies whether entity dynamic attributes should be returned. | [optional] |
| **returnNulls** | **Boolean**| Specifies whether null fields will be written to the result JSON. | [optional] |
| **fetchPlan** | **String**| Name of the fetchPlan which is used for loading the entity. | [optional] |

### Return type

[**List&lt;EntityUser&gt;**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The list of entities is returned in the response body. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to read the entity. |  -  |
| **404** | Not found. MetaClass for the entity with the given name not found. |  -  |

<a id="entitiesUserPost"></a>
# **entitiesUserPost**
> EntityUser entitiesUserPost(entityUser)

Creates new entity: User

The method expects a JSON with entity object in the request body. The entity object may contain references to other entities.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    UserApi apiInstance = new UserApi(defaultClient);
    EntityUser entityUser = new EntityUser(); // EntityUser | JSON object with the entity
    try {
      EntityUser result = apiInstance.entitiesUserPost(entityUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#entitiesUserPost");
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
| **entityUser** | [**EntityUser**](EntityUser.md)| JSON object with the entity | |

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
| **201** | Entity created. The created entity is returned in the response body. |  -  |
| **400** | Bad request. For example, the entity may have a reference to the non-existing entity. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to create the entity. |  -  |
| **404** | Not found. MetaClass for the entity with the given name not found. |  -  |

<a id="entitiesUserSearchGet"></a>
# **entitiesUserSearchGet**
> List&lt;EntityUser&gt; entitiesUserSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Find entities by filter conditions: User

Finds entities by filter conditions. The filter is defined by JSON object that is passed as URL parameter.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    UserApi apiInstance = new UserApi(defaultClient);
    String filter = "filter_example"; // String | 
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityUser> result = apiInstance.entitiesUserSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#entitiesUserSearchGet");
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
| **filter** | **String**|  | |
| **returnCount** | **Boolean**| Specifies whether the total count of entities should be returned in the &#39;X-Total-Count&#39; header. | [optional] |
| **offset** | **String**| Position of the first result to retrieve. | [optional] |
| **limit** | **String**| Number of extracted entities. | [optional] |
| **sort** | **String**| Name of the field to be sorted by. If the name is preceding by the &#39;+&#39; character, then the sort order is ascending, if by the &#39;-&#39; character then descending. If there is no special character before the property name, then ascending sort will be used. | [optional] |
| **dynamicAttributes** | **Boolean**| Specifies whether entity dynamic attributes should be returned. | [optional] |
| **returnNulls** | **Boolean**| Specifies whether null fields will be written to the result JSON. | [optional] |
| **fetchPlan** | **String**| Name of the fetchPlan which is used for loading the entity. | [optional] |

### Return type

[**List&lt;EntityUser&gt;**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Entities that conforms filter conditions are returned in the response body. |  -  |
| **400** | Bad request. For example, the condition value cannot be parsed. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to read the entity. |  -  |
| **404** | Not found. MetaClass for the entity with the given name not found. |  -  |

<a id="entitiesUserSearchPost"></a>
# **entitiesUserSearchPost**
> List&lt;EntityUser&gt; entitiesUserSearchPost(entitiesDynatCategorySearchPostRequest)

Find entities by filter conditions: User

Finds entities by filter conditions. The filter is defined by JSON object that is passed in body.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    UserApi apiInstance = new UserApi(defaultClient);
    EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest = new EntitiesDynatCategorySearchPostRequest(); // EntitiesDynatCategorySearchPostRequest | JSON with search parameters
    try {
      List<EntityUser> result = apiInstance.entitiesUserSearchPost(entitiesDynatCategorySearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#entitiesUserSearchPost");
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
| **entitiesDynatCategorySearchPostRequest** | [**EntitiesDynatCategorySearchPostRequest**](EntitiesDynatCategorySearchPostRequest.md)| JSON with search parameters | |

### Return type

[**List&lt;EntityUser&gt;**](EntityUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Entities that conforms filter conditions are returned in the response body. |  -  |
| **400** | Bad request. For example, the condition value cannot be parsed. |  -  |
| **403** | Forbidden. The user doesn&#39;t have permissions to read the entity. |  -  |
| **404** | Not found. MetaClass for the entity with the given name not found. |  -  |

