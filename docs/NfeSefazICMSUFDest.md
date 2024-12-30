

# NfeSefazICMSUFDest

Grupo a ser informado nas vendas interestarduais para consumidor final, não contribuinte de ICMS.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vBCUFDest** | **BigDecimal** | Valor da Base de Cálculo do ICMS na UF do destinatário. |  |
|**vBCFCPUFDest** | **BigDecimal** | Valor da Base de Cálculo do FCP na UF do destinatário. |  [optional] |
|**pFCPUFDest** | **BigDecimal** | Percentual adicional inserido na alíquota interna da UF de destino, relativo ao Fundo de Combate à Pobreza (FCP) naquela UF. |  [optional] |
|**pICMSUFDest** | **BigDecimal** | Alíquota adotada nas operações internas na UF do destinatário para o produto / mercadoria. |  |
|**pICMSInter** | **BigDecimal** | Alíquota interestadual das UF envolvidas:  * 4%% alíquota interestadual para produtos importados  * 7%% para os Estados de origem do Sul e Sudeste (exceto ES), destinado para os Estados do Norte e Nordeste  ou ES  * 12%% para os demais casos. |  |
|**pICMSInterPart** | **BigDecimal** | Percentual de partilha para a UF do destinatário:  * 40%% em 2016  * 60%% em 2017  * 80%% em 2018  * 100%% a partir de 2019. |  |
|**vFCPUFDest** | **BigDecimal** | Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) da UF de destino. |  [optional] |
|**vICMSUFDest** | **BigDecimal** | Valor do ICMS de partilha para a UF do destinatário. |  |
|**vICMSUFRemet** | **BigDecimal** | Valor do ICMS de partilha para a UF do remetente. Nota: A partir de 2019, este valor será zero. |  |



