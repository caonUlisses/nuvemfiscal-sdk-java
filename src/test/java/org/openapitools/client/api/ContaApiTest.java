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

import io.github.com.caonulisses.nuvemfiscalsdk.ApiException;
import io.github.com.caonulisses.nuvemfiscalsdk.model.ContaCota;
import io.github.com.caonulisses.nuvemfiscalsdk.model.ContaCotaListagem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContaApi
 */
@Disabled
public class ContaApiTest {

    private final ContaApi api = new ContaApi();

    /**
     * Consultar o limite de uso e o consumo de uma cota específica.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarCotaContaTest() throws ApiException {
        String nome = null;
        ContaCota response = api.consultarCotaConta(nome);
        // TODO: test validations
    }

    /**
     * Consultar os limites de uso e consumo de todas as cotas existentes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listarCotasContaTest() throws ApiException {
        ContaCotaListagem response = api.listarCotasConta();
        // TODO: test validations
    }

}
