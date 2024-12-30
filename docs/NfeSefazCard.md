

# NfeSefazCard

Grupo de Cartões, PIX, Boletos e outros Pagamentos Eletrônicos.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tpIntegra** | **Integer** | Tipo de Integração do processo de pagamento com o sistema de automação da empresa:  * 1 - Pagamento integrado com o sistema de automação da empresa (Ex.: equipamento TEF, Comércio Eletrônico, POS Integrado)  * 2 - Pagamento não integrado com o sistema de automação da empresa (Ex.: equipamento POS Simples) |  |
|**CNPJ** | **String** | CNPJ da instituição de pagamento. |  [optional] |
|**tBand** | **String** | Bandeira da operadora de cartão. |  [optional] |
|**cAut** | **String** | Número de autorização da operação com cartões, PIX, boletos e outros pagamentos eletrônicos. |  [optional] |
|**cnPJReceb** | **String** | CNPJ do beneficiário do pagamento. |  [optional] |
|**idTermPag** | **String** | Identificador do terminal de pagamento. |  [optional] |



