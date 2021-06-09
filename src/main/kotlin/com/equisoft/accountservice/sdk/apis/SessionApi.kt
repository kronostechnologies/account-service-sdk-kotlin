package com.equisoft.accountservice.sdk.apis

import com.equisoft.accountservice.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.equisoft.accountservice.sdk.models.EnableEquisoftConnectPayloadSchema
import com.equisoft.accountservice.sdk.models.ErrorPayload
import com.equisoft.accountservice.sdk.models.ImpersonatePayload
import com.equisoft.accountservice.sdk.models.Session
import com.equisoft.accountservice.sdk.models.SessionPayload
import com.equisoft.accountservice.sdk.models.SsoToken

interface SessionApi {
    /**
     * Create a user session.
     * 
     * Responses:
     *  - 201: User session created.
     *  - 400: Could not create session.
     * 
     * @param sessionPayload  
     * @return [Session]
     */
    @POST("sessions")
    suspend fun createSession(@Body sessionPayload: SessionPayload): Response<Session>

    /**
     * Delete all sessions
     * 
     * Responses:
     *  - 204: Success. All session deleted
     * 
     * @return [Unit]
     */
    @DELETE("sessions")
    suspend fun deleteAllSessions(): Response<Unit>

    /**
     * Delete all expired sessions.
     * 
     * Responses:
     *  - 204: Success.
     * 
     * @return [Unit]
     */
    @DELETE("sessions/expired")
    suspend fun deleteExpiredSessions(): Response<Unit>

    /**
     * Delete a user session.
     * 
     * Responses:
     *  - 204: User session deleted.
     *  - 404: User session not found.
     * 
     * @param uuid The user session&#39;s identifier 
     * @return [Unit]
     */
    @DELETE("sessions/{uuid}")
    suspend fun deleteSession(@Path("uuid") uuid: kotlin.String): Response<Unit>

    /**
     * Delete a sso token for the session for a given id/name/type
     * 
     * Responses:
     *  - 204: Session SSO token deleted.
     *  - 404: User session or token not found.
     * 
     * @param uuid  
     * @param tokenId  
     * @return [Unit]
     */
    @DELETE("sessions/{uuid}/tokens/{tokenId}")
    suspend fun deleteSessionSsoToken(@Path("uuid") uuid: kotlin.String, @Path("tokenId") tokenId: kotlin.String): Response<Unit>

    /**
     * Allow activation for sessions created with enable&#x3D;false. This may be extended to enable specific services. Disabled sessions are not allowed to be used by first-party application (Equisoft/Connect, Equisoft/Plan).
     * 
     * Responses:
     *  - 204: User session enabled.
     *  - 400: Could not enable session.
     *  - 404: User session not found.
     * 
     * @param uuid  
     * @param body  (optional)
     * @return [Unit]
     */
    @POST("sessions/{uuid}/enable")
    suspend fun enableSession(@Path("uuid") uuid: kotlin.String, @Body body: kotlin.String? = null): Response<Unit>

    /**
     * Enable session for the Equisoft/Connect service
     * 
     * Responses:
     *  - 202: User session enabled.
     *  - 400: Could not enable session for Equisoft/Connect.
     *  - 404: User session not found.
     * 
     * @param uuid  
     * @param enableEquisoftConnectPayloadSchema  (optional)
     * @return [Unit]
     */
    @POST("sessions/{uuid}/enable/EQUISOFT_CONNECT")
    suspend fun enableSessionForEquisoftConnect(@Path("uuid") uuid: kotlin.String, @Body enableEquisoftConnectPayloadSchema: EnableEquisoftConnectPayloadSchema? = null): Response<Unit>

    /**
     * Get detailed information about a user session.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: User session not found.
     * 
     * @param uuid The user session&#39;s identifier 
     * @param keepAlive If true, update the last access timestamp. (optional)
     * @return [Session]
     */
    @GET("sessions/{uuid}")
    suspend fun getSession(@Path("uuid") uuid: kotlin.String, @Query("keepAlive") keepAlive: kotlin.Boolean? = null): Response<Session>

    /**
     * Get a stored sso token for the session
     * 
     * Responses:
     *  - 200: Returns the content of the stored sso token.
     *  - 404: User session not found.
     * 
     * @param uuid  
     * @param tokenId  
     * @return [SsoToken]
     */
    @GET("sessions/{uuid}/tokens/{tokenId}")
    suspend fun getSessionSsoToken(@Path("uuid") uuid: kotlin.String, @Path("tokenId") tokenId: kotlin.String): Response<SsoToken>

    /**
     * Impersonate the given user context.
     * For administrator with impersonation capability. Impersonate the given user context. After impersonation, the admin user becomes the \&quot;actor\&quot; and the impersonated user becomes the \&quot;user\&quot;. Use /revertIdentity to revert the impersonation.
     * Responses:
     *  - 200: User session impersonated
     *  - 404: User session not found.
     * 
     * @param uuid  
     * @param impersonatePayload  
     * @return [Session]
     */
    @POST("sessions/{uuid}/impersonate")
    suspend fun impersonate(@Path("uuid") uuid: kotlin.String, @Body impersonatePayload: ImpersonatePayload): Response<Session>

    /**
     * Revert an impersonated session to the context of the \&quot;admin\&quot; user who initiated the impersonation.
     * 
     * Responses:
     *  - 200: User session identity reverted
     *  - 404: User session not found.
     * 
     * @param uuid  
     * @param body  (optional)
     * @return [Session]
     */
    @POST("sessions/{uuid}/revertIdentity")
    suspend fun revertIdentity(@Path("uuid") uuid: kotlin.String, @Body body: kotlin.String? = null): Response<Session>

    /**
     * Store a sso token for the session for a given id/name/type
     * 
     * Responses:
     *  - 200: Successfully stored the sso token
     *  - 404: User session not found.
     * 
     * @param uuid  
     * @param tokenId  
     * @param body  
     * @return [Unit]
     */
    @PUT("sessions/{uuid}/tokens/{tokenId}")
    suspend fun setSessionSsoToken(@Path("uuid") uuid: kotlin.String, @Path("tokenId") tokenId: kotlin.String, @Body body: kotlin.String): Response<Unit>

}
