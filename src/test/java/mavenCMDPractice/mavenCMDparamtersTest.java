package mavenCMDPractice;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavenCMDparamtersTest {
	WebDriver driver;
	
	@Test
	public void VtigerLoginTest() {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/namita/jyoti/11/chromedriver");
		 WebDriver driver=null;
		String browser=System.getProperty("browser");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browser.equals("safari")){
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		driver.manage().window().maximize();
		String url = System.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("user_name")).sendKeys(System.getProperty("user"));
		driver.findElement(By.name("user_password")).sendKeys(System.getProperty("pass"));
		driver.findElement(By.id("submitButton")).click();
		
		driver.quit();
		
		
	
		}

	

}
