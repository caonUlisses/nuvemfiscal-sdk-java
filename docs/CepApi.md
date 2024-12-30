# CepApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consultarCep**](CepApi.md#consultarCep) | **GET** /cep/{Cep} | Consultar endereço através do CEP |


<a id="consultarCep"></a>
# **consultarCep**
> CepEndereco consultarCep(cep)

Consultar endereço através do CEP

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#cep-consultas\&quot;&gt;cep-consultas&lt;/a&gt;  - Consumo: 1 unidade requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.CepApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nuvemfiscal.com.br");
    
    // Configure API key authorization: jwt
    ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
    jwt.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwt.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CepApi apiInstance = new CepApi(defaultClient);
    String cep = "cep_example"; // String | CEP sem máscara.
    try {
      CepEndereco result = apiInstance.consultarCep(cep);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CepApi#consultarCep");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cep** | **String**| CEP sem máscara. | |

### Return type

[**CepEndereco**](CepEndereco.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

