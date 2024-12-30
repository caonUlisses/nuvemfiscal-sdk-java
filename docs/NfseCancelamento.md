

# NfseCancelamento


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único do cancelamento gerado automaticamente pela Nuvem Fiscal. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**codigo** | **String** |  |  [optional] |
|**motivo** | **String** |  |  [optional] |
|**dataHora** | **OffsetDateTime** |  |  [optional] |
|**mensagens** | [**List&lt;NfseMensagemRetorno&gt;**](NfseMensagemRetorno.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDENTE | &quot;pendente&quot; |
| FILA_CANCELAMENTO | &quot;fila_cancelamento&quot; |
| CONCLUIDO | &quot;concluido&quot; |
| REJEITADO | &quot;rejeitado&quot; |
| ERRO | &quot;erro&quot; |



