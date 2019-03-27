#language: en
Feature: Buscar Teatros por filtros

  ########## ESSA AUTOMACAO TESTA A BUSCA DE TEATROS POR LOCALIZAÇAO VIA API - 30/01/2019 ##########
  ########## MICROSERVICOS ##########################################
  ########## @author FERNANDO LISBOA ########################################################################
  #
  ############################################################################################################
  # CT01.1 - BUSCAR EVENTOS POR CATEGORIAS
  ############################################################################################################
  Scenario Template: [SEARCH FILTER - THEATER] "<Cenario>"-"<DescricaoDoCenario>"
    Given que eu informe o ambiente a ser testado "<ambiente>"
    When eu enviar a pesquisa  atraves de um arquivo json"<jsonfile>"
    Then devo receber no reorno o id  Highlighted "<id>"
    And o a lista de peças por teatro

    @CT01.1
    Examples: 
      | Cenario | DescricaoDoCenario                              | jsonfile               | ambiente |
      | CT01.1  | Filtro de Teatro por localidade ambiente de DEV | filtroPorIdTeatro.json | dev      |

    @CT01.2
    Examples: 
      | Cenario | DescricaoDoCenario                              | jsonfile               | ambiente |
      | CT01.2  | Filtro de Teatro por localidade ambiente de HMG | filtroPorIdTeatro.json | hmg      |

    @CT01.3
    Examples: 
      | Cenario | DescricaoDoCenario                               | jsonfile               | ambiente |
      | CT01.3  | Filtro de Teatro por localidade ambiente de PROD | filtroPorIdTeatro.json | prod     |
