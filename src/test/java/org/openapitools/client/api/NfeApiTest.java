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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Dfe;
import org.openapitools.client.model.DfeCancelamento;
import org.openapitools.client.model.DfeCartaCorrecao;
import org.openapitools.client.model.DfeContribuinteInfCons;
import org.openapitools.client.model.DfeEvento;
import org.openapitools.client.model.DfeEventoListagem;
import org.openapitools.client.model.DfeInutilizacao;
import org.openapitools.client.model.DfeListagem;
import org.openapitools.client.model.DfeLote;
import org.openapitools.client.model.DfeLoteListagem;
import org.openapitools.client.model.DfePedidoEnvioEmail;
import org.openapitools.client.model.DfePedidoInutilizacao;
import org.openapitools.client.model.DfeSefazStatus;
import org.openapitools.client.model.DfeSincronizacao;
import org.openapitools.client.model.EmailStatusResponse;
import java.io.File;
import org.openapitools.client.model.NfePedidoCancelamento;
import org.openapitools.client.model.NfePedidoCartaCorrecao;
import org.openapitools.client.model.NfePedidoEmissao;
import org.openapitools.client.model.NfePedidoEmissaoLote;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NfeApi
 */
@Disabled
public class NfeApiTest {

    private final NfeApi api = new NfeApi();

    /**
     * Baixar PDF do cancelamento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfCancelamentoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarPdfCancelamentoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar PDF da carta de correção
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfCartaCorrecaoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarPdfCartaCorrecaoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar PDF do evento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfEventoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarPdfEventoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar PDF da inutilização
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfInutilizacaoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarPdfInutilizacaoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar PDF do DANFE
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPdfNfeTest() throws ApiException {
        String id = null;
        Boolean logotipo = null;
        Boolean nomeFantasia = null;
        String formato = null;
        String mensagemRodape = null;
        Boolean canhoto = null;
        File response = api.baixarPdfNfe(id, logotipo, nomeFantasia, formato, mensagemRodape, canhoto);
        // TODO: test validations
    }

    /**
     * Prévia do PDF do DANFE
     *
     * Através desse endpoint, é possível enviar os dados de uma NF-e e gerar uma prévia do DANFE.    Os dados de entrada são os mesmos do endpoint de emissão de NF-e (&#x60;POST /nfe&#x60;).    **Atenção**: O DANFE gerado por este endpoint é apenas para fins de visualização e não possui valor fiscal. Para a emissão de uma NF-e com valor fiscal, utilize o processo de emissão padrão descrito na documentação.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPreviaPdfNfeTest() throws ApiException {
        NfePedidoEmissao body = null;
        Boolean logotipo = null;
        Boolean nomeFantasia = null;
        String formato = null;
        String mensagemRodape = null;
        Boolean canhoto = null;
        File response = api.baixarPreviaPdfNfe(body, logotipo, nomeFantasia, formato, mensagemRodape, canhoto);
        // TODO: test validations
    }

    /**
     * Prévia do XML da NF-e
     *
     * Através desse endpoint, é possível enviar os dados de uma NF-e e gerar uma prévia do XML, sem a assinatura digital.    Os dados de entrada são os mesmos do endpoint de emissão de NF-e (&#x60;POST /nfe&#x60;).    **Atenção**: O XML gerado por este endpoint é apenas para fins de visualização e não possui valor fiscal. Para a emissão de uma NF-e com valor fiscal, utilize o processo de emissão padrão descrito na documentação.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarPreviaXmlNfeTest() throws ApiException {
        NfePedidoEmissao body = null;
        File response = api.baixarPreviaXmlNfe(body);
        // TODO: test validations
    }

    /**
     * Baixar XML do cancelamento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlCancelamentoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlCancelamentoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML da carta de correção
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlCartaCorrecaoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlCartaCorrecaoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML do evento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlEventoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlEventoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML da inutilização
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlInutilizacaoNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlInutilizacaoNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML da NF-e processada
     *
     * Utilize esse endpoint para obter o XML da nota enviado para a SEFAZ, complementado com a informação do protocolo de autorização ou denegação de uso (TAG raiz &#x60;nfeProc&#x60;).    O XML só estará disponível nesse endpoint caso a nota tenha sido autorizada ou denegada pela SEFAZ. Para obter o XML nos demais casos, utilize o endpoint &#x60;GET /nfe/{id}/xml/nota&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlNfeTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlNfe(id);
        // TODO: test validations
    }

    /**
     * Baixar XML da NF-e
     *
     * Utilize esse endpoint para obter o XML da nota enviado para a SEFAZ.    O XML estará disponível nesse endpoint mesmo em casos que a nota tenha sido rejeitada.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlNfeNotaTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlNfeNota(id);
        // TODO: test validations
    }

    /**
     * Baixar XML do Protocolo da SEFAZ
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void baixarXmlNfeProtocoloTest() throws ApiException {
        String id = null;
        File response = api.baixarXmlNfeProtocolo(id);
        // TODO: test validations
    }

    /**
     * Cancelar uma NF-e autorizada
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelarNfeTest() throws ApiException {
        String id = null;
        NfePedidoCancelamento body = null;
        DfeCancelamento response = api.cancelarNfe(id, body);
        // TODO: test validations
    }

    /**
     * Consultar o cancelamento da NF-e
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarCancelamentoNfeTest() throws ApiException {
        String id = null;
        DfeCancelamento response = api.consultarCancelamentoNfe(id);
        // TODO: test validations
    }

    /**
     * Consultar a solicitação de correção da NF-e
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarCartaCorrecaoNfeTest() throws ApiException {
        String id = null;
        DfeCartaCorrecao response = api.consultarCartaCorrecaoNfe(id);
        // TODO: test validations
    }

    /**
     * Consultar contribuinte
     *
     * Consulta o Cadastro Centralizado de Contribuintes (CCC) do ICMS da unidade federada.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarContribuinteNfeTest() throws ApiException {
        String cpfCnpj = null;
        String argumento = null;
        String documento = null;
        String uf = null;
        DfeContribuinteInfCons response = api.consultarContribuinteNfe(cpfCnpj, argumento, documento, uf);
        // TODO: test validations
    }

    /**
     * Consultar evento
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarEventoNfeTest() throws ApiException {
        String id = null;
        DfeEvento response = api.consultarEventoNfe(id);
        // TODO: test validations
    }

    /**
     * Consultar a inutilização de sequência de numeração
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarInutilizacaoNfeTest() throws ApiException {
        String id = null;
        DfeInutilizacao response = api.consultarInutilizacaoNfe(id);
        // TODO: test validations
    }

    /**
     * Consultar lote de NF-e
     *
     * Consulta os detalhes de um lote já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de lotes e a Nuvem Fiscal irá retornar as informações do lote correspondente.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarLoteNfeTest() throws ApiException {
        String id = null;
        DfeLote response = api.consultarLoteNfe(id);
        // TODO: test validations
    }

    /**
     * Consultar NF-e
     *
     * Consulta os detalhes de uma NF-e já existente. Forneça o ID único obtido de uma requisição de emissão ou de listagem de notas e a Nuvem Fiscal irá retornar as informações da nota correspondente.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarNfeTest() throws ApiException {
        String id = null;
        Dfe response = api.consultarNfe(id);
        // TODO: test validations
    }

    /**
     * Consulta do Status do Serviço na SEFAZ Autorizadora
     *
     * Consulta do status do serviço prestado pelo Portal da Secretaria de Fazenda Estadual.    A Nuvem Fiscal mantém a última consulta em cache por 5 minutos, evitando sobrecarregar desnecessariamente os servidores da SEFAZ (conforme orientação do MOC - versão 7.0, item 5.5.3). Dessa forma, você poderá chamar esse endpoint quantas vezes quiser, sem preocupar-se em ter o seu CNPJ bloqueado por consumo indevido (Rejeição 656).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consultarStatusSefazNfeTest() throws ApiException {
        String cpfCnpj = null;
        String autorizador = null;
        DfeSefazStatus response = api.consultarStatusSefazNfe(cpfCnpj, autorizador);
        // TODO: test validations
    }

    /**
     * Solicitar correção da NF-e
     *
     * É possível enviar até 20 correções diferentes, sendo que será válido sempre a última correção enviada.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void criarCartaCorrecaoNfeTest() throws ApiException {
        String id = null;
        NfePedidoCartaCorrecao body = null;
        DfeCartaCorrecao response = api.criarCartaCorrecaoNfe(id, body);
        // TODO: test validations
    }

    /**
     * Emitir lote de NF-e
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por NF-e.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emitirLoteNfeTest() throws ApiException {
        NfePedidoEmissaoLote body = null;
        DfeLote response = api.emitirLoteNfe(body);
        // TODO: test validations
    }

    /**
     * Emitir NF-e
     *
     * Este endpoint permite a emissão de Notas Fiscais Eletrônicas (NF-e).  A solicitação deve ser feita enviando os dados necessários para a  emissão de uma NF-e.     A estrutura do JSON utilizado na solicitação segue a hierarquia e  nomenclatura de campos definidos no &lt;a href&#x3D;\&quot;https://www.nfe.fazenda.gov.br/portal/principal.aspx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;  Manual de Orientação ao Contribuinte (MOC)&lt;/a&gt;.  Esta conformidade visa facilitar a integração de novos usuários que já  possuem familiaridade com o padrão, além de permitir a resolução de  dúvidas diretamente no MOC, com um profissional de contabilidade  habilitado ou em outras fontes confiáveis que tratam do mesmo assunto.    **Comportamento Assíncrono**    A resposta desse endpoint inclui a propriedade *status* no JSON.  Caso o valor retornado seja *pendente*, significa que a solicitação está  sendo realizada de forma assíncrona pela API. Nesse caso, o usuário deverá  adotar um fluxo que consiste em requisitar periodicamente o endpoint  &lt;a href&#x3D;\&quot;#tag/Nfe/operation/ConsultarNfe\&quot;&gt;Consultar NF-e&lt;/a&gt; até que  seja retornado um status indicando o fim da emissão.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emitirNfeTest() throws ApiException {
        NfePedidoEmissao body = null;
        Dfe response = api.emitirNfe(body);
        // TODO: test validations
    }

    /**
     * Enviar e-mail
     *
     * Envia o XML e PDF da nota via email.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enviarEmailNfeTest() throws ApiException {
        String id = null;
        DfePedidoEnvioEmail body = null;
        EmailStatusResponse response = api.enviarEmailNfe(id, body);
        // TODO: test validations
    }

    /**
     * Inutilizar uma sequência de numeração de NF-e
     *
     * **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void inutilizarNumeracaoNfeTest() throws ApiException {
        DfePedidoInutilizacao body = null;
        DfeInutilizacao response = api.inutilizarNumeracaoNfe(body);
        // TODO: test validations
    }

    /**
     * Listar eventos
     *
     * Retorna a lista de eventos vinculados a um documento fiscal de acordo com os critérios de busca utilizados. Os eventos são retornados ordenados pela data da criação, com as mais recentes aparecendo primeiro.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listarEventosNfeTest() throws ApiException {
        String dfeId = null;
        Integer $top = null;
        Integer $skip = null;
        Boolean $inlinecount = null;
        DfeEventoListagem response = api.listarEventosNfe(dfeId, $top, $skip, $inlinecount);
        // TODO: test validations
    }

    /**
     * Listar lotes de NF-e
     *
     * Retorna a lista dos lotes de acordo com os critérios de busca utilizados. Os lotes são retornados ordenados pela data da criação, com os mais recentes aparecendo primeiro.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listarLotesNfeTest() throws ApiException {
        String cpfCnpj = null;
        String ambiente = null;
        Integer $top = null;
        Integer $skip = null;
        Boolean $inlinecount = null;
        String referencia = null;
        DfeLoteListagem response = api.listarLotesNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia);
        // TODO: test validations
    }

    /**
     * Listar NF-e
     *
     * Retorna a lista de notas de acordo com os critérios de busca utilizados. As notas são retornadas ordenadas pela data da criação, com as mais recentes aparecendo primeiro.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listarNfeTest() throws ApiException {
        String cpfCnpj = null;
        String ambiente = null;
        Integer $top = null;
        Integer $skip = null;
        Boolean $inlinecount = null;
        String referencia = null;
        String chave = null;
        String serie = null;
        DfeListagem response = api.listarNfe(cpfCnpj, ambiente, $top, $skip, $inlinecount, referencia, chave, serie);
        // TODO: test validations
    }

    /**
     * Sincroniza dados na NF-e a partir da SEFAZ
     *
     * Realiza a sincronização dos dados a partir da consulta da situação atual da NF-e na Base de Dados do Portal da Secretaria de Fazenda Estadual.    **Cenários de uso**:  * Sincronizar uma nota que se encontra com o status &#x60;erro&#x60; na Nuvem Fiscal, mas está autorizada na SEFAZ (útil em casos de erros de transmissão com a SEFAZ, como instabilidades e timeouts).  * Sincronizar uma nota que se encontra com o status &#x60;autorizado&#x60;na Nuvem Fiscal, mas está cancelada na SEFAZ.  * Sincronizar todos os eventos de Cancelamento, Carta de Correção e EPEC de uma nota que porventura não tenham sido feitos a partir da Nuvem Fiscal.    **Informações adicionais**:  - Cota: &lt;a href&#x3D;\&quot;/docs/limites#dfe-eventos\&quot;&gt;dfe-eventos&lt;/a&gt;  - Consumo: 1 unidade por evento sincronizado ou requisição.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sincronizarNfeTest() throws ApiException {
        String id = null;
        DfeSincronizacao response = api.sincronizarNfe(id);
        // TODO: test validations
    }

}
