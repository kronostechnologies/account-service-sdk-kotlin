# SessionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSession**](SessionApi.md#createSession) | **POST** sessions | Create a user session.
[**deleteAllSessions**](SessionApi.md#deleteAllSessions) | **DELETE** sessions | Delete all sessions
[**deleteExpiredSessions**](SessionApi.md#deleteExpiredSessions) | **DELETE** sessions/expired | Delete all expired sessions.
[**deleteSession**](SessionApi.md#deleteSession) | **DELETE** sessions/{uuid} | Delete a user session.
[**deleteSessionSsoToken**](SessionApi.md#deleteSessionSsoToken) | **DELETE** sessions/{uuid}/tokens/{tokenId} | Delete a sso token for the session for a given id/name/type
[**enableSession**](SessionApi.md#enableSession) | **POST** sessions/{uuid}/enable | Allow activation for sessions created with enable&#x3D;false. This may be extended to enable specific services. Disabled sessions are not allowed to be used by first-party application (Equisoft/Connect, Equisoft/Plan).
[**enableSessionForEquisoftConnect**](SessionApi.md#enableSessionForEquisoftConnect) | **POST** sessions/{uuid}/enable/EQUISOFT_CONNECT | Enable session for the Equisoft/Connect service
[**getSession**](SessionApi.md#getSession) | **GET** sessions/{uuid} | Get detailed information about a user session.
[**getSessionSsoToken**](SessionApi.md#getSessionSsoToken) | **GET** sessions/{uuid}/tokens/{tokenId} | Get a stored sso token for the session
[**impersonate**](SessionApi.md#impersonate) | **POST** sessions/{uuid}/impersonate | Impersonate the given user context.
[**revertIdentity**](SessionApi.md#revertIdentity) | **POST** sessions/{uuid}/revertIdentity | Revert an impersonated session to the context of the \&quot;admin\&quot; user who initiated the impersonation.
[**setSessionSsoToken**](SessionApi.md#setSessionSsoToken) | **PUT** sessions/{uuid}/tokens/{tokenId} | Store a sso token for the session for a given id/name/type



Create a user session.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val sessionPayload : SessionPayload =  // SessionPayload | 

launch(Dispatchers.IO) {
    val result : Session = webService.createSession(sessionPayload)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionPayload** | [**SessionPayload**](SessionPayload.md)|  |

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete all sessions

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)

launch(Dispatchers.IO) {
    webService.deleteAllSessions()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Delete all expired sessions.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)

launch(Dispatchers.IO) {
    webService.deleteExpiredSessions()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Delete a user session.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The user session's identifier

launch(Dispatchers.IO) {
    webService.deleteSession(uuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The user session&#39;s identifier |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a sso token for the session for a given id/name/type

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.deleteSessionSsoToken(uuid, tokenId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **tokenId** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Allow activation for sessions created with enable&#x3D;false. This may be extended to enable specific services. Disabled sessions are not allowed to be used by first-party application (Equisoft/Connect, Equisoft/Plan).

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.enableSession(uuid, body)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json


Enable session for the Equisoft/Connect service

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val enableEquisoftConnectPayloadSchema : EnableEquisoftConnectPayloadSchema =  // EnableEquisoftConnectPayloadSchema | 

launch(Dispatchers.IO) {
    webService.enableSessionForEquisoftConnect(uuid, enableEquisoftConnectPayloadSchema)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **enableEquisoftConnectPayloadSchema** | [**EnableEquisoftConnectPayloadSchema**](EnableEquisoftConnectPayloadSchema.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get detailed information about a user session.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The user session's identifier
val keepAlive : kotlin.Boolean = true // kotlin.Boolean | If true, update the last access timestamp.

launch(Dispatchers.IO) {
    val result : Session = webService.getSession(uuid, keepAlive)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The user session&#39;s identifier |
 **keepAlive** | **kotlin.Boolean**| If true, update the last access timestamp. | [optional]

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get a stored sso token for the session

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SsoToken = webService.getSessionSsoToken(uuid, tokenId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **tokenId** | **kotlin.String**|  |

### Return type

[**SsoToken**](SsoToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Impersonate the given user context.

For administrator with impersonation capability. Impersonate the given user context. After impersonation, the admin user becomes the \&quot;actor\&quot; and the impersonated user becomes the \&quot;user\&quot;. Use /revertIdentity to revert the impersonation.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val impersonatePayload : ImpersonatePayload =  // ImpersonatePayload | 

launch(Dispatchers.IO) {
    val result : Session = webService.impersonate(uuid, impersonatePayload)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **impersonatePayload** | [**ImpersonatePayload**](ImpersonatePayload.md)|  |

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Revert an impersonated session to the context of the \&quot;admin\&quot; user who initiated the impersonation.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : Session = webService.revertIdentity(uuid, body)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **body** | **kotlin.String**|  | [optional]

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json


Store a sso token for the session for a given id/name/type

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SessionApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.setSessionSsoToken(uuid, tokenId, body)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **tokenId** | **kotlin.String**|  |
 **body** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

