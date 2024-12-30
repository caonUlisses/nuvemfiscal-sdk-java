# CteApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**baixarPdfCancelamentoCte**](CteApi.md#baixarPdfCancelamentoCte) | **GET** /cte/{id}/cancelamento/pdf | Baixar PDF do cancelamento |
| [**baixarPdfCartaCorrecaoCte**](CteApi.md#baixarPdfCartaCorrecaoCte) | **GET** /cte/{id}/carta-correcao/pdf | Baixar PDF da carta de correção |
| [**baixarPdfCte**](CteApi.md#baixarPdfCte) | **GET** /cte/{id}/pdf | Baixar PDF do DACTE |
| [**baixarPdfEventoCte**](CteApi.md#baixarPdfEventoCte) | **GET** /cte/eventos/{id}/pdf | Baixar PDF do evento |
| [**baixarXmlCancelamentoCte**](CteApi.md#baixarXmlCancelamentoCte) | **GET** /cte/{id}/cancelamento/xml | Baixar XML do cancelamento |
| [**baixarXmlCartaCorrecaoCte**](CteApi.md#baixarXmlCartaCorrecaoCte) | **GET** /cte/{id}/carta-correcao/xml | Baixar XML da carta de correção |
| [**baixarXmlCte**](CteApi.md#baixarXmlCte) | **GET** /cte/{id}/xml | Baixar XML do CT-e processado |
| [**baixarXmlCteConhecimento**](CteApi.md#baixarXmlCteConhecimento) | **GET** /cte/{id}/xml/conhecimento | Baixar XML do CT-e |
| [**baixarXmlCteProtocolo**](CteApi.md#baixarXmlCteProtocolo) | **GET** /cte/{id}/xml/protocolo | Baixar XML do Protocolo da SEFAZ |
| [**baixarXmlEventoCte**](CteApi.md#baixarXmlEventoCte) | **GET** /cte/eventos/{id}/xml | Baixar XML do evento |
| [**cancelarCte**](CteApi.md#cancelarCte) | **POST** /cte/{id}/cancelamento | Cancelar um CT-e autorizado |
| [**consultarCancelamentoCte**](CteApi.md#consultarCancelamentoCte) | **GET** /cte/{id}/cancelamento | Consultar o cancelamento do CT-e |
| [**consultarCartaCorrecaoCte**](CteApi.md#consultarCartaCorrecaoCte) | **GET** /cte/{id}/carta-correcao | Consultar a solicitação de correção do CT-e |
| [**consultarCte**](CteApi.md#consultarCte) | **GET** /cte/{id} | Consultar CT-e |
| [**consultarEventoCte**](CteApi.md#consultarEventoCte) | **GET** /cte/eventos/{id} | Consultar evento |
| [**consultarStatusSefazCte**](CteApi.md#consultarStatusSefazCte) | **GET** /cte/sefaz/status | Consulta do Status do Serviço na SEFAZ Autorizadora |
| [**criarCartaCorrecaoCte**](CteApi.md#criarCartaCorrecaoCte) | **POST** /cte/{id}/carta-correcao | Solicitar correção do CT-e |
| [**emitirCte**](CteApi.md#emitirCte) | **POST** /cte | Emitir CT-e |
| [**listarCte**](CteApi.md#listarCte) | **GET** /cte | Listar CT-e |
| [**sincronizarCte**](CteApi.md#sincronizarCte) | **POST** /cte/{id}/sincronizar | Sincroniza dados no CT-e a partir da SEFAZ |


<a id="baixarPdfCancelamentoCte"></a>
# **baixarPdfCancelamentoCte**
> File baixarPdfCancelamentoCte(id)

Baixar PDF do cancelamento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfCancelamentoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarPdfCancelamentoCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarPdfCartaCorrecaoCte"></a>
# **baixarPdfCartaCorrecaoCte**
> File baixarPdfCartaCorrecaoCte(id)

Baixar PDF da carta de correção

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfCartaCorrecaoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarPdfCartaCorrecaoCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarPdfCte"></a>
# **baixarPdfCte**
> File baixarPdfCte(id, logotipo)

Baixar PDF do DACTE

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    Boolean logotipo = false; // Boolean | Imprime o documento com logotipo, desde que esteja cadastrado na empresa.
    try {
      File result = apiInstance.baixarPdfCte(id, logotipo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarPdfCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |
| **logotipo** | **Boolean**| Imprime o documento com logotipo, desde que esteja cadastrado na empresa. | [optional] [default to false] |

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

<a id="baixarPdfEventoCte"></a>
# **baixarPdfEventoCte**
> File baixarPdfEventoCte(id)

Baixar PDF do evento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfEventoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarPdfEventoCte");
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
| **id** | **String**| ID único do evento gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlCancelamentoCte"></a>
# **baixarXmlCancelamentoCte**
> File baixarXmlCancelamentoCte(id)

Baixar XML do cancelamento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCancelamentoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarXmlCancelamentoCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlCartaCorrecaoCte"></a>
# **baixarXmlCartaCorrecaoCte**
> File baixarXmlCartaCorrecaoCte(id)

Baixar XML da carta de correção

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCartaCorrecaoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarXmlCartaCorrecaoCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlCte"></a>
# **baixarXmlCte**
> File baixarXmlCte(id)

Baixar XML do CT-e processado

Utilize esse endpoint para obter o XML do conhecimento enviado para a SEFAZ, complementado com a informação do protocolo de autorização de uso (TAG raiz &#x60;cteProc&#x60;).    O XML só estará disponível nesse endpoint caso o conhecimento tenha sido autorizado pela SEFAZ. Para obter o XML nos demais casos, utilize o endpoint &#x60;GET /cte/{id}/xml/conhecimento&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarXmlCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlCteConhecimento"></a>
# **baixarXmlCteConhecimento**
> File baixarXmlCteConhecimento(id)

Baixar XML do CT-e

Utilize esse endpoint para obter o XML do conhecimento enviado para a SEFAZ.    O XML estará disponível nesse endpoint mesmo em casos que o conhecimento tenha sido rejeitado.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único da CT-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCteConhecimento(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarXmlCteConhecimento");
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
| **id** | **String**| ID único da CT-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlCteProtocolo"></a>
# **baixarXmlCteProtocolo**
> File baixarXmlCteProtocolo(id)

Baixar XML do Protocolo da SEFAZ

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único da CT-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCteProtocolo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarXmlCteProtocolo");
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
| **id** | **String**| ID único da CT-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlEventoCte"></a>
# **baixarXmlEventoCte**
> File baixarXmlEventoCte(id)

Baixar XML do evento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlEventoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#baixarXmlEventoCte");
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
| **id** | **String**| ID único do evento gerado pela Nuvem Fiscal. | |

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

<a id="cancelarCte"></a>
# **cancelarCte**
> DfeCancelamento cancelarCte(id, body)

Cancelar um CT-e autorizado

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    CtePedidoCancelamento body = new CtePedidoCancelamento(); // CtePedidoCancelamento | 
    try {
      DfeCancelamento result = apiInstance.cancelarCte(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#cancelarCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |
| **body** | [**CtePedidoCancelamento**](CtePedidoCancelamento.md)|  | [optional] |

### Return type

[**DfeCancelamento**](DfeCancelamento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarCancelamentoCte"></a>
# **consultarCancelamentoCte**
> DfeCancelamento consultarCancelamentoCte(id)

Consultar o cancelamento do CT-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      DfeCancelamento result = apiInstance.consultarCancelamentoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#consultarCancelamentoCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

### Return type

[**DfeCancelamento**](DfeCancelamento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarCartaCorrecaoCte"></a>
# **consultarCartaCorrecaoCte**
> CteCartaCorrecao consultarCartaCorrecaoCte(id)

Consultar a solicitação de correção do CT-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      CteCartaCorrecao result = apiInstance.consultarCartaCorrecaoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#consultarCartaCorrecaoCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

### Return type

[**CteCartaCorrecao**](CteCartaCorrecao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarCte"></a>
# **consultarCte**
> Dfe consultarCte(id)

Consultar CT-e

Consulta os detalhes de um CT-e já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de CT-e e a Nuvem Fiscal irá retornar as informações do CT-e correspondente.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      Dfe result = apiInstance.consultarCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#consultarCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

### Return type

[**Dfe**](Dfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarEventoCte"></a>
# **consultarEventoCte**
> DfeEvento consultarEventoCte(id)

Consultar evento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      DfeEvento result = apiInstance.consultarEventoCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#consultarEventoCte");
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
| **id** | **String**| ID único do evento gerado pela Nuvem Fiscal. | |

### Return type

[**DfeEvento**](DfeEvento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarStatusSefazCte"></a>
# **consultarStatusSefazCte**
> DfeSefazStatus consultarStatusSefazCte(cpfCnpj, autorizador)

Consulta do Status do Serviço na SEFAZ Autorizadora

Consulta do status do serviço prestado pelo Portal da Secretaria de Fazenda Estadual.    A Nuvem Fiscal mantém a última consulta em cache por 5 minutos, evitando sobrecarregar desnecessariamente os servidores da SEFAZ (conforme orientação do MOC - versão 3.0.0a, item 4.6.3). Dessa forma, você poderá chamar esse endpoint quantas vezes quiser, sem preocupar-se em ter o seu CNPJ bloqueado por consumo indevido (Rejeição 656).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF/CNPJ do emitente.  Utilize o valor sem máscara.
    String autorizador = "autorizador_example"; // String | Ambiente Autorizador.    Autorizadores disponíveis: `MT`, `MS`, `MG`, `PR`, `RS`, `SP`, `SVRS`, `SVSP`, `AN`.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.*
    try {
      DfeSefazStatus result = apiInstance.consultarStatusSefazCte(cpfCnpj, autorizador);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#consultarStatusSefazCte");
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
| **cpfCnpj** | **String**| CPF/CNPJ do emitente.  Utilize o valor sem máscara. | |
| **autorizador** | **String**| Ambiente Autorizador.    Autorizadores disponíveis: &#x60;MT&#x60;, &#x60;MS&#x60;, &#x60;MG&#x60;, &#x60;PR&#x60;, &#x60;RS&#x60;, &#x60;SP&#x60;, &#x60;SVRS&#x60;, &#x60;SVSP&#x60;, &#x60;AN&#x60;.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.* | [optional] |

### Return type

[**DfeSefazStatus**](DfeSefazStatus.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="criarCartaCorrecaoCte"></a>
# **criarCartaCorrecaoCte**
> CteCartaCorrecao criarCartaCorrecaoCte(id, body)

Solicitar correção do CT-e

É possível enviar até 20 correções diferentes, sendo que será válido sempre a última correção enviada.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    CtePedidoCartaCorrecao body = new CtePedidoCartaCorrecao(); // CtePedidoCartaCorrecao | 
    try {
      CteCartaCorrecao result = apiInstance.criarCartaCorrecaoCte(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#criarCartaCorrecaoCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |
| **body** | [**CtePedidoCartaCorrecao**](CtePedidoCartaCorrecao.md)|  | |

### Return type

[**CteCartaCorrecao**](CteCartaCorrecao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="emitirCte"></a>
# **emitirCte**
> Dfe emitirCte(body)

Emitir CT-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    CtePedidoEmissao body = new CtePedidoEmissao(); // CtePedidoEmissao | 
    try {
      Dfe result = apiInstance.emitirCte(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#emitirCte");
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
| **body** | [**CtePedidoEmissao**](CtePedidoEmissao.md)|  | |

### Return type

[**Dfe**](Dfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarCte"></a>
# **listarCte**
> DfeListagem listarCte(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie)

Listar CT-e

Retorna a lista de CT-e de acordo com os critérios de busca utilizados. Os CT-e são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | Seu identificador único para o documento.
    String chave = "chave_example"; // String | Chave de acesso do DF-e.
    String serie = "serie_example"; // String | Série do DF-e.
    try {
      DfeListagem result = apiInstance.listarCte(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#listarCte");
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

[**DfeListagem**](DfeListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="sincronizarCte"></a>
# **sincronizarCte**
> DfeSincronizacao sincronizarCte(id)

Sincroniza dados no CT-e a partir da SEFAZ

Realiza a sincronização dos dados a partir da consulta da situação atual da CT-e na Base de Dados do Portal da Secretaria de Fazenda Estadual.    **Cenários de uso**:  * Sincronizar um CT-e que se encontra com o status &#x60;erro&#x60; na Nuvem Fiscal, mas está autorizado na SEFAZ (útil em casos de erros de transmissão com a SEFAZ, como instabilidades e timeouts).  * Sincronizar um CT-e que se encontra com o status &#x60;autorizado&#x60;na Nuvem Fiscal, mas está cancelado na SEFAZ.  * Sincronizar todos os eventos de Cancelamento e Carta de Correção de um CT-e que porventura não tenham sido feitos a partir da Nuvem Fiscal.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por evento sincronizado ou requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CteApi;

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

    CteApi apiInstance = new CteApi(defaultClient);
    String id = "id_example"; // String | ID único do CT-e gerado pela Nuvem Fiscal.
    try {
      DfeSincronizacao result = apiInstance.sincronizarCte(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CteApi#sincronizarCte");
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
| **id** | **String**| ID único do CT-e gerado pela Nuvem Fiscal. | |

### Return type

[**DfeSincronizacao**](DfeSincronizacao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

