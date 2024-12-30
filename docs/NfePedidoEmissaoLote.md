

# NfePedidoEmissaoLote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentos** | [**List&lt;NfePedidoEmissao&gt;**](NfePedidoEmissao.md) |  |  |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  |
|**referencia** | **String** | Seu identificador para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento. |  [optional] |
|**idLote** | **String** |  |  |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



