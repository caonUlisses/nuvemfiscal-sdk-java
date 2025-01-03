

# NfeSefazICMSSN201

Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN=201 (v.2.0).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orig** | **Integer** | Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%. |  |
|**CSOSN** | **String** | * 201 - Tributada pelo Simples Nacional com permissão de crédito e com cobrança do ICMS por Substituição Tributária (v.2.0) |  |
|**modBCST** | **Integer** | Modalidade de determinação da BC do ICMS ST:  * 0 - Preço tabelado ou máximo  sugerido  * 1 - Lista Negativa (valor)  * 2 - Lista Positiva (valor)  * 3 - Lista Neutra (valor)  * 4 - Margem Valor Agregado (%%)  * 5 - Pauta (valor). (v2.0)  * 6 - Valor da Operação |  |
|**pMVAST** | **BigDecimal** | Percentual da Margem de Valor Adicionado ICMS ST (v2.0). |  [optional] |
|**pRedBCST** | **BigDecimal** | Percentual de redução da BC ICMS ST  (v2.0). |  [optional] |
|**vBCST** | **BigDecimal** | Valor da BC do ICMS ST (v2.0). |  |
|**pICMSST** | **BigDecimal** | Alíquota do ICMS ST (v2.0). |  |
|**vICMSST** | **BigDecimal** | Valor do ICMS ST (v2.0). |  |
|**vBCFCPST** | **BigDecimal** | Valor da Base de cálculo do FCP. |  [optional] |
|**pFCPST** | **BigDecimal** | Percentual de FCP retido por substituição tributária. |  [optional] |
|**vFCPST** | **BigDecimal** | Valor do FCP retido por substituição tributária. |  [optional] |
|**pCredSN** | **BigDecimal** | Alíquota aplicável de cálculo do crédito (Simples Nacional). (v2.0). |  |
|**vCredICMSSN** | **BigDecimal** | Valor crédito do ICMS que pode ser aproveitado nos termos do art. 23 da LC 123 (Simples Nacional) (v2.0). |  |



