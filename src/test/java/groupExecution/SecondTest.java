package groupExecution;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(groups="smoke")
	public void Second1Test() {
		Reporter.log("Second1Test",true);
	}
	@Test(groups="sanity")
	public void Second2Test() {
		Reporter.log("Second2Test",true);
	}
	@Test(groups="system")
	public void Second3Test() {
		Reporter.log("Second3Test",true);
	}
}
