package br.com.goin.filtrareventos.runner;

import java.io.File;
import java.io.UnsupportedEncodingException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import managers.FileReaderManager;
import com.cucumber.listener.*;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions( 
			monochrome = true, 
			glue = {"br.com.goin.filtrareventos.steps"},
		    plugin = { "pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:target/relatório de filmes.html" }, 
			features = {"src/main/resources/feature/searchFilter/filtrarFilmesTest.feature" },
			tags = {"@CT01.1,@CT01.2,@CT01.3"},
			snippets = cucumber.api.SnippetType.CAMELCASE
		)  

public class FiltrarFilmesTestRunner {
	
	@AfterClass
	 public static void writeExtentReport() throws UnsupportedEncodingException {
	 
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 }

}
