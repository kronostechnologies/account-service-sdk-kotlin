package com.equisoft.accountservice.sdk.apis

import com.equisoft.accountservice.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.equisoft.accountservice.sdk.models.ErrorPayload
import com.equisoft.accountservice.sdk.models.Role

interface RoleApi {
    /**
     * Get organization role for a given uuid
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Role not found.
     * 
     * @param uuid The role identifier 
     * @return [Role]
     */
    @GET("roles/{uuid}")
    suspend fun getRole(@Path("uuid") uuid: kotlin.String): Response<Role>

}
