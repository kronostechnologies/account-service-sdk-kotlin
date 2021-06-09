# UserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserSessions**](UserApi.md#deleteUserSessions) | **DELETE** users/{uuid}/sessions | Delete all sessions for the user.
[**getUser**](UserApi.md#getUser) | **GET** users/{uuid} | Get detailed information about a user account.
[**getUserPermissions**](UserApi.md#getUserPermissions) | **GET** users/{uuid}/permissions | Get user permissions
[**getUuidById**](UserApi.md#getUuidById) | **GET** users/{id}/uuid | Find an uuid by id.
[**listUsers**](UserApi.md#listUsers) | **GET** users | Searches accounts that match ALL params. If no search parameters are provided, returns all users.



Delete all sessions for the user.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The user account's identifier

launch(Dispatchers.IO) {
    webService.deleteUserSessions(uuid)
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


Get detailed information about a user account.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The user account's identifier

launch(Dispatchers.IO) {
    val result : User = webService.getUser(uuid)
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


Get user permissions

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The user account's identifier
val xUserUuid : kotlin.String = xUserUuid_example // kotlin.String | Uuid of the user for whom the call is made. Used to apply access and security rules

launch(Dispatchers.IO) {
    val result : UserPermissions = webService.getUserPermissions(uuid, xUserUuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The user account&#39;s identifier |
 **xUserUuid** | **kotlin.String**| Uuid of the user for whom the call is made. Used to apply access and security rules | [optional]

### Return type

[**UserPermissions**](UserPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Find an uuid by id.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | The user account's identifier

launch(Dispatchers.IO) {
    val result : Id = webService.getUuidById(id)
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


Searches accounts that match ALL params. If no search parameters are provided, returns all users.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserApi::class.java)
val identifierOrEmail : kotlin.String = identifierOrEmail_example // kotlin.String | 
val identifier : kotlin.String = identifier_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<UserAccountSearchResult> = webService.listUsers(identifierOrEmail, identifier, email, includeDeleted)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierOrEmail** | **kotlin.String**|  | [optional]
 **identifier** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional]

### Return type

[**kotlin.collections.List&lt;UserAccountSearchResult&gt;**](UserAccountSearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

