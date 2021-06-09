package com.equisoft.accountservice.sdk.apis

import com.equisoft.accountservice.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.equisoft.accountservice.sdk.models.ErrorPayload
import com.equisoft.accountservice.sdk.models.Id
import com.equisoft.accountservice.sdk.models.User
import com.equisoft.accountservice.sdk.models.UserAccountSearchResult
import com.equisoft.accountservice.sdk.models.UserPermissions

interface UserApi {
    /**
     * Delete all sessions for the user.
     * 
     * Responses:
     *  - 204: Success. All session deleted
     * 
     * @param uuid The user account&#39;s identifier 
     * @return [Unit]
     */
    @DELETE("users/{uuid}/sessions")
    suspend fun deleteUserSessions(@Path("uuid") uuid: kotlin.String): Response<Unit>

    /**
     * Get detailed information about a user account.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: User account not found.
     * 
     * @param uuid The user account&#39;s identifier 
     * @return [User]
     */
    @GET("users/{uuid}")
    suspend fun getUser(@Path("uuid") uuid: kotlin.String): Response<User>

    /**
     * Get user permissions
     * 
     * Responses:
     *  - 200: Success
     *  - 404: User account not found.
     * 
     * @param uuid The user account&#39;s identifier 
     * @param xUserUuid Uuid of the user for whom the call is made. Used to apply access and security rules (optional)
     * @return [UserPermissions]
     */
    @GET("users/{uuid}/permissions")
    suspend fun getUserPermissions(@Path("uuid") uuid: kotlin.String, @Header("X-User-Uuid") xUserUuid: kotlin.String): Response<UserPermissions>

    /**
     * Find an uuid by id.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Id not found.
     * 
     * @param id The user account&#39;s identifier 
     * @return [Id]
     */
    @GET("users/{id}/uuid")
    suspend fun getUuidById(@Path("id") id: kotlin.Long): Response<Id>

    /**
     * Searches accounts that match ALL params. If no search parameters are provided, returns all users.
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param identifierOrEmail  (optional)
     * @param identifier  (optional)
     * @param email  (optional)
     * @param includeDeleted  (optional)
     * @return [kotlin.collections.List<UserAccountSearchResult>]
     */
    @GET("users")
    suspend fun listUsers(@Query("identifierOrEmail") identifierOrEmail: kotlin.String? = null, @Query("identifier") identifier: kotlin.String? = null, @Query("email") email: kotlin.String? = null, @Query("includeDeleted") includeDeleted: kotlin.Boolean? = null): Response<kotlin.collections.List<UserAccountSearchResult>>

}
