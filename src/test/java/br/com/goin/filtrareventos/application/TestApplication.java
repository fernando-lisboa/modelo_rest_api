package br.com.goin.filtrareventos.application;

import static org.junit.Assert.fail;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import br.com.goin.filtrareventos.config.HttpClientConfig;
import br.com.goin.filtrareventos.config.RestTemplateConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RestTemplateConfig.class, HttpClientConfig.class })
public class TestApplication<T> {

	private Ambientes ambiente;

	public TestApplication(Ambientes ambiente) {
		this.ambiente = ambiente;
	}

	public enum Ambientes {
		dev("https://dev.appgoin-v1.com/v1/graphql"), prod("https://prod.appgoin-v1.com/v1/graphql"),
		hmg("https://hmg.appgoin-v1.com/v1/graphql"), newHomeDev("https://api-dev.appgoin-v1.com/home/get-home"),
		newHomeHmg("https://api-hmg.appgoin-v1.com/home/get-home"),
		newHomeProd("https://api-prod.appgoin-v1.com/home/get-home");

		private final String name;

		/**
		 * @param name
		 */
		private Ambientes(final String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	private final String COGNITO_IP_PREFIX = "cognito-idp.us-east-1.amazonaws.com/";

	private final String DEV_USER_POOL_ID = "us-east-1_HRZ5Y2b0T";
	private final String PROD_USER_POOL_ID = "us-east-1_OnQZQ1uEo";
	private final String HMG_USER_POOL_ID = "us-east-1_vmmkhBIFQ";

	RestTemplate restTemplate = new RestTemplate();

	public List<T> apiCallList(String jsonFile, java.lang.reflect.Type type) {
		List<Object> massaLista = carregaMassaDeDadosList(jsonFile);
		List<T> returnList = new ArrayList();
		for (Object object : massaLista) {
			returnList.add(apiService(type, object));
		}
		return returnList;
	}


	public T apiCall(String jsonFile, java.lang.reflect.Type type) {
		Object massaLista = carregaMassaDeDados(jsonFile);
		return apiService(type, massaLista);
	}

	private T apiService(java.lang.reflect.Type type, Object massa) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String identityProvider = COGNITO_IP_PREFIX;
		if (ambiente.equals(Ambientes.dev)) {
			identityProvider += DEV_USER_POOL_ID;
		} else if (ambiente.equals(Ambientes.prod)) {
			identityProvider += PROD_USER_POOL_ID;
		} else if (ambiente.equals(Ambientes.hmg)) {
			identityProvider += HMG_USER_POOL_ID;
		} else if (ambiente.equals(Ambientes.newHomeDev)) {
			identityProvider += HMG_USER_POOL_ID;
		} else if (ambiente.equals(Ambientes.newHomeHmg)) {
			identityProvider += HMG_USER_POOL_ID;
		} else if (ambiente.equals(Ambientes.newHomeProd)) {
			identityProvider += HMG_USER_POOL_ID;
		}
	
		headers.set("identity-provider", identityProvider);
		HttpEntity<Object> entity = new HttpEntity<Object>(massa, headers);
		String fullresponse = restTemplate.postForObject(ambiente.name, entity, String.class);
		
		Gson gson = new Gson();
		return gson.fromJson(fullresponse, type);
	}

	public Object carregaMassaDeDados(String jsonFile) {

		try {

			Gson gson = new Gson();

			Object listagson = gson.fromJson(retornaConteudoArquivoJson(jsonFile), new TypeToken<Object>() {
			}.getType());

			return listagson;

		} catch (Exception e) {
			e.printStackTrace();
			// logger.error(“Erro ao deserealizar massa de dados”);
			fail();
		}
		return null;
	}

	private List<Object> carregaMassaDeDadosList(String jsonFile) {

		try {

			Gson gson = new Gson();

			List<Object> listagson = gson.fromJson(retornaConteudoArquivoJson(jsonFile), new TypeToken<List<Object>>() {
			}.getType());

			return listagson;

		} catch (Exception e) {
			e.printStackTrace();
			// logger.error(“Erro ao deserealizar massa de dados”);
			fail();
		}
		return null;
	}

	private String retornaConteudoArquivoJson(String fileName) {
		JsonParser parser = new JsonParser();
		try {
			Object json = parser.parse(new FileReader(fileName));
			String convert = json.toString();
			return convert;
		} catch (Exception e) {

			System.out.println(e);
		}
		return null;
	}
}
