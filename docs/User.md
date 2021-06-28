
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** |  | 
**uuid** | **kotlin.String** |  | 
**displayName** | **kotlin.String** |  | 
**email** | **kotlin.String** |  | 
**locale** | **kotlin.String** |  | 
**state** | [**UserState**](UserState.md) |  | 
**locked** | **kotlin.Boolean** |  | 
**legacyRoles** | **kotlin.collections.List&lt;kotlin.String&gt;** | Legacy roles the user is member of | 
**deletable** | **kotlin.Boolean** | User deletion is disabled. | 
**billable** | **kotlin.Boolean** | User is accounted for billing. | 
**agreement** | [**UserAgreement**](UserAgreement.md) |  | 
**services** | [**kotlin.collections.List&lt;ServiceAccess&gt;**](ServiceAccess.md) |  | 
**servicesUsers** | [**kotlin.collections.List&lt;UserServiceAssociation&gt;**](UserServiceAssociation.md) |  | 
**authType** | **kotlin.String** |  | 
**mobilePhone** | **kotlin.String** | Mobile phone used for sms password reset. |  [optional]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**ssoProvider** | [**UserSsoProvider**](UserSsoProvider.md) |  |  [optional]
**ssoIdentifier** | **kotlin.String** |  |  [optional]



