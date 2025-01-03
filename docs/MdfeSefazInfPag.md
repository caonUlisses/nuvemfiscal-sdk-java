

# MdfeSefazInfPag

Informações do Pagamento do Frete.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**xNome** | **String** | Razão social ou Nome do respnsável pelo pagamento. |  [optional] |
|**CPF** | **String** | Número do CPF do responsável pelo pgto.  Informar os zeros não significativos. |  [optional] |
|**CNPJ** | **String** | Número do CNPJ do responsável pelo pgto.  Informar os zeros não significativos. |  [optional] |
|**idEstrangeiro** | **String** | Identificador do responsável pelo pgto em caso de ser estrangeiro. |  [optional] |
|**comp** | [**List&lt;MdfeSefazComp&gt;**](MdfeSefazComp.md) |  |  |
|**vContrato** | **BigDecimal** | Valor Total do Contrato. |  |
|**indAltoDesemp** | **Integer** | Indicador de operação de transporte de alto desempenho.  Operação de transporte com utilização de veículos de frotas dedicadas ou fidelizadas.  Preencher com “1” para indicar operação de transporte de alto desempenho, demais casos não informar a tag. |  [optional] |
|**indPag** | **Integer** | Indicador da Forma de Pagamento:0-Pagamento à Vista  * 1 - Pagamento à Prazo |  |
|**vAdiant** | **BigDecimal** | Valor do Adiantamento (usar apenas em pagamento à Prazo. |  [optional] |
|**indAntecipaAdiant** | **Integer** | Indicador para declarar concordância em antecipar o adiantamento.  Informar a tag somente se for autorizado antecipar o adiantamento. |  [optional] |
|**infPrazo** | [**List&lt;MdfeSefazInfPrazo&gt;**](MdfeSefazInfPrazo.md) |  |  [optional] |
|**tpAntecip** | **Integer** | Tipo de Permissão em relação a antecipação das parcelas.  * 0 - Não permite antecipar  * 1 - Permite antecipar as parcelas  * 2 - Permite antecipar as parcelas mediante confirmação |  [optional] |
|**infBanc** | [**MdfeSefazInfBanc**](MdfeSefazInfBanc.md) |  |  |



