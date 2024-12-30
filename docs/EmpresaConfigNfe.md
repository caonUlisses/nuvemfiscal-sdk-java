

# EmpresaConfigNfe


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CRT** | **Integer** | Código de Regime Tributário.  Este campo será preenchido com:  * 1 – Simples Nacional;  * 2 – Simples Nacional – excesso de sublimite de receita bruta;  * 3 – Regime Normal;  * 4 - Simples Nacional - Microempreendedor individual (MEI). |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Indica se a empresa irá emitir em produção ou homologação. |  |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



