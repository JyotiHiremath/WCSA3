package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class ListenersPracticeWithAnnotation {
	@Listeners(GenericUtility.ListenerImplementation.class)
	public class ListenerPracticeWithAnnotation extends BaseClass{
		
		@Test
		public void demo() {
			Reporter.log("@Test method",true);
		}

	}
	


}
