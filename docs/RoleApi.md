# RoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRole**](RoleApi.md#getRole) | **GET** roles/{uuid} | Get organization role for a given uuid



Get organization role for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoleApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The role identifier

launch(Dispatchers.IO) {
    val result : Role = webService.getRole(uuid)
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

