
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** |  |  [optional]
**uuid** | **kotlin.String** |  |  [optional]
**displayName** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**mobilePhone** | **kotlin.String** | Mobile phone used for sms password reset. |  [optional]
**locale** | **kotlin.String** |  |  [optional]
**state** | [**UserState**](UserState.md) |  |  [optional]
**roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | Roles the user is member a member of. |  [optional]
**deletable** | **kotlin.Boolean** | User deletion is disabled. |  [optional]
**billable** | **kotlin.Boolean** | User is accounted for billing. |  [optional]
**agreement** | [**UserAgreement**](UserAgreement.md) |  |  [optional]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**services** | [**kotlin.collections.List&lt;ServiceAccess&gt;**](ServiceAccess.md) |  |  [optional]



