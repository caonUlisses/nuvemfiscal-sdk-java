

# NfeSefazICMS51

Tributção pelo ICMS 51 - Diferimento. A exigência do preenchimento das informações do ICMS diferido fica à critério de cada UF.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orig** | **Integer** | Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%. |  |
|**CST** | **String** | Tributação pelo ICMS 51 - Tributação com Diferimento. |  |
|**modBC** | **Integer** | Modalidade de determinação da BC do ICMS:  * 0 - Margem Valor Agregado (%%)  * 1 - Pauta (valor)  * 2 - Preço Tabelado Máximo (valor)  * 3 - Valor da Operação |  [optional] |
|**pRedBC** | **BigDecimal** | Percentual de redução da BC. |  [optional] |
|**cBenefRBC** | **String** | Código de Benefício Fiscal na UF aplicado ao item quando houver RBC. |  [optional] |
|**vBC** | **BigDecimal** | Valor da BC do ICMS. |  [optional] |
|**pICMS** | **BigDecimal** | Alíquota do imposto. |  [optional] |
|**vICMSOp** | **BigDecimal** | Valor do ICMS da Operação. |  [optional] |
|**pDif** | **BigDecimal** | Percentual do diferemento. |  [optional] |
|**vICMSDif** | **BigDecimal** | Valor do ICMS da diferido. |  [optional] |
|**vICMS** | **BigDecimal** | Valor do ICMS. |  [optional] |
|**vBCFCP** | **BigDecimal** | Valor da Base de cálculo do FCP. |  [optional] |
|**pFCP** | **BigDecimal** | Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP). |  [optional] |
|**vFCP** | **BigDecimal** | Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP). |  [optional] |
|**pFCPDif** | **BigDecimal** | Percentual do diferimento do ICMS relativo ao Fundo de Combate à Pobreza (FCP). |  [optional] |
|**vFCPDif** | **BigDecimal** | Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) diferido. |  [optional] |
|**vFCPEfet** | **BigDecimal** | Valor efetivo do ICMS relativo ao Fundo de Combate à Pobreza (FCP). |  [optional] |



