

# NfeSefazICMSST

Grupo de informação do ICMSST devido para a UF de destino, nas operações interestaduais de produtos que tiveram retenção antecipada de ICMS por ST na UF do remetente. Repasse via Substituto Tributário.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orig** | **Integer** | Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%. |  |
|**CST** | **String** | Tributção pelo ICMS  * 41 - Não Tributado  * 60 - Cobrado anteriormente por substituição tributária |  |
|**vBCSTRet** | **BigDecimal** | Informar o valor da BC do ICMS ST retido na UF remetente. |  |
|**pST** | **BigDecimal** | Aliquota suportada pelo consumidor final. |  [optional] |
|**vICMSSubstituto** | **BigDecimal** | Valor do ICMS Próprio do Substituto cobrado em operação anterior. |  [optional] |
|**vICMSSTRet** | **BigDecimal** | Informar o valor do ICMS ST retido na UF remetente (iv2.0)). |  |
|**vBCFCPSTRet** | **BigDecimal** | Informar o valor da Base de Cálculo do FCP retido anteriormente por ST. |  [optional] |
|**pFCPSTRet** | **BigDecimal** | Percentual relativo ao Fundo de Combate à Pobreza (FCP) retido por substituição tributária. |  [optional] |
|**vFCPSTRet** | **BigDecimal** | Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) retido por substituição tributária. |  [optional] |
|**vBCSTDest** | **BigDecimal** | Informar o valor da BC do ICMS ST da UF destino. |  |
|**vICMSSTDest** | **BigDecimal** | Informar o valor da BC do ICMS ST da UF destino (v2.0). |  |
|**pRedBCEfet** | **BigDecimal** | Percentual de redução da base de cálculo efetiva. |  [optional] |
|**vBCEfet** | **BigDecimal** | Valor da base de cálculo efetiva. |  [optional] |
|**pICMSEfet** | **BigDecimal** | Alíquota do ICMS efetivo. |  [optional] |
|**vICMSEfet** | **BigDecimal** | Valor do ICMS efetivo. |  [optional] |



