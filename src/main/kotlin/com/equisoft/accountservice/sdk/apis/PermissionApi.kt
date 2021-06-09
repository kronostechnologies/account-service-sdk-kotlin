package com.equisoft.accountservice.sdk.apis

import com.equisoft.accountservice.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.equisoft.accountservice.sdk.models.CreateOrUpdatePermissionPayload
import com.equisoft.accountservice.sdk.models.ErrorPayload
import com.equisoft.accountservice.sdk.models.PermissionCreated

interface PermissionApi {
    /**
     * Create or update a permission for a given code
     * 
     * Responses:
     *  - 200: Permission created or updated.
     *  - 400: An error occurred when creating or updating the permission
     * 
     * @param code The permission code 
     * @param createOrUpdatePermissionPayload  
     * @return [PermissionCreated]
     */
    @PUT("permissions/{code}")
    suspend fun createOrUpdatePermission(@Path("code") code: kotlin.String, @Body createOrUpdatePermissionPayload: CreateOrUpdatePermissionPayload): Response<PermissionCreated>

}
