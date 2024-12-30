# DistribuioNfEApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**baixarPdfDocumentoDistribuicaoNfe**](DistribuioNfEApi.md#baixarPdfDocumentoDistribuicaoNfe) | **GET** /distribuicao/nfe/documentos/{id}/pdf | Baixar PDF do documento |
| [**baixarXmlDocumentoDistribuicaoNfe**](DistribuioNfEApi.md#baixarXmlDocumentoDistribuicaoNfe) | **GET** /distribuicao/nfe/documentos/{id}/xml | Baixar XML do documento |
| [**consultarDistribuicaoNfe**](DistribuioNfEApi.md#consultarDistribuicaoNfe) | **GET** /distribuicao/nfe/{id} | Consultar distribuição |
| [**consultarDocumentoDistribuicaoNfe**](DistribuioNfEApi.md#consultarDocumentoDistribuicaoNfe) | **GET** /distribuicao/nfe/documentos/{id} | Consultar documento |
| [**consultarManifestacaoNfe**](DistribuioNfEApi.md#consultarManifestacaoNfe) | **GET** /distribuicao/nfe/manifestacoes/{id} | Consultar manifestação |
| [**gerarDistribuicaoNfe**](DistribuioNfEApi.md#gerarDistribuicaoNfe) | **POST** /distribuicao/nfe | Distribuir documentos |
| [**listarDistribuicaoNfe**](DistribuioNfEApi.md#listarDistribuicaoNfe) | **GET** /distribuicao/nfe | Listar distribuições |
| [**listarDocumentoDistribuicaoNfe**](DistribuioNfEApi.md#listarDocumentoDistribuicaoNfe) | **GET** /distribuicao/nfe/documentos | Listar documentos |
| [**listarManifestacaoNfe**](DistribuioNfEApi.md#listarManifestacaoNfe) | **GET** /distribuicao/nfe/manifestacoes | Listar Manifestações |
| [**listarNfeSemManifestacao**](DistribuioNfEApi.md#listarNfeSemManifestacao) | **GET** /distribuicao/nfe/notas-sem-manifestacao | Listar notas sem manifestação |
| [**manifestarNfe**](DistribuioNfEApi.md#manifestarNfe) | **POST** /distribuicao/nfe/manifestacoes | Manifestar nota |


<a id="baixarPdfDocumentoDistribuicaoNfe"></a>
# **baixarPdfDocumentoDistribuicaoNfe**
> File baixarPdfDocumentoDistribuicaoNfe(id)

Baixar PDF do documento

Utilize esse endpoint para obter o PDF do documento.    Schemas suportados:  * procNFe_v4.00.xsd

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String id = "id_example"; // String | ID único do documento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfDocumentoDistribuicaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#baixarPdfDocumentoDistribuicaoNfe");
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
| **id** | **String**| ID único do documento gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlDocumentoDistribuicaoNfe"></a>
# **baixarXmlDocumentoDistribuicaoNfe**
> File baixarXmlDocumentoDistribuicaoNfe(id)

Baixar XML do documento

Utilize esse endpoint para obter o XML das informações resumidas ou documento fiscal de interesse da pessoa ou empresa interessada.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String id = "id_example"; // String | ID único do documento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlDocumentoDistribuicaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#baixarXmlDocumentoDistribuicaoNfe");
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
| **id** | **String**| ID único do documento gerado pela Nuvem Fiscal. | |

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

<a id="consultarDistribuicaoNfe"></a>
# **consultarDistribuicaoNfe**
> DistribuicaoNfe consultarDistribuicaoNfe(id)

Consultar distribuição

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String id = "id_example"; // String | ID único da distribuição de NF-e gerada pela Nuvem Fiscal.
    try {
      DistribuicaoNfe result = apiInstance.consultarDistribuicaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#consultarDistribuicaoNfe");
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
| **id** | **String**| ID único da distribuição de NF-e gerada pela Nuvem Fiscal. | |

### Return type

[**DistribuicaoNfe**](DistribuicaoNfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarDocumentoDistribuicaoNfe"></a>
# **consultarDocumentoDistribuicaoNfe**
> DistribuicaoNfeDocumento consultarDocumentoDistribuicaoNfe(id)

Consultar documento

Utilize esse endpoint para obter as informações resumidas ou documento fiscal de interesse da pessoa ou empresa interessada.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String id = "id_example"; // String | ID único do documento gerado pela Nuvem Fiscal.
    try {
      DistribuicaoNfeDocumento result = apiInstance.consultarDocumentoDistribuicaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#consultarDocumentoDistribuicaoNfe");
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
| **id** | **String**| ID único do documento gerado pela Nuvem Fiscal. | |

### Return type

[**DistribuicaoNfeDocumento**](DistribuicaoNfeDocumento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarManifestacaoNfe"></a>
# **consultarManifestacaoNfe**
> DistribuicaoNfeEvento consultarManifestacaoNfe(id)

Consultar manifestação

Consulta os detalhes de uma manifestação de NF-e já existente. Forneça o ID único obtido de uma requisição de manifestação ou de listagem de manifestações e a Nuvem Fiscal irá retornar as informações da manifestação correspondente.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String id = "id_example"; // String | ID único da manifestação gerado pela Nuvem Fiscal.
    try {
      DistribuicaoNfeEvento result = apiInstance.consultarManifestacaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#consultarManifestacaoNfe");
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
| **id** | **String**| ID único da manifestação gerado pela Nuvem Fiscal. | |

### Return type

[**DistribuicaoNfeEvento**](DistribuicaoNfeEvento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="gerarDistribuicaoNfe"></a>
# **gerarDistribuicaoNfe**
> DistribuicaoNfe gerarDistribuicaoNfe(body)

Distribuir documentos

Este endpoint permite que o destinatário obtenha Documentos Fiscais  Eletrônicos (DF-e) emitidos contra o seu CNPJ ou CPF ou que seja de  seu interesse. A distribuição pode ser feita de três formas:  *dist-nsu*, *cons-nsu* e *cons-chave*.    **Formas de Consulta**:  - *dist-nsu*: Consulta pelo último NSU recebido.  - *cons-nsu*: Consulta por um NSU específico.  - *cons-chave*: Consulta pela chave de acesso da NF-e.    **Retorno da Solicitação**    A resposta da solicitação inclui a propriedade *status* no JSON, que  pode ter os seguintes valores:  - *processando*: A solicitação está em andamento.  - *concluido*: A solicitação foi processada com sucesso.  - *erro*: Ocorreu um erro no processamento da solicitação.    Se o status retornado for *processando*, significa que a solicitação está  sendo realizada de forma assíncrona pela API. Nesse caso, o usuário deverá  adotar um fluxo que consiste em requisitar periodicamente o endpoint  &lt;a href&#x3D;\&quot;#tag/Distribuicao-NF-e/operation/ConsultarDistribuicaoNfe\&quot;&gt;consultar distribuição&lt;/a&gt; até que  a API retorne o pedido com um status indicando o fim do  processamento (concluido ou erro).    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por documento distribuído (retornado) ou requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    DistribuicaoNfePedido body = new DistribuicaoNfePedido(); // DistribuicaoNfePedido | 
    try {
      DistribuicaoNfe result = apiInstance.gerarDistribuicaoNfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#gerarDistribuicaoNfe");
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
| **body** | [**DistribuicaoNfePedido**](DistribuicaoNfePedido.md)|  | |

### Return type

[**DistribuicaoNfe**](DistribuicaoNfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarDistribuicaoNfe"></a>
# **listarDistribuicaoNfe**
> DistribuicaoNfeListagem listarDistribuicaoNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount)

Listar distribuições

Retorna a lista de distribuições de NF-e de acordo com os critérios de busca utilizados. As distribuições são retornadas ordenadas pela data da criação, com as mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ da pessoa ou empresa interessada.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    try {
      DistribuicaoNfeListagem result = apiInstance.listarDistribuicaoNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#listarDistribuicaoNfe");
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
| **cpfCnpj** | **String**| Filtrar pelo CPF ou CNPJ da pessoa ou empresa interessada.    Utilize o valor sem máscara. | |
| **ambiente** | **String**| Identificação do Ambiente.    Valores aceitos: homologacao, producao | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |

### Return type

[**DistribuicaoNfeListagem**](DistribuicaoNfeListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarDocumentoDistribuicaoNfe"></a>
# **listarDocumentoDistribuicaoNfe**
> DistribuicaoNfeDocumentoListagem listarDocumentoDistribuicaoNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, distNsu, tipoDocumento, formaDistribuicao, chaveAcesso)

Listar documentos

Retorna a lista de documentos fiscais eletrônicos de interesse da pessoa ou empresa de acordo com os critérios de busca utilizados. Os documentos são retornadas ordenados pela data da criação, com os mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ da pessoa ou empresa interessada.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    Integer distNsu = 56; // Integer | Filtrar por documentos a partir do NSU informado.
    String tipoDocumento = "tipoDocumento_example"; // String | Filtrar pelo tipo do documento de interesse da pessoa ou empresa.    Valores aceitos: `nota`, `evento`
    String formaDistribuicao = "formaDistribuicao_example"; // String | Filtrar por documentos que foram distribuídos em sua forma resumida ou completa.    Valores aceitos: `resumida`, `completa`
    String chaveAcesso = "chaveAcesso_example"; // String | Filtrar pela chave de acesso da NF-e.
    try {
      DistribuicaoNfeDocumentoListagem result = apiInstance.listarDocumentoDistribuicaoNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, distNsu, tipoDocumento, formaDistribuicao, chaveAcesso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#listarDocumentoDistribuicaoNfe");
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
| **cpfCnpj** | **String**| Filtrar pelo CPF ou CNPJ da pessoa ou empresa interessada.    Utilize o valor sem máscara. | |
| **ambiente** | **String**| Identificação do Ambiente.    Valores aceitos: homologacao, producao | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |
| **distNsu** | **Integer**| Filtrar por documentos a partir do NSU informado. | [optional] |
| **tipoDocumento** | **String**| Filtrar pelo tipo do documento de interesse da pessoa ou empresa.    Valores aceitos: &#x60;nota&#x60;, &#x60;evento&#x60; | [optional] |
| **formaDistribuicao** | **String**| Filtrar por documentos que foram distribuídos em sua forma resumida ou completa.    Valores aceitos: &#x60;resumida&#x60;, &#x60;completa&#x60; | [optional] |
| **chaveAcesso** | **String**| Filtrar pela chave de acesso da NF-e. | [optional] |

### Return type

[**DistribuicaoNfeDocumentoListagem**](DistribuicaoNfeDocumentoListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarManifestacaoNfe"></a>
# **listarManifestacaoNfe**
> ManifestacaoNfeListagem listarManifestacaoNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount)

Listar Manifestações

Retorna a lista de manifestações de NF-e de acordo com os critérios de busca utilizados. As manifestações são retornadas ordenadas pela data da criação, com as mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do autor do evento.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    try {
      ManifestacaoNfeListagem result = apiInstance.listarManifestacaoNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#listarManifestacaoNfe");
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
| **cpfCnpj** | **String**| Filtrar pelo CPF ou CNPJ do autor do evento.    Utilize o valor sem máscara. | |
| **ambiente** | **String**| Identificação do Ambiente.    Valores aceitos: homologacao, producao | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |

### Return type

[**ManifestacaoNfeListagem**](ManifestacaoNfeListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarNfeSemManifestacao"></a>
# **listarNfeSemManifestacao**
> DistribuicaoNfeNotaListagem listarNfeSemManifestacao(cpfCnpj, ambiente, $top, $skip, $inlinecount, conclusiva)

Listar notas sem manifestação

No processo de distribuição de DF-e, as notas fiscais eletrônicas (NF-e)  são inicialmente disponibilizadas de forma resumida. Para obter o XML  completo, o destinatário deve manifestar a ciência da operação e,  posteriormente, uma manifestação conclusiva dentro de um prazo legal.    Para facilitar essa gestão e o cumprimento dos prazos legais de manifestação,  a API da Nuvem Fiscal permite listar as notas que ainda não  possuem manifestação, ajudando os usuários a identificar rapidamente as  notas que necessitam de ação.    O usuário pode optar por listar apenas as notas que não possuem manifestação  conclusiva ou que não possuem qualquer tipo de manifestação. Essa flexibilidade  permite um controle mais preciso e adequado às necessidades operacionais  de cada empresa.    Os documentos são retornados ordenados decrescentemente pela data de  distribuição, permitindo uma visualização clara e organizada das notas  mais recentes.    **Cenários de uso:**  * Identificar rapidamente as notas que ainda precisam de manifestação para obter o XML completo.  * Listar todas as notas fiscais eletrônicas que foram registradas com ciência da operação, mas ainda não possuem uma manifestação conclusiva (confirmação da operação, desconhecimento da operação ou operação não realizada).  * Listar todas as notas fiscais eletrônicas que não possuem nenhum tipo de manifestação registrada (nem ciência da operação, nem manifestação conclusiva).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ da pessoa ou empresa interessada.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    Boolean conclusiva = false; // Boolean | Indica se serão consideradas apenas as manifestações conclusivas.    Valores:  * `false`: serão retornadas notas que não possuírem qualquer tipo de    manifestação.    * `true`: apenas as notas que não possuírem manifestação conclusiva    serão retornadas. Ou seja, notas que tenham sido manifestadas apenas    com Ciência da Operação (210210) continuarão sendo retornadas por    esse endpoint até que recebam uma manifestação conclusiva.
    try {
      DistribuicaoNfeNotaListagem result = apiInstance.listarNfeSemManifestacao(cpfCnpj, ambiente, $top, $skip, $inlinecount, conclusiva);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#listarNfeSemManifestacao");
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
| **cpfCnpj** | **String**| Filtrar pelo CPF ou CNPJ da pessoa ou empresa interessada.    Utilize o valor sem máscara. | |
| **ambiente** | **String**| Identificação do Ambiente.    Valores aceitos: homologacao, producao | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |
| **conclusiva** | **Boolean**| Indica se serão consideradas apenas as manifestações conclusivas.    Valores:  * &#x60;false&#x60;: serão retornadas notas que não possuírem qualquer tipo de    manifestação.    * &#x60;true&#x60;: apenas as notas que não possuírem manifestação conclusiva    serão retornadas. Ou seja, notas que tenham sido manifestadas apenas    com Ciência da Operação (210210) continuarão sendo retornadas por    esse endpoint até que recebam uma manifestação conclusiva. | [optional] [default to false] |

### Return type

[**DistribuicaoNfeNotaListagem**](DistribuicaoNfeNotaListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="manifestarNfe"></a>
# **manifestarNfe**
> DistribuicaoNfeEvento manifestarNfe(body)

Manifestar nota

O processo de manifestação do destinatário permite que os destinatários  de Notas Fiscais Eletrônicas (NF-e) registrem formalmente sua posição em  relação às operações descritas nesses documentos fiscais. Ele envolve  eventos que indicam se a operação foi confirmada, desconhecida ou  não realizada.    Os seguintes tipos de manifestação são suportados pela NF-e:  * **Confirmação da Operação (210200)**: Manifestação do destinatário confirmando que a operação descrita na NF-e ocorreu exatamente como informado na NF-e. Esse evento libera a possibilidade de download da NF-e pelo destinatário e impede que a empresa emitente cancele a NF-e após a confirmação.  * **Ciência da Operação (210210)**: Declara que o destinatário tem ciência da existência da NF-e, mas ainda não possui elementos suficientes para manifestar-se conclusivamente. Este é um evento opcional que pode ser usado pelo destinatário para indicar que está ciente da NF-e enquanto coleta mais informações. Esse evento libera a possibilidade de download da NF-e pelo destinatário.  * **Desconhecimento da Operação (210220)**: Manifestação do destinatário declarando que a operação descrita da NF-e não foi por ele solicitada.  * **Operação não Realizada (210240)**: Manifestação do destinatário reconhecendo sua participação na operação descrita na NF-e, mas declarando que a operação não ocorreu ou não se efetivou como informado nesta NF-e.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistribuioNfEApi;

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

    DistribuioNfEApi apiInstance = new DistribuioNfEApi(defaultClient);
    DistribuicaoNfePedidoManifestacao body = new DistribuicaoNfePedidoManifestacao(); // DistribuicaoNfePedidoManifestacao | Contém os dados do pedido para manifestação do destinatário.
    try {
      DistribuicaoNfeEvento result = apiInstance.manifestarNfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistribuioNfEApi#manifestarNfe");
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
| **body** | [**DistribuicaoNfePedidoManifestacao**](DistribuicaoNfePedidoManifestacao.md)| Contém os dados do pedido para manifestação do destinatário. | |

### Return type

[**DistribuicaoNfeEvento**](DistribuicaoNfeEvento.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

