

# InfoTomador

Grupo de informações do DPS relativas ao Tomador de Serviços.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgaoPublico** | **Boolean** | Indica se o tomador do serviço é um orgão público.    **Atenção**: Para emissões pelo Sistema Nacional NFS-e, esse campo é ignorado. |  [optional] |
|**CNPJ** | **String** | Número do CNPJ. |  [optional] |
|**CPF** | **String** | Número do CPF. |  [optional] |
|**NIF** | **String** | Número de Identificação Fiscal fornecido por órgão de administração tributária no exterior. |  [optional] |
|**cNaoNIF** | **Integer** | Motivo para não informação do NIF:  * 0 - Não informado na nota de origem  * 1 - Dispensado do NIF  * 2 - Não exigência do NIF |  [optional] |
|**CAEPF** | **String** | Número do Cadastro de Atividade Econômica da Pessoa Física (CAEPF). |  [optional] |
|**IM** | **String** | Número da inscrição municipal. |  [optional] |
|**xNome** | **String** | Nome/Nome Empresarial. |  |
|**end** | [**Endereco**](Endereco.md) |  |  [optional] |
|**fone** | **String** | Número do telefone do prestador:  Preencher com o Código DDD + número do telefone.  Nas operações com exterior é permitido informar o código do país + código da localidade + número do telefone). |  [optional] |
|**email** | **String** | * E-mail |  [optional] |



