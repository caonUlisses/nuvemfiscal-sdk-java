

# CteSefazUnidadeTransp

Informações das Unidades de Transporte (Carreta/Reboque/Vagão).  Deve ser preenchido com as informações das unidades de transporte utilizadas.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tpUnidTransp** | **Integer** | Tipo da Unidade de Transporte.  * 1 - Rodoviário Tração  * 2 - Rodoviário Reboque  * 3 - Navio  * 4 - Balsa  * 5 - Aeronave  * 6 - Vagão  * 7 - Outros |  |
|**idUnidTransp** | **String** | Identificação da Unidade de Transporte.  Informar a identificação conforme o tipo de unidade de transporte.  Por exemplo: para rodoviário tração ou reboque deverá preencher com a placa do veículo. |  |
|**lacUnidTransp** | [**List&lt;CteSefazLacUnidTransp&gt;**](CteSefazLacUnidTransp.md) |  |  [optional] |
|**infUnidCarga** | [**List&lt;CteSefazUnidCarga&gt;**](CteSefazUnidCarga.md) |  |  [optional] |
|**qtdRat** | **BigDecimal** | Quantidade rateada (Peso,Volume). |  [optional] |



