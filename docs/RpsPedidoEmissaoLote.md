

# RpsPedidoEmissaoLote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  |
|**referencia** | **String** | Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento. |  [optional] |
|**listaRps** | [**List&lt;RpsPedidoEmissao&gt;**](RpsPedidoEmissao.md) |  |  [optional] |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



