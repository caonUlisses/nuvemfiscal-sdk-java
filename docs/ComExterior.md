

# ComExterior

Grupo de informações relativas à exportação/importação de serviço prestado.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mdPrestacao** | **Integer** | Modo de Prestação:  * 0 - Desconhecido (tipo não informado na nota de origem)  * 1 - Transfronteiriço  * 2 - Consumo no Brasil  * 3 - Presença Comercial no Exterior  * 4 - Movimento Temporário de Pessoas Físicas |  |
|**vincPrest** | **Integer** | Vínculo entre as partes no negócio:  * 0 - Sem vínculo com o tomador/ Prestador  * 1 - Controlada  * 2 - Controladora  * 3 - Coligada  * 4 - Matriz  * 5 - Filial ou sucursal  * 6 - Outro vínculo |  |
|**tpMoeda** | **String** | Identifica a moeda da transação comercial. |  |
|**vServMoeda** | **BigDecimal** | Valor do serviço prestado expresso em moeda estrangeira especificada em tpmoeda. |  |
|**mecAFComexP** | **String** | Mecanismo de apoio/fomento ao Comércio Exterior utilizado pelo prestador do serviço:  * 00 - Desconhecido (tipo não informado na nota de origem)  * 01 - Nenhum  * 02 - ACC - Adiantamento sobre Contrato de Câmbio - Redução a Zero do IR e do IOF  * 03 - ACE - Adiantamento sobre Cambiais Entregues - Redução a Zero do IR e do IOF  * 04 - BNDES-Exim Pós-Embarque - Serviços  * 05 - BNDES-Exim Pré-Embarque - Serviços  * 06 - FGE - Fundo de Garantia à Exportação  * 07 - PROEX - EQUALIZAÇÃO  * 08 - PROEX - Financiamento |  |
|**mecAFComexT** | **String** | Mecanismo de apoio/fomento ao Comércio Exterior utilizado pelo tomador do serviço:  * 00 - Desconhecido (tipo não informado na nota de origem)  * 01 - Nenhum  * 02 - Adm. Pública e Repr. Internacional  * 03 - Alugueis e Arrend. Mercantil de maquinas, equip., embarc. e aeronaves  * 04 - Arrendamento Mercantil de aeronave para empresa de transporte aéreo público  * 05 - Comissão a agentes externos na exportação  * 06 - Despesas de armazenagem, mov. e transporte de carga no exterior  * 07 - Eventos FIFA (subsidiária)  * 08 - Eventos FIFA  * 09 - Fretes, arrendamentos de embarcações ou aeronaves e outros  * 10 - Material Aeronáutico  * 11 - Promoção de Bens no Exterior  * 12 - Promoção de Dest. Turísticos Brasileiros  * 13 - Promoção do Brasil no Exterior  * 14 - Promoção Serviços no Exterior  * 15 - RECINE  * 16 - RECOPA  * 17 - Registro e Manutenção de marcas, patentes e cultivares  * 18 - REICOMP  * 19 - REIDI  * 20 - REPENEC  * 21 - REPES  * 22 - RETAERO  * 23 - RETID  * 24 - Royalties, Assistência Técnica, Científica e Assemelhados  * 25 - Serviços de avaliação da conformidade vinculados aos Acordos da OMC  * 26 - ZPE |  |
|**movTempBens** | **Integer** | Operação está vinculada à Movimentação Temporária de Bens:  * 0 - Desconhecido (tipo não informado na nota de origem)  * 1 - Não  * 2 - Vinculada - Declaração de Importação  * 3 - Vinculada - Declaração de Exportação |  |
|**nDI** | **String** | Número da Declaração de Importação (DI/DSI/DA/DRI-E) averbado. |  [optional] |
|**nRE** | **String** | Número do Registro de Exportação (RE) averbado. |  [optional] |
|**mdic** | **Integer** | Compartilhar as informações da NFS-e gerada a partir desta DPS com a Secretaria de Comércio Exterior:  * 0 - Não enviar para o MDIC  * 1 - Enviar para o MDIC |  |


