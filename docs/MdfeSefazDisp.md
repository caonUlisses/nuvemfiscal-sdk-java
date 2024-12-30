

# MdfeSefazDisp

Informações dos dispositivos do Vale Pedágio.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cnPJForn** | **String** | CNPJ da empresa fornecedora do Vale-Pedágio.  * CNPJ da Empresa Fornecedora do Vale-Pedágio, ou seja, empresa que fornece ao Responsável pelo Pagamento do Vale-Pedágio os dispositivos do Vale-Pedágio.  * Informar os zeros não significativos. |  |
|**cnPJPg** | **String** | CNPJ do responsável pelo pagamento do Vale-Pedágio.  * responsável pelo pagamento do Vale Pedágio. Informar somente quando o responsável não for o emitente do MDF-e.  * Informar os zeros não significativos. |  [optional] |
|**cpFPg** | **String** | CNPJ do responsável pelo pagamento do Vale-Pedágio.  Informar os zeros não significativos. |  [optional] |
|**nCompra** | **String** | Número do comprovante de compra.  Número de ordem do comprovante de compra do Vale-Pedágio fornecido para cada veículo ou combinação veicular, por viagem. |  [optional] |
|**vValePed** | **BigDecimal** | Valor do Vale-Pedagio.  Valor do Vale-Pedágio obrigatório necessário à livre circulação, desde a origem da operação de transporte até o destino, do transportador contratado. |  |
|**tpValePed** | **String** | Tipo do Vale Pedagio.  * 01 - TAG  * 02 - Cupom  * 03 - Cartão |  [optional] |



