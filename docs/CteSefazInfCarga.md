

# CteSefazInfCarga

Informações da Carga do CT-e.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vCarga** | **BigDecimal** | Valor total da carga.  Dever ser informado para todos os modais, com exceção para o Dutoviário. |  [optional] |
|**proPred** | **String** | Produto predominante.  Informar a descrição do produto predominante. |  |
|**xOutCat** | **String** | Outras características da carga.  \&quot;FRIA\&quot;, \&quot;GRANEL\&quot;, \&quot;REFRIGERADA\&quot;, \&quot;Medidas: 12X12X12\&quot;. |  [optional] |
|**infQ** | [**List&lt;CteSefazInfQ&gt;**](CteSefazInfQ.md) |  |  |
|**vCargaAverb** | **BigDecimal** | Valor da Carga para efeito de averbação.  Normalmente igual ao valor declarado da mercadoria, diferente por exemplo, quando a mercadoria transportada é isenta de tributos nacionais para exportação, onde é preciso averbar um valor maior, pois no caso de indenização, o valor a ser pago será maior. |  [optional] |



