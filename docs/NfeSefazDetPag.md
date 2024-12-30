

# NfeSefazDetPag

Grupo de detalhamento da forma de pagamento.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**indPag** | **Integer** | Indicador da Forma de Pagamento:0-Pagamento à Vista  * 1 - Pagamento à Prazo |  [optional] |
|**tPag** | **String** | Forma de Pagamento:. |  |
|**xPag** | **String** | Descrição do Meio de Pagamento. |  [optional] |
|**vPag** | **BigDecimal** | Valor do Pagamento. Esta tag poderá ser omitida quando a tag tPag&#x3D;90 (Sem Pagamento), caso contrário deverá ser preenchida. |  |
|**dPag** | **LocalDate** | Data do Pagamento. |  [optional] |
|**cnPJPag** | **String** | CNPJ transacional do pagamento - Preencher informando o CNPJ do estabelecimento onde o pagamento foi processado/transacionado/recebido quando a emissão do documento fiscal ocorrer em estabelecimento distinto. |  [optional] |
|**ufPag** | **String** | UF do CNPJ do estabelecimento onde o pagamento foi processado/transacionado/recebido. |  [optional] |
|**card** | [**NfeSefazCard**](NfeSefazCard.md) |  |  [optional] |



