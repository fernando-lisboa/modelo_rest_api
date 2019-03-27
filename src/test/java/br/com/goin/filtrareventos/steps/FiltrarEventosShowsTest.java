package br.com.goin.filtrareventos.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.cucumber.listener.Reporter;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import br.com.goin.filtrareventos.application.TestApplication;
import br.com.goin.filtrareventos.application.TestApplication.Ambientes;
import br.com.goin.filtrareventos.dto.DataDto;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class FiltrarEventosShowsTest {

	private static final String JSON_FILES_PATH = "src/main/resources/json/events/";
	private TestApplication call;
	List<DataDto> listDataDto = new ArrayList<>();
	private List<DataDto> massaDeDadosList;
	private String step;
	Gson gson = new Gson();
	private String cT;

	@Dado("^que eu informe o ambiente de teste \"([^\"]*)\"$")
	public void queEuInformeOAmbienteDeTeste(Ambientes ambiente) throws Throwable {

		step = "Ambiente para teste: " + ambiente;
		call = new TestApplication<>(ambiente);

		Reporter.addStepLog(step);
	}

	@Quando("^eu enviar a pesquisa para a api\"([^\"]*)\"$")
	public void eu_enviar_a_pesquisa_para_a_api(String jsonFile) throws Throwable {

		step = "eu enviar a pesquisa para a api: " + jsonFile.toString();
		Reporter.addStepLog(step);

		List<Object> objects = call.apiCallList(JSON_FILES_PATH + jsonFile, new TypeToken<DataDto>() {
		}.getType());

		listDataDto = new ArrayList<>();
		for (Object dataDto : objects) {
			listDataDto.add((DataDto) dataDto);
		}

	}

	@Entao("^devo receber no reorno o id da categoria shows \"([^\"]*)\"$")
	public void devo_receber_no_reorno_o_id_da_categoria_shows(String idShows) throws Throwable {

		step = "devo receber no reorno o id da categoria shows: ";
		
		
		for (int index = 0; index <= listDataDto.size() - 1; index++) {

			if (listDataDto.get(index).getData().getSearchFilter().getEvents().isEmpty()) {

				System.out.println("posição " + "do resultado da Query está vazia");
			} else {

				// Valida se o Campo Total de Itens está vazio

				assertTrue("Não retornou corretamente o id solicitado ", listDataDto.get(index).getData()
						.getSearchFilter().getEvents().get(0).getSubcategories().get(1).equals(idShows));

				// Valida se o Campo Total de Itens está vazio

				assertTrue("Não retornou o campo TotalItens ",
						!listDataDto.get(index).getData().getSearchFilter().getTotalItems().equals(null));

				// Valida se o Campo TotaPages está vazio

				assertTrue("Não retornou o campo TotalPages ",
						!listDataDto.get(index).getData().getSearchFilter().getTotalPages().equals(null));

				// Valida se o Campo CurrentPages está vazio

				assertTrue("Não retornou o campo CurrentPage ",
						!listDataDto.get(index).getData().getSearchFilter().getCurrentPage().equals(null));

				// Valida se o Campo Address está vazio

				for (int indexEvent = 0; indexEvent <= listDataDto.get(index).getData().getSearchFilter().getEvents()
						.size() - 1; indexEvent++) {

					assertTrue("Não retornou o campo Address ", listDataDto.get(index).getData().getSearchFilter()
							.getEvents().get(indexEvent).getPlaceAddress() != null);

					// Valida se o Campo Name está vazio

					assertTrue("Não retornou o campo Name ", listDataDto.get(index).getData().getSearchFilter()
							.getEvents().get(indexEvent).getName() != null);

					// Valida se o Campo City está vazio

					assertTrue("Não retornou o campo City ", listDataDto.get(index).getData().getSearchFilter()
							.getEvents().get(indexEvent).getCity() != null);

					// Valida se o Campo Description está vazio

					assertTrue("Não retornou o campo Descripion ", listDataDto.get(index).getData().getSearchFilter()
							.getEvents().get(indexEvent).getDescription() != null);

					// Valida se o Campo EndDate está vazio

					assertTrue("Não retornou o campo City ", listDataDto.get(index).getData().getSearchFilter()
							.getEvents().get(indexEvent).getEndDate() != null);

					System.out.println("Index: " + index + "indexEvent: " + indexEvent);

				}

			}

		}
		String retornoConsulta = gson.toJson(listDataDto);
		Reporter.addStepLog(retornoConsulta);

	}

	/// #########################MÉTODOS
	/// AUXILIARES########################################################

	private void carregaMassaDeDados(String jsonfileRetorno) {

		massaDeDadosList = new ArrayList<DataDto>();
		try {

			Gson gson = new Gson();

			List<DataDto> listagson = gson.fromJson(retornaConteudoArquivoJson(JSON_FILES_PATH + jsonfileRetorno),
					new TypeToken<ArrayList<DataDto>>() {
					}.getType());

			massaDeDadosList.addAll(listagson);

		} catch (Exception e) {
			e.printStackTrace();
			// logger.error("Erro ao deserealizar massa de dados");
			fail();
		}

		String retorno = massaDeDadosList.get(0).toString();
	}

	private String retornaConteudoArquivoJson(String fileName) {
		JsonParser parser = new JsonParser();
		try {
			Object json = parser.parse(new FileReader(fileName));
			return json.toString();
		} catch (Exception e) {

			System.out.println(e);
		}
		return null;
	}

}
