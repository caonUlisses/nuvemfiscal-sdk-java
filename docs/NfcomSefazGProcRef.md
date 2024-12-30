

# NfcomSefazGProcRef

Grupo Processo referenciado.  Este grupo somente deverá ser preenchido quando houver processo judicial ou administrativo que altere valores.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vItem** | **BigDecimal** | Valor unitário do item.  Informar o valor sem a influência da decisão judicial/administrativa. |  |
|**qFaturada** | **BigDecimal** | Quantidade Faturada.  Informar a quantidade de comercialização do produto . |  |
|**vProd** | **BigDecimal** | Valor total do item. |  |
|**vDesc** | **BigDecimal** | Valor do Desconto. |  [optional] |
|**vOutro** | **BigDecimal** | Outras despesas acessórias. |  [optional] |
|**indDevolucao** | **Integer** | Indicador de devolução do valor do item.  * 1 - Devolução do valor do item |  [optional] |
|**vBC** | **BigDecimal** | Valor da BC do ICMS. |  [optional] |
|**pICMS** | **BigDecimal** | Alíquota do ICMS. |  [optional] |
|**vICMS** | **BigDecimal** | Valor do ICMS. |  [optional] |
|**vPIS** | **BigDecimal** | Valor do PIS. |  [optional] |
|**vCOFINS** | **BigDecimal** | Valor do COFINS. |  [optional] |
|**vFCP** | **BigDecimal** | Valor do Fundo de Combate à Pobreza (FCP). |  [optional] |
|**gProc** | [**List&lt;NfcomSefazGProc&gt;**](NfcomSefazGProc.md) |  |  |



