

# InfDPS

Grupo de informações da DPS relativas ao serviço prestado.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tpAmb** | **Integer** | Identificação do Ambiente:  * 1 - Produção  * 2 - Homologação |  [optional] |
|**dhEmi** | **OffsetDateTime** | Data e hora da emissão do DPS. Data e hora no formato UTC (Universal Coordinated Time): AAAA-MM-DDThh:mm:ssTZD. |  |
|**verAplic** | **String** | Versão do aplicativo que gerou o DPS. |  [optional] |
|**dCompet** | **LocalDate** | Data em que se iniciou a prestação do serviço: Dia, mês e ano (AAAAMMDD). (AAAA-MM-DDThh:mm:ssTZD).      *Geramos automaticamente quando nenhum valor é informado.* |  [optional] |
|**subst** | [**Substituicao**](Substituicao.md) |  |  [optional] |
|**prest** | [**InfoPrestador**](InfoPrestador.md) |  |  |
|**toma** | [**InfoTomador**](InfoTomador.md) |  |  [optional] |
|**interm** | [**InfoIntermediario**](InfoIntermediario.md) |  |  [optional] |
|**serv** | [**Serv**](Serv.md) |  |  |
|**valores** | [**InfoValores**](InfoValores.md) |  |  |



