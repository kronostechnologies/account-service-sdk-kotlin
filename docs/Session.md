
# Session

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sessionId** | **kotlin.String** | Globally unique identifier. |  [optional]
**state** | [**SessionState**](SessionState.md) |  |  [optional]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**expire** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**user** | [**User**](User.md) |  |  [optional]
**actor** | [**User**](User.md) |  |  [optional]
**sso** | [**SsoProvider**](SsoProvider.md) |  |  [optional]
**enabledForEquisoftConnect** | **kotlin.Boolean** | Session is enabled for Equisoft/Connect and is accounted for concurrent access. |  [optional]
**mobile** | **kotlin.Boolean** | Indicate that the session is initiated from a mobile device. |  [optional]



