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

import com.equisoft.accountservice.sdk.models.DatabaseState
import com.equisoft.accountservice.sdk.models.ServiceName

import com.squareup.moshi.Json

/**
 * 
 * @param serviceName 
 * @param databaseId 
 * @param databaseName 
 * @param databaseState 
 * @param userId Local ID of the user in the database.
 * @param maxConcurrentAccess Number of concurrent desktop session allowed for Equisoft/Connect. 0 for unlimited access.
 */

data class ServiceAccess (
    @Json(name = "serviceName")
    val serviceName: ServiceName? = null,
    @Json(name = "databaseId")
    val databaseId: kotlin.Long? = null,
    @Json(name = "databaseName")
    val databaseName: kotlin.String? = null,
    @Json(name = "databaseState")
    val databaseState: DatabaseState? = null,
    /* Local ID of the user in the database. */
    @Json(name = "userId")
    val userId: kotlin.Long? = null,
    /* Number of concurrent desktop session allowed for Equisoft/Connect. 0 for unlimited access. */
    @Json(name = "maxConcurrentAccess")
    val maxConcurrentAccess: kotlin.Int? = null
)

