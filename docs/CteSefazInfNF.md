

# CteSefazInfNF

Informações das NF.  Este grupo deve ser informado quando o documento originário for NF.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nRoma** | **String** | Número do Romaneio da NF. |  [optional] |
|**nPed** | **String** | Número do Pedido da NF. |  [optional] |
|**mod** | **String** | Modelo da Nota Fiscal.  Preencher com:  * 01 - NF Modelo 01/1A e Avulsa  * 04 - NF de Produtor |  |
|**serie** | **String** | Série. |  |
|**nDoc** | **String** | Número. |  |
|**dEmi** | **LocalDate** | Data de Emissão.  Formato AAAA-MM-DD. |  |
|**vBC** | **BigDecimal** | Valor da Base de Cálculo do ICMS. |  |
|**vICMS** | **BigDecimal** | Valor Total do ICMS. |  |
|**vBCST** | **BigDecimal** | Valor da Base de Cálculo do ICMS ST. |  |
|**vST** | **BigDecimal** | Valor Total do ICMS ST. |  |
|**vProd** | **BigDecimal** | Valor Total dos Produtos. |  |
|**vNF** | **BigDecimal** | Valor Total da NF. |  |
|**nCFOP** | **String** | CFOP Predominante.  CFOP da NF ou, na existência de mais de um, predominância pelo critério de valor econômico. |  |
|**nPeso** | **BigDecimal** | Peso total em Kg. |  [optional] |
|**PIN** | **String** | PIN SUFRAMA.  PIN atribuído pela SUFRAMA para a operação. |  [optional] |
|**dPrev** | **LocalDate** | Data prevista de entrega.  Formato AAAA-MM-DD. |  [optional] |
|**infUnidCarga** | [**List&lt;CteSefazUnidCarga&gt;**](CteSefazUnidCarga.md) |  |  [optional] |
|**infUnidTransp** | [**List&lt;CteSefazUnidadeTransp&gt;**](CteSefazUnidadeTransp.md) |  |  [optional] |



