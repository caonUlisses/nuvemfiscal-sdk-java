

# NfeSefazEmit

Identificação do emitente.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CNPJ** | **String** | Número do CNPJ do emitente.    ***Obrigatório caso o emitente seja pessoa jurídica***. |  [optional] |
|**CPF** | **String** | Número do CPF do emitente.    ***Obrigatorio caso o emitente seja pessoa física***. |  [optional] |
|**xNome** | **String** | Razão Social ou Nome do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**xFant** | **String** | Nome fantasia.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**enderEmit** | [**NfeSefazEnderEmi**](NfeSefazEnderEmi.md) |  |  [optional] |
|**IE** | **String** | Inscrição Estadual do Emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**IEST** | **String** | Inscricao Estadual do Substituto Tributário.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**IM** | **String** | Inscrição Municipal.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**CNAE** | **String** | CNAE Fiscal.    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |
|**CRT** | **Integer** | Código de Regime Tributário.  Este campo será obrigatoriamente preenchido com:  * 1 - Simples Nacional  * 2 - Simples Nacional - excesso de sublimite de receita bruta  * 3 - Regime Normal  * 4 - Simples Nacional - Microempreendedor individual - MEI    *Caso não seja informado, será utilizado o do cadastro da empresa.* |  [optional] |



