

# DfeInutilizacao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cnpj** | **String** |  |  [optional] |
|**ano** | **Integer** |  |  [optional] |
|**modelo** | **Integer** |  |  [optional] |
|**serie** | **Integer** |  |  [optional] |
|**numeroInicial** | **Integer** |  |  [optional] |
|**numeroFinal** | **Integer** |  |  [optional] |
|**justificativa** | **String** |  |  [optional] |
|**id** | **String** | ID único gerado pela Nuvem Fiscal para este evento. |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do ambiente. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status do Evento. |  [optional] |
|**autor** | [**DfeAutorEvento**](DfeAutorEvento.md) |  |  [optional] |
|**chaveAcesso** | **String** | Chave de Acesso do documento vinculado ao evento. |  [optional] |
|**dataEvento** | **OffsetDateTime** | Data e hora do Evento. |  [optional] |
|**numeroSequencial** | **Integer** | Sequencial do evento para o mesmo tipo de evento. |  [optional] |
|**dataRecebimento** | **OffsetDateTime** | Data e hora do recebimento do Evento pela SEFAZ. |  [optional] |
|**codigoStatus** | **Integer** | Código do status de registro do Evento. |  [optional] |
|**motivoStatus** | **String** | Descrição literal do status do registro do Evento. |  [optional] |
|**numeroProtocolo** | **String** | Número do Protocolo de registro do Evento. |  [optional] |
|**codigoMensagem** | **Integer** | Código da Mensagem. |  [optional] |
|**mensagem** | **String** | Mensagem da SEFAZ para o emissor. |  [optional] |
|**tipoEvento** | **String** |  |  [optional] |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDENTE | &quot;pendente&quot; |
| REGISTRADO | &quot;registrado&quot; |
| REJEITADO | &quot;rejeitado&quot; |
| ERRO | &quot;erro&quot; |



