

# NfcomSefazEmit

Identificação do Emitente do documento fiscal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CNPJ** | **String** | CNPJ do emitente.  Informar zeros não significativos. |  |
|**IE** | **String** | Inscrição Estadual do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**ieUFDest** | **String** | Inscrição Estadual Virtual do emitente na UF de Destino da partilha (IE Virtual). |  [optional] |
|**CRT** | **Integer** | Código do Regime Tributário. Informar:  * 1 - Simples Nacional;  * 2 - Simples Nacional, excesso sublimite de receita bruta;  * 3 - Regime Normal.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**xNome** | **String** | Razão social ou Nome do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**xFant** | **String** | Nome fantasia do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**enderEmit** | [**NfcomSefazEndeEmi**](NfcomSefazEndeEmi.md) |  |  [optional] |



