# UserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserSessions**](UserApi.md#deleteUserSessions) | **DELETE** /users/{uuid}/sessions | Delete all sessions for the user.
[**getUser**](UserApi.md#getUser) | **GET** /users/{uuid} | Get detailed information about a user account.
[**getUserPermissions**](UserApi.md#getUserPermissions) | **GET** /users/{uuid}/permissions | Get user permissions
[**getUuidById**](UserApi.md#getUuidById) | **GET** /users/{id}/uuid | Find an uuid by id.
[**listUsers**](UserApi.md#listUsers) | **GET** /users | Searches accounts that match ALL params. If no search parameters are provided, returns all users.


<a name="deleteUserSessions"></a>
# **deleteUserSessions**
> deleteUserSessions(uuid)

Delete all sessions for the user.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = UserApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The user account's identifier
try {
    apiInstance.deleteUserSessions(uuid)
} catch (e: ClientException) {
    println("4xx response calling UserApi#deleteUserSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#deleteUserSessions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The user account&#39;s identifier |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUser"></a>
# **getUser**
> User getUser(uuid)

Get detailed information about a user account.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = UserApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The user account's identifier
try {
    val result : User = apiInstance.getUser(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The user account&#39;s identifier |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserPermissions"></a>
# **getUserPermissions**
> UserPermissions getUserPermissions(uuid)

Get user permissions

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = UserApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The user account's identifier
try {
    val result : UserPermissions = apiInstance.getUserPermissions(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUserPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUserPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The user account&#39;s identifier |

### Return type

[**UserPermissions**](UserPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUuidById"></a>
# **getUuidById**
> Id getUuidById(id)

Find an uuid by id.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = UserApi()
val id : kotlin.Long = 789 // kotlin.Long | The user account's identifier
try {
    val result : Id = apiInstance.getUuidById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUuidById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUuidById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The user account&#39;s identifier |

### Return type

[**Id**](Id.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> kotlin.collections.List&lt;UserAccountSearchResult&gt; listUsers(identifierOrEmail, identifier, email)

Searches accounts that match ALL params. If no search parameters are provided, returns all users.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = UserApi()
val identifierOrEmail : kotlin.String = identifierOrEmail_example // kotlin.String | 
val identifier : kotlin.String = identifier_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UserAccountSearchResult> = apiInstance.listUsers(identifierOrEmail, identifier, email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#listUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#listUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierOrEmail** | **kotlin.String**|  | [optional]
 **identifier** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;UserAccountSearchResult&gt;**](UserAccountSearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

