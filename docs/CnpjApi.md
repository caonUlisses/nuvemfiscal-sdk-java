# CnpjApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consultarCnpj**](CnpjApi.md#consultarCnpj) | **GET** /cnpj/{Cnpj} | Consultar dados do CNPJ |
| [**listarCnpj**](CnpjApi.md#listarCnpj) | **GET** /cnpj | Listar estabelecimentos ativos a partir da base de CNPJ |


<a id="consultarCnpj"></a>
# **consultarCnpj**
> CnpjEmpresa consultarCnpj(cnpj)

Consultar dados do CNPJ

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#cnpj-consultas\&quot;&gt;cnpj-consultas&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.CnpjApi;

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

    CnpjApi apiInstance = new CnpjApi(defaultClient);
    String cnpj = "cnpj_example"; // String | CNPJ sem máscara.
    try {
      CnpjEmpresa result = apiInstance.consultarCnpj(cnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CnpjApi#consultarCnpj");
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
| **cnpj** | **String**| CNPJ sem máscara. | |

### Return type

[**CnpjEmpresa**](CnpjEmpresa.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarCnpj"></a>
# **listarCnpj**
> CnpjListagem listarCnpj(cnaePrincipal, municipio, naturezaJuridica, $top, $skip, $inlinecount)

Listar estabelecimentos ativos a partir da base de CNPJ

Retorna uma lista de estabelecimentos de acordo com os critérios de busca utilizados.  Somente serão retornados estabelecimentos com situação cadastral \&quot;Ativa\&quot;.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#cnpj-listagem\&quot;&gt;cnpj-listagem&lt;/a&gt;  - Consumo: 1 unidade por estabelecimento listado ou requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.CnpjApi;

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

    CnpjApi apiInstance = new CnpjApi(defaultClient);
    String cnaePrincipal = "cnaePrincipal_example"; // String | Filtro pelo código CNAE da atividade principal do estabelecimento.  Utilize o valor sem máscara.
    String municipio = "municipio_example"; // String | Filtro pelo código IBGE ou TOM (Tabela de Órgãos e Municípios) do município do estabelecimento.  Utilize o valor sem máscara.
    String naturezaJuridica = "naturezaJuridica_example"; // String | Filtro pela natureza jurídica do estabelecimento   Utilize o valor de quatro dígitos sem máscara.
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    try {
      CnpjListagem result = apiInstance.listarCnpj(cnaePrincipal, municipio, naturezaJuridica, $top, $skip, $inlinecount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CnpjApi#listarCnpj");
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
| **cnaePrincipal** | **String**| Filtro pelo código CNAE da atividade principal do estabelecimento.  Utilize o valor sem máscara. | |
| **municipio** | **String**| Filtro pelo código IBGE ou TOM (Tabela de Órgãos e Municípios) do município do estabelecimento.  Utilize o valor sem máscara. | |
| **naturezaJuridica** | **String**| Filtro pela natureza jurídica do estabelecimento   Utilize o valor de quatro dígitos sem máscara. | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |

### Return type

[**CnpjListagem**](CnpjListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

