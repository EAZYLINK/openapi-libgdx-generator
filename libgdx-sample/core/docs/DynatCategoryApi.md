# DynatCategoryApi

All URIs are relative to */rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entitiesDynatCategoryEntityIdDelete**](DynatCategoryApi.md#entitiesDynatCategoryEntityIdDelete) | **DELETE** /entities/dynat_Category/{entityId} | Deletes the entity: dynat_Category |
| [**entitiesDynatCategoryEntityIdGet**](DynatCategoryApi.md#entitiesDynatCategoryEntityIdGet) | **GET** /entities/dynat_Category/{entityId} | Gets a single entity by identifier: dynat_Category |
| [**entitiesDynatCategoryEntityIdPut**](DynatCategoryApi.md#entitiesDynatCategoryEntityIdPut) | **PUT** /entities/dynat_Category/{entityId} | Updates the entity: dynat_Category |
| [**entitiesDynatCategoryGet**](DynatCategoryApi.md#entitiesDynatCategoryGet) | **GET** /entities/dynat_Category | Gets a list of entities: dynat_Category |
| [**entitiesDynatCategoryPost**](DynatCategoryApi.md#entitiesDynatCategoryPost) | **POST** /entities/dynat_Category | Creates new entity: dynat_Category |
| [**entitiesDynatCategorySearchGet**](DynatCategoryApi.md#entitiesDynatCategorySearchGet) | **GET** /entities/dynat_Category/search | Find entities by filter conditions: dynat_Category |
| [**entitiesDynatCategorySearchPost**](DynatCategoryApi.md#entitiesDynatCategorySearchPost) | **POST** /entities/dynat_Category/search | Find entities by filter conditions: dynat_Category |


<a id="entitiesDynatCategoryEntityIdDelete"></a>
# **entitiesDynatCategoryEntityIdDelete**
> entitiesDynatCategoryEntityIdDelete(entityId)

Deletes the entity: dynat_Category

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.DynatCategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    DynatCategoryApi apiInstance = new DynatCategoryApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    try {
      apiInstance.entitiesDynatCategoryEntityIdDelete(entityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynatCategoryApi#entitiesDynatCategoryEntityIdDelete");
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

<a id="entitiesDynatCategoryEntityIdGet"></a>
# **entitiesDynatCategoryEntityIdGet**
> EntityDynatCategory entitiesDynatCategoryEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan)

Gets a single entity by identifier: dynat_Category

Gets a single entity by identifier

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.DynatCategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    DynatCategoryApi apiInstance = new DynatCategoryApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      EntityDynatCategory result = apiInstance.entitiesDynatCategoryEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynatCategoryApi#entitiesDynatCategoryEntityIdGet");
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

[**EntityDynatCategory**](EntityDynatCategory.md)

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

<a id="entitiesDynatCategoryEntityIdPut"></a>
# **entitiesDynatCategoryEntityIdPut**
> EntityDynatCategory entitiesDynatCategoryEntityIdPut(entityId, entityDynatCategory)

Updates the entity: dynat_Category

Updates the entity. Only fields that are passed in the JSON object (the request body) are updated.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.DynatCategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    DynatCategoryApi apiInstance = new DynatCategoryApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    EntityDynatCategory entityDynatCategory = new EntityDynatCategory(); // EntityDynatCategory | JSON object with the entity
    try {
      EntityDynatCategory result = apiInstance.entitiesDynatCategoryEntityIdPut(entityId, entityDynatCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynatCategoryApi#entitiesDynatCategoryEntityIdPut");
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
| **entityDynatCategory** | [**EntityDynatCategory**](EntityDynatCategory.md)| JSON object with the entity | |

### Return type

[**EntityDynatCategory**](EntityDynatCategory.md)

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

<a id="entitiesDynatCategoryGet"></a>
# **entitiesDynatCategoryGet**
> List&lt;EntityDynatCategory&gt; entitiesDynatCategoryGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Gets a list of entities: dynat_Category

Gets a list of entities

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.DynatCategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    DynatCategoryApi apiInstance = new DynatCategoryApi(defaultClient);
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityDynatCategory> result = apiInstance.entitiesDynatCategoryGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynatCategoryApi#entitiesDynatCategoryGet");
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

[**List&lt;EntityDynatCategory&gt;**](EntityDynatCategory.md)

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

<a id="entitiesDynatCategoryPost"></a>
# **entitiesDynatCategoryPost**
> EntityDynatCategory entitiesDynatCategoryPost(entityDynatCategory)

Creates new entity: dynat_Category

The method expects a JSON with entity object in the request body. The entity object may contain references to other entities.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.DynatCategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    DynatCategoryApi apiInstance = new DynatCategoryApi(defaultClient);
    EntityDynatCategory entityDynatCategory = new EntityDynatCategory(); // EntityDynatCategory | JSON object with the entity
    try {
      EntityDynatCategory result = apiInstance.entitiesDynatCategoryPost(entityDynatCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynatCategoryApi#entitiesDynatCategoryPost");
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
| **entityDynatCategory** | [**EntityDynatCategory**](EntityDynatCategory.md)| JSON object with the entity | |

### Return type

[**EntityDynatCategory**](EntityDynatCategory.md)

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

<a id="entitiesDynatCategorySearchGet"></a>
# **entitiesDynatCategorySearchGet**
> List&lt;EntityDynatCategory&gt; entitiesDynatCategorySearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Find entities by filter conditions: dynat_Category

Finds entities by filter conditions. The filter is defined by JSON object that is passed as URL parameter.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.DynatCategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    DynatCategoryApi apiInstance = new DynatCategoryApi(defaultClient);
    String filter = "filter_example"; // String | 
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityDynatCategory> result = apiInstance.entitiesDynatCategorySearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynatCategoryApi#entitiesDynatCategorySearchGet");
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

[**List&lt;EntityDynatCategory&gt;**](EntityDynatCategory.md)

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

<a id="entitiesDynatCategorySearchPost"></a>
# **entitiesDynatCategorySearchPost**
> List&lt;EntityDynatCategory&gt; entitiesDynatCategorySearchPost(entitiesDynatCategorySearchPostRequest)

Find entities by filter conditions: dynat_Category

Finds entities by filter conditions. The filter is defined by JSON object that is passed in body.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.DynatCategoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    DynatCategoryApi apiInstance = new DynatCategoryApi(defaultClient);
    EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest = new EntitiesDynatCategorySearchPostRequest(); // EntitiesDynatCategorySearchPostRequest | JSON with search parameters
    try {
      List<EntityDynatCategory> result = apiInstance.entitiesDynatCategorySearchPost(entitiesDynatCategorySearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynatCategoryApi#entitiesDynatCategorySearchPost");
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

[**List&lt;EntityDynatCategory&gt;**](EntityDynatCategory.md)

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

