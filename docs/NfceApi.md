# NfceApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**baixarEscPosNfce**](NfceApi.md#baixarEscPosNfce) | **GET** /nfce/{id}/escpos | Comandos ESC/POS para impressão do DANFCE |
| [**baixarPdfCancelamentoNfce**](NfceApi.md#baixarPdfCancelamentoNfce) | **GET** /nfce/{id}/cancelamento/pdf | Baixar PDF do cancelamento |
| [**baixarPdfEventoNfce**](NfceApi.md#baixarPdfEventoNfce) | **GET** /nfce/eventos/{id}/pdf | Baixar PDF do evento |
| [**baixarPdfInutilizacaoNfce**](NfceApi.md#baixarPdfInutilizacaoNfce) | **GET** /nfce/inutilizacoes/{id}/pdf | Baixar PDF da inutilização |
| [**baixarPdfNfce**](NfceApi.md#baixarPdfNfce) | **GET** /nfce/{id}/pdf | Baixar PDF do DANFCE |
| [**baixarPreviaPdfNfce**](NfceApi.md#baixarPreviaPdfNfce) | **POST** /nfce/previa/pdf | Prévia do PDF do DANFCE |
| [**baixarPreviaXmlNfce**](NfceApi.md#baixarPreviaXmlNfce) | **POST** /nfce/previa/xml | Prévia do XML da NFC-e |
| [**baixarXmlCancelamentoNfce**](NfceApi.md#baixarXmlCancelamentoNfce) | **GET** /nfce/{id}/cancelamento/xml | Baixar XML do cancelamento |
| [**baixarXmlEventoNfce**](NfceApi.md#baixarXmlEventoNfce) | **GET** /nfce/eventos/{id}/xml | Baixar XML do evento |
| [**baixarXmlInutilizacaoNfce**](NfceApi.md#baixarXmlInutilizacaoNfce) | **GET** /nfce/inutilizacoes/{id}/xml | Baixar XML da inutilização |
| [**baixarXmlNfce**](NfceApi.md#baixarXmlNfce) | **GET** /nfce/{id}/xml | Baixar XML da NFC-e processada |
| [**baixarXmlNfceNota**](NfceApi.md#baixarXmlNfceNota) | **GET** /nfce/{id}/xml/nota | Baixar XML da NFC-e |
| [**baixarXmlNfceProtocolo**](NfceApi.md#baixarXmlNfceProtocolo) | **GET** /nfce/{id}/xml/protocolo | Baixar XML do Protocolo da SEFAZ |
| [**cancelarNfce**](NfceApi.md#cancelarNfce) | **POST** /nfce/{id}/cancelamento | Cancelar uma NFC-e autorizada |
| [**consultarCancelamentoNfce**](NfceApi.md#consultarCancelamentoNfce) | **GET** /nfce/{id}/cancelamento | Consultar o cancelamento da NFC-e |
| [**consultarEventoNfce**](NfceApi.md#consultarEventoNfce) | **GET** /nfce/eventos/{id} | Consultar evento |
| [**consultarInutilizacaoNfce**](NfceApi.md#consultarInutilizacaoNfce) | **GET** /nfce/inutilizacoes/{id} | Consultar a inutilização de sequência de numeração |
| [**consultarLoteNfce**](NfceApi.md#consultarLoteNfce) | **GET** /nfce/lotes/{id} | Consultar lote de NFC-e |
| [**consultarNfce**](NfceApi.md#consultarNfce) | **GET** /nfce/{id} | Consultar NFC-e |
| [**consultarStatusSefazNfce**](NfceApi.md#consultarStatusSefazNfce) | **GET** /nfce/sefaz/status | Consulta do Status do Serviço na SEFAZ Autorizadora |
| [**emitirLoteNfce**](NfceApi.md#emitirLoteNfce) | **POST** /nfce/lotes | Emitir lote de NFC-e |
| [**emitirNfce**](NfceApi.md#emitirNfce) | **POST** /nfce | Emitir NFC-e |
| [**enviarEmailNfce**](NfceApi.md#enviarEmailNfce) | **POST** /nfce/{id}/email | Enviar e-mail |
| [**inutilizarNumeracaoNfce**](NfceApi.md#inutilizarNumeracaoNfce) | **POST** /nfce/inutilizacoes | Inutilizar uma sequência de numeração de NFC-e |
| [**listarEventosNfce**](NfceApi.md#listarEventosNfce) | **GET** /nfce/eventos | Listar eventos |
| [**listarLotesNfce**](NfceApi.md#listarLotesNfce) | **GET** /nfce/lotes | Listar lotes de NFC-e |
| [**listarNfce**](NfceApi.md#listarNfce) | **GET** /nfce | Listar NFC-e |
| [**sincronizarNfce**](NfceApi.md#sincronizarNfce) | **POST** /nfce/{id}/sincronizar | Sincroniza dados na NFC-e a partir da SEFAZ |


<a id="baixarEscPosNfce"></a>
# **baixarEscPosNfce**
> File baixarEscPosNfce(id, modelo, colunas, qrcodeLateral)

Comandos ESC/POS para impressão do DANFCE

ESC/POS é um sistema de comando criado pela Epson usado em diversos sistemas de impressoras POS.    Com o formato ESC/POS, você poderá imprimir nativamente em uma vasta quantidade de modelos de impressora térmicas utilizadas no Brasil e no mundo. Com ela, você consegue fazer o envio de comandos em ESC/POS direto para a porta da impressora.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    Integer modelo = 1; // Integer | Modelo da impressora:  * `0` - Texto  * `1` - Epson  * `2` - Bematech  * `3` - Daruma  * `4` - Vox  * `5` - Diebold  * `6` - Epson P2  * `7` - CustomPos  * `8` - Star  * `9` - Zjiang  * `10` - GPrinter  * `11` - Datecs  * `12` - Sunmi  * `13` - Externo
    Integer colunas = 48; // Integer | Define o máximo de caracteres, em uma linha, usando a fonte normal.    Ex: 40, 42, 48, 58, 80.
    Boolean qrcodeLateral = false; // Boolean | Imprime o QRCode na lateral do DANFCe.    OBS: não suportado por alguns modelos de impressora.
    try {
      File result = apiInstance.baixarEscPosNfce(id, modelo, colunas, qrcodeLateral);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarEscPosNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |
| **modelo** | **Integer**| Modelo da impressora:  * &#x60;0&#x60; - Texto  * &#x60;1&#x60; - Epson  * &#x60;2&#x60; - Bematech  * &#x60;3&#x60; - Daruma  * &#x60;4&#x60; - Vox  * &#x60;5&#x60; - Diebold  * &#x60;6&#x60; - Epson P2  * &#x60;7&#x60; - CustomPos  * &#x60;8&#x60; - Star  * &#x60;9&#x60; - Zjiang  * &#x60;10&#x60; - GPrinter  * &#x60;11&#x60; - Datecs  * &#x60;12&#x60; - Sunmi  * &#x60;13&#x60; - Externo | [optional] [default to 1] |
| **colunas** | **Integer**| Define o máximo de caracteres, em uma linha, usando a fonte normal.    Ex: 40, 42, 48, 58, 80. | [optional] [default to 48] |
| **qrcodeLateral** | **Boolean**| Imprime o QRCode na lateral do DANFCe.    OBS: não suportado por alguns modelos de impressora. | [optional] [default to false] |

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

<a id="baixarPdfCancelamentoNfce"></a>
# **baixarPdfCancelamentoNfce**
> File baixarPdfCancelamentoNfce(id)

Baixar PDF do cancelamento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfCancelamentoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarPdfCancelamentoNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarPdfEventoNfce"></a>
# **baixarPdfEventoNfce**
> File baixarPdfEventoNfce(id)

Baixar PDF do evento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfEventoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarPdfEventoNfce");
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

<a id="baixarPdfInutilizacaoNfce"></a>
# **baixarPdfInutilizacaoNfce**
> File baixarPdfInutilizacaoNfce(id)

Baixar PDF da inutilização

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarPdfInutilizacaoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarPdfInutilizacaoNfce");
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

<a id="baixarPdfNfce"></a>
# **baixarPdfNfce**
> File baixarPdfNfce(id, logotipo, nomeFantasia, mensagemRodape, resumido, qrcodeLateral, largura, margem)

Baixar PDF do DANFCE

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    Boolean logotipo = false; // Boolean | Imprime o documento com logotipo, desde que esteja cadastrado na empresa.
    Boolean nomeFantasia = false; // Boolean | Exibe o nome fantasia do emitente, desde que esteja presente no XML da nota.
    String mensagemRodape = "mensagemRodape_example"; // String | Imprime mensagem no rodapé do documento.    O caractere `|` (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * `\"esquerda\"`  * `\"esquerda|centro\"`  * `\"esquerda|centro|direita\"`  * `\"|centro\"`, `\"|centro|\"`  * `\"|centro|direita\"`  * `\"||direita\"`  * `\"esquerda||direita\"`
    Boolean resumido = false; // Boolean | Poderá ser impresso apenas o DANFE NFC-e resumido ou ecológico, sem o detalhamento dos itens da venda, desde que a Unidade Federada permita esta opção em sua legislação e o consumidor assim o solicite.
    Boolean qrcodeLateral = false; // Boolean | Imprime o QRCode na lateral do DANFE NFC-e.    *Disponível apenas para DANFE com 80 milímetros de largura*.
    Integer largura = 80; // Integer | Largura do DANFE NFC-e (em milímetros).
    String margem = "2"; // String | Define as margens do DANFE NFC-e (em milímetros).    Essa propriedade pode ser especificada usando um, dois, três ou quatro valores (separados por vírgulas). Cada valor deve ser um número entre `0` e `9`.  * Quando **um** valor é especificado, a mesma margem é aplicada para **todos os quatro lados**.  * Quando **dois** valores são especificados, a primeira margem é aplicada aos **lados esquerdo e direito**, e a segunda aos **lados superior e inferior**.  * Quando **três** valores são especificados, a primeira margem é aplicada ao **lado esquerdo**, a segunda aos **lados superior e inferior**, e a terceira ao **lado direito**.  * Quando **quatro** valores são especificados, as margens são aplicadas aos lados **esquerdo**, **superior**, **direito** e **inferior**, nesta ordem (sentido horário).    **Exemplos de uso**:  * `margem=1`    - Margem esquerda: 1mm    - Margem superior: 1mm    - Margem direita: 1mm    - Margem inferior: 1mm  * `margem=1,2`    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 1mm    - Margem inferior: 2mm  * `margem=1,2,3`    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 2mm  * `margem=1,2,3,4`    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 4mm
    try {
      File result = apiInstance.baixarPdfNfce(id, logotipo, nomeFantasia, mensagemRodape, resumido, qrcodeLateral, largura, margem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarPdfNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |
| **logotipo** | **Boolean**| Imprime o documento com logotipo, desde que esteja cadastrado na empresa. | [optional] [default to false] |
| **nomeFantasia** | **Boolean**| Exibe o nome fantasia do emitente, desde que esteja presente no XML da nota. | [optional] [default to false] |
| **mensagemRodape** | **String**| Imprime mensagem no rodapé do documento.    O caractere &#x60;|&#x60; (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * &#x60;\&quot;esquerda\&quot;&#x60;  * &#x60;\&quot;esquerda|centro\&quot;&#x60;  * &#x60;\&quot;esquerda|centro|direita\&quot;&#x60;  * &#x60;\&quot;|centro\&quot;&#x60;, &#x60;\&quot;|centro|\&quot;&#x60;  * &#x60;\&quot;|centro|direita\&quot;&#x60;  * &#x60;\&quot;||direita\&quot;&#x60;  * &#x60;\&quot;esquerda||direita\&quot;&#x60; | [optional] |
| **resumido** | **Boolean**| Poderá ser impresso apenas o DANFE NFC-e resumido ou ecológico, sem o detalhamento dos itens da venda, desde que a Unidade Federada permita esta opção em sua legislação e o consumidor assim o solicite. | [optional] [default to false] |
| **qrcodeLateral** | **Boolean**| Imprime o QRCode na lateral do DANFE NFC-e.    *Disponível apenas para DANFE com 80 milímetros de largura*. | [optional] [default to false] |
| **largura** | **Integer**| Largura do DANFE NFC-e (em milímetros). | [optional] [default to 80] |
| **margem** | **String**| Define as margens do DANFE NFC-e (em milímetros).    Essa propriedade pode ser especificada usando um, dois, três ou quatro valores (separados por vírgulas). Cada valor deve ser um número entre &#x60;0&#x60; e &#x60;9&#x60;.  * Quando **um** valor é especificado, a mesma margem é aplicada para **todos os quatro lados**.  * Quando **dois** valores são especificados, a primeira margem é aplicada aos **lados esquerdo e direito**, e a segunda aos **lados superior e inferior**.  * Quando **três** valores são especificados, a primeira margem é aplicada ao **lado esquerdo**, a segunda aos **lados superior e inferior**, e a terceira ao **lado direito**.  * Quando **quatro** valores são especificados, as margens são aplicadas aos lados **esquerdo**, **superior**, **direito** e **inferior**, nesta ordem (sentido horário).    **Exemplos de uso**:  * &#x60;margem&#x3D;1&#x60;    - Margem esquerda: 1mm    - Margem superior: 1mm    - Margem direita: 1mm    - Margem inferior: 1mm  * &#x60;margem&#x3D;1,2&#x60;    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 1mm    - Margem inferior: 2mm  * &#x60;margem&#x3D;1,2,3&#x60;    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 2mm  * &#x60;margem&#x3D;1,2,3,4&#x60;    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 4mm | [optional] [default to 2] |

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

<a id="baixarPreviaPdfNfce"></a>
# **baixarPreviaPdfNfce**
> File baixarPreviaPdfNfce(body, logotipo, nomeFantasia, mensagemRodape, resumido, qrcodeLateral, largura, margem)

Prévia do PDF do DANFCE

Através desse endpoint, é possível enviar os dados de uma NFC-e e gerar uma prévia do DANFCE.    Os dados de entrada são os mesmos do endpoint de emissão de NFC-e (&#x60;POST /nfce&#x60;).    **Atenção**: O DANFE gerado por este endpoint é apenas para fins de visualização e não possui valor fiscal. Para a emissão de uma NF-e com valor fiscal, utilize o processo de emissão padrão descrito na documentação.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    NfePedidoEmissao body = new NfePedidoEmissao(); // NfePedidoEmissao | 
    Boolean logotipo = false; // Boolean | Imprime o documento com logotipo, desde que esteja cadastrado na empresa.
    Boolean nomeFantasia = false; // Boolean | Exibe o nome fantasia do emitente, desde que esteja presente no XML da nota.
    String mensagemRodape = "mensagemRodape_example"; // String | Imprime mensagem no rodapé do documento.    O caractere `|` (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * `\"esquerda\"`  * `\"esquerda|centro\"`  * `\"esquerda|centro|direita\"`  * `\"|centro\"`, `\"|centro|\"`  * `\"|centro|direita\"`  * `\"||direita\"`  * `\"esquerda||direita\"`
    Boolean resumido = false; // Boolean | Poderá ser impresso apenas o DANFE NFC-e resumido ou ecológico, sem o detalhamento dos itens da venda, desde que a Unidade Federada permita esta opção em sua legislação e o consumidor assim o solicite.
    Boolean qrcodeLateral = false; // Boolean | Imprime o QRCode na lateral do DANFE NFC-e.    *Disponível apenas para DANFE com 80 milímetros de largura*.
    Integer largura = 80; // Integer | Largura do DANFE NFC-e (em milímetros).
    String margem = "2"; // String | Define as margens do DANFE NFC-e (em milímetros).    Essa propriedade pode ser especificada usando um, dois, três ou quatro valores (separados por vírgulas). Cada valor deve ser um número entre `0` e `9`.  * Quando **um** valor é especificado, a mesma margem é aplicada para **todos os quatro lados**.  * Quando **dois** valores são especificados, a primeira margem é aplicada aos **lados esquerdo e direito**, e a segunda aos **lados superior e inferior**.  * Quando **três** valores são especificados, a primeira margem é aplicada ao **lado esquerdo**, a segunda aos **lados superior e inferior**, e a terceira ao **lado direito**.  * Quando **quatro** valores são especificados, as margens são aplicadas aos lados **esquerdo**, **superior**, **direito** e **inferior**, nesta ordem (sentido horário).    **Exemplos de uso**:  * `margem=1`    - Margem esquerda: 1mm    - Margem superior: 1mm    - Margem direita: 1mm    - Margem inferior: 1mm  * `margem=1,2`    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 1mm    - Margem inferior: 2mm  * `margem=1,2,3`    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 2mm  * `margem=1,2,3,4`    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 4mm
    try {
      File result = apiInstance.baixarPreviaPdfNfce(body, logotipo, nomeFantasia, mensagemRodape, resumido, qrcodeLateral, largura, margem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarPreviaPdfNfce");
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
| **mensagemRodape** | **String**| Imprime mensagem no rodapé do documento.    O caractere &#x60;|&#x60; (pipe) poderá ser utilizado para definir a quantidade e o alinhamento das mensagens.    **Exemplos de Uso:**  * &#x60;\&quot;esquerda\&quot;&#x60;  * &#x60;\&quot;esquerda|centro\&quot;&#x60;  * &#x60;\&quot;esquerda|centro|direita\&quot;&#x60;  * &#x60;\&quot;|centro\&quot;&#x60;, &#x60;\&quot;|centro|\&quot;&#x60;  * &#x60;\&quot;|centro|direita\&quot;&#x60;  * &#x60;\&quot;||direita\&quot;&#x60;  * &#x60;\&quot;esquerda||direita\&quot;&#x60; | [optional] |
| **resumido** | **Boolean**| Poderá ser impresso apenas o DANFE NFC-e resumido ou ecológico, sem o detalhamento dos itens da venda, desde que a Unidade Federada permita esta opção em sua legislação e o consumidor assim o solicite. | [optional] [default to false] |
| **qrcodeLateral** | **Boolean**| Imprime o QRCode na lateral do DANFE NFC-e.    *Disponível apenas para DANFE com 80 milímetros de largura*. | [optional] [default to false] |
| **largura** | **Integer**| Largura do DANFE NFC-e (em milímetros). | [optional] [default to 80] |
| **margem** | **String**| Define as margens do DANFE NFC-e (em milímetros).    Essa propriedade pode ser especificada usando um, dois, três ou quatro valores (separados por vírgulas). Cada valor deve ser um número entre &#x60;0&#x60; e &#x60;9&#x60;.  * Quando **um** valor é especificado, a mesma margem é aplicada para **todos os quatro lados**.  * Quando **dois** valores são especificados, a primeira margem é aplicada aos **lados esquerdo e direito**, e a segunda aos **lados superior e inferior**.  * Quando **três** valores são especificados, a primeira margem é aplicada ao **lado esquerdo**, a segunda aos **lados superior e inferior**, e a terceira ao **lado direito**.  * Quando **quatro** valores são especificados, as margens são aplicadas aos lados **esquerdo**, **superior**, **direito** e **inferior**, nesta ordem (sentido horário).    **Exemplos de uso**:  * &#x60;margem&#x3D;1&#x60;    - Margem esquerda: 1mm    - Margem superior: 1mm    - Margem direita: 1mm    - Margem inferior: 1mm  * &#x60;margem&#x3D;1,2&#x60;    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 1mm    - Margem inferior: 2mm  * &#x60;margem&#x3D;1,2,3&#x60;    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 2mm  * &#x60;margem&#x3D;1,2,3,4&#x60;    - Margem esquerda: 1mm    - Margem superior: 2mm    - Margem direita: 3mm    - Margem inferior: 4mm | [optional] [default to 2] |

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

<a id="baixarPreviaXmlNfce"></a>
# **baixarPreviaXmlNfce**
> File baixarPreviaXmlNfce(body)

Prévia do XML da NFC-e

Através desse endpoint, é possível enviar os dados de uma NFC-e e gerar uma prévia do XML, sem a assinatura digital.    Os dados de entrada são os mesmos do endpoint de emissão de NFC-e (&#x60;POST /nfce&#x60;).    **Atenção**: O XML gerado por este endpoint é apenas para fins de visualização e não possui valor fiscal. Para a emissão de uma NF-e com valor fiscal, utilize o processo de emissão padrão descrito na documentação.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    NfePedidoEmissao body = new NfePedidoEmissao(); // NfePedidoEmissao | 
    try {
      File result = apiInstance.baixarPreviaXmlNfce(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarPreviaXmlNfce");
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

<a id="baixarXmlCancelamentoNfce"></a>
# **baixarXmlCancelamentoNfce**
> File baixarXmlCancelamentoNfce(id)

Baixar XML do cancelamento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlCancelamentoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarXmlCancelamentoNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlEventoNfce"></a>
# **baixarXmlEventoNfce**
> File baixarXmlEventoNfce(id)

Baixar XML do evento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlEventoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarXmlEventoNfce");
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

<a id="baixarXmlInutilizacaoNfce"></a>
# **baixarXmlInutilizacaoNfce**
> File baixarXmlInutilizacaoNfce(id)

Baixar XML da inutilização

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlInutilizacaoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarXmlInutilizacaoNfce");
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

<a id="baixarXmlNfce"></a>
# **baixarXmlNfce**
> File baixarXmlNfce(id)

Baixar XML da NFC-e processada

Utilize esse endpoint para obter o XML da nota enviado para a SEFAZ, complementado com a informação do protocolo de autorização ou denegação de uso (TAG raiz &#x60;nfeProc&#x60;).    O XML só estará disponível nesse endpoint caso a nota tenha sido autorizada ou denegada pela SEFAZ. Para obter o XML nos demais casos, utilize o endpoint &#x60;GET /nfce/{id}/xml/nota&#x60;.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarXmlNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlNfceNota"></a>
# **baixarXmlNfceNota**
> File baixarXmlNfceNota(id)

Baixar XML da NFC-e

Utilize esse endpoint para obter o XML da nota enviado para a SEFAZ.    O XML estará disponível nesse endpoint mesmo em casos que a nota tenha sido rejeitada.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlNfceNota(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarXmlNfceNota");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

<a id="baixarXmlNfceProtocolo"></a>
# **baixarXmlNfceProtocolo**
> File baixarXmlNfceProtocolo(id)

Baixar XML do Protocolo da SEFAZ

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      File result = apiInstance.baixarXmlNfceProtocolo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#baixarXmlNfceProtocolo");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

<a id="cancelarNfce"></a>
# **cancelarNfce**
> DfeCancelamento cancelarNfce(id, body)

Cancelar uma NFC-e autorizada

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    NfePedidoCancelamento body = new NfePedidoCancelamento(); // NfePedidoCancelamento | 
    try {
      DfeCancelamento result = apiInstance.cancelarNfce(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#cancelarNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |
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

<a id="consultarCancelamentoNfce"></a>
# **consultarCancelamentoNfce**
> DfeCancelamento consultarCancelamentoNfce(id)

Consultar o cancelamento da NFC-e

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      DfeCancelamento result = apiInstance.consultarCancelamentoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#consultarCancelamentoNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

<a id="consultarEventoNfce"></a>
# **consultarEventoNfce**
> DfeEvento consultarEventoNfce(id)

Consultar evento

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      DfeEvento result = apiInstance.consultarEventoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#consultarEventoNfce");
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

<a id="consultarInutilizacaoNfce"></a>
# **consultarInutilizacaoNfce**
> DfeInutilizacao consultarInutilizacaoNfce(id)

Consultar a inutilização de sequência de numeração

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único do evento gerado pela Nuvem Fiscal.
    try {
      DfeInutilizacao result = apiInstance.consultarInutilizacaoNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#consultarInutilizacaoNfce");
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

<a id="consultarLoteNfce"></a>
# **consultarLoteNfce**
> DfeLote consultarLoteNfce(id)

Consultar lote de NFC-e

Consulta os detalhes de um lote já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de lotes e a Nuvem Fiscal irá retornar as informações do lote correspondente.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único do lote gerado pela Nuvem Fiscal.
    try {
      DfeLote result = apiInstance.consultarLoteNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#consultarLoteNfce");
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

<a id="consultarNfce"></a>
# **consultarNfce**
> Dfe consultarNfce(id)

Consultar NFC-e

Consulta os detalhes de uma NFC-e já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de notas e a Nuvem Fiscal irá retornar as informações da nota correspondente.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      Dfe result = apiInstance.consultarNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#consultarNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

<a id="consultarStatusSefazNfce"></a>
# **consultarStatusSefazNfce**
> DfeSefazStatus consultarStatusSefazNfce(cpfCnpj, autorizador)

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
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF/CNPJ do emitente.  Utilize o valor sem máscara.
    String autorizador = "autorizador_example"; // String | Ambiente Autorizador.    Autorizadores disponíveis: `AM`, `BA`, `CE`, `GO`, `MG`, `MS`, `MT`, `PE`, `PR`, `RS`, `SP`, `SVRS`.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.*
    try {
      DfeSefazStatus result = apiInstance.consultarStatusSefazNfce(cpfCnpj, autorizador);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#consultarStatusSefazNfce");
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
| **autorizador** | **String**| Ambiente Autorizador.    Autorizadores disponíveis: &#x60;AM&#x60;, &#x60;BA&#x60;, &#x60;CE&#x60;, &#x60;GO&#x60;, &#x60;MG&#x60;, &#x60;MS&#x60;, &#x60;MT&#x60;, &#x60;PE&#x60;, &#x60;PR&#x60;, &#x60;RS&#x60;, &#x60;SP&#x60;, &#x60;SVRS&#x60;.    *Caso não seja informado, será utilizado o ambiente autorizador da UF do emitente.* | [optional] |

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

<a id="emitirLoteNfce"></a>
# **emitirLoteNfce**
> DfeLote emitirLoteNfce(body)

Emitir lote de NFC-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por NFC-e.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    NfePedidoEmissaoLote body = new NfePedidoEmissaoLote(); // NfePedidoEmissaoLote | 
    try {
      DfeLote result = apiInstance.emitirLoteNfce(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#emitirLoteNfce");
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

<a id="emitirNfce"></a>
# **emitirNfce**
> Dfe emitirNfce(body)

Emitir NFC-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    NfePedidoEmissao body = new NfePedidoEmissao(); // NfePedidoEmissao | 
    try {
      Dfe result = apiInstance.emitirNfce(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#emitirNfce");
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

<a id="enviarEmailNfce"></a>
# **enviarEmailNfce**
> EmailStatusResponse enviarEmailNfce(id, body)

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
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    DfePedidoEnvioEmail body = new DfePedidoEnvioEmail(); // DfePedidoEnvioEmail | 
    try {
      EmailStatusResponse result = apiInstance.enviarEmailNfce(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#enviarEmailNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |
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

<a id="inutilizarNumeracaoNfce"></a>
# **inutilizarNumeracaoNfce**
> DfeInutilizacao inutilizarNumeracaoNfce(body)

Inutilizar uma sequência de numeração de NFC-e

**Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    DfePedidoInutilizacao body = new DfePedidoInutilizacao(); // DfePedidoInutilizacao | 
    try {
      DfeInutilizacao result = apiInstance.inutilizarNumeracaoNfce(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#inutilizarNumeracaoNfce");
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

<a id="listarEventosNfce"></a>
# **listarEventosNfce**
> DfeEventoListagem listarEventosNfce(dfeId, $top, $skip, $inlinecount)

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
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String dfeId = "dfeId_example"; // String | ID único gerado pela Nuvem Fiscal para o documento fiscal.
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    try {
      DfeEventoListagem result = apiInstance.listarEventosNfce(dfeId, $top, $skip, $inlinecount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#listarEventosNfce");
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

<a id="listarLotesNfce"></a>
# **listarLotesNfce**
> DfeLoteListagem listarLotesNfce(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia)

Listar lotes de NFC-e

Retorna a lista dos lotes de acordo com os critérios de busca utilizados. Os lotes são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.  Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | 
    try {
      DfeLoteListagem result = apiInstance.listarLotesNfce(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#listarLotesNfce");
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

<a id="listarNfce"></a>
# **listarNfce**
> DfeListagem listarNfce(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie)

Listar NFC-e

Retorna a lista de notas de acordo com os critérios de busca utilizados. As notas são retornadas ordenadas pela data da criação, com as mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ do emitente.    Utilize o valor sem máscara.
    String ambiente = "ambiente_example"; // String | Identificação do Ambiente.    Valores aceitos: homologacao, producao
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String referencia = "referencia_example"; // String | Seu identificador único para o documento.
    String chave = "chave_example"; // String | Chave de acesso do DF-e.
    String serie = "serie_example"; // String | Série do DF-e.
    try {
      DfeListagem result = apiInstance.listarNfce(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#listarNfce");
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

<a id="sincronizarNfce"></a>
# **sincronizarNfce**
> DfeSincronizacao sincronizarNfce(id)

Sincroniza dados na NFC-e a partir da SEFAZ

Realiza a sincronização dos dados a partir da consulta da situação atual da NFC-e na Base de Dados do Portal da Secretaria de Fazenda Estadual.    **Cenários de uso**:  * Sincronizar uma nota que se encontra com o status &#x60;erro&#x60; na Nuvem Fiscal, mas está autorizada na SEFAZ (útil em casos de erros de transmissão com a SEFAZ, como instabilidades e timeouts).  * Sincronizar uma nota que se encontra com o status &#x60;autorizado&#x60;na Nuvem Fiscal, mas está cancelada na SEFAZ.  * Sincronizar todos os eventos de Cancelamento, Carta de Correção e EPEC de uma nota que porventura não tenham sido feitos a partir da Nuvem Fiscal.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por evento sincronizado ou requisição.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.NfceApi;

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

    NfceApi apiInstance = new NfceApi(defaultClient);
    String id = "id_example"; // String | ID único da NFC-e gerado pela Nuvem Fiscal.
    try {
      DfeSincronizacao result = apiInstance.sincronizarNfce(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NfceApi#sincronizarNfce");
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
| **id** | **String**| ID único da NFC-e gerado pela Nuvem Fiscal. | |

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

