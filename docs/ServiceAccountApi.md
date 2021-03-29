# ServiceAccountApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceAccount**](ServiceAccountApi.md#createServiceAccount) | **POST** /serviceAccounts | Creates a new service account
[**getServiceAccount**](ServiceAccountApi.md#getServiceAccount) | **GET** /serviceAccounts/{uuid} | Get detailed information about a user account.
[**searchServiceAccount**](ServiceAccountApi.md#searchServiceAccount) | **GET** /serviceAccounts | Searches service accounts that match ALL params. If none are provided, returns all service accounts
[**updateServiceAccount**](ServiceAccountApi.md#updateServiceAccount) | **PATCH** /serviceAccounts/{uuid} | Updates a service account by uuid


<a name="createServiceAccount"></a>
# **createServiceAccount**
> ServiceAccountUuidSchema createServiceAccount(serviceAccountCreationSchema)

Creates a new service account

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = ServiceAccountApi()
val serviceAccountCreationSchema : ServiceAccountCreationSchema =  // ServiceAccountCreationSchema | 
try {
    val result : ServiceAccountUuidSchema = apiInstance.createServiceAccount(serviceAccountCreationSchema)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceAccountApi#createServiceAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceAccountApi#createServiceAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountCreationSchema** | [**ServiceAccountCreationSchema**](ServiceAccountCreationSchema.md)|  |

### Return type

[**ServiceAccountUuidSchema**](ServiceAccountUuidSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getServiceAccount"></a>
# **getServiceAccount**
> ServiceAccountSchema getServiceAccount(uuid)

Get detailed information about a user account.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = ServiceAccountApi()
val uuid : kotlin.String = uuid_example // kotlin.String | Service account identifier
try {
    val result : ServiceAccountSchema = apiInstance.getServiceAccount(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceAccountApi#getServiceAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceAccountApi#getServiceAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| Service account identifier |

### Return type

[**ServiceAccountSchema**](ServiceAccountSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchServiceAccount"></a>
# **searchServiceAccount**
> kotlin.collections.List&lt;ServiceAccountSchema&gt; searchServiceAccount(name)

Searches service accounts that match ALL params. If none are provided, returns all service accounts

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = ServiceAccountApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.collections.List<ServiceAccountSchema> = apiInstance.searchServiceAccount(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceAccountApi#searchServiceAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceAccountApi#searchServiceAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;ServiceAccountSchema&gt;**](ServiceAccountSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateServiceAccount"></a>
# **updateServiceAccount**
> ServiceAccountUuidSchema updateServiceAccount(uuid, serviceAccountUpdateSchema)

Updates a service account by uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = ServiceAccountApi()
val uuid : kotlin.String = uuid_example // kotlin.String | Service account identifier
val serviceAccountUpdateSchema : ServiceAccountUpdateSchema =  // ServiceAccountUpdateSchema | 
try {
    val result : ServiceAccountUuidSchema = apiInstance.updateServiceAccount(uuid, serviceAccountUpdateSchema)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceAccountApi#updateServiceAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceAccountApi#updateServiceAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| Service account identifier |
 **serviceAccountUpdateSchema** | [**ServiceAccountUpdateSchema**](ServiceAccountUpdateSchema.md)|  |

### Return type

[**ServiceAccountUuidSchema**](ServiceAccountUuidSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

