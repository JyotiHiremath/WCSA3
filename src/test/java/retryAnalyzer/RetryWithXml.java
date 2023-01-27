package retryAnalyzer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryWithXml {
	
	@Test
	public void demo() {
		System.out.println("In demo");
		AssertJUnit.fail();
	}

}
