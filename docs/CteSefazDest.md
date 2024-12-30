

# CteSefazDest

Informações do Destinatário do CT-e.  Poderá não ser informado para os CT-e de redespacho intermediário e serviço vinculado a multimodal. Nos demais casos deverá sempre ser informado.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CNPJ** | **String** | Número do CNPJ.  Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros.  Informar os zeros não significativos. |  [optional] |
|**CPF** | **String** | Número do CPF.  Informar os zeros não significativos. |  [optional] |
|**IE** | **String** | Inscrição Estadual.  Informar a IE do destinatário ou ISENTO se destinatário é contribuinte do ICMS isento de inscrição no cadastro de contribuintes do ICMS. Caso o destinatário não seja contribuinte do ICMS não informar o conteúdo. |  [optional] |
|**xNome** | **String** | Razão Social ou Nome do destinatário. |  |
|**fone** | **String** | Telefone. |  [optional] |
|**ISUF** | **String** | Inscrição na SUFRAMA.  (Obrigatório nas operações com as áreas com benefícios de incentivos fiscais sob controle da SUFRAMA). |  [optional] |
|**enderDest** | [**CteSefazEndereco**](CteSefazEndereco.md) |  |  |
|**email** | **String** | Endereço de email. |  [optional] |



