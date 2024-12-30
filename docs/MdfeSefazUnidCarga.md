

# MdfeSefazUnidCarga

Informações das Unidades de Carga (Containeres/ULD/Outros).  Dispositivo de carga utilizada (Unit Load Device - ULD) significa todo tipo de contêiner de carga, vagão, contêiner de avião, palete de aeronave com rede ou palete de aeronave com rede sobre um iglu.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tpUnidCarga** | **Integer** | Tipo da Unidade de Carga.  * 1 - Container  * 2 - ULD  * 3 - Pallet  * 4 - Outros |  |
|**idUnidCarga** | **String** | Identificação da Unidade de Carga.  Informar a identificação da unidade de carga, por exemplo: número do container. |  |
|**lacUnidCarga** | [**List&lt;MdfeSefazLacUnidCarga&gt;**](MdfeSefazLacUnidCarga.md) |  |  [optional] |
|**qtdRat** | **BigDecimal** | Quantidade rateada (Peso,Volume). |  [optional] |



