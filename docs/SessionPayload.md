
# SessionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userUuid** | **kotlin.String** | Globally unique identifier. | 
**enable** | **kotlin.Boolean** |  |  [optional]
**sso** | [**SsoProvider**](SsoProvider.md) |  |  [optional]
**publicComputer** | **kotlin.Boolean** | Indicate that the session is initiated from a public computer. |  [optional]
**mobileDevice** | **kotlin.Boolean** | Indicate that the session is initiated from a mobile device. |  [optional]
**cookieDomain** | **kotlin.String** | Indicate the domain name the session cookie was emitted for. If null, the cookie is assumed to be on the current hostname. |  [optional]



