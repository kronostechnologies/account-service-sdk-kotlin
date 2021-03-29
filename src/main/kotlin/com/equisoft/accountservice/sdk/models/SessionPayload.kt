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

import com.equisoft.accountservice.sdk.models.SsoProvider

import com.squareup.moshi.Json

/**
 * Data needed for the creation of a user session.
 * @param userUuid Globally unique identifier.
 * @param enable 
 * @param sso 
 * @param publicComputer Indicate that the session is initiated from a public computer.
 * @param mobileDevice Indicate that the session is initiated from a mobile device.
 * @param cookieDomain Indicate the domain name the session cookie was emitted for. If null, the cookie is assumed to be on the current hostname.
 * @param isPublicComputer Indicate that the session is initiated from a public computer.
 * @param isMobileDevice Indicate that the session is initiated from a mobile device.
 */

data class SessionPayload (
    /* Globally unique identifier. */
    @Json(name = "userUuid")
    val userUuid: kotlin.String,
    @Json(name = "enable")
    val enable: kotlin.Boolean? = null,
    @Json(name = "sso")
    val sso: SsoProvider? = null,
    /* Indicate that the session is initiated from a public computer. */
    @Json(name = "publicComputer")
    val publicComputer: kotlin.Boolean? = null,
    /* Indicate that the session is initiated from a mobile device. */
    @Json(name = "mobileDevice")
    val mobileDevice: kotlin.Boolean? = null,
    /* Indicate the domain name the session cookie was emitted for. If null, the cookie is assumed to be on the current hostname. */
    @Json(name = "cookieDomain")
    val cookieDomain: kotlin.String? = null,
    /* Indicate that the session is initiated from a public computer. */
    @Json(name = "isPublicComputer")
    val isPublicComputer: kotlin.Boolean? = null,
    /* Indicate that the session is initiated from a mobile device. */
    @Json(name = "isMobileDevice")
    val isMobileDevice: kotlin.Boolean? = null
)

