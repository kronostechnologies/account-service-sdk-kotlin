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
 * Details related to the SSO provider user to create this session.
 * @param provider SSO Provider who initiated the single sign on.
 * @param identifier External identifier the user used to login with the SSO provider.
 */

data class SsoProvider (
    /* SSO Provider who initiated the single sign on. */
    @Json(name = "provider")
    val provider: kotlin.String,
    /* External identifier the user used to login with the SSO provider. */
    @Json(name = "identifier")
    val identifier: kotlin.String
)

