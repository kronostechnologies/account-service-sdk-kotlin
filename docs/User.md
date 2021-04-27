
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
**roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | Legacy roles the user is member of. Use legacyRole because this property will eventually be used for next-generation roles | 
**deletable** | **kotlin.Boolean** | User deletion is disabled. | 
**billable** | **kotlin.Boolean** | User is accounted for billing. | 
**agreement** | [**UserAgreement**](UserAgreement.md) |  | 
**services** | [**kotlin.collections.List&lt;ServiceAccess&gt;**](ServiceAccess.md) |  | 
**mobilePhone** | **kotlin.String** | Mobile phone used for sms password reset. |  [optional]
**legacyRoles** | **kotlin.collections.List&lt;kotlin.String&gt;** | Legacy roles the user is member of |  [optional]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]



