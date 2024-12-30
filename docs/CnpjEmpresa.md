

# CnpjEmpresa


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cnpj** | **String** | Número de inscrição do CNPJ. |  [optional] |
|**razaoSocial** | **String** | Nome empresarial da pessoa jurídica. |  [optional] |
|**nomeFantasia** | **String** | Corresponde ao nome fantasia. |  [optional] |
|**dataInicioAtividade** | **LocalDate** | Data de início da atividade. |  [optional] |
|**matriz** | **Boolean** | Indicador de matriz/filial:  * &#x60;true&#x60; - É matriz  * &#x60;false&#x60; - É filial |  [optional] |
|**naturezaJuridica** | [**CnpjNaturezaJuridica**](CnpjNaturezaJuridica.md) |  |  [optional] |
|**capitalSocial** | **BigDecimal** | Capital social da empresa. |  [optional] |
|**porte** | [**CnpjPorteEmpresa**](CnpjPorteEmpresa.md) |  |  [optional] |
|**enteFederativoResponsavel** | **String** | O ente federativo responsável é preenchido para os casos de órgãos e  entidades do grupo de natureza jurídica 1XXX. Para as demais naturezas,  este atributo fica em branco. |  [optional] |
|**situacaoCadastral** | [**CnpjSituacaoCadastral**](CnpjSituacaoCadastral.md) |  |  [optional] |
|**motivoSituacaoCadastral** | [**CnpjMotivoSituacaoCadastral**](CnpjMotivoSituacaoCadastral.md) |  |  [optional] |
|**nomeDaCidadeNoExterior** | **String** | Nome da cidade no exterior. |  [optional] |
|**pais** | [**CnpjPais**](CnpjPais.md) |  |  [optional] |
|**atividadePrincipal** | [**CnpjCnae**](CnpjCnae.md) |  |  [optional] |
|**atividadesSecundarias** | [**List&lt;CnpjCnaeSecundario&gt;**](CnpjCnaeSecundario.md) |  |  [optional] |
|**endereco** | [**CnpjEndereco**](CnpjEndereco.md) |  |  [optional] |
|**telefones** | [**List&lt;CnpjTelefone&gt;**](CnpjTelefone.md) |  |  [optional] |
|**email** | **String** | E-mail do contribuinte. |  [optional] |
|**situacaoEspecial** | [**CnpjSituacaoEspecial**](CnpjSituacaoEspecial.md) |  |  [optional] |
|**simples** | [**CnpjOpcaoSimples**](CnpjOpcaoSimples.md) |  |  [optional] |
|**simei** | [**CnpjOpcaoSimei**](CnpjOpcaoSimei.md) |  |  [optional] |
|**socios** | [**List&lt;CnpjSocio&gt;**](CnpjSocio.md) |  |  [optional] |



