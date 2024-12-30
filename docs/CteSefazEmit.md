

# CteSefazEmit

Identificação do Emitente do CT-e.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CNPJ** | **String** | CNPJ do emitente.  Informar zeros não significativos.    ***Obrigatório caso o emitente seja pessoa jurídica***. |  [optional] |
|**CPF** | **String** | CPF do emitente.  Informar zeros não significativos.  Usar com série específica 920-969 para emitente pessoa física com inscrição estadual.    ***Obrigatorio caso o emitente seja pessoa física***. |  [optional] |
|**IE** | **String** | Inscrição Estadual do Emitente.  A IE do emitente somente ficará sem informação para o caso do Regime Especial da NFF (tpEmis&#x3D;3).    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**IEST** | **String** | Inscrição Estadual do Substituto Tributário. |  [optional] |
|**xNome** | **String** | Razão social ou Nome do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**xFant** | **String** | Nome fantasia.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**enderEmit** | [**CteSefazEndeEmi**](CteSefazEndeEmi.md) |  |  [optional] |
|**CRT** | **Integer** | Código do Regime Tributário. Informar:  * 1 - Simples Nacional;  * 2 - Simples Nacional, excesso sublimite de receita bruta;  * 3 - Regime Normal;  * 4 - Simples Nacional - Microempreendedor Individual (MEI).    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |



