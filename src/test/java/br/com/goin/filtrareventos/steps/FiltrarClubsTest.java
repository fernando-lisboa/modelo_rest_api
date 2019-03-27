package br.com.goin.filtrareventos.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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

public class FiltrarClubsTest {

	// Local de armazenamento de arquivo Json
	private static final String JSON_FILES_PATH = "src/main/resources/json/clubs/";

	/// #########################DECLARAÇÃO DE
	/// VARIÁVEIS########################################################
	private TestApplication call;
	List<DataDto> listDataDto = new ArrayList<>();
	private List<DataDto> massaDeDadosList;

	private String step;
	Gson gson = new Gson();
	private String cT;

	// #########################MÉTODOS DE//
	// TESTES########################################################
	@SuppressWarnings("unlikely-arg-type")
	@Dado("^que eu informe o ambiente desejado para teste \"([^\"]*)\", \"([^\"]*)\"$")
	public void que_eu_informe_o_ambiente_desejado_para_teste(Ambientes ambiente, String ct) throws Throwable {

		cT = ct;
		step = "Ambiente para teste: " + ambiente;

		call = new TestApplication<>(ambiente);

		Reporter.addStepLog(step);
	}

	@Quando("^eu enviar a pesquisa para a api informando o arquivo \"([^\"]*)\"$")
	public void eu_enviar_a_pesquisa_para_a_api_informando_o_arquivo(String jsonFile) throws Throwable {

		step = "eu enviar a pesquisa para a api informando o arquivo: " + jsonFile.toString();
		Reporter.addStepLog(step);

		List<Object> objects = call.apiCallList(JSON_FILES_PATH + jsonFile, new TypeToken<DataDto>() {
		}.getType());

		listDataDto = new ArrayList<>();
		for (Object dataDto : objects) {
			listDataDto.add((DataDto) dataDto);

		}

	}

	@Entao("^devo receber no reorno o do filtro informado \"([^\"]*)\"$")
	public void devo_receber_no_reorno_o_do_filtro_informado(String jsonfileRetorno) throws Throwable {

		// Carrega massa de Entrada
		carregaMassaDeDados(jsonfileRetorno);

		step = "devo receber no reorno o id da categoria shows: " + jsonfileRetorno;

		for (int index = 0; index <= listDataDto.size() - 1; index++) {

			if (listDataDto.get(index).getData().getSearchFilter().getClubs().isEmpty()) {

				System.out.println("posição " + index + " do resultado da Query está vazia");
			} else {

				if (cT.equals("CT01.1")) {

					assertTrue("Quantidade de Clubs retornado diferente do esperado",
							listDataDto.get(index).getData().getSearchFilter().getClubs().get(0).getSubcategoriesInfo()
									.get(0).getSubcategoryId()
									.equals(massaDeDadosList.get(index).getData().getSearchFilter().getClubs().get(0)
											.getSubcategoriesInfo().get(0).getSubcategoryId()));

					assertTrue("Quantidade de Clubs retornado diferente do esperado",
							listDataDto.get(index).getData().getSearchFilter().getClubs().get(0).getSubcategoriesInfo()
									.get(0).getName().equals(massaDeDadosList.get(index).getData().getSearchFilter()
											.getClubs().get(0).getSubcategoriesInfo().get(0).getName()));

				}

				// Valida se o Campo Total de Itens está vazio

				assertTrue("Não retornou o campo TotalItens ",
						listDataDto.get(index).getData().getSearchFilter().getTotalItems() != null);

				// Valida se o Campo TotaPages está vazio

				assertTrue("Não retornou o campo TotalPages ",
						listDataDto.get(index).getData().getSearchFilter().getTotalPages() != null);

				// Valida se o Campo CurrentPages está vazio

				assertTrue("Não retornou o campo CurrentPage ",
						listDataDto.get(index).getData().getSearchFilter().getCurrentPage() != null);

				for (int indexClub = 0; indexClub <= listDataDto.get(index).getData().getSearchFilter().getClubs()
						.size() - 1; indexClub++) {

					assertTrue("Não retornou o campo Address ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getAddress() != null);

					// Valida se o Campo Name está vazio

					assertTrue("Não retornou o campo Name ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getName() != null);

					// Valida se o Campo City está vazio

					assertTrue("Não retornou o campo City ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getCity() != null);

					// Valida se o Campo SubcategoryId{Name} está vazio

					assertTrue("Não retornou o campo City ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getSubcategoriesInfo().get(0).getName() != null);

					System.out.println("Index: " + index + "indexClub: " + indexClub);
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
