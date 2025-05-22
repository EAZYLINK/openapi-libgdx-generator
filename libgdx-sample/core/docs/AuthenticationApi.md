# AuthenticationApi

> 

## Available Endpoints


### `GET /rest/services/authentication/addUsernamePassword`

**Summary**: authentication#addUsernamePassword

**Operation ID**: `servicesAuthenticationAddUsernamePasswordGet`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `user` | `` | `String` | ✔️ |  |
| `username` | `` | `String` | ✔️ |  |
| `email` | `` | `String` | ✔️ |  |
| `password` | `` | `String` | ✔️ |  |

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---

### `POST /rest/services/authentication/addUsernamePassword`

**Summary**: authentication#addUsernamePassword

**Operation ID**: `servicesAuthenticationAddUsernamePasswordPost`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `servicesAuthenticationAddUsernamePasswordPostRequest` | `` | `ServicesAuthenticationAddUsernamePasswordPostRequest` | ✔️ |  |

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---

### `GET /rest/services/authentication/loginAnonymously`

**Summary**: authentication#loginAnonymously

**Operation ID**: `servicesAuthenticationLoginAnonymouslyGet`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---

### `POST /rest/services/authentication/loginAnonymously`

**Summary**: authentication#loginAnonymously

**Operation ID**: `servicesAuthenticationLoginAnonymouslyPost`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `body` | `` | `Object` | ✔️ |  |

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---

### `GET /rest/services/authentication/loginWithCustomId`

**Summary**: authentication#loginWithCustomId

**Operation ID**: `servicesAuthenticationLoginWithCustomIdGet`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `customId` | `` | `String` | ✔️ |  |
| `createIfNotExists` | `` | `String` | ✔️ |  |

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---

### `POST /rest/services/authentication/loginWithCustomId`

**Summary**: authentication#loginWithCustomId

**Operation ID**: `servicesAuthenticationLoginWithCustomIdPost`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `servicesAuthenticationLoginWithCustomIdPostRequest` | `` | `ServicesAuthenticationLoginWithCustomIdPostRequest` | ✔️ |  |

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---

### `GET /rest/services/authentication/loginWithEmail`

**Summary**: authentication#loginWithEmail

**Operation ID**: `servicesAuthenticationLoginWithEmailGet`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `email` | `` | `String` | ✔️ |  |
| `password` | `` | `String` | ✔️ |  |

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---

### `POST /rest/services/authentication/loginWithEmail`

**Summary**: authentication#loginWithEmail

**Operation ID**: `servicesAuthenticationLoginWithEmailPost`

**Notes**:  
Executes the service method. This request expects query parameters with the names defined in services configuration on the middleware.

#### Parameters

| Name | In | Type | Required | Description |
|------|----|------|----------|-------------|
| `servicesAuthenticationLoginWithEmailPostRequest` | `` | `ServicesAuthenticationLoginWithEmailPostRequest` | ✔️ |  |

#### Responses

- **200**: Returns the result of the method execution. It can be of simple datatype as well as JSON that represents an entity or entities collection.
- **204**: No content. This status is returned when the service method was executed successfully but returns null or is of void type.
- **403**: Forbidden. The user doesn&#39;t have permissions to invoke the service method.

---
