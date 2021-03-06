/**
* User account and session management
* Provides HTTP endpoints to manage User Accounts and User Sessions.
*
* The version of the OpenAPI document: 0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.equisoft.accountservice.sdk.models

import com.equisoft.accountservice.sdk.models.LocalizedString
import com.equisoft.accountservice.sdk.models.OrganizationPathElement
import com.equisoft.accountservice.sdk.models.OrganizationServicesElement

import com.squareup.moshi.Json

/**
 * 
 * @param uuid 
 * @param name 
 * @param path 
 * @param services 
 * @param parentUuid 
 */

data class ListOrganizationElement (
    @Json(name = "uuid")
    val uuid: kotlin.String,
    @Json(name = "name")
    val name: LocalizedString,
    @Json(name = "path")
    val path: kotlin.collections.List<OrganizationPathElement>,
    @Json(name = "services")
    val services: kotlin.collections.List<OrganizationServicesElement>,
    @Json(name = "parentUuid")
    val parentUuid: kotlin.String? = null
)

