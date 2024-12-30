

# DfeLote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único gerado pela Nuvem Fiscal para este documento. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) |  |  [optional] |
|**referencia** | **String** | Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento. |  [optional] |
|**idLote** | **String** |  |  [optional] |
|**recibo** | [**DfeRecibo**](DfeRecibo.md) |  |  [optional] |
|**documentos** | [**List&lt;Dfe&gt;**](Dfe.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDENTE | &quot;pendente&quot; |
| PROCESSADO | &quot;processado&quot; |
| ERRO | &quot;erro&quot; |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



