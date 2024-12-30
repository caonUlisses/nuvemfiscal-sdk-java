

# NfcomSefazProd

Dados do Produto ou Serviço.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cProd** | **String** | Código do produto ou serviço. |  |
|**xProd** | **String** | Descrição do produto ou serviço. |  |
|**cClass** | **String** | Código de classificação.  Tabela de Classificação de Item da NFCom (validar por RV). |  |
|**CFOP** | **String** | CFOP.  Utilizar Tabela de CFOP. |  [optional] |
|**CNPJLD** | **String** | CNPJ da operadora LD.  Informar o CNPJ da operadora LD que irá lançar o item de cofaturamento em nota do tipo faturamento 2. |  [optional] |
|**uMed** | **Integer** | Unidade Básica de Medida.  * 1 - Minuto  * 2 - MB  * 3 - GB  * 4 - UN |  |
|**qFaturada** | **BigDecimal** | Quantidade Faturada.  Informar a quantidade de comercialização do produto . |  |
|**vItem** | **BigDecimal** | Valor unitário do item. |  |
|**vDesc** | **BigDecimal** | Valor do Desconto. |  [optional] |
|**vOutro** | **BigDecimal** | Outras despesas acessórias. |  [optional] |
|**vProd** | **BigDecimal** | Valor total do item. |  |
|**dExpiracao** | **LocalDate** | Data de expiração de crédito.  Formato AAAA-MM-DD. |  [optional] |
|**indDevolucao** | **Integer** | Indicador de devolução do valor do item.  * 1 - Devolução do valor do item |  [optional] |



