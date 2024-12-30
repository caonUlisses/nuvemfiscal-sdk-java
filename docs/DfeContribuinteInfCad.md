

# DfeContribuinteInfCad

Informações cadastrais do contribuinte consultado.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ie** | **String** | Número da Inscrição Estadual do contribuinte. |  |
|**cnpj** | **String** | Número do CNPJ  do contribuinte. |  [optional] |
|**cpf** | **String** | Número do CPF do contribuinte. |  [optional] |
|**uf** | **String** | Sigla da UF de localização do contribuinte. Em algumas situações, a UF de localização pode ser diferente da UF consultada. Ex. IE de Substituto Tributário. |  |
|**situacaoCadastral** | **Integer** | Situação cadastral do contribuinte:  * 0 - não habilitado  * 1 - habilitado |  |
|**indicadorNfe** | **Integer** | Indicador de contribuinte credenciado a emitir NF-e.  * 0 - Não credenciado para emissão da NF-e  * 1 - Credenciado  * 2 - Credenciado com obrigatoriedade para todas operações  * 3 - Credenciado com obrigatoriedade parcial  * 4 - a SEFAZ não fornece a informação  Este indicador significa apenas que o contribuinte é credenciado para emitir NF-e na SEFAZ consultada. |  |
|**indicadorCte** | **Integer** | Indicador de contribuinte credenciado a emitir CT-e.  * 0 - Não credenciado para emissão da CT-e  * 1 - Credenciado  * 2 - Credenciado com obrigatoriedade para todas operações  * 3 - Credenciado com obrigatoriedade parcial  * 4 - a SEFAZ não fornece a informação  Este indicador significa apenas que o contribuinte é credenciado para emitir CT-e na SEFAZ consultada. |  |
|**nomeRazaoSocial** | **String** | Razão Social ou nome do contribuinte. |  |
|**nomeFantasia** | **String** | Razão Social ou nome do contribuinte. |  [optional] |
|**regimeApuracaoIcms** | **String** | Regime de Apuração do ICMS. |  [optional] |
|**cnae** | **String** | CNAE Fiscal do contribuinte. |  [optional] |
|**dataInicioAtividade** | **LocalDate** | Data de início de atividades do contribuinte. |  [optional] |
|**dataSituacaoCadastral** | **LocalDate** | Data da última modificação da situação cadastral do contribuinte. |  [optional] |
|**dataFimAtividade** | **LocalDate** | Data de ocorrência da baixa do contribuinte. |  [optional] |
|**ieUnica** | **String** | Inscrição Estadual Única. |  [optional] |
|**ieAtual** | **String** | Inscrição Estadual atual. |  [optional] |
|**endereco** | [**DfeContribuinteEndereco**](DfeContribuinteEndereco.md) |  |  [optional] |



