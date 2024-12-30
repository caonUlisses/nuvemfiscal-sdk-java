

# NfeSefazTransp

Dados dos transportes da NF-e.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modFrete** | **Integer** | Modalidade do frete  * 0 - Contratação do Frete por conta do Remetente (CIF)  * 1 - Contratação do Frete por conta do destinatário/remetente (FOB)  * 2 - Contratação do Frete por conta de terceiros  * 3 - Transporte próprio por conta do remetente  * 4 - Transporte próprio por conta do destinatário  * 9 - Sem Ocorrência de transporte |  |
|**transporta** | [**NfeSefazTransporta**](NfeSefazTransporta.md) |  |  [optional] |
|**retTransp** | [**NfeSefazRetTransp**](NfeSefazRetTransp.md) |  |  [optional] |
|**veicTransp** | [**NfeSefazVeiculo**](NfeSefazVeiculo.md) |  |  [optional] |
|**reboque** | [**List&lt;NfeSefazVeiculo&gt;**](NfeSefazVeiculo.md) |  |  [optional] |
|**vagao** | **String** | Identificação do vagão (v2.0). |  [optional] |
|**balsa** | **String** | Identificação da balsa (v2.0). |  [optional] |
|**vol** | [**List&lt;NfeSefazVol&gt;**](NfeSefazVol.md) |  |  [optional] |



