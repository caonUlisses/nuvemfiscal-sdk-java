

# EmpresaConfigDistribuicaoNfe


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**distribuicaoAutomatica** | **Boolean** | Indica se a distribuição automática está habilitada.    Nesse modo, a API da Nuvem Fiscal irá realizar pedidos de distribuição  pelo último NSU de forma automática a cada 1 hora. |  [optional] |
|**cienciaAutomatica** | **Boolean** | Indica se a manifestação de Ciência da Operação (210210) deve ser feita  automaticamente pela API.    Caso habilitada, a manifestação de ciência será realizada para notas  recebidas por qualquer forma de consulta ou modo de distribuição (manual ou automático). |  [optional] |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Indica se a empresa irá emitir em produção ou homologação. |  |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



