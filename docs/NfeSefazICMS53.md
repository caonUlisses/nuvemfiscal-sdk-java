

# NfeSefazICMS53

Tributação monofásica sobre combustíveis com recolhimento diferido.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orig** | **Integer** | Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%. |  |
|**CST** | **String** | Tributção pelo ICMS  * 53 - Tributação monofásica sobre combustíveis com recolhimento diferido |  |
|**qBCMono** | **BigDecimal** | Quantidade tributada. |  [optional] |
|**adRemICMS** | **BigDecimal** | Alíquota ad rem do imposto. |  [optional] |
|**vICMSMonoOp** | **BigDecimal** | Valor do ICMS da operação. |  [optional] |
|**pDif** | **BigDecimal** | Percentual do diferemento. |  [optional] |
|**vICMSMonoDif** | **BigDecimal** | Valor do ICMS diferido. |  [optional] |
|**vICMSMono** | **BigDecimal** | Valor do ICMS próprio devido. |  [optional] |
|**qBCMonoDif** | **BigDecimal** | Quantidade tributada diferida.  OBS: Campo revogado pela NT2023.001v1.20 |  [optional] |
|**adRemICMSDif** | **BigDecimal** | Alíquota ad rem do imposto diferido.  OBS: Campo revogado pela NT2023.001v1.20 |  [optional] |



