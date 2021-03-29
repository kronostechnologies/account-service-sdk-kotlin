/**
* User account and session management
* Provides HTTP endpoints to manage User Accounts and User Sessions.
*
* The version of the OpenAPI document: latest
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
 * created role schema
 * @param uuid 
 * @param name 
 * @param permissions 
 */

data class RoleCreated (
    @Json(name = "uuid")
    val uuid: kotlin.String? = null,
    @Json(name = "name")
    val name: LocalizedString? = null,
    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null
)

