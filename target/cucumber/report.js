$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/filtroEventsShowsTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "Buscar SHOWS POR CATEGORIA",
  "description": "",
  "id": "buscar-shows-por-categoria",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "########## ESSA AUTOMACAO TESTA A BUSCA DE SHOWS E CATEGORIAS VIA API - 30/01/2019 ##########"
    },
    {
      "line": 5,
      "value": "########## MICROSERVICOS ##########################################"
    },
    {
      "line": 6,
      "value": "########## @author FERNANDO LISBOA ########################################################################"
    },
    {
      "line": 7,
      "value": "#"
    },
    {
      "line": 8,
      "value": "############################################################################################################"
    },
    {
      "line": 9,
      "value": "# CT01.1 - BUSCAR SHOWS POR CATEGORIAS"
    },
    {
      "line": 10,
      "value": "############################################################################################################"
    }
  ],
  "line": 11,
  "name": "[SEARCH FILTER - SHOWS] \"\u003cCenario\u003e\"-\"\u003cDescricaoDoCenario\u003e\"",
  "description": "",
  "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\"",
  "type": "scenario_outline",
  "keyword": "Scenario Template"
});
formatter.step({
  "line": 12,
  "name": "que eu informe o ambiente de teste \"\u003cambiente\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "eu enviar a pesquisa para a api\"\u003cjsonfile\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "devo receber no reorno o id da categoria shows \"\u003cid\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";",
  "rows": [
    {
      "cells": [
        "Cenario",
        "DescricaoDoCenario",
        "jsonfile",
        "id",
        "ambiente"
      ],
      "line": 18,
      "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;1"
    },
    {
      "cells": [
        "CT01.1",
        "Filtro de baladas por localidade",
        "filtroPorIdEventsShows.json",
        "6a4f725a-8a04-49fa-85b3-e080d6d596ce",
        "dev"
      ],
      "line": 19,
      "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "[SEARCH FILTER - SHOWS] \"CT01.1\"-\"Filtro de baladas por localidade\"",
  "description": "",
  "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2",
  "type": "scenario",
  "keyword": "Scenario Template"
});
formatter.step({
  "line": 12,
  "name": "que eu informe o ambiente de teste \"dev\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "eu enviar a pesquisa para a api\"filtroPorIdEventsShows.json\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "devo receber no reorno o id da categoria shows \"6a4f725a-8a04-49fa-85b3-e080d6d596ce\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "dev",
      "offset": 36
    }
  ],
  "location": "FiltrarEventosShowsTest.queEuInformeOAmbienteDeTeste(TestApplication$Ambientes)"
});
formatter.result({
  "duration": 907858781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "filtroPorIdEventsShows.json",
      "offset": 32
    }
  ],
  "location": "FiltrarEventosShowsTest.eu_enviar_a_pesquisa_para_a_api(String)"
});
formatter.result({
  "duration": 2909435849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6a4f725a-8a04-49fa-85b3-e080d6d596ce",
      "offset": 48
    }
  ],
  "location": "FiltrarEventosShowsTest.devo_receber_no_reorno_o_id_da_categoria_shows(String)"
});
formatter.result({
  "duration": 3987981,
  "status": "passed"
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";",
  "rows": [
    {
      "cells": [
        "Cenario",
        "DescricaoDoCenario",
        "jsonfile",
        "id",
        "ambiente"
      ],
      "line": 23,
      "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;1"
    },
    {
      "cells": [
        "CT01.2",
        "Filtro de baladas por localidade",
        "filtroPorIdEventsShows.json",
        "6a4f725a-8a04-49fa-85b3-e080d6d596ce",
        "hmg"
      ],
      "line": 24,
      "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "[SEARCH FILTER - SHOWS] \"CT01.2\"-\"Filtro de baladas por localidade\"",
  "description": "",
  "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2",
  "type": "scenario",
  "keyword": "Scenario Template"
});
formatter.step({
  "line": 12,
  "name": "que eu informe o ambiente de teste \"hmg\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "eu enviar a pesquisa para a api\"filtroPorIdEventsShows.json\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "devo receber no reorno o id da categoria shows \"6a4f725a-8a04-49fa-85b3-e080d6d596ce\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hmg",
      "offset": 36
    }
  ],
  "location": "FiltrarEventosShowsTest.queEuInformeOAmbienteDeTeste(TestApplication$Ambientes)"
});
formatter.result({
  "duration": 4855622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "filtroPorIdEventsShows.json",
      "offset": 32
    }
  ],
  "location": "FiltrarEventosShowsTest.eu_enviar_a_pesquisa_para_a_api(String)"
});
formatter.result({
  "duration": 689252817,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6a4f725a-8a04-49fa-85b3-e080d6d596ce",
      "offset": 48
    }
  ],
  "location": "FiltrarEventosShowsTest.devo_receber_no_reorno_o_id_da_categoria_shows(String)"
});
formatter.result({
  "duration": 670066,
  "error_message": "java.lang.AssertionError: Não retornou o campo Descripion \n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat br.com.goin.filtrareventos.steps.FiltrarEventosShowsTest.devo_receber_no_reorno_o_id_da_categoria_shows(FiltrarEventosShowsTest.java:98)\n\tat ✽.Then devo receber no reorno o id da categoria shows \"6a4f725a-8a04-49fa-85b3-e080d6d596ce\"(src/main/resources/feature/filtroEventsShowsTest.feature:14)\n",
  "status": "failed"
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";",
  "rows": [
    {
      "cells": [
        "Cenario",
        "DescricaoDoCenario",
        "jsonfile",
        "id",
        "ambiente"
      ],
      "line": 28,
      "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;1"
    },
    {
      "cells": [
        "CT01.3",
        "Filtro de baladas por localidade",
        "filtroPorIdEventsShows.json",
        "6a4f725a-8a04-49fa-85b3-e080d6d596ce",
        "prod"
      ],
      "line": 29,
      "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "[SEARCH FILTER - SHOWS] \"CT01.3\"-\"Filtro de baladas por localidade\"",
  "description": "",
  "id": "buscar-shows-por-categoria;[search-filter---shows]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2",
  "type": "scenario",
  "keyword": "Scenario Template"
});
formatter.step({
  "line": 12,
  "name": "que eu informe o ambiente de teste \"prod\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "eu enviar a pesquisa para a api\"filtroPorIdEventsShows.json\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "devo receber no reorno o id da categoria shows \"6a4f725a-8a04-49fa-85b3-e080d6d596ce\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prod",
      "offset": 36
    }
  ],
  "location": "FiltrarEventosShowsTest.queEuInformeOAmbienteDeTeste(TestApplication$Ambientes)"
});
formatter.result({
  "duration": 2740755,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "filtroPorIdEventsShows.json",
      "offset": 32
    }
  ],
  "location": "FiltrarEventosShowsTest.eu_enviar_a_pesquisa_para_a_api(String)"
});
formatter.result({
  "duration": 633926846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6a4f725a-8a04-49fa-85b3-e080d6d596ce",
      "offset": 48
    }
  ],
  "location": "FiltrarEventosShowsTest.devo_receber_no_reorno_o_id_da_categoria_shows(String)"
});
formatter.result({
  "duration": 606683,
  "status": "passed"
});
});