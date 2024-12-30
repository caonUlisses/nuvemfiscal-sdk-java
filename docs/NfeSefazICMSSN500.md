

# NfeSefazICMSSN500

Tributação do ICMS pelo SIMPLES NACIONAL,CRT=1 - Simples Nacional e CSOSN=500 (v.2.0).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orig** | **Integer** | Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%. |  |
|**CSOSN** | **String** | * 500 - ICMS cobrado anterirmente por substituição tributária (substituído) ou por antecipação  (v.2.0). |  |
|**vBCSTRet** | **BigDecimal** | Valor da BC do ICMS ST retido anteriormente (v2.0). |  [optional] |
|**pST** | **BigDecimal** | Aliquota suportada pelo consumidor final. |  [optional] |
|**vICMSSubstituto** | **BigDecimal** | Valor do ICMS próprio do substituto. |  [optional] |
|**vICMSSTRet** | **BigDecimal** | Valor do ICMS ST retido anteriormente  (v2.0). |  [optional] |
|**vBCFCPSTRet** | **BigDecimal** | Valor da Base de cálculo do FCP retido anteriormente. |  [optional] |
|**pFCPSTRet** | **BigDecimal** | Percentual de FCP retido anteriormente por substituição tributária. |  [optional] |
|**vFCPSTRet** | **BigDecimal** | Valor do FCP retido por substituição tributária. |  [optional] |
|**pRedBCEfet** | **BigDecimal** | Percentual de redução da base de cálculo efetiva. |  [optional] |
|**vBCEfet** | **BigDecimal** | Valor da base de cálculo efetiva. |  [optional] |
|**pICMSEfet** | **BigDecimal** | Alíquota do ICMS efetiva. |  [optional] |
|**vICMSEfet** | **BigDecimal** | Valor do ICMS efetivo. |  [optional] |


