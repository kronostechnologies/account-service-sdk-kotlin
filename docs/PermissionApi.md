# PermissionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdatePermission**](PermissionApi.md#createOrUpdatePermission) | **PUT** permissions/{code} | Create or update a permission for a given code



Create or update a permission for a given code

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PermissionApi::class.java)
val code : kotlin.String = code_example // kotlin.String | The permission code
val createOrUpdatePermissionPayload : CreateOrUpdatePermissionPayload =  // CreateOrUpdatePermissionPayload | 

launch(Dispatchers.IO) {
    val result : PermissionCreated = webService.createOrUpdatePermission(code, createOrUpdatePermissionPayload)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| The permission code |
 **createOrUpdatePermissionPayload** | [**CreateOrUpdatePermissionPayload**](CreateOrUpdatePermissionPayload.md)|  |

### Return type

[**PermissionCreated**](PermissionCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

