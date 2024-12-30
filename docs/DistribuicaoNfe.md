

# DistribuicaoNfe


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID único gerado pela Nuvem Fiscal para o pedido de distribuição. |  |
|**createdAt** | **OffsetDateTime** | Data/hora em que o pedido foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indica o status da distribuição. |  |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  |
|**ufAutor** | **String** | Sigla da UF do autor. |  [optional] |
|**tipoConsulta** | [**TipoConsultaEnum**](#TipoConsultaEnum) |  |  |
|**distNsu** | **Integer** | Distribuição de conjunto de DF-e a partir do NSU informado.    *Obrigatório quando &#x60;tipo_consulta&#x60; for &#x60;distNSU&#x60;.* |  [optional] |
|**consNsu** | **Integer** | Consulta DF-e vinculado ao NSU informado.    *Obrigatório quando &#x60;tipo_consulta&#x60; for &#x60;consNSU&#x60;.* |  [optional] |
|**consChave** | **String** | Consulta de NF-e por chave de acesso informada.    *Obrigatório quando &#x60;tipo_consulta&#x60; for &#x60;consChNFe&#x60;.* |  [optional] |
|**codigoStatus** | **Integer** | Código do status de processamento da requisição. |  |
|**motivoStatus** | **String** | Descrição do status de processamento da requisição. |  [optional] |
|**dataHoraResposta** | **OffsetDateTime** | Data e Hora de processamento da requisição. |  |
|**ultimoNsu** | **Integer** | Último NSU pesquisado no Ambiente Nacional. Se for o caso, o solicitante pode continuar a consulta a partir deste NSU para obter novos resultados. |  |
|**maxNsu** | **Integer** | Maior NSU existente no Ambiente Nacional para o CNPJ/CPF informado. |  |
|**documentos** | [**List&lt;DistribuicaoNfeDocumento&gt;**](DistribuicaoNfeDocumento.md) | Conjunto de informações resumidas e documentos fiscais eletrônicos de interesse da pessoa ou empresa. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSANDO | &quot;processando&quot; |
| CONCLUIDO | &quot;concluido&quot; |
| ERRO | &quot;erro&quot; |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



## Enum: TipoConsultaEnum

| Name | Value |
|---- | -----|
| DIST_NSU | &quot;dist-nsu&quot; |
| CONS_NSU | &quot;cons-nsu&quot; |
| CONS_CHAVE | &quot;cons-chave&quot; |



