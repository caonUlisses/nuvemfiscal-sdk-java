

# DfeSefazStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autorizador** | [**AutorizadorEnum**](#AutorizadorEnum) | SEFAZ autorizadora responsável. |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  [optional] |
|**dataHoraConsulta** | **OffsetDateTime** | Data e hora da consulta. |  [optional] |
|**codigoStatus** | **Integer** | Código do status da mensagem enviada. |  [optional] |
|**motivoStatus** | **String** | Descrição literal do status do serviço solicitado. |  [optional] |
|**tempoMedioResposta** | **Integer** | Tempo médio de resposta do serviço (em segundos) dos últimos 5 minutos. |  [optional] |
|**dataHoraRetorno** | **OffsetDateTime** | Data e hora prevista para o retorno dos serviços prestados. |  [optional] |



## Enum: AutorizadorEnum

| Name | Value |
|---- | -----|
| AM | &quot;AM&quot; |
| BA | &quot;BA&quot; |
| CE | &quot;CE&quot; |
| GO | &quot;GO&quot; |
| MG | &quot;MG&quot; |
| MS | &quot;MS&quot; |
| MT | &quot;MT&quot; |
| PE | &quot;PE&quot; |
| PR | &quot;PR&quot; |
| RS | &quot;RS&quot; |
| SP | &quot;SP&quot; |
| SVAN | &quot;SVAN&quot; |
| SVRS | &quot;SVRS&quot; |
| SVCAN | &quot;SVCAN&quot; |
| SVCRS | &quot;SVCRS&quot; |
| AN | &quot;AN&quot; |
| SVSP | &quot;SVSP&quot; |
| SVCSP | &quot;SVCSP&quot; |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



