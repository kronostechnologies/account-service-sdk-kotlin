# RoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRole**](RoleApi.md#getRole) | **GET** /roles/{uuid} | Get organization role for a given uuid


<a name="getRole"></a>
# **getRole**
> Role getRole(uuid)

Get organization role for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = RoleApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The role identifier
try {
    val result : Role = apiInstance.getRole(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoleApi#getRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoleApi#getRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The role identifier |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

