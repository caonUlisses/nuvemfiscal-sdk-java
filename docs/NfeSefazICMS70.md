

# NfeSefazICMS70

Tributação pelo ICMS  * 70 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orig** | **Integer** | Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%. |  |
|**CST** | **String** | Tributção pelo ICMS  * 70 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária |  |
|**modBC** | **Integer** | Modalidade de determinação da BC do ICMS:  * 0 - Margem Valor Agregado (%%)  * 1 - Pauta (valor)  * 2 - Preço Tabelado Máximo (valor)  * 3 - Valor da Operação |  |
|**pRedBC** | **BigDecimal** | Percentual de redução da BC. |  |
|**vBC** | **BigDecimal** | Valor da BC do ICMS. |  |
|**pICMS** | **BigDecimal** | Alíquota do ICMS. |  |
|**vICMS** | **BigDecimal** | Valor do ICMS. |  |
|**vBCFCP** | **BigDecimal** | Valor da Base de cálculo do FCP. |  [optional] |
|**pFCP** | **BigDecimal** | Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP). |  [optional] |
|**vFCP** | **BigDecimal** | Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP). |  [optional] |
|**modBCST** | **Integer** | Modalidade de determinação da BC do ICMS ST:  * 0 - Preço tabelado ou máximo  sugerido  * 1 - Lista Negativa (valor)  * 2 - Lista Positiva (valor)  * 3 - Lista Neutra (valor)  * 4 - Margem Valor Agregado (%%)  * 5 - Pauta (valor)  * 6 - Valor da Operação |  |
|**pMVAST** | **BigDecimal** | Percentual da Margem de Valor Adicionado ICMS ST. |  [optional] |
|**pRedBCST** | **BigDecimal** | Percentual de redução da BC ICMS ST. |  [optional] |
|**vBCST** | **BigDecimal** | Valor da BC do ICMS ST. |  |
|**pICMSST** | **BigDecimal** | Alíquota do ICMS ST. |  |
|**vICMSST** | **BigDecimal** | Valor do ICMS ST. |  |
|**vBCFCPST** | **BigDecimal** | Valor da Base de cálculo do FCP retido por substituição tributária. |  [optional] |
|**pFCPST** | **BigDecimal** | Percentual de FCP retido por substituição tributária. |  [optional] |
|**vFCPST** | **BigDecimal** | Valor do FCP retido por substituição tributária. |  [optional] |
|**vICMSDeson** | **BigDecimal** | Valor do ICMS de desoneração. |  [optional] |
|**motDesICMS** | **Integer** | Motivo da desoneração do ICMS:3-Uso na agropecuária  * 9 - Outros  * 12 - Fomento agropecuário |  [optional] |
|**indDeduzDeson** | **Integer** | Indica se o valor do ICMS desonerado (vICMSDeson) deduz do valor do item (vProd):  * 0 - Valor do ICMS desonerado (vICMSDeson) não deduz do valor do item (vProd) / total da NF-e  * 1 - Valor do ICMS desonerado (vICMSDeson) deduz do valor do item (vProd) / total da NF-e |  [optional] |
|**vICMSSTDeson** | **BigDecimal** | Valor do ICMS-ST desonerado. |  [optional] |
|**motDesICMSST** | **Integer** | Motivo da desoneração do ICMS-ST: 3-Uso na agropecuária  * 9 - Outros  * 12 - Fomento agropecuário |  [optional] |



