# BanApi

All URIs are relative to */rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entitiesBanEntityIdDelete**](BanApi.md#entitiesBanEntityIdDelete) | **DELETE** /entities/Ban/{entityId} | Deletes the entity: Ban |
| [**entitiesBanEntityIdGet**](BanApi.md#entitiesBanEntityIdGet) | **GET** /entities/Ban/{entityId} | Gets a single entity by identifier: Ban |
| [**entitiesBanEntityIdPut**](BanApi.md#entitiesBanEntityIdPut) | **PUT** /entities/Ban/{entityId} | Updates the entity: Ban |
| [**entitiesBanGet**](BanApi.md#entitiesBanGet) | **GET** /entities/Ban | Gets a list of entities: Ban |
| [**entitiesBanPost**](BanApi.md#entitiesBanPost) | **POST** /entities/Ban | Creates new entity: Ban |
| [**entitiesBanSearchGet**](BanApi.md#entitiesBanSearchGet) | **GET** /entities/Ban/search | Find entities by filter conditions: Ban |
| [**entitiesBanSearchPost**](BanApi.md#entitiesBanSearchPost) | **POST** /entities/Ban/search | Find entities by filter conditions: Ban |


<a id="entitiesBanEntityIdDelete"></a>
# **entitiesBanEntityIdDelete**
> entitiesBanEntityIdDelete(entityId)

Deletes the entity: Ban

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.BanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    BanApi apiInstance = new BanApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    try {
      apiInstance.entitiesBanEntityIdDelete(entityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BanApi#entitiesBanEntityIdDelete");
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

<a id="entitiesBanEntityIdGet"></a>
# **entitiesBanEntityIdGet**
> EntityBan entitiesBanEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan)

Gets a single entity by identifier: Ban

Gets a single entity by identifier

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.BanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    BanApi apiInstance = new BanApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      EntityBan result = apiInstance.entitiesBanEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BanApi#entitiesBanEntityIdGet");
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

[**EntityBan**](EntityBan.md)

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

<a id="entitiesBanEntityIdPut"></a>
# **entitiesBanEntityIdPut**
> EntityBan entitiesBanEntityIdPut(entityId, entityBan)

Updates the entity: Ban

Updates the entity. Only fields that are passed in the JSON object (the request body) are updated.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.BanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    BanApi apiInstance = new BanApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    EntityBan entityBan = new EntityBan(); // EntityBan | JSON object with the entity
    try {
      EntityBan result = apiInstance.entitiesBanEntityIdPut(entityId, entityBan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BanApi#entitiesBanEntityIdPut");
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
| **entityBan** | [**EntityBan**](EntityBan.md)| JSON object with the entity | |

### Return type

[**EntityBan**](EntityBan.md)

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

<a id="entitiesBanGet"></a>
# **entitiesBanGet**
> List&lt;EntityBan&gt; entitiesBanGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Gets a list of entities: Ban

Gets a list of entities

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.BanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    BanApi apiInstance = new BanApi(defaultClient);
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityBan> result = apiInstance.entitiesBanGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BanApi#entitiesBanGet");
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

[**List&lt;EntityBan&gt;**](EntityBan.md)

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

<a id="entitiesBanPost"></a>
# **entitiesBanPost**
> EntityBan entitiesBanPost(entityBan)

Creates new entity: Ban

The method expects a JSON with entity object in the request body. The entity object may contain references to other entities.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.BanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    BanApi apiInstance = new BanApi(defaultClient);
    EntityBan entityBan = new EntityBan(); // EntityBan | JSON object with the entity
    try {
      EntityBan result = apiInstance.entitiesBanPost(entityBan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BanApi#entitiesBanPost");
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
| **entityBan** | [**EntityBan**](EntityBan.md)| JSON object with the entity | |

### Return type

[**EntityBan**](EntityBan.md)

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

<a id="entitiesBanSearchGet"></a>
# **entitiesBanSearchGet**
> List&lt;EntityBan&gt; entitiesBanSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Find entities by filter conditions: Ban

Finds entities by filter conditions. The filter is defined by JSON object that is passed as URL parameter.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.BanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    BanApi apiInstance = new BanApi(defaultClient);
    String filter = "filter_example"; // String | 
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityBan> result = apiInstance.entitiesBanSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BanApi#entitiesBanSearchGet");
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

[**List&lt;EntityBan&gt;**](EntityBan.md)

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

<a id="entitiesBanSearchPost"></a>
# **entitiesBanSearchPost**
> List&lt;EntityBan&gt; entitiesBanSearchPost(entitiesDynatCategorySearchPostRequest)

Find entities by filter conditions: Ban

Finds entities by filter conditions. The filter is defined by JSON object that is passed in body.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.BanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    BanApi apiInstance = new BanApi(defaultClient);
    EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest = new EntitiesDynatCategorySearchPostRequest(); // EntitiesDynatCategorySearchPostRequest | JSON with search parameters
    try {
      List<EntityBan> result = apiInstance.entitiesBanSearchPost(entitiesDynatCategorySearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BanApi#entitiesBanSearchPost");
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

[**List&lt;EntityBan&gt;**](EntityBan.md)

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

