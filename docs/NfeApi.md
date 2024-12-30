# NfeApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**baixarPdfCancelamentoNfe**](NfeApi.md#baixarPdfCancelamentoNfe) | **GET** /nfe/{id}/cancelamento/pdf | Baixar PDF do cancelamento |
| [**baixarPdfCartaCorrecaoNfe**](NfeApi.md#baixarPdfCartaCorrecaoNfe) | **GET** /nfe/{id}/carta-correcao/pdf | Baixar PDF da carta de correção |
| [**baixarPdfEventoNfe**](NfeApi.md#baixarPdfEventoNfe) | **GET** /nfe/eventos/{id}/pdf | Baixar PDF do evento |
| [**baixarPdfInutilizacaoNfe**](NfeApi.md#baixarPdfInutilizacaoNfe) | **GET** /nfe/inutilizacoes/{id}/pdf | Baixar PDF da inutilização |
| [**baixarPdfNfe**](NfeApi.md#baixarPdfNfe) | **GET** /nfe/{id}/pdf | Baixar PDF do DANFE |
| [**baixarPreviaPdfNfe**](NfeApi.md#baixarPreviaPdfNfe) | **POST** /nfe/previa/pdf | Prévia do PDF do DANFE |
| [**baixarPreviaXmlNfe**](NfeApi.md#baixarPreviaXmlNfe) | **POST** /nfe/previa/xml | Prévia do XML da NF-e |
| [**baixarXmlCancelamentoNfe**](NfeApi.md#baixarXmlCancelamentoNfe) | **GET** /nfe/{id}/cancelamento/xml | Baixar XML do cancelamento |
| [**baixarXmlCartaCorrecaoNfe**](NfeApi.md#baixarXmlCartaCorrecaoNfe) | **GET** /nfe/{id}/carta-correcao/xml | Baixar XML da carta de correção |
| [**baixarXmlEventoNfe**](NfeApi.md#baixarXmlEventoNfe) | **GET** /nfe/eventos/{id}/xml | Baixar XML do evento |
| [**baixarXmlInutilizacaoNfe**](NfeApi.md#baixarXmlInutilizacaoNfe) | **GET** /nfe/inutilizacoes/{id}/xml | Baixar XML da inutilização |
| [**baixarXmlNfe**](NfeApi.md#baixarXmlNfe) | **GET** /nfe/{id}/xml | Baixar XML da NF-e processada |
| [**baixarXmlNfeNota**](NfeApi.md#baixarXmlNfeNota) | **GET** /nfe/{id}/xml/nota | Baixar XML da NF-e |
| [**baixarXmlNfeProtocolo**](NfeApi.md#baixarXmlNfeProtocolo) | **GET** /nfe/{id}/xml/protocolo | Baixar XML do Protocolo da SEFAZ |
| [**cancelarNfe**](NfeApi.md#cancelarNfe) | **POST** /nfe/{id}/cancelamento | Cancelar uma NF-e autorizada |
| [**consultarCancelamentoNfe**](NfeApi.md#consultarCancelamentoNfe) | **GET** /nfe/{id}/cancelamento | Consultar o cancelamento da NF-e |
| [**consultarCartaCorrecaoNfe**](NfeApi.md#consultarCartaCorrecaoNfe) | **GET** /nfe/{id}/carta-correcao | Consultar a solicitação de correção da NF-e |
| [**consultarContribuinteNfe**](NfeApi.md#consultarContribuinteNfe) | **GET** /nfe/cadastro-contribuinte | Consultar contribuinte |
| [**consultarEventoNfe**](NfeApi.md#consultarEventoNfe) | **GET** /nfe/eventos/{id} | Consultar evento |
| [**consultarInutilizacaoNfe**](NfeApi.md#consultarInutilizacaoNfe) | **GET** /nfe/inutilizacoes/{id} | Consultar a inutilização de sequência de numeração |
| [**consultarLoteNfe**](NfeApi.md#consultarLoteNfe) | **GET** /nfe/lotes/{id} | Consultar lote de NF-e |
| [**consultarNfe**](NfeApi.md#consultarNfe) | **GET** /nfe/{id} | Consultar NF-e |
| [**consultarStatusSefazNfe**](NfeApi.md#consultarStatusSefazNfe) | **GET** /nfe/sefaz/status | Consulta do Status do Serviço na SEFAZ Autorizadora |
| [**criarCartaCorrecaoNfe**](NfeApi.md#criarCartaCorrecaoNfe) | **POST** /nfe/{id}/carta-correcao | Solicitar correção da NF-e |
| [**emitirLoteNfe**](NfeApi.md#emitirLoteNfe) | **POST** /nfe/lotes | Emitir lote de NF-e |
| [**emitirNfe**](NfeApi.md#emitirNfe) | **POST** /nfe | Emitir NF-e |
| [**enviarEmailNfe**](NfeApi.md#enviarEmailNfe) | **POST** /nfe/{id}/email | Enviar e-mail |
| [**inutilizarNumeracaoNfe**](NfeApi.md#inutilizarNumeracaoNfe) | **POST** /nfe/inutilizacoes | Inutilizar uma sequência de numeração de NF-e |
| [**listarEventosNfe**](NfeApi.md#listarEventosNfe) | **GET** /nfe/eventos | Listar eventos |
| [**listarLotesNfe**](NfeApi.md#listarLotesNfe) | **GET** /nfe/lotes | Listar lotes de NF-e |
| [**listarNfe**](NfeApi.md#listarNfe) | **GET** /nfe | Listar NF-e |
| [**sincronizarNfe**](NfeApi.md#sincronizarNfe) | **POST** /nfe/{id}/sincronizar | Sincroniza dados na NF-e a partir da SEFAZ |


<a id="baixarPdfCancelamentoNfe"></a>
# **baixarPdfCancelamentoNfe**
> File baixarPdfCancelamentoNfe(id)

Baixar PDF do cancelamento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfCancelamentoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarPdfCancelamentoNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarPdfCartaCorrecaoNfe"></a>
# **baixarPdfCartaCorrecaoNfe**
> File baixarPdfCartaCorrecaoNfe(id)

Baixar PDF da carta de correção

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfCartaCorrecaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarPdfCartaCorrecaoNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarPdfEventoNfe"></a>
# **baixarPdfEventoNfe**
> File baixarPdfEventoNfe(id)

Baixar PDF do evento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfEventoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarPdfEventoNfe");
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

<a id="baixarPdfInutilizacaoNfe"></a>
# **baixarPdfInutilizacaoNfe**
> File baixarPdfInutilizacaoNfe(id)

Baixar PDF da inutilização

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfInutilizacaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarPdfInutilizacaoNfe");
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

<a id="baixarPdfNfe"></a>
# **baixarPdfNfe**
> File baixarPdfNfe(id, logotipo, nomeFantasia, formato, mensagemRodape, canhoto)

Baixar PDF do DANFE

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    Boolean logotipo = false; // Boolean | Imprime o documento com logotipo, desde que esteja cadastrado na empresa.
    Boolean nomeFantasia = false; // Boolean | Exibe o nome fantasia do emitente, desde que esteja presente no XML da nota.
    String formato = "padrao"; // String | Formato de impressão do DANFE.    Valores disponíveis:  - `padrao`: será utilizado o formato definido no XML da NF-e (tag \"tpImp\");  - `retrato`: tamanho A4 em modo retrato;  - `paisagem`: tamanho A4 em modo paisagem;  - `simplificado`: formato simplificado utilizado nas operações realizadas fora do estabelecimento (Anexo II do MOC, item 3.11);  - `etiqueta`: formato simplificado utilizado nas operações em comércio eletrônico (Anexo II do MOC, item 3.12 e NT 2020.004).
    String mensagemRodape = "mensagemRodape_example"; // String | Imprime mensagem no rodapé do documento.    O caractere `|` (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * `\"esquerda\"`  * `\"esquerda|centro\"`  * `\"esquerda|centro|direita\"`  * `\"|centro\"`, `\"|centro|\"`  * `\"|centro|direita\"`  * `\"||direita\"`  * `\"esquerda||direita\"`
    Boolean canhoto = true; // Boolean | Imprime o documento com o bloco de canhoto.
    try {
      File result = apiInstance.baixarPdfNfe(id, logotipo, nomeFantasia, formato, mensagemRodape, canhoto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarPdfNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |
| **logotipo** | **Boolean**| Imprime o documento com logotipo, desde que esteja cadastrado na empresa. | [optional] [default to false] |
| **nomeFantasia** | **Boolean**| Exibe o nome fantasia do emitente, desde que esteja presente no XML da nota. | [optional] [default to false] |
| **formato** | **String**| Formato de impressão do DANFE.    Valores disponíveis:  - &#x60;padrao&#x60;: será utilizado o formato definido no XML da NF-e (tag \&quot;tpImp\&quot;);  - &#x60;retrato&#x60;: tamanho A4 em modo retrato;  - &#x60;paisagem&#x60;: tamanho A4 em modo paisagem;  - &#x60;simplificado&#x60;: formato simplificado utilizado nas operações realizadas fora do estabelecimento (Anexo II do MOC, item 3.11);  - &#x60;etiqueta&#x60;: formato simplificado utilizado nas operações em comércio eletrônico (Anexo II do MOC, item 3.12 e NT 2020.004). | [optional] [default to padrao] |
| **mensagemRodape** | **String**| Imprime mensagem no rodapé do documento.    O caractere &#x60;|&#x60; (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * &#x60;\&quot;esquerda\&quot;&#x60;  * &#x60;\&quot;esquerda|centro\&quot;&#x60;  * &#x60;\&quot;esquerda|centro|direita\&quot;&#x60;  * &#x60;\&quot;|centro\&quot;&#x60;, &#x60;\&quot;|centro|\&quot;&#x60;  * &#x60;\&quot;|centro|direita\&quot;&#x60;  * &#x60;\&quot;||direita\&quot;&#x60;  * &#x60;\&quot;esquerda||direita\&quot;&#x60; | [optional] |
| **canhoto** | **Boolean**| Imprime o documento com o bloco de canhoto. | [optional] [default to true] |

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

<a id="baixarPreviaPdfNfe"></a>
# **baixarPreviaPdfNfe**
> File baixarPreviaPdfNfe(body, logotipo, nomeFantasia, formato, mensagemRodape, canhoto)

Prévia do PDF do DANFE

Através desse endpoint, é possível enviar os dados de uma NF-e e gerar uma prévia do DANFE.    Os dados de entrada são os mesmos do endpoint de emissão de NF-e (&#x60;POST /nfe&#x60;).    **Atenção**: O DANFE gerado por este endpoint é apenas para fins de visualização e não possui valor fiscal. Para a emissão de uma NF-e com valor fiscal, utilize o processo de emissão padrão descrito na documentação.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    NfePedidoEmissao body = new NfePedidoEmissao(); // NfePedidoEmissao | 
    Boolean logotipo = false; // Boolean | Imprime o documento com logotipo, desde que esteja cadastrado na empresa.
    Boolean nomeFantasia = false; // Boolean | Exibe o nome fantasia do emitente, desde que esteja presente no XML da nota.
    String formato = "padrao"; // String | Formato de impressão do DANFE.    Valores disponíveis:  - `padrao`: será utilizado o formato definido no XML da NF-e (tag \"tpImp\");  - `retrato`: tamanho A4 em modo retrato;  - `paisagem`: tamanho A4 em modo paisagem;  - `simplificado`: formato simplificado utilizado nas operações realizadas fora do estabelecimento (Anexo II do MOC, item 3.11);  - `etiqueta`: formato simplificado utilizado nas operações em comércio eletrônico (Anexo II do MOC, item 3.12 e NT 2020.004).
    String mensagemRodape = "mensagemRodape_example"; // String | Imprime mensagem no rodapé do documento.    O caractere `|` (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * `\"esquerda\"`  * `\"esquerda|centro\"`  * `\"esquerda|centro|direita\"`  * `\"|centro\"`, `\"|centro|\"`  * `\"|centro|direita\"`  * `\"||direita\"`  * `\"esquerda||direita\"`
    Boolean canhoto = true; // Boolean | Imprime o documento com o bloco de canhoto.
    try {
      File result = apiInstance.baixarPreviaPdfNfe(body, logotipo, nomeFantasia, formato, mensagemRodape, canhoto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarPreviaPdfNfe");
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
| **body** | [**NfePedidoEmissao**](NfePedidoEmissao.md)|  | |
| **logotipo** | **Boolean**| Imprime o documento com logotipo, desde que esteja cadastrado na empresa. | [optional] [default to false] |
| **nomeFantasia** | **Boolean**| Exibe o nome fantasia do emitente, desde que esteja presente no XML da nota. | [optional] [default to false] |
| **formato** | **String**| Formato de impressão do DANFE.    Valores disponíveis:  - &#x60;padrao&#x60;: será utilizado o formato definido no XML da NF-e (tag \&quot;tpImp\&quot;);  - &#x60;retrato&#x60;: tamanho A4 em modo retrato;  - &#x60;paisagem&#x60;: tamanho A4 em modo paisagem;  - &#x60;simplificado&#x60;: formato simplificado utilizado nas operações realizadas fora do estabelecimento (Anexo II do MOC, item 3.11);  - &#x60;etiqueta&#x60;: formato simplificado utilizado nas operações em comércio eletrônico (Anexo II do MOC, item 3.12 e NT 2020.004). | [optional] [default to padrao] |
| **mensagemRodape** | **String**| Imprime mensagem no rodapé do documento.    O caractere &#x60;|&#x60; (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * &#x60;\&quot;esquerda\&quot;&#x60;  * &#x60;\&quot;esquerda|centro\&quot;&#x60;  * &#x60;\&quot;esquerda|centro|direita\&quot;&#x60;  * &#x60;\&quot;|centro\&quot;&#x60;, &#x60;\&quot;|centro|\&quot;&#x60;  * &#x60;\&quot;|centro|direita\&quot;&#x60;  * &#x60;\&quot;||direita\&quot;&#x60;  * &#x60;\&quot;esquerda||direita\&quot;&#x60; | [optional] |
| **canhoto** | **Boolean**| Imprime o documento com o bloco de canhoto. | [optional] [default to true] |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="baixarPreviaXmlNfe"></a>
# **baixarPreviaXmlNfe**
> File baixarPreviaXmlNfe(body)

Prévia do XML da NF-e

Através desse endpoint, é possível enviar os dados de uma NF-e e gerar uma prévia do XML, sem a assinatura digital.    Os dados de entrada são os mesmos do endpoint de emissão de NF-e (&#x60;POST /nfe&#x60;).    **Atenção**: O XML gerado por este endpoint é apenas para fins de visualização e não possui valor fiscal. Para a emissão de uma NF-e com valor fiscal, utilize o processo de emissão padrão descrito na documentação.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    NfePedidoEmissao body = new NfePedidoEmissao(); // NfePedidoEmissao | 
    try {
      File result = apiInstance.baixarPreviaXmlNfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarPreviaXmlNfe");
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
| **body** | [**NfePedidoEmissao**](NfePedidoEmissao.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="baixarXmlCancelamentoNfe"></a>
# **baixarXmlCancelamentoNfe**
> File baixarXmlCancelamentoNfe(id)

Baixar XML do cancelamento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCancelamentoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarXmlCancelamentoNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlCartaCorrecaoNfe"></a>
# **baixarXmlCartaCorrecaoNfe**
> File baixarXmlCartaCorrecaoNfe(id)

Baixar XML da carta de correção

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCartaCorrecaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarXmlCartaCorrecaoNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlEventoNfe"></a>
# **baixarXmlEventoNfe**
> File baixarXmlEventoNfe(id)

Baixar XML do evento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlEventoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarXmlEventoNfe");
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

<a id="baixarXmlInutilizacaoNfe"></a>
# **baixarXmlInutilizacaoNfe**
> File baixarXmlInutilizacaoNfe(id)

Baixar XML da inutilização

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlInutilizacaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarXmlInutilizacaoNfe");
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

<a id="baixarXmlNfe"></a>
# **baixarXmlNfe**
> File baixarXmlNfe(id)

Baixar XML da NF-e processada

Utilize esse endpoint para obter o XML da nota enviado para a SEFAZ, complementado com a informação do protocolo de autorização ou denegação de uso (TAG raiz &#x60;nfeProc&#x60;).    O XML só estará disponível nesse endpoint caso a nota tenha sido autorizada ou denegada pela SEFAZ. Para obter o XML nos demais casos, utilize o endpoint &#x60;GET /nfe/{id}/xml/nota&#x60;.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarXmlNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlNfeNota"></a>
# **baixarXmlNfeNota**
> File baixarXmlNfeNota(id)

Baixar XML da NF-e

Utilize esse endpoint para obter o XML da nota enviado para a SEFAZ.    O XML estará disponível nesse endpoint mesmo em casos que a nota tenha sido rejeitada.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlNfeNota(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarXmlNfeNota");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlNfeProtocolo"></a>
# **baixarXmlNfeProtocolo**
> File baixarXmlNfeProtocolo(id)

Baixar XML do Protocolo da SEFAZ

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlNfeProtocolo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#baixarXmlNfeProtocolo");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="cancelarNfe"></a>
# **cancelarNfe**
> DfeCancelamento cancelarNfe(id, body)

Cancelar uma NF-e autorizada

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    NfePedidoCancelamento body = new NfePedidoCancelamento(); // NfePedidoCancelamento | 
    try {
      DfeCancelamento result = apiInstance.cancelarNfe(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#cancelarNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |
| **body** | [**NfePedidoCancelamento**](NfePedidoCancelamento.md)|  | [optional] |

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

<a id="consultarCancelamentoNfe"></a>
# **consultarCancelamentoNfe**
> DfeCancelamento consultarCancelamentoNfe(id)

Consultar o cancelamento da NF-e

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      DfeCancelamento result = apiInstance.consultarCancelamentoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarCancelamentoNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="consultarCartaCorrecaoNfe"></a>
# **consultarCartaCorrecaoNfe**
> DfeCartaCorrecao consultarCartaCorrecaoNfe(id)

Consultar a solicitação de correção da NF-e

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      DfeCartaCorrecao result = apiInstance.consultarCartaCorrecaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarCartaCorrecaoNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

### Return type

[**DfeCartaCorrecao**](DfeCartaCorrecao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarContribuinteNfe"></a>
# **consultarContribuinteNfe**
> DfeContribuinteInfCons consultarContribuinteNfe(cpfCnpj, argumento, documento, uf)

Consultar contribuinte

Consulta o Cadastro Centralizado de Contribuintes (CCC) do ICMS da unidade federada.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*.
    String argumento = "argumento_example"; // String | Argumento de pesquisa.    Valores válidos:  * `CNPJ`  * `CPF`  * `IE`
    String documento = "documento_example"; // String | Documento a ser consultado (CNPJ, CPF ou Inscrição Estadual).
    String uf = "uf_example"; // String | Sigla da UF consultada.     Utilize `SU` para SUFRAMA.    *Caso não seja informada, será utilizada a UF da empresa.*
    try {
      DfeContribuinteInfCons result = apiInstance.consultarContribuinteNfe(cpfCnpj, argumento, documento, uf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarContribuinteNfe");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*. | |
| **argumento** | **String**| Argumento de pesquisa.    Valores válidos:  * &#x60;CNPJ&#x60;  * &#x60;CPF&#x60;  * &#x60;IE&#x60; | |
| **documento** | **String**| Documento a ser consultado (CNPJ, CPF ou Inscrição Estadual). | |
| **uf** | **String**| Sigla da UF consultada.     Utilize &#x60;SU&#x60; para SUFRAMA.    *Caso não seja informada, será utilizada a UF da empresa.* | [optional] |

### Return type

[**DfeContribuinteInfCons**](DfeContribuinteInfCons.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarEventoNfe"></a>
# **consultarEventoNfe**
> DfeEvento consultarEventoNfe(id)

Consultar evento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      DfeEvento result = apiInstance.consultarEventoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarEventoNfe");
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

<a id="consultarInutilizacaoNfe"></a>
# **consultarInutilizacaoNfe**
> DfeInutilizacao consultarInutilizacaoNfe(id)

Consultar a inutilização de sequência de numeração

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      DfeInutilizacao result = apiInstance.consultarInutilizacaoNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarInutilizacaoNfe");
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

[**DfeInutilizacao**](DfeInutilizacao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarLoteNfe"></a>
# **consultarLoteNfe**
> DfeLote consultarLoteNfe(id)

Consultar lote de NF-e

Consulta os detalhes de um lote já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de lotes e a Nuvem Fiscal irá retornar as informações do lote correspondente.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único do lote gerado pela Nuvem Fiscal.
    try {
      DfeLote result = apiInstance.consultarLoteNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarLoteNfe");
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

<a id="consultarNfe"></a>
# **consultarNfe**
> Dfe consultarNfe(id)

Consultar NF-e

Consulta os detalhes de uma NF-e já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de notas e a Nuvem Fiscal irá retornar as informações da nota correspondente.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      Dfe result = apiInstance.consultarNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

<a id="consultarStatusSefazNfe"></a>
# **consultarStatusSefazNfe**
> DfeSefazStatus consultarStatusSefazNfe(cpfCnpj, autorizador)

Consulta do Status do Serviço na SEFAZ Autorizadora

Consulta do status do serviço prestado pelo Portal da Secretaria de Fazenda Estadual.    A Nuvem Fiscal mantém a última consulta em cache por 5 minutos, evitando sobrecarregar desnecessariamente os servidores da SEFAZ (conforme orientação do MOC - versão 7.0, item 5.5.3). Dessa forma, você poderá chamar esse endpoint quantas vezes quiser, sem preocupar-se em ter o seu CNPJ bloqueado por consumo indevido (Rejeição 656).

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF/CNPJ do emitente.  Utilize o valor sem máscara.
    String autorizador = "autorizador_example"; // String | Ambiente Autorizador.    Autorizadores disponíveis: `AM`, `BA`, `GO`, `MG`, `MS`, `MT`, `PE`, `PR`, `RS`, `SP`, `SVAN`, `SVRS`, `SVCAN`, `SVCRS`, `AN`.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.*
    try {
      DfeSefazStatus result = apiInstance.consultarStatusSefazNfe(cpfCnpj, autorizador);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#consultarStatusSefazNfe");
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
| **autorizador** | **String**| Ambiente Autorizador.    Autorizadores disponíveis: &#x60;AM&#x60;, &#x60;BA&#x60;, &#x60;GO&#x60;, &#x60;MG&#x60;, &#x60;MS&#x60;, &#x60;MT&#x60;, &#x60;PE&#x60;, &#x60;PR&#x60;, &#x60;RS&#x60;, &#x60;SP&#x60;, &#x60;SVAN&#x60;, &#x60;SVRS&#x60;, &#x60;SVCAN&#x60;, &#x60;SVCRS&#x60;, &#x60;AN&#x60;.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.* | [optional] |

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

<a id="criarCartaCorrecaoNfe"></a>
# **criarCartaCorrecaoNfe**
> DfeCartaCorrecao criarCartaCorrecaoNfe(id, body)

Solicitar correção da NF-e

É possível enviar até 20 correções diferentes, sendo que será válido sempre a última correção enviada.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    NfePedidoCartaCorrecao body = new NfePedidoCartaCorrecao(); // NfePedidoCartaCorrecao | Contém os dados do pedido para carta de correção.
    try {
      DfeCartaCorrecao result = apiInstance.criarCartaCorrecaoNfe(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#criarCartaCorrecaoNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |
| **body** | [**NfePedidoCartaCorrecao**](NfePedidoCartaCorrecao.md)| Contém os dados do pedido para carta de correção. | |

### Return type

[**DfeCartaCorrecao**](DfeCartaCorrecao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="emitirLoteNfe"></a>
# **emitirLoteNfe**
> DfeLote emitirLoteNfe(body)

Emitir lote de NF-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por NF-e.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    NfePedidoEmissaoLote body = new NfePedidoEmissaoLote(); // NfePedidoEmissaoLote | 
    try {
      DfeLote result = apiInstance.emitirLoteNfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#emitirLoteNfe");
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
| **body** | [**NfePedidoEmissaoLote**](NfePedidoEmissaoLote.md)|  | |

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

<a id="emitirNfe"></a>
# **emitirNfe**
> Dfe emitirNfe(body)

Emitir NF-e

Este endpoint permite a emissão de Notas Fiscais Eletrônicas (NF-e).  A solicitação deve ser feita enviando os dados necessários para a  emissão de uma NF-e.     A estrutura do JSON utilizado na solicitação segue a hierarquia e  nomenclatura de campos definidos no &lt;a href&#x3D;\&quot;https://www.nfe.fazenda.gov.br/portal/principal.aspx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;  Manual de Orientação ao Contribuinte (MOC)&lt;/a&gt;.  Esta conformidade visa facilitar a integração de novos usuários que já  possuem familiaridade com o padrão, além de permitir a resolução de  dúvidas diretamente no MOC, com um profissional de contabilidade  habilitado ou em outras fontes confiáveis que tratam do mesmo assunto.    **Comportamento Assíncrono**    A resposta desse endpoint inclui a propriedade *status* no JSON.  Caso o valor retornado seja *pendente*, significa que a solicitação está  sendo realizada de forma assíncrona pela API. Nesse caso, o usuário deverá  adotar um fluxo que consiste em requisitar periodicamente o endpoint  &lt;a href&#x3D;\&quot;#tag/Nfe/operation/ConsultarNfe\&quot;&gt;Consultar NF-e&lt;/a&gt; até que  seja retornado um status indicando o fim da emissão.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    NfePedidoEmissao body = new NfePedidoEmissao(); // NfePedidoEmissao | 
    try {
      Dfe result = apiInstance.emitirNfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#emitirNfe");
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
| **body** | [**NfePedidoEmissao**](NfePedidoEmissao.md)|  | |

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

<a id="enviarEmailNfe"></a>
# **enviarEmailNfe**
> EmailStatusResponse enviarEmailNfe(id, body)

Enviar e-mail

Envia o XML e PDF da nota via email.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    DfePedidoEnvioEmail body = new DfePedidoEnvioEmail(); // DfePedidoEnvioEmail | 
    try {
      EmailStatusResponse result = apiInstance.enviarEmailNfe(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#enviarEmailNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |
| **body** | [**DfePedidoEnvioEmail**](DfePedidoEnvioEmail.md)|  | [optional] |

### Return type

[**EmailStatusResponse**](EmailStatusResponse.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="inutilizarNumeracaoNfe"></a>
# **inutilizarNumeracaoNfe**
> DfeInutilizacao inutilizarNumeracaoNfe(body)

Inutilizar uma sequência de numeração de NF-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    DfePedidoInutilizacao body = new DfePedidoInutilizacao(); // DfePedidoInutilizacao | 
    try {
      DfeInutilizacao result = apiInstance.inutilizarNumeracaoNfe(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#inutilizarNumeracaoNfe");
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
| **body** | [**DfePedidoInutilizacao**](DfePedidoInutilizacao.md)|  | |

### Return type

[**DfeInutilizacao**](DfeInutilizacao.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarEventosNfe"></a>
# **listarEventosNfe**
> DfeEventoListagem listarEventosNfe(dfeId, $top, $skip, $inlinecount)

Listar eventos

Retorna a lista de eventos vinculados a um documento fiscal de acordo com os critérios de busca utilizados. Os eventos são retornados ordenados pela data da criação, com as mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String dfeId = "dfeId_example"; // String | ID único gerado pela Nuvem Fiscal para o documento fiscal.
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    try {
      DfeEventoListagem result = apiInstance.listarEventosNfe(dfeId, $top, $skip, $inlinecount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#listarEventosNfe");
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
| **dfeId** | **String**| ID único gerado pela Nuvem Fiscal para o documento fiscal. | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |

### Return type

[**DfeEventoListagem**](DfeEventoListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarLotesNfe"></a>
# **listarLotesNfe**
> DfeLoteListagem listarLotesNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia)

Listar lotes de NF-e

Retorna a lista dos lotes de acordo com os critérios de busca utilizados. Os lotes são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.  Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | 
    try {
      DfeLoteListagem result = apiInstance.listarLotesNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#listarLotesNfe");
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

<a id="listarNfe"></a>
# **listarNfe**
> DfeListagem listarNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie)

Listar NF-e

Retorna a lista de notas de acordo com os critérios de busca utilizados. As notas são retornadas ordenadas pela data da criação, com as mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | Seu identificador único para o documento.
    String chave = "chave_example"; // String | Chave de acesso do DF-e.
    String serie = "serie_example"; // String | Série do DF-e.
    try {
      DfeListagem result = apiInstance.listarNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#listarNfe");
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

<a id="sincronizarNfe"></a>
# **sincronizarNfe**
> DfeSincronizacao sincronizarNfe(id)

Sincroniza dados na NF-e a partir da SEFAZ

Realiza a sincronização dos dados a partir da consulta da situação atual da NF-e na Base de Dados do Portal da Secretaria de Fazenda Estadual.    **Cenários de uso**:  * Sincronizar uma nota que se encontra com o status &#x60;erro&#x60; na Nuvem Fiscal, mas está autorizada na SEFAZ (útil em casos de erros de transmissão com a SEFAZ, como instabilidades e timeouts).  * Sincronizar uma nota que se encontra com o status &#x60;autorizado&#x60;na Nuvem Fiscal, mas está cancelada na SEFAZ.  * Sincronizar todos os eventos de Cancelamento, Carta de Correção e EPEC de uma nota que porventura não tenham sido feitos a partir da Nuvem Fiscal.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por evento sincronizado ou requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfeApi;

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

    NfeApi apiInstance = new NfeApi(defaultClient);
    String id = "id_example"; // String | ID único da NF-e gerado pela Nuvem Fiscal.
    try {
      DfeSincronizacao result = apiInstance.sincronizarNfe(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfeApi#sincronizarNfe");
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
| **id** | **String**| ID único da NF-e gerado pela Nuvem Fiscal. | |

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

