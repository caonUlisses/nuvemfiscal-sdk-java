

# RpsDadosServico


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issRetido** | **Boolean** | Reter ISSQN. |  [optional] |
|**responsavelRetencao** | **Integer** | Responsável pela retenção:  * 0 - Prestador;  * 1 - Tomador;  * 2 - Intermediário. |  [optional] |
|**itemListaServico** | **String** | Código do item da lista de serviço, geralmente segue a LC116, podendo variar de acordo com a prefeitura.    Você pode encontrar esse dado no portal da prefeitura, em uma nota emitida ou junto ao contador. |  |
|**codigoCnae** | **String** | Código CNAE (Classificação Nacional de Atividades Econômicas). |  [optional] |
|**codigoTributacaoMunicipio** | **String** | Código de tributação do município. |  [optional] |
|**discriminacao** | **String** | Detalhamento do serviço prestado. |  |
|**codigoMunicipio** | **String** | Código IBGE do município de prestação do serviço.  Caso não informado, será considerado o município do prestador. |  [optional] |
|**codigoPais** | **String** | Código do país de prestação do serviço. |  [optional] |
|**tipoTributacao** | **Integer** | Tipo de Tributação do Serviço:  * 1 - Isento de ISS  * 2 - Imune  * 3 - Não Incidência no Município  * 4 - Não Tributável  * 5 - Retido  * 6 - Tributável Dentro do Município  * 7 - Tributável Fora do Município  * 8 - Tributável Dentro do Município pelo tomador |  [optional] |
|**exigibilidadeIss** | **Integer** | Exigibilidade do ISS:  * 1 - Exigível  * 2 - Não Incidência  * 3 - Isenção  * 4 - Exportação  * 5 - Imunidade  * 6 - Suspenso por Decisão Judicial  * 7 - Suspenso por Processo Administrativo |  [optional] |
|**codigoMunicipioIncidencia** | **String** | Código IBGE do município de incidência do ISSQN. |  [optional] |
|**numeroProcesso** | **String** | Número do Processo de Suspensão da Exigibilidade. |  [optional] |
|**unidade** | **String** | Unidade do serviço prestado. |  [optional] |
|**quantidade** | **BigDecimal** | Quantidade dos serviços prestados. |  [optional] |
|**valores** | [**RpsServicoValores**](RpsServicoValores.md) |  |  |



