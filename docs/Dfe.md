

# Dfe


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único gerado pela Nuvem Fiscal para este documento. |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Data/hora em que o documento foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;pendente&#x60;: o pedido de emissão do documento foi recebido pela Nuvem Fiscal e está na fila de processamento.  * &#x60;autorizado&#x60;, &#x60;rejeitado&#x60; ou &#x60;denegado&#x60;: o documento foi transmitido para a SEFAZ, que retornou um desses status.  * &#x60;cancelado&#x60;: um evento de cancelamento foi homologado pela SEFAZ e associado ao documento.  * &#x60;encerrado&#x60;: um evento de encerramento foi homologado pela SEFAZ e associado a um MDF-e.  * &#x60;erro&#x60;: status próprio da Nuvem Fiscal que significa, na maioria das vezes, que houve algum erro que impediu a transmissão do documento para a SEFAZ (erros de validação, erros interno do servidor, timeouts, etc). |  [optional] |
|**referencia** | **String** | Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento. |  [optional] |
|**dataEmissao** | **OffsetDateTime** |  |  [optional] |
|**modelo** | **Integer** |  |  [optional] |
|**serie** | **Integer** |  |  [optional] |
|**numero** | **Integer** |  |  [optional] |
|**tipoEmissao** | **Integer** |  |  [optional] |
|**valorTotal** | **BigDecimal** |  |  [optional] |
|**chave** | **String** | Chave de acesso do DF-e. |  [optional] |
|**autorizacao** | [**DfeAutorizacao**](DfeAutorizacao.md) |  |  [optional] |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDENTE | &quot;pendente&quot; |
| AUTORIZADO | &quot;autorizado&quot; |
| REJEITADO | &quot;rejeitado&quot; |
| DENEGADO | &quot;denegado&quot; |
| ENCERRADO | &quot;encerrado&quot; |
| CANCELADO | &quot;cancelado&quot; |
| ERRO | &quot;erro&quot; |



