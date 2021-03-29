
# Session

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sessionId** | **kotlin.String** | Globally unique identifier. | 
**state** | [**SessionState**](SessionState.md) |  | 
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**suspend** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**expire** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**user** | [**User**](User.md) |  | 
**enabledForEquisoftConnect** | **kotlin.Boolean** | Session is enabled for Equisoft/Connect and is accounted for concurrent access. | 
**mobile** | **kotlin.Boolean** | Indicate that the session is initiated from a mobile device. | 
**cookieDomain** | **kotlin.String** | Indicate the domain name the session cookie was emitted for. |  [optional]
**actor** | [**User**](User.md) |  |  [optional]
**sso** | [**SsoProvider**](SsoProvider.md) |  |  [optional]



