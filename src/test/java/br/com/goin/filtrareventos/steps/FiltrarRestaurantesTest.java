package br.com.goin.filtrareventos.steps;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.cucumber.listener.Reporter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.goin.filtrareventos.application.TestApplication;
import br.com.goin.filtrareventos.application.TestApplication.Ambientes;
import br.com.goin.filtrareventos.dto.DataDto;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class FiltrarRestaurantesTest {

	private static final String JSON_FILES_PATH = "src/main/resources/json/restaurantes/";
	private TestApplication call;
	List<DataDto> listDataDto = new ArrayList<>();
	private String step;
	Gson gson = new Gson();

	@Dado("^que eu informe o ambiente para teste de restaurantes \"([^\"]*)\"$")
	public void que_eu_informe_o_ambiente_para_teste_de_restaurantes(Ambientes ambiente) throws Throwable {

		step = "Ambiente para teste: " + ambiente;

		call = new TestApplication<>(ambiente);

		Reporter.addStepLog(step);
	}

	@Quando("^eu enviar a pesquisa com um arquivo filtrarRestaurantes json\"([^\"]*)\"$")
	public void eu_enviar_a_pesquisa_com_um_arquivo_filtrarRestaurantes_json(String jsonFile) throws Throwable {

		step = "eu enviar a pesquisa com um arquivo filtrarRestaurantes json: " + jsonFile;

		List<Object> objects = call.apiCallList(JSON_FILES_PATH + jsonFile, new TypeToken<DataDto>() {
		}.getType());

		listDataDto = new ArrayList<>();
		for (Object DataDto : objects) {
			listDataDto.add((DataDto) DataDto);
		}

	}

	@Entao("^devo receber no retorno dos restaurantes proximos a localizacao incormada$")
	public void devo_receber_no_retorno_dos_restaurantes_proximos_a_localizacao_incormada() throws Throwable {

		step = "devo receber no retorno dos restaurantes proximos a localizacao incormada: ";

		for (int index = 0; index <= listDataDto.size() - 1; index++) {

			if (listDataDto.get(index).getData().getSearchFilter().getClubs().isEmpty()) {

				System.out.println("posição " + index + " do resultado da Query está vazia");
			} else {

				assertTrue("Não retornou o campo TotalItens ",
						listDataDto.get(index).getData().getSearchFilter().getTotalItems() != null);

				assertTrue("Não retornou o campo TotalPages ",
						listDataDto.get(index).getData().getSearchFilter().getTotalPages() != null);

				assertTrue("Não retornou o campo CurrentPage ",
						listDataDto.get(index).getData().getSearchFilter().getCurrentPage() != null);

				for (int indexClub = 0; indexClub <= listDataDto.get(index).getData().getSearchFilter().getClubs()
						.size() - 1; indexClub++) {

					assertTrue("Não retornou o campo Address ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getAddress() != null);
					System.out.println(listDataDto.get(index).getData().getSearchFilter().getClubs().get(indexClub)
							.getAddress().toString());

					assertTrue("Não retornou o campo Name ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getName() != null);
					System.out.println(listDataDto.get(index).getData().getSearchFilter().getClubs().get(indexClub)
							.getName().toString());

					assertTrue("Não retornou o campo City ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getCity() != null);
					System.out.println(listDataDto.get(index).getData().getSearchFilter().getClubs().get(indexClub)
							.getCity().toString());

					assertTrue("Não retornou o campo name Subcategoria ",
							listDataDto.get(index).getData().getSearchFilter().getClubs().get(indexClub)
									.getSubcategoriesInfo().get(0).getName() != null);
					System.out.println(listDataDto.get(index).getData().getSearchFilter().getClubs().get(indexClub)
							.getSubcategoriesInfo().get(0).getName().toString());

					assertTrue("Não retornou o campo logo ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getLogoImage() != null);
					System.out.println(listDataDto.get(index).getData().getSearchFilter().getClubs().get(indexClub)
							.getLogoImage().toString());

					assertTrue("Não retornou o campo Rating ", listDataDto.get(index).getData().getSearchFilter()
							.getClubs().get(indexClub).getPriceRating() != null);
					System.out.println(listDataDto.get(index).getData().getSearchFilter().getClubs().get(indexClub)
							.getPriceRating().toString());

					System.out.println("Index: " + index + "indexClub: " + indexClub);
				}

			}
		}
		String retornoConsulta = gson.toJson(listDataDto);
		Reporter.addStepLog(retornoConsulta);

	}

}
