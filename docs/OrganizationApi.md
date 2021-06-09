# OrganizationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateOrganization**](OrganizationApi.md#createOrUpdateOrganization) | **PUT** organizations/{uuid} | Create or update an organization for a given uuid
[**createOrUpdateRole**](OrganizationApi.md#createOrUpdateRole) | **PUT** organizations/{uuid}/roles/{roleId} | Create or update organization roles for a given uuid
[**createOrganization**](OrganizationApi.md#createOrganization) | **POST** organizations | Creates a new organization
[**createRole**](OrganizationApi.md#createRole) | **POST** organizations/{uuid}/roles | Create organization roles for a given uuid
[**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **DELETE** organizations/{uuid} | Delete organization
[**getOrganization**](OrganizationApi.md#getOrganization) | **GET** organizations/{uuid} | Get detailed information about an organization.
[**listOrganization**](OrganizationApi.md#listOrganization) | **GET** organizations | List organizations



Create or update an organization for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OrganizationApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val createOrUpdateOrganizationPayload : CreateOrUpdateOrganizationPayload =  // CreateOrUpdateOrganizationPayload | 

launch(Dispatchers.IO) {
    val result : OrganizationCreated = webService.createOrUpdateOrganization(uuid, createOrUpdateOrganizationPayload)
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


Create or update organization roles for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OrganizationApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val roleId : kotlin.String = roleId_example // kotlin.String | 
val createRole : CreateRole =  // CreateRole | 

launch(Dispatchers.IO) {
    val result : RoleCreated = webService.createOrUpdateRole(uuid, roleId, createRole)
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


Creates a new organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OrganizationApi::class.java)
val createOrganizationPayload : CreateOrganizationPayload =  // CreateOrganizationPayload | 

launch(Dispatchers.IO) {
    val result : OrganizationCreated = webService.createOrganization(createOrganizationPayload)
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


Create organization roles for a given uuid

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OrganizationApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | 
val createRole : CreateRole =  // CreateRole | 

launch(Dispatchers.IO) {
    val result : RoleCreated = webService.createRole(uuid, createRole)
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


Delete organization

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OrganizationApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val xUserUuid : kotlin.String = xUserUuid_example // kotlin.String | Uuid of the user for whom the call is made. Used to apply access and security rules

launch(Dispatchers.IO) {
    webService.deleteOrganization(uuid, xUserUuid)
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


Get detailed information about an organization.

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OrganizationApi::class.java)
val uuid : kotlin.String = uuid_example // kotlin.String | The organization identifier
val xUserUuid : kotlin.String = xUserUuid_example // kotlin.String | Uuid of the user for whom the call is made. Used to apply access and security rules

launch(Dispatchers.IO) {
    val result : Organization = webService.getOrganization(uuid, xUserUuid)
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


List organizations

### Example
```kotlin
// Import classes:
//import com.equisoft.accountservice.sdk.*
//import com.equisoft.accountservice.sdk.infrastructure.*
//import com.equisoft.accountservice.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OrganizationApi::class.java)
val max : kotlin.Int = 56 // kotlin.Int | Max number of organizations per page. Must be a positive integer.
val pageToken : kotlin.String = pageToken_example // kotlin.String | Page token to start with.
val parent : kotlin.String = parent_example // kotlin.String | Parent uuid.
val xUserUuid : kotlin.String = xUserUuid_example // kotlin.String | Uuid of the user for whom the call is made. Used to apply access and security rules

launch(Dispatchers.IO) {
    val result : ListUserOrganizations = webService.listOrganization(max, pageToken, parent, xUserUuid)
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

