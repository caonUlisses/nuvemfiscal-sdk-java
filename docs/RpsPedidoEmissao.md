

# RpsPedidoEmissao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referencia** | **String** | Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento. |  [optional] |
|**dataEmissao** | **OffsetDateTime** | Data e Hora de Emissão do RPS, no formato AAAA-MM-DDTHH:MM:SSTZD.  Caso não informado, será considerada a data/hora da requisição à API da Nuvem Fiscal. |  [optional] |
|**competencia** | **OffsetDateTime** | Competência do RPS, no formato AAAA-MM-DD.  Caso não informado, será considerada a data da requisição à API da Nuvem Fiscal. |  [optional] |
|**naturezaTributacao** | **Integer** | Natureza da tributação:  * 1 - Simples Nacional;  * 2 - Fixo;  * 3 - Depósito em juízo;  * 4 - Exigibilidade suspensa por decisão judicial;  * 5 - Exigibilidade suspensa por procedimento administrativo;  * 6 - Isenção parcial. |  [optional] |
|**prestador** | [**RpsIdentificacaoPrestador**](RpsIdentificacaoPrestador.md) |  |  |
|**tomador** | [**RpsDadosTomador**](RpsDadosTomador.md) |  |  |
|**intermediario** | [**RpsDadosIntermediario**](RpsDadosIntermediario.md) |  |  [optional] |
|**construcaoCivil** | [**RpsDadosConstrucaoCivil**](RpsDadosConstrucaoCivil.md) |  |  [optional] |
|**servicos** | [**List&lt;RpsDadosServico&gt;**](RpsDadosServico.md) |  |  |
|**outrasInformacoes** | **String** | Informações adicionais ao documento. |  [optional] |



