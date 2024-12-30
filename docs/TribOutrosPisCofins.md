

# TribOutrosPisCofins

Grupo de informações dos tributos PIS/COFINS.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CST** | **String** | Código de Situação Tributária do PIS/COFINS (CST):  * 00 - Nenhum  * 01 - Operação Tributável com Alíquota Básica  * 02 - Operação Tributável com Alíquota Diferenciada  * 03 - Operação Tributável com Alíquota por Unidade de Medida de Produto  * 04 - Operação Tributável monofásica - Revenda a Alíquota Zero  * 05 - Operação Tributável por Substituição Tributária  * 06 - Operação Tributável a Alíquota Zero  * 07 - Operação Tributável da Contribuição  * 08 - Operação sem Incidência da Contribuição  * 09 - Operação com Suspensão da Contribuição |  |
|**vBCPisCofins** | **BigDecimal** | Valor da Base de Cálculo do PIS/COFINS (R$). |  [optional] |
|**pAliqPis** | **BigDecimal** | Valor da Alíquota do PIS (%%). |  [optional] |
|**pAliqCofins** | **BigDecimal** | Valor da Alíquota da COFINS (%%). |  [optional] |
|**vPis** | **BigDecimal** | Valor monetário do PIS (R$). |  [optional] |
|**vCofins** | **BigDecimal** | Valor monetário do COFINS (R$). |  [optional] |
|**tpRetPisCofins** | **Integer** | Tipo de retencao do Pis/Cofins:  * 1 - Retido  * 2 - Não Retido |  [optional] |



