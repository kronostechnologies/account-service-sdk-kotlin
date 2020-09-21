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

import com.equisoft.accountservice.sdk.models.ErrorMessage

import com.squareup.moshi.Json

/**
 * 
 * @param message 
 * @param description 
 */

data class ErrorPayload (
    @Json(name = "message")
    val message: ErrorMessage? = null,
    @Json(name = "description")
    val description: kotlin.String? = null
)

