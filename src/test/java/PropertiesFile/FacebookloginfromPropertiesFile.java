package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookloginfromPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","/Users/namita/jyoti/11/chromedriver");
		
		//Create an instance of FileInputStream with properties file path
				FileInputStream fis = new FileInputStream("./src/main/resources/commonData.Properties");
				
				//Create an instance for Properties class
				Properties p = new Properties();
				
				//Load properties file to the project
				p.load(fis);
				
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(p.getProperty("url2"));
				
				driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
				
				Thread.sleep(3000);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.id("email")).sendKeys(p.getProperty("username1"));
				driver.findElement(By.name("pass")).sendKeys(p.getProperty("password1"));
			    driver.findElement(By.xpath("//button[@type='submit']")).click();
			    
				Thread.sleep(3000);
				
				if(driver.getTitle().contains("Facebook"))
					System.out.println("Pass");
				else
					System.out.println("Fail");

				driver.quit();
				
			

	}

}
