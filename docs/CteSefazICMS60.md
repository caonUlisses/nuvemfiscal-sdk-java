

# CteSefazICMS60

Tributação pelo ICMS60 - ICMS cobrado por substituição tributária.Responsabilidade do recolhimento do ICMS atribuído ao tomador ou 3º por ST.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CST** | **String** | Classificação Tributária do Serviço.  * 60 - ICMS cobrado por substituição tributária |  |
|**vBCSTRet** | **BigDecimal** | Valor da BC do ICMS ST retido.  Valor do frete sobre o qual será calculado o ICMS a ser substituído na Prestação. |  |
|**vICMSSTRet** | **BigDecimal** | Valor do ICMS ST retido.  Resultado da multiplicação do “vBCSTRet” x “pICMSSTRet” - que será valor do ICMS a ser retido pelo Substituto. Podendo o valor do ICMS a ser retido efetivamente, sofrer ajustes conforme a opção tributaria do transportador substituído. |  |
|**pICMSSTRet** | **BigDecimal** | Alíquota do ICMS.  Percentual de Alíquota incidente na prestação de serviço de transporte. |  |
|**vCred** | **BigDecimal** | Valor do Crédito outorgado/Presumido.  Preencher somente quando o transportador substituído, for optante pelo crédito outorgado previsto no Convênio 106/96 e corresponde ao percentual de 20%% do valor do ICMS ST retido. |  [optional] |
|**vICMSDeson** | **BigDecimal** | Valor do ICMS de desoneração. |  [optional] |
|**cBenef** | **String** | Código de Benefício Fiscal na UF.  Código de Benefício Fiscal utilizado pela UF. |  [optional] |



