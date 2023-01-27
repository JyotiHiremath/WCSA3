package groupExecution;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdTest {
	
	
	@Test(groups="system")
	public void Third1Test() {
		Reporter.log("Third1Test",true);
	}
	@Test(groups={"smoke","sanity","system"})
	public void Third2Test() {
		Reporter.log("Third2Test",true);
	}
	@Test(alwaysRun = true)
	public void Third3Test() {
		Reporter.log("Third3Test",true);
	}

}
