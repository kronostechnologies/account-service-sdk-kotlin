package com.equisoft.accountservice.sdk.apis

import com.equisoft.accountservice.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import com.equisoft.accountservice.sdk.models.CreateOrUpdateOrganizationPayload
import com.equisoft.accountservice.sdk.models.CreateOrganizationPayload
import com.equisoft.accountservice.sdk.models.CreateRole
import com.equisoft.accountservice.sdk.models.ErrorPayload
import com.equisoft.accountservice.sdk.models.ListUserOrganizations
import com.equisoft.accountservice.sdk.models.Organization
import com.equisoft.accountservice.sdk.models.OrganizationCreated
import com.equisoft.accountservice.sdk.models.RoleCreated

interface OrganizationApi {
    /**
     * Create or update an organization for a given uuid
     * 
     * Responses:
     *  - 201: Organization created or updated.
     *  - 400: An error occurred when creating or updating the organization
     * 
     * @param uuid The organization identifier 
     * @param createOrUpdateOrganizationPayload  
     * @return [OrganizationCreated]
     */
    @PUT("organizations/{uuid}")
    suspend fun createOrUpdateOrganization(@Path("uuid") uuid: kotlin.String, @Body createOrUpdateOrganizationPayload: CreateOrUpdateOrganizationPayload): Response<OrganizationCreated>

    /**
     * Create or update organization roles for a given uuid
     * 
     * Responses:
     *  - 200: Organization role updated.
     *  - 400: An error occurred when creating or updating the organization role
     * 
     * @param uuid  
     * @param roleId  
     * @param createRole  
     * @return [RoleCreated]
     */
    @PUT("organizations/{uuid}/roles/{roleId}")
    suspend fun createOrUpdateRole(@Path("uuid") uuid: kotlin.String, @Path("roleId") roleId: kotlin.String, @Body createRole: CreateRole): Response<RoleCreated>

    /**
     * Creates a new organization
     * 
     * Responses:
     *  - 201: Organization created.
     *  - 400: An error occurred when creating the organization
     *  - 409: The organization UUID already exists
     * 
     * @param createOrganizationPayload  
     * @return [OrganizationCreated]
     */
    @POST("organizations")
    suspend fun createOrganization(@Body createOrganizationPayload: CreateOrganizationPayload): Response<OrganizationCreated>

    /**
     * Create organization roles for a given uuid
     * 
     * Responses:
     *  - 201: Organization roles created.
     *  - 400: An error occurred when creating or updating the organization role
     * 
     * @param uuid  
     * @param createRole  
     * @return [RoleCreated]
     */
    @POST("organizations/{uuid}/roles")
    suspend fun createRole(@Path("uuid") uuid: kotlin.String, @Body createRole: CreateRole): Response<RoleCreated>

    /**
     * Delete organization
     * 
     * Responses:
     *  - 204: Success. Organization deleted
     *  - 400: Cannot delete organization with sub-organization
     * 
     * @param uuid The organization identifier 
     * @param xUserUuid Uuid of the user for whom the call is made. Used to apply access and security rules (optional)
     * @return [Unit]
     */
    @DELETE("organizations/{uuid}")
    suspend fun deleteOrganization(@Path("uuid") uuid: kotlin.String, @Header("X-User-Uuid") xUserUuid: kotlin.String): Response<Unit>

    /**
     * Get detailed information about an organization.
     * 
     * Responses:
     *  - 200: Success
     *  - 404: Organization not found.
     * 
     * @param uuid The organization identifier 
     * @param xUserUuid Uuid of the user for whom the call is made. Used to apply access and security rules (optional)
     * @return [Organization]
     */
    @GET("organizations/{uuid}")
    suspend fun getOrganization(@Path("uuid") uuid: kotlin.String, @Header("X-User-Uuid") xUserUuid: kotlin.String): Response<Organization>

    /**
     * List organizations
     * 
     * Responses:
     *  - 200: Success
     * 
     * @param max Max number of organizations per page. Must be a positive integer. 
     * @param pageToken Page token to start with. (optional)
     * @param parent Parent uuid. (optional)
     * @param xUserUuid Uuid of the user for whom the call is made. Used to apply access and security rules (optional)
     * @return [ListUserOrganizations]
     */
    @GET("organizations")
    suspend fun listOrganization(@Query("max") max: kotlin.Int, @Query("pageToken") pageToken: kotlin.String? = null, @Query("parent") parent: kotlin.String? = null, @Header("X-User-Uuid") xUserUuid: kotlin.String): Response<ListUserOrganizations>

}
