

# MdfeSefazEmit

Identificação do Emitente do Manifesto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CNPJ** | **String** | CNPJ do emitente.  Informar zeros não significativos.    ***Obrigatório caso o emitente seja pessoa jurídica***. |  [optional] |
|**CPF** | **String** | CPF do emitente.  Informar zeros não significativos.  Usar com série específica 920-969 para emitente pessoa física com inscrição estadual.  Poderá ser usado também para emissão do Regime Especial da Nota Fiscal Fácil.    ***Obrigatorio caso o emitente seja pessoa física***. |  [optional] |
|**IE** | **String** | Inscrição Estadual do emitemte.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**xNome** | **String** | Razão social ou Nome do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**xFant** | **String** | Nome fantasia do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**enderEmit** | [**MdfeSefazEndeEmi**](MdfeSefazEndeEmi.md) |  |  [optional] |



