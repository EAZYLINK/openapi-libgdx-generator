# API: UserApi

> 

## Available Endpoints


---

### `DELETE /rest/entities/User/{entityId}`

**Summary**: Deletes the entity: User  
**Operation ID**: `entitiesUserEntityIdDelete`


#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entityId` | `` | `String` | ✔️ | Entity identifier |

#### Responses

- **200**: Success. Entity was deleted.
- **403**: Forbidden. The user doesn&#39;t have permissions to delete the entity — Returns `Error`
- **404**: Not found. MetaClass for the entity with the given name not found. — Returns `Error`


---

### `GET /rest/entities/User/{entityId}`

**Summary**: Gets a single entity by identifier: User  
**Operation ID**: `entitiesUserEntityIdGet`

**Notes**:  
Gets a single entity by identifier

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entityId` | `` | `String` | ✔️ | Entity identifier |
| `dynamicAttributes` | `` | `Boolean` | ❌ | Specifies whether entity dynamic attributes should be returned. |
| `returnNulls` | `` | `Boolean` | ❌ | Specifies whether null fields will be written to the result JSON. |
| `fetchPlan` | `` | `String` | ❌ | Name of the fetchPlan which is used for loading the entity. |

#### Responses

- **200**: Success. The entity is returned in the response body. — Returns `Entity_User`
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity. — Returns `Error`
- **404**: Not found. MetaClass for the entity with the given name not found. — Returns `Error`


---

### `PUT /rest/entities/User/{entityId}`

**Summary**: Updates the entity: User  
**Operation ID**: `entitiesUserEntityIdPut`

**Notes**:  
Updates the entity. Only fields that are passed in the JSON object (the request body) are updated.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entityId` | `` | `String` | ✔️ | Entity identifier |
| `entityUser` | `` | `Entity_User` | ✔️ | JSON object with the entity |

#### Responses

- **200**: Success. The updated entity is returned in the response body. — Returns `Entity_User`
- **403**: Forbidden. The user doesn&#39;t have permissions to update the entity. — Returns `Error`
- **404**: Not found. MetaClass for the entity with the given name not found. — Returns `Error`


---

### `GET /rest/entities/User`

**Summary**: Gets a list of entities: User  
**Operation ID**: `entitiesUserGet`

**Notes**:  
Gets a list of entities

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `returnCount` | `` | `Boolean` | ❌ | Specifies whether the total count of entities should be returned in the &#39;X-Total-Count&#39; header. |
| `offset` | `` | `String` | ❌ | Position of the first result to retrieve. |
| `limit` | `` | `String` | ❌ | Number of extracted entities. |
| `sort` | `` | `String` | ❌ | Name of the field to be sorted by. If the name is preceding by the &#39;+&#39; character, then the sort order is ascending, if by the &#39;-&#39; character then descending. If there is no special character before the property name, then ascending sort will be used. |
| `dynamicAttributes` | `` | `Boolean` | ❌ | Specifies whether entity dynamic attributes should be returned. |
| `returnNulls` | `` | `Boolean` | ❌ | Specifies whether null fields will be written to the result JSON. |
| `fetchPlan` | `` | `String` | ❌ | Name of the fetchPlan which is used for loading the entity. |

#### Responses

- **200**: Success. The list of entities is returned in the response body. — Returns `java.util.ArrayList&lt;Entity_User&gt;`
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity. — Returns `Error`
- **404**: Not found. MetaClass for the entity with the given name not found. — Returns `Error`


---

### `POST /rest/entities/User`

**Summary**: Creates new entity: User  
**Operation ID**: `entitiesUserPost`

**Notes**:  
The method expects a JSON with entity object in the request body. The entity object may contain references to other entities.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entityUser` | `` | `Entity_User` | ✔️ | JSON object with the entity |

#### Responses

- **201**: Entity created. The created entity is returned in the response body. — Returns `Entity_User`
- **400**: Bad request. For example, the entity may have a reference to the non-existing entity. — Returns `Error`
- **403**: Forbidden. The user doesn&#39;t have permissions to create the entity. — Returns `Error`
- **404**: Not found. MetaClass for the entity with the given name not found. — Returns `Error`


---

### `GET /rest/entities/User/search`

**Summary**: Find entities by filter conditions: User  
**Operation ID**: `entitiesUserSearchGet`

**Notes**:  
Finds entities by filter conditions. The filter is defined by JSON object that is passed as URL parameter.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `filter` | `` | `String` | ✔️ |  |
| `returnCount` | `` | `Boolean` | ❌ | Specifies whether the total count of entities should be returned in the &#39;X-Total-Count&#39; header. |
| `offset` | `` | `String` | ❌ | Position of the first result to retrieve. |
| `limit` | `` | `String` | ❌ | Number of extracted entities. |
| `sort` | `` | `String` | ❌ | Name of the field to be sorted by. If the name is preceding by the &#39;+&#39; character, then the sort order is ascending, if by the &#39;-&#39; character then descending. If there is no special character before the property name, then ascending sort will be used. |
| `dynamicAttributes` | `` | `Boolean` | ❌ | Specifies whether entity dynamic attributes should be returned. |
| `returnNulls` | `` | `Boolean` | ❌ | Specifies whether null fields will be written to the result JSON. |
| `fetchPlan` | `` | `String` | ❌ | Name of the fetchPlan which is used for loading the entity. |

#### Responses

- **200**: Success. Entities that conforms filter conditions are returned in the response body. — Returns `java.util.ArrayList&lt;Entity_User&gt;`
- **400**: Bad request. For example, the condition value cannot be parsed. — Returns `Error`
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity. — Returns `Error`
- **404**: Not found. MetaClass for the entity with the given name not found. — Returns `Error`


---

### `POST /rest/entities/User/search`

**Summary**: Find entities by filter conditions: User  
**Operation ID**: `entitiesUserSearchPost`

**Notes**:  
Finds entities by filter conditions. The filter is defined by JSON object that is passed in body.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entitiesDynatCategorySearchPostRequest` | `` | `_entities_dynat_Category_search_post_request` | ✔️ | JSON with search parameters |

#### Responses

- **200**: Success. Entities that conforms filter conditions are returned in the response body. — Returns `java.util.ArrayList&lt;Entity_User&gt;`
- **400**: Bad request. For example, the condition value cannot be parsed. — Returns `Error`
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity. — Returns `Error`
- **404**: Not found. MetaClass for the entity with the given name not found. — Returns `Error`

