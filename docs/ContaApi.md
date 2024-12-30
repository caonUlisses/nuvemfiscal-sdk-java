# ContaApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consultarCotaConta**](ContaApi.md#consultarCotaConta) | **GET** /conta/cotas/{nome} | Consultar o limite de uso e o consumo de uma cota específica. |
| [**listarCotasConta**](ContaApi.md#listarCotasConta) | **GET** /conta/cotas | Consultar os limites de uso e consumo de todas as cotas existentes. |


<a id="consultarCotaConta"></a>
# **consultarCotaConta**
> ContaCota consultarCotaConta(nome)

Consultar o limite de uso e o consumo de uma cota específica.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.ContaApi;

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

    ContaApi apiInstance = new ContaApi(defaultClient);
    String nome = "nome_example"; // String | Nome da cota a ser consultada.
    try {
      ContaCota result = apiInstance.consultarCotaConta(nome);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContaApi#consultarCotaConta");
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
| **nome** | **String**| Nome da cota a ser consultada. | |

### Return type

[**ContaCota**](ContaCota.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarCotasConta"></a>
# **listarCotasConta**
> ContaCotaListagem listarCotasConta()

Consultar os limites de uso e consumo de todas as cotas existentes.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.ContaApi;

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

    ContaApi apiInstance = new ContaApi(defaultClient);
    try {
      ContaCotaListagem result = apiInstance.listarCotasConta();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContaApi#listarCotasConta");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContaCotaListagem**](ContaCotaListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

