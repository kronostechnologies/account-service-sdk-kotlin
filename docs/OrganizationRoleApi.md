# OrganizationRoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateRole**](OrganizationRoleApi.md#createOrUpdateRole) | **PUT** /organizations/{organisationId}/roles/{roleId} | Create or update organization roles for a given uuid
[**createRole**](OrganizationRoleApi.md#createRole) | **POST** /organizations/{organizationId}/roles | Create organization roles for a given uuid


<a name="createOrUpdateRole"></a>
# **createOrUpdateRole**
> RoleCreated createOrUpdateRole(organisationId, roleId, createRole)

Create or update organization roles for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationRoleApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | 
val roleId : kotlin.String = roleId_example // kotlin.String | 
val createRole : CreateRole =  // CreateRole | 
try {
    val result : RoleCreated = apiInstance.createOrUpdateRole(organisationId, roleId, createRole)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationRoleApi#createOrUpdateRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationRoleApi#createOrUpdateRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**|  |
 **roleId** | **kotlin.String**|  |
 **createRole** | [**CreateRole**](CreateRole.md)|  |

### Return type

[**RoleCreated**](RoleCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRole"></a>
# **createRole**
> RoleCreated createRole(organizationId, createRole)

Create organization roles for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationRoleApi()
val organizationId : kotlin.String = organizationId_example // kotlin.String | 
val createRole : CreateRole =  // CreateRole | 
try {
    val result : RoleCreated = apiInstance.createRole(organizationId, createRole)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationRoleApi#createRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationRoleApi#createRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **kotlin.String**|  |
 **createRole** | [**CreateRole**](CreateRole.md)|  |

### Return type

[**RoleCreated**](RoleCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

