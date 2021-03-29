# OrganizationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateOrganization**](OrganizationApi.md#createOrUpdateOrganization) | **PUT** /organizations/{uuid} | Create or update an organization for a given uuid
[**createOrganization**](OrganizationApi.md#createOrganization) | **POST** /organizations | Creates a new organization
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
> Organization listOrganization(max, pageToken, parent)

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
    val result : Organization = apiInstance.listOrganization(max, pageToken, parent)
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

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

