# com.equisoft.accountservice.sdk - Kotlin client library for User account and session management

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrganizationApi* | [**createOrUpdateOrganization**](docs/OrganizationApi.md#createorupdateorganization) | **PUT** /organizations/{uuid} | Create or update an organization for a given uuid
*OrganizationApi* | [**createOrUpdateRole**](docs/OrganizationApi.md#createorupdaterole) | **PUT** /organizations/{uuid}/roles/{roleId} | Create or update organization roles for a given uuid
*OrganizationApi* | [**createOrganization**](docs/OrganizationApi.md#createorganization) | **POST** /organizations | Creates a new organization
*OrganizationApi* | [**createRole**](docs/OrganizationApi.md#createrole) | **POST** /organizations/{uuid}/roles | Create organization roles for a given uuid
*OrganizationApi* | [**deleteOrganization**](docs/OrganizationApi.md#deleteorganization) | **DELETE** /organizations/{uuid} | Delete organization
*OrganizationApi* | [**getOrganization**](docs/OrganizationApi.md#getorganization) | **GET** /organizations/{uuid} | Get detailed information about an organization.
*OrganizationApi* | [**listOrganization**](docs/OrganizationApi.md#listorganization) | **GET** /organizations | List organizations
*PermissionApi* | [**createOrUpdatePermission**](docs/PermissionApi.md#createorupdatepermission) | **PUT** /permissions/{code} | Create or update a permission for a given code
*RoleApi* | [**getRole**](docs/RoleApi.md#getrole) | **GET** /roles/{uuid} | Get organization role for a given uuid
*ServiceAccountApi* | [**createServiceAccount**](docs/ServiceAccountApi.md#createserviceaccount) | **POST** /serviceAccounts | Creates a new service account
*ServiceAccountApi* | [**getServiceAccount**](docs/ServiceAccountApi.md#getserviceaccount) | **GET** /serviceAccounts/{uuid} | Get detailed information about a user account.
*ServiceAccountApi* | [**searchServiceAccount**](docs/ServiceAccountApi.md#searchserviceaccount) | **GET** /serviceAccounts | Searches service accounts that match ALL params. If none are provided, returns all service accounts
*ServiceAccountApi* | [**updateServiceAccount**](docs/ServiceAccountApi.md#updateserviceaccount) | **PATCH** /serviceAccounts/{uuid} | Updates a service account by uuid
*SessionApi* | [**createSession**](docs/SessionApi.md#createsession) | **POST** /sessions | Create a user session.
*SessionApi* | [**deleteAllSessions**](docs/SessionApi.md#deleteallsessions) | **DELETE** /sessions | Delete all sessions
*SessionApi* | [**deleteExpiredSessions**](docs/SessionApi.md#deleteexpiredsessions) | **DELETE** /sessions/expired | Delete all expired sessions.
*SessionApi* | [**deleteSession**](docs/SessionApi.md#deletesession) | **DELETE** /sessions/{uuid} | Delete a user session.
*SessionApi* | [**deleteSessionSsoToken**](docs/SessionApi.md#deletesessionssotoken) | **DELETE** /sessions/{uuid}/tokens/{tokenId} | Delete a sso token for the session for a given id/name/type
*SessionApi* | [**enableSession**](docs/SessionApi.md#enablesession) | **POST** /sessions/{uuid}/enable | Allow activation for sessions created with enable=false. This may be extended to enable specific services. Disabled sessions are not allowed to be used by first-party application (Equisoft/Connect, Equisoft/Plan).
*SessionApi* | [**enableSessionForEquisoftConnect**](docs/SessionApi.md#enablesessionforequisoftconnect) | **POST** /sessions/{uuid}/enable/EQUISOFT_CONNECT | Enable session for the Equisoft/Connect service
*SessionApi* | [**getSession**](docs/SessionApi.md#getsession) | **GET** /sessions/{uuid} | Get detailed information about a user session.
*SessionApi* | [**getSessionSsoToken**](docs/SessionApi.md#getsessionssotoken) | **GET** /sessions/{uuid}/tokens/{tokenId} | Get a stored sso token for the session
*SessionApi* | [**impersonate**](docs/SessionApi.md#impersonate) | **POST** /sessions/{uuid}/impersonate | Impersonate the given user context.
*SessionApi* | [**revertIdentity**](docs/SessionApi.md#revertidentity) | **POST** /sessions/{uuid}/revertIdentity | Revert an impersonated session to the context of the \"admin\" user who initiated the impersonation.
*SessionApi* | [**setSessionSsoToken**](docs/SessionApi.md#setsessionssotoken) | **PUT** /sessions/{uuid}/tokens/{tokenId} | Store a sso token for the session for a given id/name/type
*UserApi* | [**deleteUserSessions**](docs/UserApi.md#deleteusersessions) | **DELETE** /users/{uuid}/sessions | Delete all sessions for the user.
*UserApi* | [**getUser**](docs/UserApi.md#getuser) | **GET** /users/{uuid} | Get detailed information about a user account.
*UserApi* | [**getUserPermissions**](docs/UserApi.md#getuserpermissions) | **GET** /users/{uuid}/permissions | Get user permissions
*UserApi* | [**getUuidById**](docs/UserApi.md#getuuidbyid) | **GET** /users/{id}/uuid | Find an uuid by id.
*UserApi* | [**listUsers**](docs/UserApi.md#listusers) | **GET** /users | Searches accounts that match ALL params. If no search parameters are provided, returns all users.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.equisoft.accountservice.sdk.models.CreateOrUpdateOrganizationPayload](docs/CreateOrUpdateOrganizationPayload.md)
 - [com.equisoft.accountservice.sdk.models.CreateOrUpdatePermissionPayload](docs/CreateOrUpdatePermissionPayload.md)
 - [com.equisoft.accountservice.sdk.models.CreateOrganizationPayload](docs/CreateOrganizationPayload.md)
 - [com.equisoft.accountservice.sdk.models.CreateRole](docs/CreateRole.md)
 - [com.equisoft.accountservice.sdk.models.DatabaseState](docs/DatabaseState.md)
 - [com.equisoft.accountservice.sdk.models.EnableEquisoftConnectPayloadSchema](docs/EnableEquisoftConnectPayloadSchema.md)
 - [com.equisoft.accountservice.sdk.models.ErrorMessage](docs/ErrorMessage.md)
 - [com.equisoft.accountservice.sdk.models.ErrorPayload](docs/ErrorPayload.md)
 - [com.equisoft.accountservice.sdk.models.Id](docs/Id.md)
 - [com.equisoft.accountservice.sdk.models.ImpersonatePayload](docs/ImpersonatePayload.md)
 - [com.equisoft.accountservice.sdk.models.LegacyRoleSchema](docs/LegacyRoleSchema.md)
 - [com.equisoft.accountservice.sdk.models.ListOrganizationElement](docs/ListOrganizationElement.md)
 - [com.equisoft.accountservice.sdk.models.ListUserOrganizations](docs/ListUserOrganizations.md)
 - [com.equisoft.accountservice.sdk.models.LocalizedString](docs/LocalizedString.md)
 - [com.equisoft.accountservice.sdk.models.Organization](docs/Organization.md)
 - [com.equisoft.accountservice.sdk.models.OrganizationCreated](docs/OrganizationCreated.md)
 - [com.equisoft.accountservice.sdk.models.OrganizationPathElement](docs/OrganizationPathElement.md)
 - [com.equisoft.accountservice.sdk.models.PermissionCreated](docs/PermissionCreated.md)
 - [com.equisoft.accountservice.sdk.models.Role](docs/Role.md)
 - [com.equisoft.accountservice.sdk.models.RoleCreated](docs/RoleCreated.md)
 - [com.equisoft.accountservice.sdk.models.RolesOnOrganization](docs/RolesOnOrganization.md)
 - [com.equisoft.accountservice.sdk.models.ServiceAccess](docs/ServiceAccess.md)
 - [com.equisoft.accountservice.sdk.models.ServiceAccountCreationSchema](docs/ServiceAccountCreationSchema.md)
 - [com.equisoft.accountservice.sdk.models.ServiceAccountSchema](docs/ServiceAccountSchema.md)
 - [com.equisoft.accountservice.sdk.models.ServiceAccountStatus](docs/ServiceAccountStatus.md)
 - [com.equisoft.accountservice.sdk.models.ServiceAccountUpdateSchema](docs/ServiceAccountUpdateSchema.md)
 - [com.equisoft.accountservice.sdk.models.ServiceAccountUuidSchema](docs/ServiceAccountUuidSchema.md)
 - [com.equisoft.accountservice.sdk.models.ServiceName](docs/ServiceName.md)
 - [com.equisoft.accountservice.sdk.models.Session](docs/Session.md)
 - [com.equisoft.accountservice.sdk.models.SessionPayload](docs/SessionPayload.md)
 - [com.equisoft.accountservice.sdk.models.SessionState](docs/SessionState.md)
 - [com.equisoft.accountservice.sdk.models.SsoProvider](docs/SsoProvider.md)
 - [com.equisoft.accountservice.sdk.models.SsoToken](docs/SsoToken.md)
 - [com.equisoft.accountservice.sdk.models.User](docs/User.md)
 - [com.equisoft.accountservice.sdk.models.UserAccountPermission](docs/UserAccountPermission.md)
 - [com.equisoft.accountservice.sdk.models.UserAccountRole](docs/UserAccountRole.md)
 - [com.equisoft.accountservice.sdk.models.UserAccountSearchResult](docs/UserAccountSearchResult.md)
 - [com.equisoft.accountservice.sdk.models.UserAgreement](docs/UserAgreement.md)
 - [com.equisoft.accountservice.sdk.models.UserAgreementState](docs/UserAgreementState.md)
 - [com.equisoft.accountservice.sdk.models.UserPermissions](docs/UserPermissions.md)
 - [com.equisoft.accountservice.sdk.models.UserSsoProvider](docs/UserSsoProvider.md)
 - [com.equisoft.accountservice.sdk.models.UserState](docs/UserState.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
