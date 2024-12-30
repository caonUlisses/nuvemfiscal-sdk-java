

# NfseCidadeMetadados


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codigoIbge** | **String** | Código IBGE do município. |  [optional] |
|**uf** | **String** | UF do município. |  [optional] |
|**municipio** | **String** | Nome do município. |  [optional] |
|**provedor** | **String** | Provedor do município. |  [optional] |
|**ambientes** | [**List&lt;AmbientesEnum&gt;**](#List&lt;AmbientesEnum&gt;) | Ambientes disponíveis no provedor. |  [optional] |
|**credenciais** | [**List&lt;CredenciaisEnum&gt;**](#List&lt;CredenciaisEnum&gt;) | Credenciais requeridas para autenticação no provedor. |  [optional] |



## Enum: List&lt;AmbientesEnum&gt;

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



## Enum: List&lt;CredenciaisEnum&gt;

| Name | Value |
|---- | -----|
| CERTIFICADO | &quot;certificado&quot; |
| LOGIN_SENHA | &quot;login_senha&quot; |
| TOKEN | &quot;token&quot; |



