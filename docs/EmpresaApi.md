# EmpresaApi

All URIs are relative to *https://api.nuvemfiscal.com.br*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alterarConfigCte**](EmpresaApi.md#alterarConfigCte) | **PUT** /empresas/{cpf_cnpj}/cte | Alterar configuração de CT-e |
| [**alterarConfigDistribuicaoNfe**](EmpresaApi.md#alterarConfigDistribuicaoNfe) | **PUT** /empresas/{cpf_cnpj}/distnfe | Alterar configuração de Distribuição de NF-e |
| [**alterarConfigMdfe**](EmpresaApi.md#alterarConfigMdfe) | **PUT** /empresas/{cpf_cnpj}/mdfe | Alterar configuração de MDF-e |
| [**alterarConfigNfce**](EmpresaApi.md#alterarConfigNfce) | **PUT** /empresas/{cpf_cnpj}/nfce | Alterar configuração de NFC-e |
| [**alterarConfigNfcom**](EmpresaApi.md#alterarConfigNfcom) | **PUT** /empresas/{cpf_cnpj}/nfcom | Alterar configuração de NFCom |
| [**alterarConfigNfe**](EmpresaApi.md#alterarConfigNfe) | **PUT** /empresas/{cpf_cnpj}/nfe | Alterar configuração de NF-e |
| [**alterarConfigNfse**](EmpresaApi.md#alterarConfigNfse) | **PUT** /empresas/{cpf_cnpj}/nfse | Alterar configuração de NFS-e |
| [**atualizarEmpresa**](EmpresaApi.md#atualizarEmpresa) | **PUT** /empresas/{cpf_cnpj} | Alterar empresa |
| [**baixarLogotipoEmpresa**](EmpresaApi.md#baixarLogotipoEmpresa) | **GET** /empresas/{cpf_cnpj}/logotipo | Baixar logotipo |
| [**cadastrarCertificadoEmpresa**](EmpresaApi.md#cadastrarCertificadoEmpresa) | **PUT** /empresas/{cpf_cnpj}/certificado | Cadastrar certificado |
| [**consultarCertificadoEmpresa**](EmpresaApi.md#consultarCertificadoEmpresa) | **GET** /empresas/{cpf_cnpj}/certificado | Consultar certificado |
| [**consultarConfigCte**](EmpresaApi.md#consultarConfigCte) | **GET** /empresas/{cpf_cnpj}/cte | Consultar configuração de CT-e |
| [**consultarConfigDistribuicaoNfe**](EmpresaApi.md#consultarConfigDistribuicaoNfe) | **GET** /empresas/{cpf_cnpj}/distnfe | Consultar configuração de Distribuição de NF-e |
| [**consultarConfigMdfe**](EmpresaApi.md#consultarConfigMdfe) | **GET** /empresas/{cpf_cnpj}/mdfe | Consultar configuração de MDF-e |
| [**consultarConfigNfce**](EmpresaApi.md#consultarConfigNfce) | **GET** /empresas/{cpf_cnpj}/nfce | Consultar configuração de NFC-e |
| [**consultarConfigNfcom**](EmpresaApi.md#consultarConfigNfcom) | **GET** /empresas/{cpf_cnpj}/nfcom | Consultar configuração de NFCom |
| [**consultarConfigNfe**](EmpresaApi.md#consultarConfigNfe) | **GET** /empresas/{cpf_cnpj}/nfe | Consultar configuração de NF-e |
| [**consultarConfigNfse**](EmpresaApi.md#consultarConfigNfse) | **GET** /empresas/{cpf_cnpj}/nfse | Consultar configuração de NFS-e |
| [**consultarEmpresa**](EmpresaApi.md#consultarEmpresa) | **GET** /empresas/{cpf_cnpj} | Consultar empresa |
| [**criarEmpresa**](EmpresaApi.md#criarEmpresa) | **POST** /empresas | Cadastrar empresa |
| [**enviarCertificadoEmpresa**](EmpresaApi.md#enviarCertificadoEmpresa) | **PUT** /empresas/{cpf_cnpj}/certificado/upload | Upload de certificado |
| [**enviarLogotipoEmpresa**](EmpresaApi.md#enviarLogotipoEmpresa) | **PUT** /empresas/{cpf_cnpj}/logotipo | Enviar logotipo |
| [**excluirCertificadoEmpresa**](EmpresaApi.md#excluirCertificadoEmpresa) | **DELETE** /empresas/{cpf_cnpj}/certificado | Deletar certificado |
| [**excluirEmpresa**](EmpresaApi.md#excluirEmpresa) | **DELETE** /empresas/{cpf_cnpj} | Deletar empresa |
| [**excluirLogotipoEmpresa**](EmpresaApi.md#excluirLogotipoEmpresa) | **DELETE** /empresas/{cpf_cnpj}/logotipo | Deletar logotipo |
| [**listarEmpresas**](EmpresaApi.md#listarEmpresas) | **GET** /empresas | Listar empresas |


<a id="alterarConfigCte"></a>
# **alterarConfigCte**
> EmpresaConfigCte alterarConfigCte(cpfCnpj, body)

Alterar configuração de CT-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaConfigCte body = new EmpresaConfigCte(); // EmpresaConfigCte | 
    try {
      EmpresaConfigCte result = apiInstance.alterarConfigCte(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#alterarConfigCte");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaConfigCte**](EmpresaConfigCte.md)|  | |

### Return type

[**EmpresaConfigCte**](EmpresaConfigCte.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="alterarConfigDistribuicaoNfe"></a>
# **alterarConfigDistribuicaoNfe**
> EmpresaConfigDistribuicaoNfe alterarConfigDistribuicaoNfe(cpfCnpj, body)

Alterar configuração de Distribuição de NF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaConfigDistribuicaoNfe body = new EmpresaConfigDistribuicaoNfe(); // EmpresaConfigDistribuicaoNfe | 
    try {
      EmpresaConfigDistribuicaoNfe result = apiInstance.alterarConfigDistribuicaoNfe(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#alterarConfigDistribuicaoNfe");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaConfigDistribuicaoNfe**](EmpresaConfigDistribuicaoNfe.md)|  | |

### Return type

[**EmpresaConfigDistribuicaoNfe**](EmpresaConfigDistribuicaoNfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="alterarConfigMdfe"></a>
# **alterarConfigMdfe**
> EmpresaConfigMdfe alterarConfigMdfe(cpfCnpj, body)

Alterar configuração de MDF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaConfigMdfe body = new EmpresaConfigMdfe(); // EmpresaConfigMdfe | 
    try {
      EmpresaConfigMdfe result = apiInstance.alterarConfigMdfe(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#alterarConfigMdfe");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaConfigMdfe**](EmpresaConfigMdfe.md)|  | |

### Return type

[**EmpresaConfigMdfe**](EmpresaConfigMdfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="alterarConfigNfce"></a>
# **alterarConfigNfce**
> EmpresaConfigNfce alterarConfigNfce(cpfCnpj, body)

Alterar configuração de NFC-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaConfigNfce body = new EmpresaConfigNfce(); // EmpresaConfigNfce | 
    try {
      EmpresaConfigNfce result = apiInstance.alterarConfigNfce(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#alterarConfigNfce");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaConfigNfce**](EmpresaConfigNfce.md)|  | |

### Return type

[**EmpresaConfigNfce**](EmpresaConfigNfce.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="alterarConfigNfcom"></a>
# **alterarConfigNfcom**
> EmpresaConfigNfcom alterarConfigNfcom(cpfCnpj, body)

Alterar configuração de NFCom

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaConfigNfcom body = new EmpresaConfigNfcom(); // EmpresaConfigNfcom | 
    try {
      EmpresaConfigNfcom result = apiInstance.alterarConfigNfcom(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#alterarConfigNfcom");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaConfigNfcom**](EmpresaConfigNfcom.md)|  | |

### Return type

[**EmpresaConfigNfcom**](EmpresaConfigNfcom.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="alterarConfigNfe"></a>
# **alterarConfigNfe**
> EmpresaConfigNfe alterarConfigNfe(cpfCnpj, body)

Alterar configuração de NF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaConfigNfe body = new EmpresaConfigNfe(); // EmpresaConfigNfe | 
    try {
      EmpresaConfigNfe result = apiInstance.alterarConfigNfe(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#alterarConfigNfe");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaConfigNfe**](EmpresaConfigNfe.md)|  | |

### Return type

[**EmpresaConfigNfe**](EmpresaConfigNfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="alterarConfigNfse"></a>
# **alterarConfigNfse**
> EmpresaConfigNfse alterarConfigNfse(cpfCnpj, body)

Alterar configuração de NFS-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaConfigNfse body = new EmpresaConfigNfse(); // EmpresaConfigNfse | 
    try {
      EmpresaConfigNfse result = apiInstance.alterarConfigNfse(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#alterarConfigNfse");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaConfigNfse**](EmpresaConfigNfse.md)|  | |

### Return type

[**EmpresaConfigNfse**](EmpresaConfigNfse.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="atualizarEmpresa"></a>
# **atualizarEmpresa**
> Empresa atualizarEmpresa(cpfCnpj, body)

Alterar empresa

Altera o cadastro de uma empresa (emitente/prestador) que esteja associada a sua conta.  Nesse método, por tratar-se de um PUT, caso algum campo não seja informado, o valor dele será apagado.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    Empresa body = new Empresa(); // Empresa | 
    try {
      Empresa result = apiInstance.atualizarEmpresa(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#atualizarEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**Empresa**](Empresa.md)|  | |

### Return type

[**Empresa**](Empresa.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="baixarLogotipoEmpresa"></a>
# **baixarLogotipoEmpresa**
> File baixarLogotipoEmpresa(cpfCnpj)

Baixar logotipo

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      File result = apiInstance.baixarLogotipoEmpresa(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#baixarLogotipoEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

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

<a id="cadastrarCertificadoEmpresa"></a>
# **cadastrarCertificadoEmpresa**
> EmpresaCertificado cadastrarCertificadoEmpresa(cpfCnpj, body)

Cadastrar certificado

Cadastre ou atualize um certificado digital e vincule a sua empresa, para que possa iniciar a emissão de notas.  * No parâmetro &#x60;certificado&#x60;, envie o binário do certificado digital (.pfx ou .p12) codificado em **base64**.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    EmpresaPedidoCadastroCertificado body = new EmpresaPedidoCadastroCertificado(); // EmpresaPedidoCadastroCertificado | 
    try {
      EmpresaCertificado result = apiInstance.cadastrarCertificadoEmpresa(cpfCnpj, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#cadastrarCertificadoEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **body** | [**EmpresaPedidoCadastroCertificado**](EmpresaPedidoCadastroCertificado.md)|  | |

### Return type

[**EmpresaCertificado**](EmpresaCertificado.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarCertificadoEmpresa"></a>
# **consultarCertificadoEmpresa**
> EmpresaCertificado consultarCertificadoEmpresa(cpfCnpj)

Consultar certificado

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaCertificado result = apiInstance.consultarCertificadoEmpresa(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarCertificadoEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaCertificado**](EmpresaCertificado.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarConfigCte"></a>
# **consultarConfigCte**
> EmpresaConfigCte consultarConfigCte(cpfCnpj)

Consultar configuração de CT-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaConfigCte result = apiInstance.consultarConfigCte(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarConfigCte");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaConfigCte**](EmpresaConfigCte.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarConfigDistribuicaoNfe"></a>
# **consultarConfigDistribuicaoNfe**
> EmpresaConfigDistribuicaoNfe consultarConfigDistribuicaoNfe(cpfCnpj)

Consultar configuração de Distribuição de NF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaConfigDistribuicaoNfe result = apiInstance.consultarConfigDistribuicaoNfe(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarConfigDistribuicaoNfe");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaConfigDistribuicaoNfe**](EmpresaConfigDistribuicaoNfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarConfigMdfe"></a>
# **consultarConfigMdfe**
> EmpresaConfigMdfe consultarConfigMdfe(cpfCnpj)

Consultar configuração de MDF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaConfigMdfe result = apiInstance.consultarConfigMdfe(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarConfigMdfe");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaConfigMdfe**](EmpresaConfigMdfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarConfigNfce"></a>
# **consultarConfigNfce**
> EmpresaConfigNfce consultarConfigNfce(cpfCnpj)

Consultar configuração de NFC-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaConfigNfce result = apiInstance.consultarConfigNfce(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarConfigNfce");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaConfigNfce**](EmpresaConfigNfce.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarConfigNfcom"></a>
# **consultarConfigNfcom**
> EmpresaConfigNfcom consultarConfigNfcom(cpfCnpj)

Consultar configuração de NFCom

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaConfigNfcom result = apiInstance.consultarConfigNfcom(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarConfigNfcom");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaConfigNfcom**](EmpresaConfigNfcom.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarConfigNfe"></a>
# **consultarConfigNfe**
> EmpresaConfigNfe consultarConfigNfe(cpfCnpj)

Consultar configuração de NF-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaConfigNfe result = apiInstance.consultarConfigNfe(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarConfigNfe");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaConfigNfe**](EmpresaConfigNfe.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarConfigNfse"></a>
# **consultarConfigNfse**
> EmpresaConfigNfse consultarConfigNfse(cpfCnpj)

Consultar configuração de NFS-e

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      EmpresaConfigNfse result = apiInstance.consultarConfigNfse(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarConfigNfse");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**EmpresaConfigNfse**](EmpresaConfigNfse.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="consultarEmpresa"></a>
# **consultarEmpresa**
> Empresa consultarEmpresa(cpfCnpj)

Consultar empresa

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      Empresa result = apiInstance.consultarEmpresa(cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#consultarEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

[**Empresa**](Empresa.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="criarEmpresa"></a>
# **criarEmpresa**
> Empresa criarEmpresa(body)

Cadastrar empresa

Cadastre uma nova empresa (emitente ou prestador) à sua conta.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    Empresa body = new Empresa(); // Empresa | 
    try {
      Empresa result = apiInstance.criarEmpresa(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#criarEmpresa");
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
| **body** | [**Empresa**](Empresa.md)|  | |

### Return type

[**Empresa**](Empresa.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="enviarCertificadoEmpresa"></a>
# **enviarCertificadoEmpresa**
> EmpresaCertificado enviarCertificadoEmpresa(cpfCnpj, input)

Upload de certificado

Cadastre ou atualize um certificado digital e vincule a sua empresa, para que possa iniciar a emissão de notas.  * Utilize o &#x60;content-type&#x60; igual a &#x60;multipart/form-data&#x60;.  * No parâmetro &#x60;file&#x60;, envie o binário do arquivo (.pfx ou .p12) do certificado digital.  * No parâmetro &#x60;password&#x60;, envie a senha do certificado.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    File input = new File("/path/to/file"); // File | 
    try {
      EmpresaCertificado result = apiInstance.enviarCertificadoEmpresa(cpfCnpj, input);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#enviarCertificadoEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **input** | **File**|  | [optional] |

### Return type

[**EmpresaCertificado**](EmpresaCertificado.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="enviarLogotipoEmpresa"></a>
# **enviarLogotipoEmpresa**
> enviarLogotipoEmpresa(cpfCnpj, input)

Enviar logotipo

Cadastre ou atualize um logotipo e vincule a sua empresa.    **Restrições:**  * Tipos de mídia (MIME) suportados: &#x60;image/png&#x60; e &#x60;image/jpeg&#x60;  * Tamanho máximo do arquivo: 200 KB    **Cenários de uso:**  * Quero que minhas notas sejam impressas com esse logotipo.  * Quero trocar o logotipo utilizado em minhas impressões.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    File input = new File("/path/to/file"); // File | 
    try {
      apiInstance.enviarLogotipoEmpresa(cpfCnpj, input);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#enviarLogotipoEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |
| **input** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |

<a id="excluirCertificadoEmpresa"></a>
# **excluirCertificadoEmpresa**
> excluirCertificadoEmpresa(cpfCnpj)

Deletar certificado

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      apiInstance.excluirCertificadoEmpresa(cpfCnpj);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#excluirCertificadoEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |

<a id="excluirEmpresa"></a>
# **excluirEmpresa**
> excluirEmpresa(cpfCnpj)

Deletar empresa

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      apiInstance.excluirEmpresa(cpfCnpj);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#excluirEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |

<a id="excluirLogotipoEmpresa"></a>
# **excluirLogotipoEmpresa**
> excluirLogotipoEmpresa(cpfCnpj)

Deletar logotipo

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    String cpfCnpj = "cpfCnpj_example"; // String | CPF ou CNPJ da empresa.  Utilize o valor sem máscara.
    try {
      apiInstance.excluirLogotipoEmpresa(cpfCnpj);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#excluirLogotipoEmpresa");
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
| **cpfCnpj** | **String**| CPF ou CNPJ da empresa.  Utilize o valor sem máscara. | |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |

<a id="listarEmpresas"></a>
# **listarEmpresas**
> EmpresaListagem listarEmpresas($top, $skip, $inlinecount, cpfCnpj)

Listar empresas

Retorna a lista das empresas associadas à sua conta. As empresas são retornadas ordenadas pela data da criação, com as mais recentes aparecendo primeiro.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmpresaApi;

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

    EmpresaApi apiInstance = new EmpresaApi(defaultClient);
    Integer $top = 10; // Integer | Limite no número de objetos a serem retornados pela API, entre 1 e 100.
    Integer $skip = 0; // Integer | Quantidade de objetos que serão ignorados antes da lista começar a ser retornada.
    Boolean $inlinecount = false; // Boolean | Inclui no JSON de resposta, na propriedade `@count`, o número total de registros que o filtro retornaria, independente dos filtros de paginação.
    String cpfCnpj = "cpfCnpj_example"; // String | Filtrar pelo CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*.
    try {
      EmpresaListagem result = apiInstance.listarEmpresas($top, $skip, $inlinecount, cpfCnpj);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpresaApi#listarEmpresas");
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
| **$top** | **Integer**| Limite no número de objetos a serem retornados pela API, entre 1 e 100. | [optional] [default to 10] |
| **$skip** | **Integer**| Quantidade de objetos que serão ignorados antes da lista começar a ser retornada. | [optional] [default to 0] |
| **$inlinecount** | **Boolean**| Inclui no JSON de resposta, na propriedade &#x60;@count&#x60;, o número total de registros que o filtro retornaria, independente dos filtros de paginação. | [optional] [default to false] |
| **cpfCnpj** | **String**| Filtrar pelo CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*. | [optional] |

### Return type

[**EmpresaListagem**](EmpresaListagem.md)

### Authorization

[jwt](../README.md#jwt), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

