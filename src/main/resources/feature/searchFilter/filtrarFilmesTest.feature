#language: en
Feature: Buscar Filmes por filtros

  ########## ESSA AUTOMACAO TESTA A BUSCA DE Filmes POR LOCALIZAÇAO VIA API - 19/02/2019 ##########
  ########## MICROSERVICOS ##########################################
  ########## @author FERNANDO LISBOA ########################################################################
  #
  ############################################################################################################
  # CT01.1 - BUSCAR FILMES POR LOCALIDADE
  ############################################################################################################
  Scenario Template: [SEARCH FILTER - MOVIES] "<Scenario>"-"<DescricaoDoCenario>"
    Given que eu informe o ambiente para teste "<ambiente>"
    When eu enviar a pesquisa com um arquivo json"<jsonfile>"
    Then devo receber no reorno dos filmes

    @CT01.1
    Examples: 
      | Scenario | DescricaoDoCenario                              | jsonfile          | ambiente |
      | CT01.1  | Filtro de FILMES por localidade ambiente de DEV | filtroFilmes.json | dev      |

    @CT01.2
    Examples: 
      | Scenario | DescricaoDoCenario                              | jsonfile          | ambiente |
      | CT01.2  | Filtro de FILMES por localidade ambiente de HMG | filtroFilmes.json | hmg      |

    @CT01.3
    Examples: 
      | Scenario | DescricaoDoCenario                               | jsonfile          | ambiente |
      | CT01.3  | Filtro de FILMES por localidade ambiente de PROD | filtroFilmes.json | prod     |
