

# DfeSincronizacao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Situação atual da sincronização. |  [optional] |
|**codigoStatus** | **Integer** | Código da situação atual do DF-e. |  [optional] |
|**motivoStatus** | **String** | Descrição literal da situação atual do DF-e. |  [optional] |
|**dataRecebimento** | **OffsetDateTime** | Data e hora de processamento. |  [optional] |
|**chave** | **String** | Chave de Acesso do DF-e consultado. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDENTE | &quot;pendente&quot; |
| SINCRONIZADO | &quot;sincronizado&quot; |
| ERRO | &quot;erro&quot; |



