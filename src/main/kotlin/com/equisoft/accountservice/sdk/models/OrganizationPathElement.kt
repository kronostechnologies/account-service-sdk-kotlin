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

import com.squareup.moshi.Json

/**
 * 
 * @param name 
 * @param uuid 
 */

data class OrganizationPathElement (
    @Json(name = "name")
    val name: LocalizedString,
    @Json(name = "uuid")
    val uuid: kotlin.String
)

