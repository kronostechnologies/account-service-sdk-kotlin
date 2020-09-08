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
package com.equisoft.accountservice.sdk.apis

import com.equisoft.accountservice.sdk.models.ErrorPayload
import com.equisoft.accountservice.sdk.models.ServiceAccountCreatedSchema
import com.equisoft.accountservice.sdk.models.ServiceAccountCreationSchema
import com.equisoft.accountservice.sdk.models.ServiceAccountSchema

import com.equisoft.accountservice.sdk.infrastructure.ApiClient
import com.equisoft.accountservice.sdk.infrastructure.ClientException
import com.equisoft.accountservice.sdk.infrastructure.ClientError
import com.equisoft.accountservice.sdk.infrastructure.ServerException
import com.equisoft.accountservice.sdk.infrastructure.ServerError
import com.equisoft.accountservice.sdk.infrastructure.MultiValueMap
import com.equisoft.accountservice.sdk.infrastructure.RequestConfig
import com.equisoft.accountservice.sdk.infrastructure.RequestMethod
import com.equisoft.accountservice.sdk.infrastructure.ResponseType
import com.equisoft.accountservice.sdk.infrastructure.Success
import com.equisoft.accountservice.sdk.infrastructure.toMultiValue

class ServiceAccountApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.equisoft.accountservice.sdk.baseUrl", "http://localhost")
        }
    }

    /**
    * Creates a new service account
    * 
    * @param serviceAccountCreationSchema  
    * @return ServiceAccountCreatedSchema
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createServiceAccount(serviceAccountCreationSchema: ServiceAccountCreationSchema) : ServiceAccountCreatedSchema {
        val localVariableBody: kotlin.Any? = serviceAccountCreationSchema
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/serviceAccounts",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<ServiceAccountCreatedSchema>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ServiceAccountCreatedSchema
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get detailed information about a user account.
    * 
    * @param uuid Service account identifier 
    * @return ServiceAccountSchema
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getServiceAccount(uuid: kotlin.String) : ServiceAccountSchema {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/serviceAccounts/{uuid}".replace("{"+"uuid"+"}", "$uuid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<ServiceAccountSchema>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ServiceAccountSchema
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}
