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
import io.github.com.caonulisses.nuvemfiscalsdk.model.Dfe;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeCancelamento;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeEvento;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeListagem;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeLote;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeLoteListagem;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeSefazStatus;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeSincronizacao;
import java.io.File;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeEncerramento;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeInclusaoCondutor;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeInclusaoDfe;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeNaoEncerrados;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfePedidoCancelamento;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfePedidoEmissao;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfePedidoEmissaoLote;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfePedidoEncerramento;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfePedidoInclusaoCondutor;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfePedidoInclusaoDfe;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MdfeApi
 */
@Disabled
public class MdfeApiTest {

    private final MdfeApi api = new MdfeApi();

    /**
     * Baixar PDF do cancelamento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfCancelamentoMdfeTest() throws ApiException {
        String id = null;
        File response = api.baixarPdfCancelamentoMdfe(id);
        // TODO: test validations
    }

    /**
     * Baixar PDF do encerramento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfEncerramentoMdfeTest() throws ApiException {
        String id = null;
        File response = api.baixarPdfEncerramentoMdfe(id);
        // TODO: test validations
    }

    /**
     * Baixar PDF do evento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfEventoMdfeTest() throws ApiException {
        String id = null;
        File response = api.baixarPdfEventoMdfe(id);
        // TODO: test validations
    }

    /**
     * Baixar PDF do DAMDFE
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfMdfeTest() throws ApiException {
        String id = null;
        Boolean logotipo = null;
        File response = api.baixarPdfMdfe(id, logotipo);
        // TODO: test validations
    }

    /**
     * Baixar XML do cancelamento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlCancelamentoMdfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlCancelamentoMdfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML do encerramento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlEncerramentoMdfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlEncerramentoMdfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML do evento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlEventoMdfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlEventoMdfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML do MDF-e processado
     *
     * Utilize esse endpoint para obter o XML do manifesto enviado para a SEFAZ, complementado com a informação do protocolo de autorização ou denegação de uso (TAG raiz &#x60;mdfeProc&#x60;).    O XML só estará disponível nesse endpoint caso o manifesto tenha sido autorizado ou denegado pela SEFAZ. Para obter o XML nos demais casos, utilize o endpoint &#x60;GET /mdfe/{id}/xml/manifesto&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlMdfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlMdfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML do MDF-e
     *
     * Utilize esse endpoint para obter o XML do manifesto enviado para a SEFAZ.    O XML estará disponível nesse endpoint mesmo em casos que o manifesto tenha sido rejeitado.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlMdfeManifestoTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlMdfeManifesto(id);
        // TODO: test validations
    }

    /**
     * Baixar XML do Protocolo da SEFAZ
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlMdfeProtocoloTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlMdfeProtocolo(id);
        // TODO: test validations
    }

    /**
     * Cancelar um MDF-e autorizado
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelarMdfeTest() throws ApiException {
        String id = null;
        MdfePedidoCancelamento body = null;
        DfeCancelamento response = api.cancelarMdfe(id, body);
        // TODO: test validations
    }

    /**
     * Consultar o cancelamento do MDF-e
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarCancelamentoMdfeTest() throws ApiException {
        String id = null;
        DfeCancelamento response = api.consultarCancelamentoMdfe(id);
        // TODO: test validations
    }

    /**
     * Consultar encerramento do MDF-e
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarEncerramentoMdfeTest() throws ApiException {
        String id = null;
        MdfeEncerramento response = api.consultarEncerramentoMdfe(id);
        // TODO: test validations
    }

    /**
     * Consultar evento do MDF-e
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarEventoMdfeTest() throws ApiException {
        String id = null;
        DfeEvento response = api.consultarEventoMdfe(id);
        // TODO: test validations
    }

    /**
     * Consultar lote de MDF-e
     *
     * Consulta os detalhes de um lote já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de lotes e a Nuvem Fiscal irá retornar as informações do lote correspondente.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarLoteMdfeTest() throws ApiException {
        String id = null;
        DfeLote response = api.consultarLoteMdfe(id);
        // TODO: test validations
    }

    /**
     * Consultar manifesto
     *
     * Consulta os detalhes de um manifesto já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de manifestos e a Nuvem Fiscal irá retornar as informações do manifesto correspondente.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarMdfeTest() throws ApiException {
        String id = null;
        Dfe response = api.consultarMdfe(id);
        // TODO: test validations
    }

    /**
     * Consulta MDF-e não encerrados
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarMdfeNaoEncerradosTest() throws ApiException {
        String cpfCnpj = null;
        MdfeNaoEncerrados response = api.consultarMdfeNaoEncerrados(cpfCnpj);
        // TODO: test validations
    }

    /**
     * Consulta do Status do Serviço na SEFAZ Autorizadora
     *
     * Consulta do status do serviço prestado pelo Portal da Secretaria de Fazenda Estadual.    A Nuvem Fiscal mantém a última consulta em cache por 5 minutos, evitando sobrecarregar desnecessariamente os servidores da SEFAZ (conforme orientação do MOC - versão 3.0.0a, item 4.6.3). Dessa forma, você poderá chamar esse endpoint quantas vezes quiser, sem preocupar-se em ter o seu CNPJ bloqueado por consumo indevido (Rejeição 656).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarStatusSefazMdfeTest() throws ApiException {
        String cpfCnpj = null;
        String autorizador = null;
        DfeSefazStatus response = api.consultarStatusSefazMdfe(cpfCnpj, autorizador);
        // TODO: test validations
    }

    /**
     * Emitir lote de MDF-e
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por MDF-e.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emitirLoteMdfeTest() throws ApiException {
        MdfePedidoEmissaoLote body = null;
        DfeLote response = api.emitirLoteMdfe(body);
        // TODO: test validations
    }

    /**
     * Emitir MDF-e
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emitirMdfeTest() throws ApiException {
        MdfePedidoEmissao body = null;
        Dfe response = api.emitirMdfe(body);
        // TODO: test validations
    }

    /**
     * Encerrar um MDF-e autorizado
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void encerrarMdfeTest() throws ApiException {
        String id = null;
        MdfePedidoEncerramento body = null;
        MdfeEncerramento response = api.encerrarMdfe(id, body);
        // TODO: test validations
    }

    /**
     * Incluir um condutor em um MDF-e autorizado
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void incluirCondutorMdfeTest() throws ApiException {
        String id = null;
        MdfePedidoInclusaoCondutor body = null;
        MdfeInclusaoCondutor response = api.incluirCondutorMdfe(id, body);
        // TODO: test validations
    }

    /**
     * Incluir um DF-e em um MDF-e autorizado
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void incluirDfeMdfeTest() throws ApiException {
        String id = null;
        MdfePedidoInclusaoDfe body = null;
        MdfeInclusaoDfe response = api.incluirDfeMdfe(id, body);
        // TODO: test validations
    }

    /**
     * Listar lotes de MDF-e
     *
     * Retorna a lista dos lotes de acordo com os critérios de busca utilizados. Os lotes são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listarLotesMdfeTest() throws ApiException {
        String cpfCnpj = null;
        String ambiente = null;
        Integer $top = null;
        Integer $skip = null;
        Boolean $inlinecount = null;
        String referencia = null;
        DfeLoteListagem response = api.listarLotesMdfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia);
        // TODO: test validations
    }

    /**
     * Listar MDF-e
     *
     * Retorna a lista de manifestos de acordo com os critérios de busca utilizados. Os manifestos são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listarMdfeTest() throws ApiException {
        String cpfCnpj = null;
        String ambiente = null;
        Integer $top = null;
        Integer $skip = null;
        Boolean $inlinecount = null;
        String referencia = null;
        String chave = null;
        String serie = null;
        DfeListagem response = api.listarMdfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie);
        // TODO: test validations
    }

    /**
     * Sincroniza dados no MDF-e a partir da SEFAZ
     *
     * Realiza a sincronização dos dados a partir da consulta da situação atual da MDF-e na Base de Dados do Portal da Secretaria de Fazenda Estadual.    **Cenários de uso**:  * Sincronizar um manifesto que se encontra com o status &#x60;erro&#x60; na Nuvem Fiscal, mas está autorizado na SEFAZ (útil em casos de erros de transmissão com a SEFAZ, como instabilidades e timeouts).  * Sincronizar um manifesto que se encontra com o status &#x60;autorizado&#x60;na Nuvem Fiscal, mas está cancelado ou encerrado na SEFAZ.  * Sincronizar todos os eventos de Cancelamento, Encerramento, Inclusão de condutor e Inclusão de DF-e de um manifesto que porventura não tenham sido feitos a partir da Nuvem Fiscal.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por evento sincronizado ou requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sincronizarMdfeTest() throws ApiException {
        String id = null;
        DfeSincronizacao response = api.sincronizarMdfe(id);
        // TODO: test validations
    }

}
