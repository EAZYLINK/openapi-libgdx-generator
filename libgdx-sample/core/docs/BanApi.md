# BanApi

> 

## Available Endpoints


### `DELETE /rest/entities/Ban/{entityId}`

**Summary**: Deletes the entity: Ban

**Operation ID**: `entitiesBanEntityIdDelete`


#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entityId` | `` | `String` | ✔️ | Entity identifier |

#### Responses

- **200**: Success. Entity was deleted.
- **403**: Forbidden. The user doesn&#39;t have permissions to delete the entity
- **404**: Not found. MetaClass for the entity with the given name not found.

---

### `GET /rest/entities/Ban/{entityId}`

**Summary**: Gets a single entity by identifier: Ban

**Operation ID**: `entitiesBanEntityIdGet`

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

- **200**: Success. The entity is returned in the response body.
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity.
- **404**: Not found. MetaClass for the entity with the given name not found.

---

### `PUT /rest/entities/Ban/{entityId}`

**Summary**: Updates the entity: Ban

**Operation ID**: `entitiesBanEntityIdPut`

**Notes**:  
Updates the entity. Only fields that are passed in the JSON object (the request body) are updated.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entityId` | `` | `String` | ✔️ | Entity identifier |
| `entityBan` | `` | `EntityBan` | ✔️ | JSON object with the entity |

#### Responses

- **200**: Success. The updated entity is returned in the response body.
- **403**: Forbidden. The user doesn&#39;t have permissions to update the entity.
- **404**: Not found. MetaClass for the entity with the given name not found.

---

### `GET /rest/entities/Ban`

**Summary**: Gets a list of entities: Ban

**Operation ID**: `entitiesBanGet`

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

- **200**: Success. The list of entities is returned in the response body.
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity.
- **404**: Not found. MetaClass for the entity with the given name not found.

---

### `POST /rest/entities/Ban`

**Summary**: Creates new entity: Ban

**Operation ID**: `entitiesBanPost`

**Notes**:  
The method expects a JSON with entity object in the request body. The entity object may contain references to other entities.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entityBan` | `` | `EntityBan` | ✔️ | JSON object with the entity |

#### Responses

- **201**: Entity created. The created entity is returned in the response body.
- **400**: Bad request. For example, the entity may have a reference to the non-existing entity.
- **403**: Forbidden. The user doesn&#39;t have permissions to create the entity.
- **404**: Not found. MetaClass for the entity with the given name not found.

---

### `GET /rest/entities/Ban/search`

**Summary**: Find entities by filter conditions: Ban

**Operation ID**: `entitiesBanSearchGet`

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

- **200**: Success. Entities that conforms filter conditions are returned in the response body.
- **400**: Bad request. For example, the condition value cannot be parsed.
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity.
- **404**: Not found. MetaClass for the entity with the given name not found.

---

### `POST /rest/entities/Ban/search`

**Summary**: Find entities by filter conditions: Ban

**Operation ID**: `entitiesBanSearchPost`

**Notes**:  
Finds entities by filter conditions. The filter is defined by JSON object that is passed in body.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `entitiesDynatCategorySearchPostRequest` | `` | `EntitiesDynatCategorySearchPostRequest` | ✔️ | JSON with search parameters |

#### Responses

- **200**: Success. Entities that conforms filter conditions are returned in the response body.
- **400**: Bad request. For example, the condition value cannot be parsed.
- **403**: Forbidden. The user doesn&#39;t have permissions to read the entity.
- **404**: Not found. MetaClass for the entity with the given name not found.

---
