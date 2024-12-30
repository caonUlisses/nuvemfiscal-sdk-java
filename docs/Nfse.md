

# Nfse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único da nota gerado automaticamente pela Nuvem Fiscal. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**numero** | **String** |  |  [optional] |
|**codigoVerificacao** | **String** |  |  [optional] |
|**linkUrl** | **String** |  |  [optional] |
|**dataEmissao** | **OffsetDateTime** |  |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) |  |  [optional] |
|**referencia** | **String** |  |  [optional] |
|**dps** | [**DPS**](DPS.md) |  |  [optional] |
|**cancelamento** | [**NfseCancelamento**](NfseCancelamento.md) |  |  [optional] |
|**mensagens** | [**List&lt;NfseMensagemRetorno&gt;**](NfseMensagemRetorno.md) |  |  [optional] |
|**declaracaoPrestacaoServico** | [**Rps**](Rps.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSANDO | &quot;processando&quot; |
| AUTORIZADA | &quot;autorizada&quot; |
| NEGADA | &quot;negada&quot; |
| CANCELADA | &quot;cancelada&quot; |
| SUBSTITUIDA | &quot;substituida&quot; |
| ERRO | &quot;erro&quot; |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



