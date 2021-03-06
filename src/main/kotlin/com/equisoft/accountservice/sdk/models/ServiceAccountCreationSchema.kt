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


import com.squareup.moshi.Json

/**
 * A request to create a new account
 * @param name 
 * @param clientId 
 * @param displayName 
 */

data class ServiceAccountCreationSchema (
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "clientId")
    val clientId: kotlin.String,
    @Json(name = "displayName")
    val displayName: kotlin.String
)

