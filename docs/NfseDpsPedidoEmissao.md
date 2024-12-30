

# NfseDpsPedidoEmissao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provedor** | [**ProvedorEnum**](#ProvedorEnum) | Default: &#x60;\&quot;padrao\&quot;&#x60;    Identificação do provedor para transmissão da DPS:   * &#x60;\&quot;padrao\&quot;&#x60;: Provedor padrão da prefeitura.   * &#x60;\&quot;nacional\&quot;&#x60;: Ambiente de Dados Nacional (ADN) do &lt;a href&#x3D;\&quot;https://www.gov.br/nfse/pt-br\&quot; target&#x3D;\&quot;blank\&quot;&gt;Sistema Nacional NFS-e&lt;/a&gt;. |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  |
|**referencia** | **String** | Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento. |  [optional] |
|**infDPS** | [**InfDPS**](InfDPS.md) |  |  |



## Enum: ProvedorEnum

| Name | Value |
|---- | -----|
| PADRAO | &quot;padrao&quot; |
| NACIONAL | &quot;nacional&quot; |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



