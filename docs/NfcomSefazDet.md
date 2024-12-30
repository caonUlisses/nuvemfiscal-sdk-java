

# NfcomSefazDet

Detalhamento de Produtos e Serviços.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nItem** | **Integer** | Número do item da NFCom. |  |
|**chNFComAnt** | **String** | Chave de Acesso da NFCom anterior.  Informar chave de acesso de referencia anterior  TAG OPCIONAL, DEVE SER INFORMADA APENAS NOS CASOS PREVISTOS DE NOTA ANTERIOR REFERENCIADA. |  [optional] |
|**nItemAnt** | **String** | Número do item da NFCom anterior.  Informar nro do item da chave de acesso de referencia anterior  TAG OPCIONAL, DEVE SER INFORMADA APENAS NOS CASOS PREVISTOS DE NOTA ANTERIOR REFERENCIADA. |  [optional] |
|**indNFComAntPapelFatCentral** | **Integer** | Indicador de Nota anterior em papel no faturamento centralizado.  Informa que a NFCom Anterior de Faturamento centralizado não é eletrônica. |  [optional] |
|**prod** | [**NfcomSefazProd**](NfcomSefazProd.md) |  |  |
|**imposto** | [**NfcomSefazImposto**](NfcomSefazImposto.md) |  |  |
|**gProcRef** | [**NfcomSefazGProcRef**](NfcomSefazGProcRef.md) |  |  [optional] |
|**gRessarc** | [**NfcomSefazGRessarc**](NfcomSefazGRessarc.md) |  |  [optional] |
|**infAdProd** | **String** | Informações adicionais do produto (norma referenciada, informações complementares, etc). |  [optional] |



