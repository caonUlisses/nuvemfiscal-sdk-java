

# MdfeSefazInfResp

Informações do responsável pelo seguro da carga.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**respSeg** | **Integer** | Responsável pelo seguro.  Preencher com:  * 1 - Emitente do MDF-e  * 22 - Responsável pela contratação do serviço de transporte (contratante)  Dados obrigatórios apenas no modal Rodoviário, depois da lei 11.442/07. Para os demais modais esta informação é opcional. |  |
|**CNPJ** | **String** | Número do CNPJ do responsável pelo seguro.  Obrigatório apenas se responsável pelo seguro for (2) responsável pela contratação do transporte - pessoa jurídica. |  [optional] |
|**CPF** | **String** | Número do CPF do responsável pelo seguro.  Obrigatório apenas se responsável pelo seguro for (2) responsável pela contratação do transporte - pessoa física. |  [optional] |



