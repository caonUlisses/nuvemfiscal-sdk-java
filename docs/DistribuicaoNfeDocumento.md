

# DistribuicaoNfeDocumento


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único gerado pela Nuvem Fiscal para identificar o documento. |  |
|**createdAt** | **OffsetDateTime** | Data/hora em que o documento foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;. |  [optional] |
|**nsu** | **Integer** | NSU do documento fiscal. |  [optional] |
|**schema** | **String** | Identificação do Schema XML que será utilizado para validar o XML existente no conteúdo da tag docZip. Vai identificar o tipo do documento e sua versão. Exemplos: resNFe_v1.00.xsd, procNFe_v3.10.xsd, resEvento_1.00.xsd, procEventoNFe_v1.00.xsd. |  |
|**tipoDocumento** | [**TipoDocumentoEnum**](#TipoDocumentoEnum) | Tipo do documento de interesse da pessoa ou empresa. |  [optional] |
|**chaveAcesso** | **String** | Chave de Acesso da NF-e. |  [optional] |
|**resumo** | **Boolean** | Indica se o documento distribuído está em sua forma resumida. |  [optional] |
|**tipoEvento** | **String** | Tipo do evento. |  [optional] |
|**numeroSequencial** | **Integer** | Número sequencial do evento para o mesmo tipo de evento. |  [optional] |
|**dataEvento** | **OffsetDateTime** | Data e hora do evento. |  [optional] |
|**dataRecebimento** | **OffsetDateTime** | Data e hora de autorização do evento. |  [optional] |
|**numeroProtocolo** | **String** | Número do protocolo de autorização. |  [optional] |
|**tipoNfe** | **Integer** | Tipo da NF-e (0 - entrada; 1 - saída). |  [optional] |
|**valorNfe** | **BigDecimal** | Valor total da NF-e. |  [optional] |
|**digestValue** | **String** | Digest Value da NF-e processada. Utilizado para conferir a integridade da NF-e original. |  [optional] |
|**emitenteCpfCnpj** | **String** | CPF/CNPJ do emitente. |  [optional] |
|**emitenteNomeRazaoSocial** | **String** | Nome ou Razão Social do emitente. |  [optional] |
|**emitenteInscricaoEstadual** | **String** | Inscrição Estadual do emitente. |  [optional] |



## Enum: TipoDocumentoEnum

| Name | Value |
|---- | -----|
| NOTA | &quot;nota&quot; |
| EVENTO | &quot;evento&quot; |



