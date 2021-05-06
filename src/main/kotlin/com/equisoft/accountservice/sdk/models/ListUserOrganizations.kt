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

import com.equisoft.accountservice.sdk.models.ListOrganizationElement

import com.squareup.moshi.Json

/**
 * 
 * @param organizations 
 */

data class ListUserOrganizations (
    @Json(name = "organizations")
    val organizations: kotlin.collections.List<ListOrganizationElement>
)

