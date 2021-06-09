package com.equisoft.accountservice.sdk.apis

import com.equisoft.accountservice.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.equisoft.accountservice.sdk.models.ErrorPayload
import com.equisoft.accountservice.sdk.models.ServiceAccountCreationSchema
import com.equisoft.accountservice.sdk.models.ServiceAccountSchema
import com.equisoft.accountservice.sdk.models.ServiceAccountUpdateSchema
import com.equisoft.accountservice.sdk.models.ServiceAccountUuidSchema

interface ServiceAccountApi {
    /**
     * Creates a new service account
     * 
     * Responses:
     *  - 201: User session created.
     *  - 400: An error occurred when creating the service account
     *  - 409: The service account UUID already exists
     * 
     * @param serviceAccountCreationSchema  
     * @return [ServiceAccountUuidSchema]
     */
    @POST("serviceAccounts")
    suspend fun createServiceAccount(@Body serviceAccountCreationSchema: ServiceAccountCreationSchema): Response<ServiceAccountUuidSchema>

    /**
     * Get detailed information about a user account.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Service account not found.
     * 
     * @param uuid Service account identifier 
     * @return [ServiceAccountSchema]
     */
    @GET("serviceAccounts/{uuid}")
    suspend fun getServiceAccount(@Path("uuid") uuid: kotlin.String): Response<ServiceAccountSchema>

    /**
     * Searches service accounts that match ALL params. If none are provided, returns all service accounts
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param name  (optional)
     * @return [kotlin.collections.List<ServiceAccountSchema>]
     */
    @GET("serviceAccounts")
    suspend fun searchServiceAccount(@Query("name") name: kotlin.String? = null): Response<kotlin.collections.List<ServiceAccountSchema>>

    /**
     * Updates a service account by uuid
     * 
     * Responses:
     *  - 200: User session updated.
     *  - 400: An error occurred when creating the service account
     *  - 404: Service account not found.
     * 
     * @param uuid Service account identifier 
     * @param serviceAccountUpdateSchema  
     * @return [ServiceAccountUuidSchema]
     */
    @PATCH("serviceAccounts/{uuid}")
    suspend fun updateServiceAccount(@Path("uuid") uuid: kotlin.String, @Body serviceAccountUpdateSchema: ServiceAccountUpdateSchema): Response<ServiceAccountUuidSchema>

}
