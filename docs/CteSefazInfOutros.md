

# CteSefazInfOutros

Informações dos demais documentos.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tpDoc** | **String** | Tipo de documento originário.  Preencher com:  * 00 - Declaração  * 10 - Dutoviário  * 59 - CF-e SAT  * 65 - NFC-e  * 99 - Outros |  |
|**descOutros** | **String** | Descrição do documento. |  [optional] |
|**nDoc** | **String** | Número. |  [optional] |
|**dEmi** | **LocalDate** | Data de Emissão.  Formato AAAA-MM-DD. |  [optional] |
|**vDocFisc** | **BigDecimal** | Valor do documento. |  [optional] |
|**dPrev** | **LocalDate** | Data prevista de entrega.  Formato AAAA-MM-DD. |  [optional] |
|**infUnidCarga** | [**List&lt;CteSefazUnidCarga&gt;**](CteSefazUnidCarga.md) |  |  [optional] |
|**infUnidTransp** | [**List&lt;CteSefazUnidadeTransp&gt;**](CteSefazUnidadeTransp.md) |  |  [optional] |



