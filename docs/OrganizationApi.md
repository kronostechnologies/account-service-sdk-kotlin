# OrganizationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateOrganization**](OrganizationApi.md#createOrUpdateOrganization) | **PUT** /organizations/{uuid} | Create or update an organization for a given uuid
[**createOrUpdateRole**](OrganizationApi.md#createOrUpdateRole) | **PUT** /organizations/{uuid}/roles/{roleId} | Create or update organization roles for a given uuid
[**createOrganization**](OrganizationApi.md#createOrganization) | **POST** /organizations | Creates a new organization
[**createRole**](OrganizationApi.md#createRole) | **POST** /organizations/{uuid}/roles | Create organization roles for a given uuid
[**getOrganization**](OrganizationApi.md#getOrganization) | **GET** /organizations/{uuid} | Get detailed information about an organization.
[**listOrganization**](OrganizationApi.md#listOrganization) | **GET** /organizations | List organizations


<a name="createOrUpdateOrganization"></a>
# **createOrUpdateOrganization**
> OrganizationCreated createOrUpdateOrganization(uuid, createOrUpdateOrganizationPayload)

Create or update an organization for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val createOrUpdateOrganizationPayload : CreateOrUpdateOrganizationPayload =  // CreateOrUpdateOrganizationPayload | 
try {
    val result : OrganizationCreated = apiInstance.createOrUpdateOrganization(uuid, createOrUpdateOrganizationPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#createOrUpdateOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#createOrUpdateOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The organization identifier |
 **createOrUpdateOrganizationPayload** | [**CreateOrUpdateOrganizationPayload**](CreateOrUpdateOrganizationPayload.md)|  |

### Return type

[**OrganizationCreated**](OrganizationCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrUpdateRole"></a>
# **createOrUpdateRole**
> RoleCreated createOrUpdateRole(uuid, roleId, createRole)

Create or update organization roles for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val roleId : kotlin.String = roleId_example // kotlin.String | 
val createRole : CreateRole =  // CreateRole | 
try {
    val result : RoleCreated = apiInstance.createOrUpdateRole(uuid, roleId, createRole)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#createOrUpdateRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#createOrUpdateRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **roleId** | **kotlin.String**|  |
 **createRole** | [**CreateRole**](CreateRole.md)|  |

### Return type

[**RoleCreated**](RoleCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrganization"></a>
# **createOrganization**
> OrganizationCreated createOrganization(createOrganizationPayload)

Creates a new organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val createOrganizationPayload : CreateOrganizationPayload =  // CreateOrganizationPayload | 
try {
    val result : OrganizationCreated = apiInstance.createOrganization(createOrganizationPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#createOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#createOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrganizationPayload** | [**CreateOrganizationPayload**](CreateOrganizationPayload.md)|  |

### Return type

[**OrganizationCreated**](OrganizationCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRole"></a>
# **createRole**
> RoleCreated createRole(uuid, createRole)

Create organization roles for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val createRole : CreateRole =  // CreateRole | 
try {
    val result : RoleCreated = apiInstance.createRole(uuid, createRole)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#createRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#createRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **createRole** | [**CreateRole**](CreateRole.md)|  |

### Return type

[**RoleCreated**](RoleCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrganization"></a>
# **getOrganization**
> Organization getOrganization(uuid)

Get detailed information about an organization.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
try {
    val result : Organization = apiInstance.getOrganization(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#getOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#getOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The organization identifier |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrganization"></a>
# **listOrganization**
> ListUserOrganizations listOrganization(max, pageToken, parent)

List organizations

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val max : kotlin.Int = 56 // kotlin.Int | 
val pageToken : kotlin.String = pageToken_example // kotlin.String | 
val parent : kotlin.String = parent_example // kotlin.String | 
try {
    val result : ListUserOrganizations = apiInstance.listOrganization(max, pageToken, parent)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#listOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#listOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **max** | **kotlin.Int**|  |
 **pageToken** | **kotlin.String**|  | [optional]
 **parent** | **kotlin.String**|  | [optional]

### Return type

[**ListUserOrganizations**](ListUserOrganizations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

