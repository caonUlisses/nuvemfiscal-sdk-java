

# NfeSefazDest

Identificação do Destinatário.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CNPJ** | **String** | Número do CNPJ. |  [optional] |
|**CPF** | **String** | Número do CPF. |  [optional] |
|**idEstrangeiro** | **String** | Identificador do destinatário, em caso de comprador estrangeiro. |  [optional] |
|**xNome** | **String** | Razão Social ou nome do destinatário. |  [optional] |
|**enderDest** | [**NfeSefazEndereco**](NfeSefazEndereco.md) |  |  [optional] |
|**indIEDest** | **Integer** | Indicador da IE do destinatário:  * 1 - Contribuinte ICMSpagamento à vista  * 2 - Contribuinte isento de inscrição  * 9 - Não Contribuinte |  |
|**IE** | **String** | Inscrição Estadual (obrigatório nas operações com contribuintes do ICMS). |  [optional] |
|**ISUF** | **String** | Inscrição na SUFRAMA (Obrigatório nas operações com as áreas com benefícios de incentivos fiscais sob controle da SUFRAMA) PL_005d - 11/08/09 - alterado para aceitar 8 ou 9 dígitos. |  [optional] |
|**IM** | **String** | Inscrição Municipal do tomador do serviço. |  [optional] |
|**email** | **String** | Informar o e-mail do destinatário. O campo pode ser utilizado para informar o e-mail  de recepção da NF-e indicada pelo destinatário. |  [optional] |



