/*
 * API Nuvem Fiscal
 * API para automação comercial e documentos fiscais.
 *
 * The version of the OpenAPI document: 2.44.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.com.caonulisses.nuvemfiscalsdk.api;

import io.github.com.caonulisses.nuvemfiscalsdk.ApiCallback;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiClient;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.ApiResponse;
import io.github.com.caonulisses.nuvemfiscalsdk.Configuration;
import io.github.com.caonulisses.nuvemfiscalsdk.Pair;
import io.github.com.caonulisses.nuvemfiscalsdk.ProgressRequestBody;
import io.github.com.caonulisses.nuvemfiscalsdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.com.caonulisses.nuvemfiscalsdk.model.CepEndereco;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CepApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CepApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CepApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for consultarCep
     * @param cep CEP sem máscara. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call consultarCepCall(String cep, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cep/{Cep}"
            .replace("{" + "Cep" + "}", localVarApiClient.escapeString(cep.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "jwt", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call consultarCepValidateBeforeCall(String cep, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'cep' is set
        if (cep == null) {
            throw new ApiException("Missing the required parameter 'cep' when calling consultarCep(Async)");
        }

        return consultarCepCall(cep, _callback);

    }

    /**
     * Consultar endereço através do CEP
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#cep-consultas\&quot;&gt;cep-consultas&lt;/a&gt;  - Consumo: 1 unidade requisição.
     * @param cep CEP sem máscara. (required)
     * @return CepEndereco
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public CepEndereco consultarCep(String cep) throws ApiException {
        ApiResponse<CepEndereco> localVarResp = consultarCepWithHttpInfo(cep);
        return localVarResp.getData();
    }

    /**
     * Consultar endereço através do CEP
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#cep-consultas\&quot;&gt;cep-consultas&lt;/a&gt;  - Consumo: 1 unidade requisição.
     * @param cep CEP sem máscara. (required)
     * @return ApiResponse&lt;CepEndereco&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CepEndereco> consultarCepWithHttpInfo(String cep) throws ApiException {
        okhttp3.Call localVarCall = consultarCepValidateBeforeCall(cep, null);
        Type localVarReturnType = new TypeToken<CepEndereco>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Consultar endereço através do CEP (asynchronously)
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#cep-consultas\&quot;&gt;cep-consultas&lt;/a&gt;  - Consumo: 1 unidade requisição.
     * @param cep CEP sem máscara. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call consultarCepAsync(String cep, final ApiCallback<CepEndereco> _callback) throws ApiException {

        okhttp3.Call localVarCall = consultarCepValidateBeforeCall(cep, _callback);
        Type localVarReturnType = new TypeToken<CepEndereco>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
