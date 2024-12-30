# EmailApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consultarEmail**](EmailApi.md#consultarEmail) | **GET** /emails/{id} | Consultar e-mail |
| [**listarEmails**](EmailApi.md#listarEmails) | **GET** /emails | Listar e-mails |


<a id="consultarEmail"></a>
# **consultarEmail**
> Email consultarEmail(id)

Consultar e-mail

Obtém informações detalhadas sobre o envio de um email. Este endpoint  permite rastrear todos os eventos relacionados ao email, como envio,  entrega, falhas e outros eventos relevantes.    Com este endpoint, é possível ter uma visão completa do ciclo de vida  de um email enviado, permitindo que os usuários acompanhem e analisem  o status e o histórico de eventos do email. Isso é particularmente  útil para identificar problemas de entrega e entender o comportamento  do email ao longo do tempo.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.EmailApi;

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

    EmailApi apiInstance = new EmailApi(defaultClient);
    String id = "id_example"; // String | ID único do e-mail.    Esse parâmetro é obtido após o envio do email por qualquer endpoint da  API da Nuvem Fiscal que realize disparos de email.    Exemplos:  * <a href=\"#tag/Nfe/operation/EnviarEmailNfe\">Envio de XML e PDF de NF-e</a>.  * <a href=\"#tag/Nfce/operation/EnviarEmailNfce\">Envio de XML e PDF de NFC-e</a>.
    try {
      Email result = apiInstance.consultarEmail(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailApi#consultarEmail");
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
| **id** | **String**| ID único do e-mail.    Esse parâmetro é obtido após o envio do email por qualquer endpoint da  API da Nuvem Fiscal que realize disparos de email.    Exemplos:  * &lt;a href&#x3D;\&quot;#tag/Nfe/operation/EnviarEmailNfe\&quot;&gt;Envio de XML e PDF de NF-e&lt;/a&gt;.  * &lt;a href&#x3D;\&quot;#tag/Nfce/operation/EnviarEmailNfce\&quot;&gt;Envio de XML e PDF de NFC-e&lt;/a&gt;. | |

### Return type

[**Email**](Email.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="listarEmails"></a>
# **listarEmails**
> EmailListagem listarEmails(cpfCnpj, $top, $skip, $inlinecount, undelivered, email)

Listar e-mails

Retorna a lista dos emails associadas à sua conta. Os e-emails são  retornados ordenados pela data da criação, com os mais recentes  aparecendo primeiro.

### Example
```java
// Import classes:
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.auth.*;
import io.github.com.caonulisses.nuvemfiscalsdk.models.*;
import io.github.com.caonulisses.nuvemfiscalsdk.api.EmailApi;

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

    EmailApi apiInstance = new EmailApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | Filtra pelo CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*.
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    Boolean undelivered = true; // Boolean | Filtra apenas emails com problemas de entrega.
    String email = "email_example"; // String | Filtra pelo endereço de e-mail do destinatário para qual o email foi enviado.
    try {
      EmailListagem result = apiInstance.listarEmails(cpfCnpj, $top, $skip, $inlinecount, undelivered, email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailApi#listarEmails");
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
| **cpfCnpj** | **String**| Filtra pelo CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*. | |
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |
| **undelivered** | **Boolean**| Filtra apenas emails com problemas de entrega. | [optional] |
| **email** | **String**| Filtra pelo endereço de e-mail do destinatário para qual o email foi enviado. | [optional] |

### Return type

[**EmailListagem**](EmailListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

