package br.com.goin.config;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {
	
	
	
	public String getReportConfigPath(){
		 Properties properties = new Properties();
		 InputStream input = null;
		 try {

				input = new FileInputStream("src/main/java/br/com/goin/config/config.properties");

				// load a properties file
				properties.load(input);

				// get the property value and print it out
				System.out.println(properties.getProperty("reportConfigPath"));

			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		 String reportConfigPath = properties.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}

}
