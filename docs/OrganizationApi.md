# OrganizationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addService**](OrganizationApi.md#addService) | **PUT** /organizations/{uuid}/services/{serviceCode} | Add/update a service for an organization
[**addServiceToUser**](OrganizationApi.md#addServiceToUser) | **PUT** /organizations/{uuid}/users/{userUuid}/services/{serviceCode} | Add/update a service to a user for an organization
[**createOrUpdateOrganization**](OrganizationApi.md#createOrUpdateOrganization) | **PUT** /organizations/{uuid} | Create or update an organization for a given uuid
[**createOrUpdateRole**](OrganizationApi.md#createOrUpdateRole) | **PUT** /organizations/{uuid}/roles/{roleId} | Create or update organization roles for a given uuid
[**createOrganization**](OrganizationApi.md#createOrganization) | **POST** /organizations | Creates a new organization
[**createRole**](OrganizationApi.md#createRole) | **POST** /organizations/{uuid}/roles | Create organization roles for a given uuid
[**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **DELETE** /organizations/{uuid} | Delete organization
[**getOrganization**](OrganizationApi.md#getOrganization) | **GET** /organizations/{uuid} | Get detailed information about an organization.
[**listOrganization**](OrganizationApi.md#listOrganization) | **GET** /organizations | List organizations
[**removeService**](OrganizationApi.md#removeService) | **DELETE** /organizations/{uuid}/services/{serviceCode} | Remove a service for an organization
[**removeServiceFromUser**](OrganizationApi.md#removeServiceFromUser) | **DELETE** /organizations/{uuid}/users/{userUuid}/services/{serviceCode} | Remove a service from a user for an organization


<a name="addService"></a>
# **addService**
> addService(uuid, serviceCode, upsertServicePayload)

Add/update a service for an organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val serviceCode : kotlin.String = serviceCode_example // kotlin.String | The service code
val upsertServicePayload : UpsertServicePayload =  // UpsertServicePayload | 
try {
    apiInstance.addService(uuid, serviceCode, upsertServicePayload)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#addService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#addService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The organization identifier |
 **serviceCode** | **kotlin.String**| The service code |
 **upsertServicePayload** | [**UpsertServicePayload**](UpsertServicePayload.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addServiceToUser"></a>
# **addServiceToUser**
> addServiceToUser(uuid, userUuid, serviceCode, upsertServicePayload)

Add/update a service to a user for an organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val userUuid : kotlin.String = userUuid_example // kotlin.String | The user identifier
val serviceCode : kotlin.String = serviceCode_example // kotlin.String | The service code
val upsertServicePayload : UpsertServicePayload =  // UpsertServicePayload | 
try {
    apiInstance.addServiceToUser(uuid, userUuid, serviceCode, upsertServicePayload)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#addServiceToUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#addServiceToUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The organization identifier |
 **userUuid** | **kotlin.String**| The user identifier |
 **serviceCode** | **kotlin.String**| The service code |
 **upsertServicePayload** | [**UpsertServicePayload**](UpsertServicePayload.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

<a name="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(uuid, xUserUuid)

Delete organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val xUserUuid : kotlin.String = xUserUuid_example // kotlin.String | Uuid of the user for whom the call is made. Used to apply access and security rules
try {
    apiInstance.deleteOrganization(uuid, xUserUuid)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#deleteOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#deleteOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The organization identifier |
 **xUserUuid** | **kotlin.String**| Uuid of the user for whom the call is made. Used to apply access and security rules | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrganization"></a>
# **getOrganization**
> Organization getOrganization(uuid, xUserUuid)

Get detailed information about an organization.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val xUserUuid : kotlin.String = xUserUuid_example // kotlin.String | Uuid of the user for whom the call is made. Used to apply access and security rules
try {
    val result : Organization = apiInstance.getOrganization(uuid, xUserUuid)
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
 **xUserUuid** | **kotlin.String**| Uuid of the user for whom the call is made. Used to apply access and security rules | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrganization"></a>
# **listOrganization**
> ListUserOrganizations listOrganization(max, pageToken, parent, xUserUuid)

List organizations

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val max : kotlin.Int = 56 // kotlin.Int | Max number of organizations per page. Must be a positive integer.
val pageToken : kotlin.String = pageToken_example // kotlin.String | Page token to start with.
val parent : kotlin.String = parent_example // kotlin.String | Parent uuid.
val xUserUuid : kotlin.String = xUserUuid_example // kotlin.String | Uuid of the user for whom the call is made. Used to apply access and security rules
try {
    val result : ListUserOrganizations = apiInstance.listOrganization(max, pageToken, parent, xUserUuid)
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
 **max** | **kotlin.Int**| Max number of organizations per page. Must be a positive integer. |
 **pageToken** | **kotlin.String**| Page token to start with. | [optional]
 **parent** | **kotlin.String**| Parent uuid. | [optional]
 **xUserUuid** | **kotlin.String**| Uuid of the user for whom the call is made. Used to apply access and security rules | [optional]

### Return type

[**ListUserOrganizations**](ListUserOrganizations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeService"></a>
# **removeService**
> removeService(uuid, serviceCode)

Remove a service for an organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val serviceCode : kotlin.String = serviceCode_example // kotlin.String | The service code
try {
    apiInstance.removeService(uuid, serviceCode)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#removeService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#removeService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The organization identifier |
 **serviceCode** | **kotlin.String**| The service code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeServiceFromUser"></a>
# **removeServiceFromUser**
> removeServiceFromUser(uuid, userUuid, serviceCode)

Remove a service from a user for an organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiInstance = OrganizationApi()
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val userUuid : kotlin.String = userUuid_example // kotlin.String | The user identifier
val serviceCode : kotlin.String = serviceCode_example // kotlin.String | The service code
try {
    apiInstance.removeServiceFromUser(uuid, userUuid, serviceCode)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApi#removeServiceFromUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApi#removeServiceFromUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**| The organization identifier |
 **userUuid** | **kotlin.String**| The user identifier |
 **serviceCode** | **kotlin.String**| The service code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

