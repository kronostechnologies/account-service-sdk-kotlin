# ServiceAccountApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceAccount**](ServiceAccountApi.md#createServiceAccount) | **POST** serviceAccounts | Creates a new service account
[**getServiceAccount**](ServiceAccountApi.md#getServiceAccount) | **GET** serviceAccounts/{uuid} | Get detailed information about a user account.
[**searchServiceAccount**](ServiceAccountApi.md#searchServiceAccount) | **GET** serviceAccounts | Searches service accounts that match ALL params. If none are provided, returns all service accounts
[**updateServiceAccount**](ServiceAccountApi.md#updateServiceAccount) | **PATCH** serviceAccounts/{uuid} | Updates a service account by uuid



Creates a new service account

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceAccountApi::class.java)
val serviceAccountCreationSchema : ServiceAccountCreationSchema =  // ServiceAccountCreationSchema | 

launch(Dispatchers.IO) {
    val result : ServiceAccountUuidSchema = webService.createServiceAccount(serviceAccountCreationSchema)
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


Get detailed information about a user account.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceAccountApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | Service account identifier

launch(Dispatchers.IO) {
    val result : ServiceAccountSchema = webService.getServiceAccount(uuid)
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


Searches service accounts that match ALL params. If none are provided, returns all service accounts

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceAccountApi::class.java)
val name : kotlin.String = name_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<ServiceAccountSchema> = webService.searchServiceAccount(name)
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


Updates a service account by uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ServiceAccountApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | Service account identifier
val serviceAccountUpdateSchema : ServiceAccountUpdateSchema =  // ServiceAccountUpdateSchema | 

launch(Dispatchers.IO) {
    val result : ServiceAccountUuidSchema = webService.updateServiceAccount(uuid, serviceAccountUpdateSchema)
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

