package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchthedatafromPropetiesFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/namita/jyoti/11/chromedriver");

		// Create an instance of FileInputStream with properties file path
		FileInputStream fis = new FileInputStream("./src/main/resources/commonData.Properties");

		// Create an instance for Properties class
		Properties p = new Properties();

		// Load properties file to the project
		p.load(fis);

		// Fetch the data from properties file
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));

	}

}
