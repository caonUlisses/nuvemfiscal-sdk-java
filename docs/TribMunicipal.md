

# TribMunicipal

Grupo de informações relacionados ao Imposto Sobre Serviços de Qualquer Natureza - ISSQN.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tribISSQN** | **Integer** | Tributação do ISSQN sobre o serviço prestado:  * 1 - Operação tributável  * 2 - Imunidade  * 3 - Exportação de serviço  * 4 - Não Incidência |  |
|**cLocIncid** | **String** | Código do município de incidência do ISSQN (tabela do IBGE).    Caso o envio seja pelo Sistema Nacional NFS-e, essa propriedade é ignorada e o município de incidência do ISSQN é determinado automaticamente pela SEFIN nacional, conforme regras do aspecto espacial da lei complementar federal (LC 116/03) que são válidas para todos os municípios. |  [optional] |
|**cPaisResult** | **String** | Código do país onde se verficou o resultado da prestação do serviço para o caso de Exportação de Serviço.(Tabela de Países ISO). |  [optional] |
|**BM** | [**BeneficioMunicipal**](BeneficioMunicipal.md) |  |  [optional] |
|**exigSusp** | [**ExigSuspensa**](ExigSuspensa.md) |  |  [optional] |
|**tpImunidade** | **Integer** | Identificação da Imunidade do ISSQN - somente para o caso de Imunidade:  * 0 - Imunidade (tipo não informado na nota de origem)  * 1 - Patrimônio, renda ou serviços, uns dos outros (CF88, Art 150, VI, a)  * 2 - Templos de qualquer culto (CF88, Art 150, VI, b)  * 3 - Patrimônio, renda ou serviços dos partidos políticos, inclusive suas fundações, das entidades sindicais dos trabalhadores, das instituições de educação e de assistência social, sem fins lucrativos, atendidos os requisitos da lei (CF88, Art 150, VI, c)  * 4 - Livros, jornais, periódicos e o papel destinado a sua impressão (CF88, Art 150, VI, d) |  [optional] |
|**vBC** | **BigDecimal** | Valor da Base de Cálculo do ISSQN (R$).    Caso você não informe esse campo, vamos calculá-lo automaticamente.    **Atenção**: Para emissões pelo Sistema Nacional NFS-e, esse campo é ignorado e o valor é determinado automaticamente pela SEFIN nacional. |  [optional] |
|**pAliq** | **BigDecimal** | Valor da alíquota (%%) do serviço prestado relativo ao município sujeito ativo (município de incidência) do ISSQN.    **Observações**:  * Se o município de incidência pertence ao Sistema Nacional NFS-e a alíquota estará parametrizada e, portanto, será fornecida pelo sistema.  * Se o município de incidência não pertence ao Sistema Nacional NFS-e a alíquota não estará parametrizada e, por isso, deverá ser fornecida pelo emitente. |  [optional] |
|**vISSQN** | **BigDecimal** | Valor do ISSQN (R$).    Caso você não informe esse campo, vamos calculá-lo automaticamente.    **Atenção**: Para emissões pelo Sistema Nacional NFS-e, esse campo é ignorado e o valor é determinado automaticamente pela SEFIN nacional. |  [optional] |
|**tpRetISSQN** | **Integer** | Tipo de retencao do ISSQN:  * 1 - Não Retido  * 2 - Retido pelo Tomador  * 3 - Retido pelo Intermediario |  [optional] |
|**vLiq** | **BigDecimal** | Valor Líquido (R$).    Caso você não informe esse campo, vamos calculá-lo automaticamente.    **Atenção**: Para emissões pelo Sistema Nacional NFS-e, esse campo é ignorado e o valor é determinado automaticamente pela SEFIN nacional. |  [optional] |



