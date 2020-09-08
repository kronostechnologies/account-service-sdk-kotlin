# ServiceAccountApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceAccount**](ServiceAccountApi.md#createServiceAccount) | **POST** /serviceAccounts | Creates a new service account
[**getServiceAccount**](ServiceAccountApi.md#getServiceAccount) | **GET** /serviceAccounts/{uuid} | Get detailed information about a user account.


<a name="createServiceAccount"></a>
# **createServiceAccount**
> ServiceAccountCreatedSchema createServiceAccount(serviceAccountCreationSchema)

Creates a new service account

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = ServiceAccountApi()
val serviceAccountCreationSchema : ServiceAccountCreationSchema =  // ServiceAccountCreationSchema | 
try {
    val result : ServiceAccountCreatedSchema = apiInstance.createServiceAccount(serviceAccountCreationSchema)
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

[**ServiceAccountCreatedSchema**](ServiceAccountCreatedSchema.md)

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

