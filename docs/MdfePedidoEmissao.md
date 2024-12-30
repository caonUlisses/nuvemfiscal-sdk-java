

# MdfePedidoEmissao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**infMDFe** | [**MdfeSefazInfMDFe**](MdfeSefazInfMDFe.md) |  |  |
|**infMDFeSupl** | [**MdfeSefazInfMDFeSupl**](MdfeSefazInfMDFeSupl.md) |  |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  |
|**referencia** | **String** | Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento. |  [optional] |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



