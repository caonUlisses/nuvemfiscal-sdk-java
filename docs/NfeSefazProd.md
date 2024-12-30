

# NfeSefazProd

Dados dos produtos e serviços da NF-e.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cProd** | **String** | Código do produto ou serviço. Preencher com CFOP caso se trate de itens não relacionados com mercadorias/produto e que o contribuinte não possua codificação própria  Formato ”CFOP9999”. |  |
|**cEAN** | **String** | GTIN (Global Trade Item Number) do produto, antigo código EAN ou código de barras. |  |
|**cBarra** | **String** | Codigo de barras diferente do padrão GTIN. |  [optional] |
|**xProd** | **String** | Descrição do produto ou serviço. |  |
|**NCM** | **String** | Código NCM (8 posições), será permitida a informação do gênero (posição do capítulo do NCM) quando a operação não for de comércio exterior (importação/exportação) ou o produto não seja tributado pelo IPI. Em caso de item de serviço ou item que não tenham produto (Ex. transferência de crédito, crédito do ativo imobilizado, etc.), informar o código 00 (zeros) (v2.0). |  |
|**NVE** | **List&lt;String&gt;** | Nomenclatura de Valor aduaneio e Estatístico. |  [optional] |
|**CEST** | **String** | Codigo especificador da Substuicao Tributaria - CEST, que identifica a mercadoria sujeita aos regimes de  substituicao tributária e de antecipação do recolhimento  do imposto. |  [optional] |
|**indEscala** | **String** |  |  [optional] |
|**cnPJFab** | **String** | CNPJ do Fabricante da Mercadoria, obrigatório para produto em escala NÃO relevante. |  [optional] |
|**cBenef** | **String** |  |  [optional] |
|**gCred** | [**List&lt;NfeSefazGCred&gt;**](NfeSefazGCred.md) |  |  [optional] |
|**EXTIPI** | **String** | Código EX TIPI (3 posições). |  [optional] |
|**CFOP** | **String** | Cfop. |  |
|**uCom** | **String** | Unidade comercial. |  |
|**qCom** | **BigDecimal** | Quantidade Comercial  do produto, alterado para aceitar de 0 a 4 casas decimais e 11 inteiros. |  |
|**vUnCom** | **BigDecimal** | Valor unitário de comercialização  - alterado para aceitar 0 a 10 casas decimais e 11 inteiros. |  |
|**vProd** | **BigDecimal** | Valor bruto do produto ou serviço. |  |
|**cEANTrib** | **String** | GTIN (Global Trade Item Number) da unidade tributável, antigo código EAN ou código de barras. |  |
|**cBarraTrib** | **String** | Código de barras da unidade tributável diferente do padrão GTIN. |  [optional] |
|**uTrib** | **String** | Unidade Tributável. |  |
|**qTrib** | **BigDecimal** | Quantidade Tributável - alterado para aceitar de 0 a 4 casas decimais e 11 inteiros. |  |
|**vUnTrib** | **BigDecimal** | Valor unitário de tributação - - alterado para aceitar 0 a 10 casas decimais e 11 inteiros. |  |
|**vFrete** | **BigDecimal** | Valor Total do Frete. |  [optional] |
|**vSeg** | **BigDecimal** | Valor Total do Seguro. |  [optional] |
|**vDesc** | **BigDecimal** | Valor do Desconto. |  [optional] |
|**vOutro** | **BigDecimal** | Outras despesas acessórias. |  [optional] |
|**indTot** | **Integer** | Este campo deverá ser preenchido com:  * 0 - o valor do item (vProd) não compõe o valor total da NF-e (vProd)  * 1 - o valor do item (vProd) compõe o valor total da NF-e (vProd) |  |
|**DI** | [**List&lt;NfeSefazDI&gt;**](NfeSefazDI.md) |  |  [optional] |
|**detExport** | [**List&lt;NfeSefazDetExport&gt;**](NfeSefazDetExport.md) |  |  [optional] |
|**xPed** | **String** | pedido de compra - Informação de interesse do emissor para controle do B2B. |  [optional] |
|**nItemPed** | **Integer** | Número do Item do Pedido de Compra - Identificação do número do item do pedido de Compra. |  [optional] |
|**nFCI** | **String** | Número de controle da FCI - Ficha de Conteúdo de Importação. |  [optional] |
|**rastro** | [**List&lt;NfeSefazRastro&gt;**](NfeSefazRastro.md) |  |  [optional] |
|**infProdNFF** | [**NfeSefazInfProdNFF**](NfeSefazInfProdNFF.md) |  |  [optional] |
|**infProdEmb** | [**NfeSefazInfProdEmb**](NfeSefazInfProdEmb.md) |  |  [optional] |
|**veicProd** | [**NfeSefazVeicProd**](NfeSefazVeicProd.md) |  |  [optional] |
|**med** | [**NfeSefazMed**](NfeSefazMed.md) |  |  [optional] |
|**arma** | [**List&lt;NfeSefazArma&gt;**](NfeSefazArma.md) |  |  [optional] |
|**comb** | [**NfeSefazComb**](NfeSefazComb.md) |  |  [optional] |
|**nRECOPI** | **String** | Número do RECOPI. |  [optional] |



