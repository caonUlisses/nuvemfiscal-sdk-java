

# CteSefazIde

Identificação do CT-e.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cUF** | **Integer** | Código da UF do emitente do CT-e.  Utilizar a Tabela do IBGE. |  |
|**cCT** | **String** | Código numérico que compõe a Chave de Acesso.  Número aleatório gerado pelo emitente para cada CT-e, com o objetivo de evitar acessos indevidos ao documento.    *Geramos automaticamente quando nenhum valor é informado.* |  [optional] |
|**CFOP** | **String** | Código Fiscal de Operações e Prestações. |  |
|**natOp** | **String** | Natureza da Operação. |  |
|**mod** | **Integer** | Modelo do documento fiscal.  Utilizar o código 57 para identificação do CT-e, emitido em substituição aos modelos de conhecimentos em papel. |  [optional] |
|**serie** | **Integer** | Série do CT-e.  Preencher com \&quot;0\&quot; no caso de série única. |  |
|**nCT** | **Integer** | Número do CT-e. |  |
|**dhEmi** | **OffsetDateTime** | Data e hora de emissão do CT-e.  Formato AAAA-MM-DDTHH:MM:DD TZD. |  |
|**tpImp** | **Integer** | Formato de impressão do DACTE:  * 1 - Retrato  * 2 - Paisagem |  |
|**tpEmis** | **Integer** | Forma de emissão do CT-e.  Preencher com:  * 1 - Normal  * 3 - Regime Especial NFF  * 4 - EPEC pela SVC  * 5 - Contingência FSDA  * 7 - Autorização pela SVC-RS  * 8 - Autorização pela SVC-SP |  |
|**cDV** | **Integer** | Digito Verificador da chave de acesso do CT-e.  Informar o dígito  de controle da chave de acesso do CT-e, que deve ser calculado com a aplicação do algoritmo módulo 11 (base 2,9) da chave de acesso.    *Geramos automaticamente quando nenhum valor é informado.* |  [optional] |
|**tpAmb** | **Integer** | Tipo do Ambiente:  * 1 - Produção  * 2 - Homologação |  [optional] |
|**tpCTe** | **Integer** | Tipo do CT-e.  Preencher com:  * 0 - CT-e Normal  * 1 - CT-e de Complemento de Valores  * 3 - CT-e de Substituição |  |
|**procEmi** | **Integer** | Identificador do processo de emissão do CT-e.  Preencher com:  * 0 - emissão de CT-e com aplicativo do contribuinte  * 3 - emissão CT-e pelo contribuinte com aplicativo fornecido pelo SEBRAE |  |
|**verProc** | **String** | Versão do processo de emissão.  Iinformar a versão do aplicativo emissor de CT-e. |  |
|**indGlobalizado** | **Integer** | Indicador de CT-e Globalizado.  Informar valor 1 quando for Globalizado e não informar a tag quando não tratar de CT-e Globalizado. |  [optional] |
|**cMunEnv** | **String** | Código do Município de envio do CT-e (de onde o documento foi transmitido).  Utilizar a tabela do IBGE. Informar 9999999 para as operações com o exterior. |  |
|**xMunEnv** | **String** | Nome do Município de envio do CT-e (de onde o documento foi transmitido).  Informar PAIS/Municipio para as operações com o exterior. |  |
|**ufEnv** | **String** | Sigla da UF de envio do CT-e (de onde o documento foi transmitido).  Informar &#39;EX&#39; para operações com o exterior. |  |
|**modal** | **String** | Modal. Preencher com:  * 01 - Rodoviário  * 02 - Aéreo  * 03 - Aquaviário  * 04 - Ferroviário  * 05 - Dutoviário  * 06 - Multimodal |  |
|**tpServ** | **Integer** | Tipo do Serviço.  Preencher com:  * 0 - Normal  * 1 - Subcontratação  * 2 - Redespacho  * 3 - Redespacho Intermediário  * 4 - Serviço Vinculado a Multimodal |  |
|**cMunIni** | **String** | Código do Município de início da prestação.  Utilizar a tabela do IBGE. Informar 9999999 para operações com o exterior. |  |
|**xMunIni** | **String** | Nome do Município do início da prestação.  Informar &#39;EXTERIOR&#39; para operações com o exterior. |  |
|**ufIni** | **String** | UF do início da prestação.  Informar &#39;EX&#39; para operações com o exterior. |  |
|**cMunFim** | **String** | Código do Município de término da prestação.  Utilizar a tabela do IBGE. Informar 9999999 para operações com o exterior. |  |
|**xMunFim** | **String** | Nome do Município do término da prestação.  Informar &#39;EXTERIOR&#39; para operações com o exterior. |  |
|**ufFim** | **String** | UF do término da prestação.  Informar &#39;EX&#39; para operações com o exterior. |  |
|**retira** | **Integer** | Indicador se o Recebedor retira no Aeroporto, Filial, Porto ou Estação de Destino? Preencher com:  * 0 - Sim  * 1 - Não |  |
|**xDetRetira** | **String** | Detalhes do retira. |  [optional] |
|**indIEToma** | **Integer** | Indicador do papel do tomador na prestação do serviço:  * 1 - Contribuinte ICMS  * 2 - Contribuinte isento de inscrição  * 9 - Não Contribuinte  Aplica-se ao tomador que for indicado no toma3 ou toma4. |  |
|**toma3** | [**CteSefazToma3**](CteSefazToma3.md) |  |  [optional] |
|**toma4** | [**CteSefazToma4**](CteSefazToma4.md) |  |  [optional] |
|**dhCont** | **OffsetDateTime** | Data e Hora da entrada em contingência.  Informar a data e hora no formato AAAA-MM-DDTHH:MM:SS. |  [optional] |
|**xJust** | **String** | Justificativa da entrada em contingência. |  [optional] |



