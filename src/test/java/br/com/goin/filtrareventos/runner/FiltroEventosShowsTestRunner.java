package br.com.goin.filtrareventos.runner;



import java.io.File;
import java.io.UnsupportedEncodingException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
@RunWith(Cucumber.class)
@CucumberOptions(format = {"html:target/cucumber" }, 
			monochrome = true, 
			glue = {"br.com.goin.filtrareventos.steps"},
			features = {"src/main/resources/feature/searchFilter/filtroEventsShowsTest.feature" }, 
					plugin = { "pretty",
			"com.cucumber.listener.ExtentCucumberFormatter:target/Relatório de Shows.html" }, 
							tags = {"@CT01.1,@CT01.2,@CT01.3"},
			snippets = cucumber.api.SnippetType.CAMELCASE
		)

public class FiltroEventosShowsTestRunner {
	@AfterClass
	public static void writeExtentReport() throws UnsupportedEncodingException {

	Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}



