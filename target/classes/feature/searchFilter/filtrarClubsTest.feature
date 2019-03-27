#language: en
Feature: Buscar Baladas pelos filtros de categorias e sub categorias validado campos obrigatórios

  ########## ESSA AUTOMACAO TESTA A BUSCA DE CLUBS E CATEGORIAS VIA API - 30/01/2019 ##########
  ########## MICROSERVICOS ##########################################
  ########## @author FERNANDO LISBOA ########################################################################
  #
  ############################################################################################################
  # CT01.1 - BUSCAR EVENTOS POR CATEGORIAS
  ############################################################################################################
  Scenario Template: [SEARCH FILTER - CLUBS] "<Scenario>"-"<DescricaoDoCenario>"
    Given que eu informe o ambiente desejado para teste "<ambiente>", "<ct>"
    When eu enviar a pesquisa para a api informando o arquivo "<jsonfile>"
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
