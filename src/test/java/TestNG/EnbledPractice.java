package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnbledPractice {
	
	@Test
	public void a(){
		Reporter.log("test a",true);
	}
	@Test(enabled = false)
	public void b(){
		Reporter.log("test b",true);
	}
	@Test
	public void c(){
		Reporter.log("test c",true);
	}
}
