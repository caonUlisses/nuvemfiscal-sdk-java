

# RpsLote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único do lote gerado automaticamente pela Nuvem Fiscal. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**numero** | **String** |  |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) |  |  [optional] |
|**referencia** | **String** |  |  [optional] |
|**notas** | [**List&lt;Nfse&gt;**](Nfse.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOVO | &quot;novo&quot; |
| FILA_ENVIO | &quot;fila_envio&quot; |
| FILA_CONSULTA | &quot;fila_consulta&quot; |
| PROCESSADO | &quot;processado&quot; |
| ERRO | &quot;erro&quot; |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



