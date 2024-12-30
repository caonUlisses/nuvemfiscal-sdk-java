

# DistribuicaoNfeEvento


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único gerado pela Nuvem Fiscal para este evento. |  [optional] |
|**createdAt** | **OffsetDateTime** | Data/hora em que o evento foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;. |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do ambiente. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status do Evento. |  [optional] |
|**cpfCnpjAutor** | **String** | CPF/CNPJ do autor do evento. |  [optional] |
|**chaveAcesso** | **String** | Chave de Acesso do documento vinculado ao evento. |  [optional] |
|**tipoEvento** | **String** | Tipo do evento vinculado. |  [optional] |
|**dataEvento** | **OffsetDateTime** | Data e hora do Evento. |  [optional] |
|**numeroSequencial** | **Integer** | Sequencial do evento para o mesmo tipo de evento. |  [optional] |
|**justificativa** | **String** | Justificativa para o desconhecimento ou não-realização da operação. |  [optional] |
|**dataRegistro** | **OffsetDateTime** | Data e hora do registro do evento pela SEFAZ. |  [optional] |
|**codigoStatus** | **Integer** | Código do status de registro do evento. |  [optional] |
|**motivoStatus** | **String** | Descrição literal do status do registro do evento. |  [optional] |
|**numeroProtocolo** | **String** | Número do Protocolo de registro do evento. |  [optional] |



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



