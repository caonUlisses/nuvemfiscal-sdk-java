# MdfeApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**baixarPdfCancelamentoMdfe**](MdfeApi.md#baixarPdfCancelamentoMdfe) | **GET** /mdfe/{id}/cancelamento/pdf | Baixar PDF do cancelamento |
| [**baixarPdfEncerramentoMdfe**](MdfeApi.md#baixarPdfEncerramentoMdfe) | **GET** /mdfe/{id}/encerramento/pdf | Baixar PDF do encerramento |
| [**baixarPdfEventoMdfe**](MdfeApi.md#baixarPdfEventoMdfe) | **GET** /mdfe/eventos/{id}/pdf | Baixar PDF do evento |
| [**baixarPdfMdfe**](MdfeApi.md#baixarPdfMdfe) | **GET** /mdfe/{id}/pdf | Baixar PDF do DAMDFE |
| [**baixarXmlCancelamentoMdfe**](MdfeApi.md#baixarXmlCancelamentoMdfe) | **GET** /mdfe/{id}/cancelamento/xml | Baixar XML do cancelamento |
| [**baixarXmlEncerramentoMdfe**](MdfeApi.md#baixarXmlEncerramentoMdfe) | **GET** /mdfe/{id}/encerramento/xml | Baixar XML do encerramento |
| [**baixarXmlEventoMdfe**](MdfeApi.md#baixarXmlEventoMdfe) | **GET** /mdfe/eventos/{id}/xml | Baixar XML do evento |
| [**baixarXmlMdfe**](MdfeApi.md#baixarXmlMdfe) | **GET** /mdfe/{id}/xml | Baixar XML do MDF-e processado |
| [**baixarXmlMdfeManifesto**](MdfeApi.md#baixarXmlMdfeManifesto) | **GET** /mdfe/{id}/xml/manifesto | Baixar XML do MDF-e |
| [**baixarXmlMdfeProtocolo**](MdfeApi.md#baixarXmlMdfeProtocolo) | **GET** /mdfe/{id}/xml/protocolo | Baixar XML do Protocolo da SEFAZ |
| [**cancelarMdfe**](MdfeApi.md#cancelarMdfe) | **POST** /mdfe/{id}/cancelamento | Cancelar um MDF-e autorizado |
| [**consultarCancelamentoMdfe**](MdfeApi.md#consultarCancelamentoMdfe) | **GET** /mdfe/{id}/cancelamento | Consultar o cancelamento do MDF-e |
| [**consultarEncerramentoMdfe**](MdfeApi.md#consultarEncerramentoMdfe) | **GET** /mdfe/{id}/encerramento | Consultar encerramento do MDF-e |
| [**consultarEventoMdfe**](MdfeApi.md#consultarEventoMdfe) | **GET** /mdfe/eventos/{id} | Consultar evento do MDF-e |
| [**consultarLoteMdfe**](MdfeApi.md#consultarLoteMdfe) | **GET** /mdfe/lotes/{id} | Consultar lote de MDF-e |
| [**consultarMdfe**](MdfeApi.md#consultarMdfe) | **GET** /mdfe/{id} | Consultar manifesto |
| [**consultarMdfeNaoEncerrados**](MdfeApi.md#consultarMdfeNaoEncerrados) | **GET** /mdfe/nao-encerrados | Consulta MDF-e não encerrados |
| [**consultarStatusSefazMdfe**](MdfeApi.md#consultarStatusSefazMdfe) | **GET** /mdfe/sefaz/status | Consulta do Status do Serviço na SEFAZ Autorizadora |
| [**emitirLoteMdfe**](MdfeApi.md#emitirLoteMdfe) | **POST** /mdfe/lotes | Emitir lote de MDF-e |
| [**emitirMdfe**](MdfeApi.md#emitirMdfe) | **POST** /mdfe | Emitir MDF-e |
| [**encerrarMdfe**](MdfeApi.md#encerrarMdfe) | **POST** /mdfe/{id}/encerramento | Encerrar um MDF-e autorizado |
| [**incluirCondutorMdfe**](MdfeApi.md#incluirCondutorMdfe) | **POST** /mdfe/{id}/inclusao-condutor | Incluir um condutor em um MDF-e autorizado |
| [**incluirDfeMdfe**](MdfeApi.md#incluirDfeMdfe) | **POST** /mdfe/{id}/inclusao-dfe | Incluir um DF-e em um MDF-e autorizado |
| [**listarLotesMdfe**](MdfeApi.md#listarLotesMdfe) | **GET** /mdfe/lotes | Listar lotes de MDF-e |
| [**listarMdfe**](MdfeApi.md#listarMdfe) | **GET** /mdfe | Listar MDF-e |
| [**sincronizarMdfe**](MdfeApi.md#sincronizarMdfe) | **POST** /mdfe/{id}/sincronizar | Sincroniza dados no MDF-e a partir da SEFAZ |


<a id="baixarPdfCancelamentoMdfe"></a>
# **baixarPdfCancelamentoMdfe**
> File baixarPdfCancelamentoMdfe(id)

Baixar PDF do cancelamento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfCancelamentoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarPdfCancelamentoMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarPdfEncerramentoMdfe"></a>
# **baixarPdfEncerramentoMdfe**
> File baixarPdfEncerramentoMdfe(id)

Baixar PDF do encerramento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfEncerramentoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarPdfEncerramentoMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarPdfEventoMdfe"></a>
# **baixarPdfEventoMdfe**
> File baixarPdfEventoMdfe(id)

Baixar PDF do evento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfEventoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarPdfEventoMdfe");
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

<a id="baixarPdfMdfe"></a>
# **baixarPdfMdfe**
> File baixarPdfMdfe(id, logotipo)

Baixar PDF do DAMDFE

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    Boolean logotipo = false; // Boolean | Imprime o documento com logotipo, desde que esteja cadastrado na empresa.
    try {
      File result = apiInstance.baixarPdfMdfe(id, logotipo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarPdfMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |
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

<a id="baixarXmlCancelamentoMdfe"></a>
# **baixarXmlCancelamentoMdfe**
> File baixarXmlCancelamentoMdfe(id)

Baixar XML do cancelamento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCancelamentoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarXmlCancelamentoMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlEncerramentoMdfe"></a>
# **baixarXmlEncerramentoMdfe**
> File baixarXmlEncerramentoMdfe(id)

Baixar XML do encerramento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlEncerramentoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarXmlEncerramentoMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlEventoMdfe"></a>
# **baixarXmlEventoMdfe**
> File baixarXmlEventoMdfe(id)

Baixar XML do evento

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlEventoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarXmlEventoMdfe");
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

<a id="baixarXmlMdfe"></a>
# **baixarXmlMdfe**
> File baixarXmlMdfe(id)

Baixar XML do MDF-e processado

Utilize esse endpoint para obter o XML do manifesto enviado para a SEFAZ, complementado com a informação do protocolo de autorização ou denegação de uso (TAG raiz &#x60;mdfeProc&#x60;).    O XML só estará disponível nesse endpoint caso o manifesto tenha sido autorizado ou denegado pela SEFAZ. Para obter o XML nos demais casos, utilize o endpoint &#x60;GET /mdfe/{id}/xml/manifesto&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarXmlMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlMdfeManifesto"></a>
# **baixarXmlMdfeManifesto**
> File baixarXmlMdfeManifesto(id)

Baixar XML do MDF-e

Utilize esse endpoint para obter o XML do manifesto enviado para a SEFAZ.    O XML estará disponível nesse endpoint mesmo em casos que o manifesto tenha sido rejeitado.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único da MDF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlMdfeManifesto(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarXmlMdfeManifesto");
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
| **id** | **String**| ID único da MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlMdfeProtocolo"></a>
# **baixarXmlMdfeProtocolo**
> File baixarXmlMdfeProtocolo(id)

Baixar XML do Protocolo da SEFAZ

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único da MDF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlMdfeProtocolo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#baixarXmlMdfeProtocolo");
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
| **id** | **String**| ID único da MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="cancelarMdfe"></a>
# **cancelarMdfe**
> DfeCancelamento cancelarMdfe(id, body)

Cancelar um MDF-e autorizado

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    MdfePedidoCancelamento body = new MdfePedidoCancelamento(); // MdfePedidoCancelamento | Dados do cancelamento.
    try {
      DfeCancelamento result = apiInstance.cancelarMdfe(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#cancelarMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |
| **body** | [**MdfePedidoCancelamento**](MdfePedidoCancelamento.md)| Dados do cancelamento. | [optional] |

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

<a id="consultarCancelamentoMdfe"></a>
# **consultarCancelamentoMdfe**
> DfeCancelamento consultarCancelamentoMdfe(id)

Consultar o cancelamento do MDF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      DfeCancelamento result = apiInstance.consultarCancelamentoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#consultarCancelamentoMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="consultarEncerramentoMdfe"></a>
# **consultarEncerramentoMdfe**
> MdfeEncerramento consultarEncerramentoMdfe(id)

Consultar encerramento do MDF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      MdfeEncerramento result = apiInstance.consultarEncerramentoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#consultarEncerramentoMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

### Return type

[**MdfeEncerramento**](MdfeEncerramento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarEventoMdfe"></a>
# **consultarEventoMdfe**
> DfeEvento consultarEventoMdfe(id)

Consultar evento do MDF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      DfeEvento result = apiInstance.consultarEventoMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#consultarEventoMdfe");
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

<a id="consultarLoteMdfe"></a>
# **consultarLoteMdfe**
> DfeLote consultarLoteMdfe(id)

Consultar lote de MDF-e

Consulta os detalhes de um lote já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de lotes e a Nuvem Fiscal irá retornar as informações do lote correspondente.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do lote gerado pela Nuvem Fiscal.
    try {
      DfeLote result = apiInstance.consultarLoteMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#consultarLoteMdfe");
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

[**DfeLote**](DfeLote.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarMdfe"></a>
# **consultarMdfe**
> Dfe consultarMdfe(id)

Consultar manifesto

Consulta os detalhes de um manifesto já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de manifestos e a Nuvem Fiscal irá retornar as informações do manifesto correspondente.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      Dfe result = apiInstance.consultarMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#consultarMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

<a id="consultarMdfeNaoEncerrados"></a>
# **consultarMdfeNaoEncerrados**
> MdfeNaoEncerrados consultarMdfeNaoEncerrados(cpfCnpj)

Consulta MDF-e não encerrados

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF/CNPJ do emitente.  Utilize o valor sem máscara.
    try {
      MdfeNaoEncerrados result = apiInstance.consultarMdfeNaoEncerrados(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#consultarMdfeNaoEncerrados");
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

### Return type

[**MdfeNaoEncerrados**](MdfeNaoEncerrados.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarStatusSefazMdfe"></a>
# **consultarStatusSefazMdfe**
> DfeSefazStatus consultarStatusSefazMdfe(cpfCnpj, autorizador)

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
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF/CNPJ do emitente.  Utilize o valor sem máscara.
    String autorizador = "autorizador_example"; // String | Ambiente Autorizador.    Autorizadores disponíveis: `SVRS`.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.*
    try {
      DfeSefazStatus result = apiInstance.consultarStatusSefazMdfe(cpfCnpj, autorizador);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#consultarStatusSefazMdfe");
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
| **autorizador** | **String**| Ambiente Autorizador.    Autorizadores disponíveis: &#x60;SVRS&#x60;.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.* | [optional] |

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

<a id="emitirLoteMdfe"></a>
# **emitirLoteMdfe**
> DfeLote emitirLoteMdfe(body)

Emitir lote de MDF-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por MDF-e.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    MdfePedidoEmissaoLote body = new MdfePedidoEmissaoLote(); // MdfePedidoEmissaoLote | 
    try {
      DfeLote result = apiInstance.emitirLoteMdfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#emitirLoteMdfe");
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
| **body** | [**MdfePedidoEmissaoLote**](MdfePedidoEmissaoLote.md)|  | |

### Return type

[**DfeLote**](DfeLote.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="emitirMdfe"></a>
# **emitirMdfe**
> Dfe emitirMdfe(body)

Emitir MDF-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    MdfePedidoEmissao body = new MdfePedidoEmissao(); // MdfePedidoEmissao | 
    try {
      Dfe result = apiInstance.emitirMdfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#emitirMdfe");
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
| **body** | [**MdfePedidoEmissao**](MdfePedidoEmissao.md)|  | |

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

<a id="encerrarMdfe"></a>
# **encerrarMdfe**
> MdfeEncerramento encerrarMdfe(id, body)

Encerrar um MDF-e autorizado

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    MdfePedidoEncerramento body = new MdfePedidoEncerramento(); // MdfePedidoEncerramento | 
    try {
      MdfeEncerramento result = apiInstance.encerrarMdfe(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#encerrarMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |
| **body** | [**MdfePedidoEncerramento**](MdfePedidoEncerramento.md)|  | |

### Return type

[**MdfeEncerramento**](MdfeEncerramento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="incluirCondutorMdfe"></a>
# **incluirCondutorMdfe**
> MdfeInclusaoCondutor incluirCondutorMdfe(id, body)

Incluir um condutor em um MDF-e autorizado

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    MdfePedidoInclusaoCondutor body = new MdfePedidoInclusaoCondutor(); // MdfePedidoInclusaoCondutor | 
    try {
      MdfeInclusaoCondutor result = apiInstance.incluirCondutorMdfe(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#incluirCondutorMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |
| **body** | [**MdfePedidoInclusaoCondutor**](MdfePedidoInclusaoCondutor.md)|  | |

### Return type

[**MdfeInclusaoCondutor**](MdfeInclusaoCondutor.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="incluirDfeMdfe"></a>
# **incluirDfeMdfe**
> MdfeInclusaoDfe incluirDfeMdfe(id, body)

Incluir um DF-e em um MDF-e autorizado

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    MdfePedidoInclusaoDfe body = new MdfePedidoInclusaoDfe(); // MdfePedidoInclusaoDfe | 
    try {
      MdfeInclusaoDfe result = apiInstance.incluirDfeMdfe(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#incluirDfeMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |
| **body** | [**MdfePedidoInclusaoDfe**](MdfePedidoInclusaoDfe.md)|  | |

### Return type

[**MdfeInclusaoDfe**](MdfeInclusaoDfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarLotesMdfe"></a>
# **listarLotesMdfe**
> DfeLoteListagem listarLotesMdfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia)

Listar lotes de MDF-e

Retorna a lista dos lotes de acordo com os critérios de busca utilizados. Os lotes são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.  Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | 
    try {
      DfeLoteListagem result = apiInstance.listarLotesMdfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#listarLotesMdfe");
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

[**DfeLoteListagem**](DfeLoteListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarMdfe"></a>
# **listarMdfe**
> DfeListagem listarMdfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie)

Listar MDF-e

Retorna a lista de manifestos de acordo com os critérios de busca utilizados. Os manifestos são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | Seu identificador único para o documento.
    String chave = "chave_example"; // String | Chave de acesso do DF-e.
    String serie = "serie_example"; // String | Série do DF-e.
    try {
      DfeListagem result = apiInstance.listarMdfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#listarMdfe");
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

<a id="sincronizarMdfe"></a>
# **sincronizarMdfe**
> DfeSincronizacao sincronizarMdfe(id)

Sincroniza dados no MDF-e a partir da SEFAZ

Realiza a sincronização dos dados a partir da consulta da situação atual da MDF-e na Base de Dados do Portal da Secretaria de Fazenda Estadual.    **Cenários de uso**:  * Sincronizar um manifesto que se encontra com o status &#x60;erro&#x60; na Nuvem Fiscal, mas está autorizado na SEFAZ (útil em casos de erros de transmissão com a SEFAZ, como instabilidades e timeouts).  * Sincronizar um manifesto que se encontra com o status &#x60;autorizado&#x60;na Nuvem Fiscal, mas está cancelado ou encerrado na SEFAZ.  * Sincronizar todos os eventos de Cancelamento, Encerramento, Inclusão de condutor e Inclusão de DF-e de um manifesto que porventura não tenham sido feitos a partir da Nuvem Fiscal.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por evento sincronizado ou requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MdfeApi;

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

    MdfeApi apiInstance = new MdfeApi(defaultClient);
    String id = "id_example"; // String | ID único do MDF-e gerado pela Nuvem Fiscal.
    try {
      DfeSincronizacao result = apiInstance.sincronizarMdfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MdfeApi#sincronizarMdfe");
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
| **id** | **String**| ID único do MDF-e gerado pela Nuvem Fiscal. | |

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

