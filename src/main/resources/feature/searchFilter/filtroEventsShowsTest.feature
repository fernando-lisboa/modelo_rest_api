#language: en
Feature: Buscar SHOWS POR CATEGORIA

  ########## ESSA AUTOMACAO TESTA A BUSCA DE SHOWS E CATEGORIAS VIA API - 30/01/2019 ##########
  ########## MICROSERVICOS ##########################################
  ########## @author FERNANDO LISBOA ########################################################################
  #
  ############################################################################################################
  # CT01.1 - BUSCAR SHOWS POR CATEGORIAS
  ############################################################################################################
  Scenario Template: [SEARCH FILTER - SHOWS] "<Cenario>"-"<DescricaoDoCenario>"
    Given que eu informe o ambiente de teste "<ambiente>"
    When eu enviar a pesquisa para a api"<jsonfile>"
    Then devo receber no reorno o id da categoria shows "<id>"

    @CT01.1
    Examples: 
      | Cenario | DescricaoDoCenario               | jsonfile                    | id                                   | ambiente |
      | CT01.1  | Filtro de baladas por localidade | filtroPorIdEventsShows.json | 6a4f725a-8a04-49fa-85b3-e080d6d596ce | dev      |

    @CT01.2
    Examples: 
      | Cenario | DescricaoDoCenario               | jsonfile                    | id                                   | ambiente |
      | CT01.2  | Filtro de baladas por localidade | filtroPorIdEventsShows.json | 6a4f725a-8a04-49fa-85b3-e080d6d596ce | hmg      |

    @CT01.3
    Examples: 
      | Cenario | DescricaoDoCenario               | jsonfile                    | id                                   | ambiente |
      | CT01.3  | Filtro de baladas por localidade | filtroPorIdEventsShows.json | 6a4f725a-8a04-49fa-85b3-e080d6d596ce | prod      |
