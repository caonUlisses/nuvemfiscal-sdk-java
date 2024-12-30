

# NfeSefazNFref

Grupo de infromações da NF referenciada.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refNFe** | **String** | Chave de acesso das NF-e referenciadas. Chave de acesso compostas por Código da UF (tabela do IBGE) + AAMM da emissão + CNPJ do Emitente + modelo, série e número da NF-e Referenciada + Código Numérico + DV. |  [optional] |
|**refNFeSig** | **String** | Referencia uma NF-e (modelo 55) emitida anteriormente pela sua Chave de Acesso com código numérico zerado, permitindo manter o sigilo da NF-e referenciada. |  [optional] |
|**refNF** | [**NfeSefazRefNF**](NfeSefazRefNF.md) |  |  [optional] |
|**refNFP** | [**NfeSefazRefNFP**](NfeSefazRefNFP.md) |  |  [optional] |
|**refCTe** | **String** | Utilizar esta TAG para referenciar um CT-e emitido anteriormente, vinculada a NF-e atual. |  [optional] |
|**refECF** | [**NfeSefazRefECF**](NfeSefazRefECF.md) |  |  [optional] |



