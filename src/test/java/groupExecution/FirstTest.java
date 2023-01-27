package groupExecution;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {

	
	@Test(groups="smoke")
	public void First1Test() {
		Reporter.log("first1Test",true);
	}
	@Test(groups="sanity")
	public void First2Test() {
		Reporter.log("first2Test",true);
	}
	@Test(groups={"smoke","sanity"})
	public void First3Test() {
		Reporter.log("first3Test",true);
	}
}
