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
import br.com.goin.filtrarfilmes.dto.DataFilmeDto;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class FiltrarFilmesTest {

	private static final String JSON_FILES_PATH = "src/main/resources/json/playsMovie/";
	private TestApplication call;
	List<DataFilmeDto> listDataDto = new ArrayList<>();
	private String step;
	Gson gson = new Gson();

	@Dado("^que eu informe o ambiente para teste \"([^\"]*)\"$")
	public void que_eu_informe_o_ambiente_para_teste(Ambientes ambiente) throws Throwable {

		step = "Ambiente para teste: " +ambiente;

		call = new TestApplication<>(ambiente);

		Reporter.addStepLog(step);
		

	}

	@Quando("^eu enviar a pesquisa com um arquivo json\"([^\"]*)\"$")
	public void eu_enviar_a_pesquisa_com_um_arquivo_json(String jsonFile) throws Throwable {

		step = "eu enviar a pesquisa com um arquivo json: "+jsonFile.toString();
		Reporter.addStepLog(step);
		
		List<Object> objects = call.apiCallList(JSON_FILES_PATH + jsonFile, new TypeToken<DataFilmeDto>() {
		}.getType());

		listDataDto = new ArrayList<>();
		for (Object DataFilmeDto : objects) {
			listDataDto.add((DataFilmeDto) DataFilmeDto);
		}
		
		
		
		
	}

	@Entao("^devo receber no reorno dos filmes$")
	public void devo_receber_no_reorno_dos_filmes() throws Throwable {

		step = "Então devo receber no reorno dos filmes";
		
		int Highlighted = listDataDto.get(0).getData().getPlaysMovie().getHighlighted().size();

		if (listDataDto.get(0).getData().getPlaysMovie().getHighlighted().isEmpty()) {

			System.out.println("resultado da Query está vazia");
		} else {

			for (int indexHighlighted = 0; indexHighlighted <= Highlighted - 1; indexHighlighted++) {

				assertTrue(listDataDto.get(0).getData().getPlaysMovie().getHighlighted().get(indexHighlighted)
						.getId() != null);
				assertTrue(listDataDto.get(0).getData().getPlaysMovie().getHighlighted().get(indexHighlighted)
						.getName() != null);
				assertTrue(listDataDto.get(0).getData().getPlaysMovie().getHighlighted().get(indexHighlighted)
						.getImage() != null);

			}
		}

		int inTheathers = listDataDto.get(0).getData().getPlaysMovie().getInTheathers().size();

		if (listDataDto.get(0).getData().getPlaysMovie().getInTheathers().isEmpty()) {

			System.out.println("resultado da Query está vazia");
		} else {

			for (int indexInTheathers = 0; indexInTheathers <= inTheathers - 1; indexInTheathers++) {

				assertTrue(listDataDto.get(0).getData().getPlaysMovie().getInTheathers().get(indexInTheathers)
						.getId() != null);
				assertTrue(listDataDto.get(0).getData().getPlaysMovie().getInTheathers().get(indexInTheathers)
						.getName() != null);
				assertTrue(listDataDto.get(0).getData().getPlaysMovie().getInTheathers().get(indexInTheathers)
						.getImage() != null);

			}
		}
		
		String retornoConsulta = gson.toJson(listDataDto);
		Reporter.addStepLog(retornoConsulta);

	}


}
