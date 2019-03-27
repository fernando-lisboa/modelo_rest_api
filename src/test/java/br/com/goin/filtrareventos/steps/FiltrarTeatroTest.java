package br.com.goin.filtrareventos.steps;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cucumber.listener.Reporter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.goin.filtrareventos.application.TestApplication;
import br.com.goin.filtrareventos.application.TestApplication.Ambientes;
import br.com.goin.filtrarteatro.dto.DataTeatroDto;
import br.com.goin.filtrarteatro.dto.Highlighted;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class FiltrarTeatroTest {

	private static final String JSON_FILES_PATH = "src/main/resources/json/theater/";
	private TestApplication call;
	List<DataTeatroDto> listDataDto = new ArrayList<>();
	private List<DataTeatroDto> massaDeDadosList;
	private Iterator<Highlighted> Highlighted;
	private String step;
	Gson gson = new Gson();
	@Dado("^que eu informe o ambiente a ser testado \"([^\"]*)\"$")
	public void que_eu_informe_o_ambiente_a_ser_testado(Ambientes ambiente) throws Throwable {

		call = new TestApplication<>(ambiente);
	}

	@Quando("^eu enviar a pesquisa  atraves de um arquivo json\"([^\"]*)\"$")
	public void eu_enviar_a_pesquisa_atraves_de_um_arquivo_json(String jsonFile) throws Throwable {

		List<Object> objects = call.apiCallList(JSON_FILES_PATH + jsonFile, new TypeToken<DataTeatroDto>() {
		}.getType());

		listDataDto = new ArrayList<>();
		for (Object DataTeatroDto : objects) {
			listDataDto.add((DataTeatroDto) DataTeatroDto);
		}

	}

	@Entao("^devo receber no reorno o id  Highlighted \"([^\"]*)\"$")
	public void devo_receber_no_reorno_o_id_Highlighted(String idTeatro) throws Throwable {

		int Highlighted = listDataDto.get(0).getData().getGetPlaysTheater().getHighlighted().size();

		if (listDataDto.get(0).getData().getGetPlaysTheater().getHighlighted().isEmpty()) {

			System.out.println("resultado da Query está vazia");
		} else {

			for (int indexHighlighted = 0; indexHighlighted <= Highlighted - 1; indexHighlighted++) {

				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getHighlighted().get(indexHighlighted)
						.getId() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getHighlighted().get(indexHighlighted)
						.getCity() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getHighlighted().get(indexHighlighted)
						.getName() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getHighlighted().get(indexHighlighted)
						.getImage() != null);

			}
		}

	}

	@Entao("^o a lista de peças por teatro$")
	public void o_a_lista_de_peças_por_teatro() throws Throwable {

		int inTheathers = listDataDto.get(0).getData().getGetPlaysTheater().getInTheathers().size();

		if (listDataDto.get(0).getData().getGetPlaysTheater().getInTheathers().isEmpty()) {

			System.out.println("resultado da Query está vazia");
		} else {

			for (int indexInTheathers = 0; indexInTheathers <= inTheathers - 1; indexInTheathers++) {

				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getInTheathers().get(indexInTheathers)
						.getId() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getInTheathers().get(indexInTheathers)
						.getCity() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getInTheathers().get(indexInTheathers)
						.getName() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getInTheathers().get(indexInTheathers)
						.getImage() != null);

			}
		}
		int comingSoon = listDataDto.get(0).getData().getGetPlaysTheater().getComingSoon().size();

		if (listDataDto.get(0).getData().getGetPlaysTheater().getComingSoon().isEmpty()) {

			System.out.println("resultado da Query está vazia");
		} else {

			for (int indexComingSoon = 0; indexComingSoon <= comingSoon - 1; indexComingSoon++) {

				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getComingSoon().get(indexComingSoon)
						.getCity() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getComingSoon().get(indexComingSoon)
						.getName() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getComingSoon().get(indexComingSoon)
						.getId() != null);
				assertTrue(listDataDto.get(0).getData().getGetPlaysTheater().getComingSoon().get(indexComingSoon)
						.getImage() != null);

			}
		}
		String retornoConsulta = gson.toJson(listDataDto);
		Reporter.addStepLog(retornoConsulta);
	}

}
