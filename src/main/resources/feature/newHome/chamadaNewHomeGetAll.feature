#language: en
Feature: Chamada da nova Home para trazer Eventos em Destaques, Essa Semana e Proximos Eventos

  ########## ESSA AUTOMACAO TESTA A BUSCA DA NOVA HOME VIA API - 28/01/2019 ##########
  ########## MICROSERVICOS ##########################################
  ########## @author FERNANDO LISBOA ########################################################################
  #
  ############################################################################################################
  # CT01.1 - BUSCAR EVENTOS POR CATEGORIAS
  ############################################################################################################
  Scenario Template: [NEW HOME] "<Scenario>"-"<DescricaoDoCenario>"
    Given que eu informe o ambiente desejado para teste "<ambiente>"
    When eu enviar a chamada da nova home passando cidade e uf "<city>", "<uf>"
    Then devo receber no reorno o do filtro informado "<jsonfileRetorno>"

    @CT01.1
    Examples: 
      | Scenario | DescricaoDoCenario                             | jsonfile              | jsonfileRetorno              | ambiente |
      | CT01.1   | Filtro de Clubs por localidade ambiente de DEV | filtroPorIdClubs.json | filtroPorIdClubsRetorno.json | dev      |

    @CT01.2
    Examples: 
      | Scenario | DescricaoDoCenario                             | jsonfile              | jsonfileRetorno              | ambiente |
      | CT01.2   | Filtro de Clubs por localidade ambiente de HMG | filtroPorIdClubs.json | filtroPorIdClubsRetorno.json | hmg      |

    @CT01.3
    Examples: 
      | Scenario | DescricaoDoCenario                              | jsonfile              | jsonfileRetorno              | ambiente |
      | CT01.3   | Filtro de Clubs por localidade ambiente de PROD | filtroPorIdClubs.json | filtroPorIdClubsRetorno.json | prod     |