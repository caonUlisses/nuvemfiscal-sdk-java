

# NfcomSefazAssinante

Dados do assinante.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**iCodAssinante** | **String** | Código único de Identificação do assinante. |  |
|**tpAssinante** | **Integer** | Tipo de assinante.  * 1 - Comercial  * 2 - Industrial  * 3 - Residencial/Pessoa Física  * 4 - Produtor Rural  * 5 - Órgão da administração pública estadual direta e suas fundações e autarquias, quando mantidas pelo poder público estadual e regidas por normas de direito público, nos termos do Convênio ICMS 107/95  * 6 - Prestador de serviço de telecomunicação responsável pelo recolhimento do imposto incidente sobre a cessão dos meios de rede do prestador do serviço ao usuário final, nos termos do Convênio ICMS 17/13  * 7 - Missões Diplomáticas, Repartições Consulares e Organismos Internacionais, nos termos do Convênio ICMS 158/94  * 8 - Igrejas e Templos de qualquer natureza  * 99 - Outros não especificados anteriormente |  |
|**tpServUtil** | **Integer** | Tipo de serviço utilizado.  * 1 - Telefonia  * 2 - Comunicação de dados  * 3 - TV por Assinatura  * 4 - Provimento de acesso à Internet  * 5 - Multimídia  * 6 - Outros  * 7 - Varios |  |
|**nContrato** | **String** | Número do Contrato do assinante. |  [optional] |
|**dContratoIni** | **LocalDate** | Data de início do contrato.  Formato AAAA-MM-DD. |  [optional] |
|**dContratoFim** | **LocalDate** | Data de término do contrato.  Formato AAAA-MM-DD. |  [optional] |
|**nroTermPrinc** | **String** | Número do Terminal Principal do serviço contratado.  Em se tratando de plano de prestação de serviço telefônico corporativo, familiar ou similares, informar o número do terminal telefônico principal do plano. |  [optional] |
|**cUFPrinc** | **Integer** | Código da UF de habilitação do terminal.  Utilizar a  Tabela do IBGE de código de unidades da federação. |  [optional] |
|**nroTermAdic** | **String** | Número dos Terminais adicionais do serviço contratado. |  [optional] |
|**cUFAdic** | **Integer** | Código da UF de habilitação do terminal. |  [optional] |



