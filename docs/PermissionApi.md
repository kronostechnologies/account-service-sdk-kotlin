# PermissionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdatePermission**](PermissionApi.md#createOrUpdatePermission) | **PUT** /permissions/{code} | Create or update a permission for a given code


<a name="createOrUpdatePermission"></a>
# **createOrUpdatePermission**
> PermissionCreated createOrUpdatePermission(code, createOrUpdatePermissionPayload)

Create or update a permission for a given code

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = PermissionApi()
val code : kotlin.String = code_example // kotlin.String | The permission code
val createOrUpdatePermissionPayload : CreateOrUpdatePermissionPayload =  // CreateOrUpdatePermissionPayload | 
try {
    val result : PermissionCreated = apiInstance.createOrUpdatePermission(code, createOrUpdatePermissionPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionApi#createOrUpdatePermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionApi#createOrUpdatePermission")
    e.printStackTrace()
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

