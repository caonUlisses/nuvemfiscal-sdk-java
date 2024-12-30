

# DistribuicaoNfePedidoManifestacao


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpfCnpj** | **String** | CPF ou CNPJ do autor do evento.    *Utilize o valor sem máscara*. |  |
|**ambiente** | [**AmbienteEnum**](#AmbienteEnum) | Identificação do Ambiente. |  |
|**chaveAcesso** | **String** | Chave de Acesso da NF-e. |  |
|**tipoEvento** | **String** | Tipo do evento de manifestação do destinatário.    Valores disponíveis:  * &#x60;210200&#x60; - Confirmação da operação;  * &#x60;210210&#x60; - Ciência da operação;  * &#x60;210220&#x60; - Desconhecimento da operação;  * &#x60;210240&#x60; - Operação não realizada. |  |
|**justificativa** | **String** | Justificativa para o desconhecimento ou não-realização da operação.    **Nota**: Campo obrigatório para o evento &#x60;210240&#x60; (operação não realizada). |  [optional] |



## Enum: AmbienteEnum

| Name | Value |
|---- | -----|
| HOMOLOGACAO | &quot;homologacao&quot; |
| PRODUCAO | &quot;producao&quot; |



