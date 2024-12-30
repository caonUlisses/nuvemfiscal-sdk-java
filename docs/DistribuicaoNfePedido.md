

# DistribuicaoNfePedido


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpfCnpj** | **String** | CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*. |  |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  |
|**ufAutor** | **String** | Sigla da UF do autor. |  [optional] |
|**tipoConsulta** | [**TipoConsultaEnum**](#TipoConsultaEnum) | Tipo de consulta.   Valores possíveis: * &#x60;dist-nsu&#x60; - Consulta pelo último NSU recebido. * &#x60;cons-nsu&#x60; - Consulta por um NSU específico. * &#x60;cons-chave&#x60; - Consulta pela chave de acesso da NF-e. |  |
|**distNsu** | **Integer** | Distribuição de conjunto de DF-e a partir do NSU informado.    *Obrigatório quando \&quot;tipo_consulta\&quot; for \&quot;dist-nsu\&quot;.* |  [optional] |
|**consNsu** | **Integer** | Consulta DF-e vinculado ao NSU informado.    *Obrigatório quando \&quot;tipo_consulta\&quot; for \&quot;cons-nsu\&quot;.* |  [optional] |
|**consChave** | **String** | Consulta de NF-e por chave de acesso informada.    *Obrigatório quando \&quot;tipo_consulta\&quot; for \&quot;cons-chave\&quot;.* |  [optional] |
|**ignorarTempoEspera** | **Boolean** | Deve ser utilizado em situações em que o cliente  deseja ignorar o intervalo mínimo de 1 hora entre pedidos de distribuição  de NF-e. Quando habilitado, o cliente reconhece os riscos associados,  incluindo o bloqueio do CNPJ no Ambiente Nacional da SEFAZ, caso seja  caracterizado consumo indevido.    Valores:  * &#x60;false&#x60;: Respeita a regra de intervalo mínimo de 1 hora entre consultas    quando não há mais documentos disponíveis.    * &#x60;true&#x60;: Ignora o tempo de espera e força a requisição. |  [optional] |



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



