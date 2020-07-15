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


import com.squareup.moshi.Json
/**
 * 
 * @param disableOldestSessions When concurrent access exceeded, disable oldest sessions
 */

data class EnableEquisoftConnectPayloadSchema (
    /* When concurrent access exceeded, disable oldest sessions */
    @Json(name = "disableOldestSessions")
    val disableOldestSessions: kotlin.Boolean? = null
)

