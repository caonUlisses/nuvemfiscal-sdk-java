

# DfeContribuinteInfCons

Dados do Resultado do Dados do Pedido de Consulta de cadastro de contribuintes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codigoStatus** | **Integer** | Código do status da mensagem enviada. |  |
|**motivoStatus** | **String** | Descrição literal do status do serviço solicitado. |  |
|**uf** | **String** | sigla da UF consultada, utilizar SU para SUFRAMA. |  |
|**ie** | **String** | Inscrição Estadual do contribuinte. |  [optional] |
|**cnpj** | **String** | CNPJ do contribuinte. |  [optional] |
|**cpf** | **String** | CPF do contribuinte. |  [optional] |
|**dataConsulta** | **OffsetDateTime** | Data da Consulta. |  |
|**ufAtendimento** | **Integer** | código da UF de atendimento. |  |
|**informacoesCadastrais** | [**List&lt;DfeContribuinteInfCad&gt;**](DfeContribuinteInfCad.md) |  |  [optional] |



