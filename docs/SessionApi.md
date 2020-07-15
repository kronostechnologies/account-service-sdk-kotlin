# SessionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSession**](SessionApi.md#createSession) | **POST** /sessions | Create a user session.
[**deleteAllSessions**](SessionApi.md#deleteAllSessions) | **DELETE** /sessions | Delete all sessions
[**deleteExpiredSessions**](SessionApi.md#deleteExpiredSessions) | **DELETE** /sessions/expired | Delete all expired sessions.
[**deleteSession**](SessionApi.md#deleteSession) | **DELETE** /sessions/{uuid} | Delete a user session.
[**deleteSessionSsoToken**](SessionApi.md#deleteSessionSsoToken) | **DELETE** /sessions/{uuid}/tokens/{tokenId} | Delete a sso token for the session for a given id/name/type
[**enableSession**](SessionApi.md#enableSession) | **POST** /sessions/{uuid}/enable | Allow activation for sessions created with enable&#x3D;false. This may be extended to enable specific services. Disabled sessions are not allowed to be used by first-party application (Equisoft/Connect, Equisoft/Plan).
[**enableSessionForEquisoftConnect**](SessionApi.md#enableSessionForEquisoftConnect) | **POST** /sessions/{uuid}/enable/EQUISOFT_CONNECT | Enable session for the Equisoft/Connect service
[**getSession**](SessionApi.md#getSession) | **GET** /sessions/{uuid} | Get detailed information about a user session.
[**getSessionSsoToken**](SessionApi.md#getSessionSsoToken) | **GET** /sessions/{uuid}/tokens/{tokenId} | Get a stored sso token for the session
[**impersonate**](SessionApi.md#impersonate) | **POST** /sessions/{uuid}/impersonate | Impersonate the given user context.
[**revertIdentity**](SessionApi.md#revertIdentity) | **POST** /sessions/{uuid}/revertIdentity | Revert an impersonated session to the context of the \&quot;admin\&quot; user who initiated the impersonation.
[**setSessionSsoToken**](SessionApi.md#setSessionSsoToken) | **PUT** /sessions/{uuid}/tokens/{tokenId} | Store a sso token for the session for a given id/name/type


<a name="createSession"></a>
# **createSession**
> Session createSession(sessionPayload)

Create a user session.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val sessionPayload : SessionPayload =  // SessionPayload | 
try {
    val result : Session = apiInstance.createSession(sessionPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#createSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#createSession")
    e.printStackTrace()
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

<a name="deleteAllSessions"></a>
# **deleteAllSessions**
> deleteAllSessions()

Delete all sessions

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
try {
    apiInstance.deleteAllSessions()
} catch (e: ClientException) {
    println("4xx response calling SessionApi#deleteAllSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#deleteAllSessions")
    e.printStackTrace()
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

<a name="deleteExpiredSessions"></a>
# **deleteExpiredSessions**
> deleteExpiredSessions()

Delete all expired sessions.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
try {
    apiInstance.deleteExpiredSessions()
} catch (e: ClientException) {
    println("4xx response calling SessionApi#deleteExpiredSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#deleteExpiredSessions")
    e.printStackTrace()
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

<a name="deleteSession"></a>
# **deleteSession**
> deleteSession(uuid)

Delete a user session.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The user session's identifier
try {
    apiInstance.deleteSession(uuid)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#deleteSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#deleteSession")
    e.printStackTrace()
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

<a name="deleteSessionSsoToken"></a>
# **deleteSessionSsoToken**
> deleteSessionSsoToken(uuid, tokenId)

Delete a sso token for the session for a given id/name/type

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
try {
    apiInstance.deleteSessionSsoToken(uuid, tokenId)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#deleteSessionSsoToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#deleteSessionSsoToken")
    e.printStackTrace()
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

<a name="enableSession"></a>
# **enableSession**
> enableSession(uuid)

Allow activation for sessions created with enable&#x3D;false. This may be extended to enable specific services. Disabled sessions are not allowed to be used by first-party application (Equisoft/Connect, Equisoft/Plan).

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
try {
    apiInstance.enableSession(uuid)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#enableSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#enableSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableSessionForEquisoftConnect"></a>
# **enableSessionForEquisoftConnect**
> enableSessionForEquisoftConnect(uuid, enableEquisoftConnectPayloadSchema)

Enable session for the Equisoft/Connect service

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val enableEquisoftConnectPayloadSchema : EnableEquisoftConnectPayloadSchema =  // EnableEquisoftConnectPayloadSchema | 
try {
    apiInstance.enableSessionForEquisoftConnect(uuid, enableEquisoftConnectPayloadSchema)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#enableSessionForEquisoftConnect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#enableSessionForEquisoftConnect")
    e.printStackTrace()
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

<a name="getSession"></a>
# **getSession**
> Session getSession(uuid, keepAlive)

Get detailed information about a user session.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The user session's identifier
val keepAlive : kotlin.Boolean = true // kotlin.Boolean | If true, update the last access timestamp.
try {
    val result : Session = apiInstance.getSession(uuid, keepAlive)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getSession")
    e.printStackTrace()
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

<a name="getSessionSsoToken"></a>
# **getSessionSsoToken**
> SsoToken getSessionSsoToken(uuid, tokenId)

Get a stored sso token for the session

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
try {
    val result : SsoToken = apiInstance.getSessionSsoToken(uuid, tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getSessionSsoToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getSessionSsoToken")
    e.printStackTrace()
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

<a name="impersonate"></a>
# **impersonate**
> Session impersonate(uuid, impersonatePayload)

Impersonate the given user context.

For administrator with impersonation capability. Impersonate the given user context. After impersonation, the admin user becomes the \&quot;actor\&quot; and the impersonated user becomes the \&quot;user\&quot;. Use /revertIdentity to revert the impersonation.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val impersonatePayload : ImpersonatePayload =  // ImpersonatePayload | 
try {
    val result : Session = apiInstance.impersonate(uuid, impersonatePayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#impersonate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#impersonate")
    e.printStackTrace()
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

<a name="revertIdentity"></a>
# **revertIdentity**
> Session revertIdentity(uuid)

Revert an impersonated session to the context of the \&quot;admin\&quot; user who initiated the impersonation.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
try {
    val result : Session = apiInstance.revertIdentity(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#revertIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#revertIdentity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setSessionSsoToken"></a>
# **setSessionSsoToken**
> setSessionSsoToken(uuid, tokenId, body)

Store a sso token for the session for a given id/name/type

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = SessionApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.setSessionSsoToken(uuid, tokenId, body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#setSessionSsoToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#setSessionSsoToken")
    e.printStackTrace()
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

