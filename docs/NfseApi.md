# NfseApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**baixarPdfNfse**](NfseApi.md#baixarPdfNfse) | **GET** /nfse/{id}/pdf | Baixar PDF do DANFSE |
| [**baixarXmlCancelamentoNfse**](NfseApi.md#baixarXmlCancelamentoNfse) | **GET** /nfse/{Id}/cancelamento/xml | Baixar XML do evento de cancelamento |
| [**baixarXmlDps**](NfseApi.md#baixarXmlDps) | **GET** /nfse/{id}/xml/dps | Baixar XML da DPS |
| [**baixarXmlNfse**](NfseApi.md#baixarXmlNfse) | **GET** /nfse/{id}/xml | Baixar XML da NFS-e processada |
| [**cancelarNfse**](NfseApi.md#cancelarNfse) | **POST** /nfse/{id}/cancelamento | Cancelar uma NFS-e autorizada |
| [**cidadesAtendidas**](NfseApi.md#cidadesAtendidas) | **GET** /nfse/cidades | Cidades atendidas |
| [**consultarCancelamentoNfse**](NfseApi.md#consultarCancelamentoNfse) | **GET** /nfse/{id}/cancelamento | Consultar o cancelamento da NFS-e |
| [**consultarLoteNfse**](NfseApi.md#consultarLoteNfse) | **GET** /nfse/lotes/{id} | Consultar lote de NFS-e |
| [**consultarMetadados**](NfseApi.md#consultarMetadados) | **GET** /nfse/cidades/{codigo_ibge} | Consultar metadados |
| [**consultarNfse**](NfseApi.md#consultarNfse) | **GET** /nfse/{id} | Consultar NFS-e |
| [**emitirLoteNfse**](NfseApi.md#emitirLoteNfse) | **POST** /nfse/lotes | Emitir lote de NFS-e |
| [**emitirLoteNfseDps**](NfseApi.md#emitirLoteNfseDps) | **POST** /nfse/dps/lotes | Emitir lote de NFS-e |
| [**emitirNfse**](NfseApi.md#emitirNfse) | **POST** /nfse | Emitir NFS-e |
| [**emitirNfseDps**](NfseApi.md#emitirNfseDps) | **POST** /nfse/dps | Emitir NFS-e |
| [**listarLotesNfse**](NfseApi.md#listarLotesNfse) | **GET** /nfse/lotes | Listar lotes de NFS-e |
| [**listarNfse**](NfseApi.md#listarNfse) | **GET** /nfse | Listar NFS-e |
| [**sincronizarNfse**](NfseApi.md#sincronizarNfse) | **POST** /nfse/{id}/sincronizar | Sincroniza dados na NFS-e a partir da Prefeitura |


<a id="baixarPdfNfse"></a>
# **baixarPdfNfse**
> File baixarPdfNfse(id, logotipo, mensagemRodape)

Baixar PDF do DANFSE

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    Boolean logotipo = false; // Boolean | Imprime o documento com logotipo, desde que esteja cadastrado na empresa.
    String mensagemRodape = "mensagemRodape_example"; // String | Imprime mensagem no rodapé do documento.    O caractere `|` (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * `\"esquerda\"`  * `\"esquerda|centro\"`  * `\"esquerda|centro|direita\"`  * `\"|centro\"`, `\"|centro|\"`  * `\"|centro|direita\"`  * `\"||direita\"`  * `\"esquerda||direita\"`    Default: `\"\"`
    try {
      File result = apiInstance.baixarPdfNfse(id, logotipo, mensagemRodape);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#baixarPdfNfse");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |
| **logotipo** | **Boolean**| Imprime o documento com logotipo, desde que esteja cadastrado na empresa. | [optional] [default to false] |
| **mensagemRodape** | **String**| Imprime mensagem no rodapé do documento.    O caractere &#x60;|&#x60; (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * &#x60;\&quot;esquerda\&quot;&#x60;  * &#x60;\&quot;esquerda|centro\&quot;&#x60;  * &#x60;\&quot;esquerda|centro|direita\&quot;&#x60;  * &#x60;\&quot;|centro\&quot;&#x60;, &#x60;\&quot;|centro|\&quot;&#x60;  * &#x60;\&quot;|centro|direita\&quot;&#x60;  * &#x60;\&quot;||direita\&quot;&#x60;  * &#x60;\&quot;esquerda||direita\&quot;&#x60;    Default: &#x60;\&quot;\&quot;&#x60; | [optional] |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="baixarXmlCancelamentoNfse"></a>
# **baixarXmlCancelamentoNfse**
> File baixarXmlCancelamentoNfse(id)

Baixar XML do evento de cancelamento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCancelamentoNfse(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#baixarXmlCancelamentoNfse");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="baixarXmlDps"></a>
# **baixarXmlDps**
> File baixarXmlDps(id)

Baixar XML da DPS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlDps(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#baixarXmlDps");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="baixarXmlNfse"></a>
# **baixarXmlNfse**
> File baixarXmlNfse(id)

Baixar XML da NFS-e processada

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlNfse(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#baixarXmlNfse");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="cancelarNfse"></a>
# **cancelarNfse**
> NfseCancelamento cancelarNfse(id, body)

Cancelar uma NFS-e autorizada

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    NfsePedidoCancelamento body = new NfsePedidoCancelamento(); // NfsePedidoCancelamento | 
    try {
      NfseCancelamento result = apiInstance.cancelarNfse(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#cancelarNfse");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |
| **body** | [**NfsePedidoCancelamento**](NfsePedidoCancelamento.md)|  | [optional] |

### Return type

[**NfseCancelamento**](NfseCancelamento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="cidadesAtendidas"></a>
# **cidadesAtendidas**
> NfseCidadesAtendidas cidadesAtendidas()

Cidades atendidas

Fornece uma relação completa de todos os municípios atendidos pela Nuvem Fiscal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    try {
      NfseCidadesAtendidas result = apiInstance.cidadesAtendidas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#cidadesAtendidas");
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

[**NfseCidadesAtendidas**](NfseCidadesAtendidas.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarCancelamentoNfse"></a>
# **consultarCancelamentoNfse**
> NfseCancelamento consultarCancelamentoNfse(id)

Consultar o cancelamento da NFS-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    try {
      NfseCancelamento result = apiInstance.consultarCancelamentoNfse(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#consultarCancelamentoNfse");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |

### Return type

[**NfseCancelamento**](NfseCancelamento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarLoteNfse"></a>
# **consultarLoteNfse**
> RpsLote consultarLoteNfse(id)

Consultar lote de NFS-e

Consulta os detalhes de um lote já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de lotes e a Nuvem Fiscal irá retornar as informações do lote correspondente.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único do lote gerado pela Nuvem Fiscal.
    try {
      RpsLote result = apiInstance.consultarLoteNfse(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#consultarLoteNfse");
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
| **id** | **String**| ID único do lote gerado pela Nuvem Fiscal. | |

### Return type

[**RpsLote**](RpsLote.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarMetadados"></a>
# **consultarMetadados**
> NfseCidadeMetadados consultarMetadados(codigoIbge)

Consultar metadados

Consulta a disponibilidade de emissão e alguns metadados de um município.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String codigoIbge = "codigoIbge_example"; // String | Código IBGE do município.
    try {
      NfseCidadeMetadados result = apiInstance.consultarMetadados(codigoIbge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#consultarMetadados");
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
| **codigoIbge** | **String**| Código IBGE do município. | |

### Return type

[**NfseCidadeMetadados**](NfseCidadeMetadados.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarNfse"></a>
# **consultarNfse**
> Nfse consultarNfse(id)

Consultar NFS-e

Consulta os detalhes de uma NFS-e já existente. Forneça o ID único obtido de uma requisição de criação ou de listagem de notas e a Nuvem Fiscal irá retornar as informações da nota correspondente.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    try {
      Nfse result = apiInstance.consultarNfse(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#consultarNfse");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |

### Return type

[**Nfse**](Nfse.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="emitirLoteNfse"></a>
# **emitirLoteNfse**
> RpsLote emitirLoteNfse(body)

Emitir lote de NFS-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por NFS-e.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    RpsPedidoEmissaoLote body = new RpsPedidoEmissaoLote(); // RpsPedidoEmissaoLote | 
    try {
      RpsLote result = apiInstance.emitirLoteNfse(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#emitirLoteNfse");
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
| **body** | [**RpsPedidoEmissaoLote**](RpsPedidoEmissaoLote.md)|  | |

### Return type

[**RpsLote**](RpsLote.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="emitirLoteNfseDps"></a>
# **emitirLoteNfseDps**
> RpsLote emitirLoteNfseDps(body)

Emitir lote de NFS-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por NFS-e.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    NfseLoteDpsPedidoEmissao body = new NfseLoteDpsPedidoEmissao(); // NfseLoteDpsPedidoEmissao | 
    try {
      RpsLote result = apiInstance.emitirLoteNfseDps(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#emitirLoteNfseDps");
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
| **body** | [**NfseLoteDpsPedidoEmissao**](NfseLoteDpsPedidoEmissao.md)|  | |

### Return type

[**RpsLote**](RpsLote.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="emitirNfse"></a>
# **emitirNfse**
> Nfse emitirNfse(body)

Emitir NFS-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    NfsePedidoEmissao body = new NfsePedidoEmissao(); // NfsePedidoEmissao | 
    try {
      Nfse result = apiInstance.emitirNfse(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#emitirNfse");
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
| **body** | [**NfsePedidoEmissao**](NfsePedidoEmissao.md)|  | |

### Return type

[**Nfse**](Nfse.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="emitirNfseDps"></a>
# **emitirNfseDps**
> Nfse emitirNfseDps(body)

Emitir NFS-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    NfseDpsPedidoEmissao body = new NfseDpsPedidoEmissao(); // NfseDpsPedidoEmissao | 
    try {
      Nfse result = apiInstance.emitirNfseDps(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#emitirNfseDps");
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
| **body** | [**NfseDpsPedidoEmissao**](NfseDpsPedidoEmissao.md)|  | |

### Return type

[**Nfse**](Nfse.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarLotesNfse"></a>
# **listarLotesNfse**
> RpsLoteListagem listarLotesNfse(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia)

Listar lotes de NFS-e

Retorna a lista dos lotes de acordo com os critérios de busca utilizados. Os lotes são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.  Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | 
    try {
      RpsLoteListagem result = apiInstance.listarLotesNfse(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#listarLotesNfse");
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
| **cpfCnpj** | **String**| Filtrar pelo CPF ou CNPJ do emitente.  Utilize o valor sem máscara. | |
| **ambiente** | **String**| Identificação do Ambiente.    Valores aceitos: homologacao, producao | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |
| **referencia** | **String**|  | [optional] |

### Return type

[**RpsLoteListagem**](RpsLoteListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarNfse"></a>
# **listarNfse**
> NfseListagem listarNfse(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie)

Listar NFS-e

Retorna a lista de notas de acordo com os critérios de busca utilizados. As notas são retornadas ordenadas pela data da criação, com as mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | Seu identificador único para o documento.
    String chave = "chave_example"; // String | Chave de acesso do DF-e.
    String serie = "serie_example"; // String | Série do DF-e.
    try {
      NfseListagem result = apiInstance.listarNfse(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#listarNfse");
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
| **cpfCnpj** | **String**| Filtrar pelo CPF ou CNPJ do emitente.    Utilize o valor sem máscara. | |
| **ambiente** | **String**| Identificação do Ambiente.    Valores aceitos: homologacao, producao | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |
| **referencia** | **String**| Seu identificador único para o documento. | [optional] |
| **chave** | **String**| Chave de acesso do DF-e. | [optional] |
| **serie** | **String**| Série do DF-e. | [optional] |

### Return type

[**NfseListagem**](NfseListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="sincronizarNfse"></a>
# **sincronizarNfse**
> NfseSincronizacao sincronizarNfse(id, body)

Sincroniza dados na NFS-e a partir da Prefeitura

Realiza a sincronização dos dados a partir da consulta da situação atual da NFS-e na prefeitura.    **Cenários de uso**:  * Sincronizar uma nota que se encontra com o status &#x60;processando&#x60; na Nuvem Fiscal, mas está autorizada na prefeitura;  * Sincronizar uma nota que se encontra com o status &#x60;erro&#x60; na Nuvem Fiscal, mas está autorizada na prefeitura (útil em casos de erros de transmissão, como instabilidades e timeouts);  * Sincronizar uma nota que se encontra com o status &#x60;autorizada&#x60;na Nuvem Fiscal, mas está cancelada na prefeitura.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por evento sincronizado ou requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NfseApi;

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

    NfseApi apiInstance = new NfseApi(defaultClient);
    String id = "id_example"; // String | ID único da NFS-e gerado pela Nuvem Fiscal.
    NfsePedidoSincronizacao body = new NfsePedidoSincronizacao(); // NfsePedidoSincronizacao | 
    try {
      NfseSincronizacao result = apiInstance.sincronizarNfse(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfseApi#sincronizarNfse");
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
| **id** | **String**| ID único da NFS-e gerado pela Nuvem Fiscal. | |
| **body** | [**NfsePedidoSincronizacao**](NfsePedidoSincronizacao.md)|  | [optional] |

### Return type

[**NfseSincronizacao**](NfseSincronizacao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

