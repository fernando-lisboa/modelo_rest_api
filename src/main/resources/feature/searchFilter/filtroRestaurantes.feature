#language: en
Feature: Buscar RESTAURANTES por filtros

  ########## ESSA AUTOMACAO TESTA A BUSCA DE RESTAURANTES  POR LOCALIZAÇAO VIA API - 19/02/2019 ##########
  ########## MICROSERVICOS ##########################################
  ########## @author FERNANDO LISBOA ########################################################################
  #
  ############################################################################################################
  # CT01.1 - BUSCAR FILMES POR LOCALIDADE
  ############################################################################################################
  Scenario Template: [SEARCH FILTER - RESTAURANTES] "<Cenario>"-"<DescricaoDoCenario>"
    Given que eu informe o ambiente para teste de restaurantes "<ambiente>"
    When eu enviar a pesquisa com um arquivo filtrarRestaurantes json"<jsonfile>"
    Then devo receber no retorno dos restaurantes proximos a localizacao incormada

    @CT01.1
    Examples: 
      | Cenario | DescricaoDoCenario                                    | jsonfile                 | ambiente |
      | CT01.1  | Filtro de RESTAURANTES por localidade ambiente de DEV | filtrarRestaurantes.json | dev      |

    @CT01.2
    Examples: 
      | Cenario | DescricaoDoCenario                                    | jsonfile                 | ambiente |
      | CT01.2  | Filtro de RESTAURANTES por localidade ambiente de HMG | filtrarRestaurantes.json | hmg      |

    @CT01.3
    Examples: 
      | Cenario | DescricaoDoCenario                                     | jsonfile                 | ambiente |
      | CT01.3  | Filtro de RESTAURANTES por localidade ambiente de PROD | filtrarRestaurantes.json | prod     |
