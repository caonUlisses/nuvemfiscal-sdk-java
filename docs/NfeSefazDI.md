

# NfeSefazDI

Delcaração de Importação  (NT 2011/004).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nDI** | **String** | Número do Documento de Importação (DI, DSI, DIRE, DUImp) (NT2011/004). |  |
|**dDI** | **LocalDate** | Data de registro da DI/DSI/DA (AAAA-MM-DD). |  |
|**xLocDesemb** | **String** | Local do desembaraço aduaneiro. |  |
|**ufDesemb** | **String** | UF onde ocorreu o desembaraço aduaneiro. |  |
|**dDesemb** | **LocalDate** | Data do desembaraço aduaneiro (AAAA-MM-DD). |  |
|**tpViaTransp** | **Integer** | Via de transporte internacional informada na DI ou na Declaração Única de Importação (DUImp):  * 1 - Maritima  * 2 - Fluvial  * 3 - Lacustre  * 4 - Aerea  * 5 - Postal  * 6 - Ferroviaria  * 7 - Rodoviaria  * 8 - Conduto  * 9 - Meios Proprios  * 10 - Entrada/Saida Ficta  * 11 - Courier  * 12 - Em maos  * 13 - Por reboque |  |
|**vAFRMM** | **BigDecimal** | Valor Adicional ao frete para renovação de marinha mercante. |  [optional] |
|**tpIntermedio** | **Integer** | Forma de Importação quanto a intermediação  * 1 - por conta propria  * 2 - por conta e ordem  * 3 - encomenda |  |
|**CNPJ** | **String** | CNPJ do adquirente ou do encomendante. |  [optional] |
|**CPF** | **String** | CPF do adquirente ou do encomendante. |  [optional] |
|**ufTerceiro** | **String** | Sigla da UF do adquirente ou do encomendante. |  [optional] |
|**cExportador** | **String** | Código do exportador (usado nos sistemas internos de informação do emitente da NF-e). |  |
|**adi** | [**List&lt;NfeSefazAdi&gt;**](NfeSefazAdi.md) |  |  |



