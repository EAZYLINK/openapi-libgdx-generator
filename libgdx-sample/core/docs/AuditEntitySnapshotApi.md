# AuditEntitySnapshotApi

All URIs are relative to */rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entitiesAuditEntitySnapshotEntityIdDelete**](AuditEntitySnapshotApi.md#entitiesAuditEntitySnapshotEntityIdDelete) | **DELETE** /entities/audit_EntitySnapshot/{entityId} | Deletes the entity: audit_EntitySnapshot |
| [**entitiesAuditEntitySnapshotEntityIdGet**](AuditEntitySnapshotApi.md#entitiesAuditEntitySnapshotEntityIdGet) | **GET** /entities/audit_EntitySnapshot/{entityId} | Gets a single entity by identifier: audit_EntitySnapshot |
| [**entitiesAuditEntitySnapshotEntityIdPut**](AuditEntitySnapshotApi.md#entitiesAuditEntitySnapshotEntityIdPut) | **PUT** /entities/audit_EntitySnapshot/{entityId} | Updates the entity: audit_EntitySnapshot |
| [**entitiesAuditEntitySnapshotGet**](AuditEntitySnapshotApi.md#entitiesAuditEntitySnapshotGet) | **GET** /entities/audit_EntitySnapshot | Gets a list of entities: audit_EntitySnapshot |
| [**entitiesAuditEntitySnapshotPost**](AuditEntitySnapshotApi.md#entitiesAuditEntitySnapshotPost) | **POST** /entities/audit_EntitySnapshot | Creates new entity: audit_EntitySnapshot |
| [**entitiesAuditEntitySnapshotSearchGet**](AuditEntitySnapshotApi.md#entitiesAuditEntitySnapshotSearchGet) | **GET** /entities/audit_EntitySnapshot/search | Find entities by filter conditions: audit_EntitySnapshot |
| [**entitiesAuditEntitySnapshotSearchPost**](AuditEntitySnapshotApi.md#entitiesAuditEntitySnapshotSearchPost) | **POST** /entities/audit_EntitySnapshot/search | Find entities by filter conditions: audit_EntitySnapshot |


<a id="entitiesAuditEntitySnapshotEntityIdDelete"></a>
# **entitiesAuditEntitySnapshotEntityIdDelete**
> entitiesAuditEntitySnapshotEntityIdDelete(entityId)

Deletes the entity: audit_EntitySnapshot

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuditEntitySnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuditEntitySnapshotApi apiInstance = new AuditEntitySnapshotApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    try {
      apiInstance.entitiesAuditEntitySnapshotEntityIdDelete(entityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntitySnapshotApi#entitiesAuditEntitySnapshotEntityIdDelete");
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

<a id="entitiesAuditEntitySnapshotEntityIdGet"></a>
# **entitiesAuditEntitySnapshotEntityIdGet**
> EntityAuditEntitySnapshot entitiesAuditEntitySnapshotEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan)

Gets a single entity by identifier: audit_EntitySnapshot

Gets a single entity by identifier

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuditEntitySnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuditEntitySnapshotApi apiInstance = new AuditEntitySnapshotApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      EntityAuditEntitySnapshot result = apiInstance.entitiesAuditEntitySnapshotEntityIdGet(entityId, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntitySnapshotApi#entitiesAuditEntitySnapshotEntityIdGet");
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

[**EntityAuditEntitySnapshot**](EntityAuditEntitySnapshot.md)

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

<a id="entitiesAuditEntitySnapshotEntityIdPut"></a>
# **entitiesAuditEntitySnapshotEntityIdPut**
> EntityAuditEntitySnapshot entitiesAuditEntitySnapshotEntityIdPut(entityId, entityAuditEntitySnapshot)

Updates the entity: audit_EntitySnapshot

Updates the entity. Only fields that are passed in the JSON object (the request body) are updated.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuditEntitySnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuditEntitySnapshotApi apiInstance = new AuditEntitySnapshotApi(defaultClient);
    String entityId = "entityId_example"; // String | Entity identifier
    EntityAuditEntitySnapshot entityAuditEntitySnapshot = new EntityAuditEntitySnapshot(); // EntityAuditEntitySnapshot | JSON object with the entity
    try {
      EntityAuditEntitySnapshot result = apiInstance.entitiesAuditEntitySnapshotEntityIdPut(entityId, entityAuditEntitySnapshot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntitySnapshotApi#entitiesAuditEntitySnapshotEntityIdPut");
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
| **entityAuditEntitySnapshot** | [**EntityAuditEntitySnapshot**](EntityAuditEntitySnapshot.md)| JSON object with the entity | |

### Return type

[**EntityAuditEntitySnapshot**](EntityAuditEntitySnapshot.md)

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

<a id="entitiesAuditEntitySnapshotGet"></a>
# **entitiesAuditEntitySnapshotGet**
> List&lt;EntityAuditEntitySnapshot&gt; entitiesAuditEntitySnapshotGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Gets a list of entities: audit_EntitySnapshot

Gets a list of entities

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuditEntitySnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuditEntitySnapshotApi apiInstance = new AuditEntitySnapshotApi(defaultClient);
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityAuditEntitySnapshot> result = apiInstance.entitiesAuditEntitySnapshotGet(returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntitySnapshotApi#entitiesAuditEntitySnapshotGet");
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

[**List&lt;EntityAuditEntitySnapshot&gt;**](EntityAuditEntitySnapshot.md)

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

<a id="entitiesAuditEntitySnapshotPost"></a>
# **entitiesAuditEntitySnapshotPost**
> EntityAuditEntitySnapshot entitiesAuditEntitySnapshotPost(entityAuditEntitySnapshot)

Creates new entity: audit_EntitySnapshot

The method expects a JSON with entity object in the request body. The entity object may contain references to other entities.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuditEntitySnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuditEntitySnapshotApi apiInstance = new AuditEntitySnapshotApi(defaultClient);
    EntityAuditEntitySnapshot entityAuditEntitySnapshot = new EntityAuditEntitySnapshot(); // EntityAuditEntitySnapshot | JSON object with the entity
    try {
      EntityAuditEntitySnapshot result = apiInstance.entitiesAuditEntitySnapshotPost(entityAuditEntitySnapshot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntitySnapshotApi#entitiesAuditEntitySnapshotPost");
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
| **entityAuditEntitySnapshot** | [**EntityAuditEntitySnapshot**](EntityAuditEntitySnapshot.md)| JSON object with the entity | |

### Return type

[**EntityAuditEntitySnapshot**](EntityAuditEntitySnapshot.md)

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

<a id="entitiesAuditEntitySnapshotSearchGet"></a>
# **entitiesAuditEntitySnapshotSearchGet**
> List&lt;EntityAuditEntitySnapshot&gt; entitiesAuditEntitySnapshotSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan)

Find entities by filter conditions: audit_EntitySnapshot

Finds entities by filter conditions. The filter is defined by JSON object that is passed as URL parameter.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuditEntitySnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuditEntitySnapshotApi apiInstance = new AuditEntitySnapshotApi(defaultClient);
    String filter = "filter_example"; // String | 
    Boolean returnCount = true; // Boolean | Specifies whether the total count of entities should be returned in the 'X-Total-Count' header.
    String offset = "offset_example"; // String | Position of the first result to retrieve.
    String limit = "limit_example"; // String | Number of extracted entities.
    String sort = "sort_example"; // String | Name of the field to be sorted by. If the name is preceding by the '+' character, then the sort order is ascending, if by the '-' character then descending. If there is no special character before the property name, then ascending sort will be used.
    Boolean dynamicAttributes = true; // Boolean | Specifies whether entity dynamic attributes should be returned.
    Boolean returnNulls = true; // Boolean | Specifies whether null fields will be written to the result JSON.
    String fetchPlan = "fetchPlan_example"; // String | Name of the fetchPlan which is used for loading the entity.
    try {
      List<EntityAuditEntitySnapshot> result = apiInstance.entitiesAuditEntitySnapshotSearchGet(filter, returnCount, offset, limit, sort, dynamicAttributes, returnNulls, fetchPlan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntitySnapshotApi#entitiesAuditEntitySnapshotSearchGet");
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

[**List&lt;EntityAuditEntitySnapshot&gt;**](EntityAuditEntitySnapshot.md)

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

<a id="entitiesAuditEntitySnapshotSearchPost"></a>
# **entitiesAuditEntitySnapshotSearchPost**
> List&lt;EntityAuditEntitySnapshot&gt; entitiesAuditEntitySnapshotSearchPost(entitiesDynatCategorySearchPostRequest)

Find entities by filter conditions: audit_EntitySnapshot

Finds entities by filter conditions. The filter is defined by JSON object that is passed in body.

### Example
```java
// Import classes:
import com.codegen.ApiClient;
import com.codegen.ApiException;
import com.codegen.Configuration;
import com.codegen.models.*;
import com.codegen.api.AuditEntitySnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/rest");

    AuditEntitySnapshotApi apiInstance = new AuditEntitySnapshotApi(defaultClient);
    EntitiesDynatCategorySearchPostRequest entitiesDynatCategorySearchPostRequest = new EntitiesDynatCategorySearchPostRequest(); // EntitiesDynatCategorySearchPostRequest | JSON with search parameters
    try {
      List<EntityAuditEntitySnapshot> result = apiInstance.entitiesAuditEntitySnapshotSearchPost(entitiesDynatCategorySearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntitySnapshotApi#entitiesAuditEntitySnapshotSearchPost");
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

[**List&lt;EntityAuditEntitySnapshot&gt;**](EntityAuditEntitySnapshot.md)

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

