package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationPrcatice {

	
	@Test(invocationCount =2)
	public void demo1() {
		Reporter.log("Demo1",true);
		
	}
	@Test(invocationCount = 0)
	public void demo2() {
		Reporter.log("Demo2",true);
		
	}
	@Test(invocationCount = 3)
	public void demo3() {
		Reporter.log("Demo3",true);
	}
		
		@Test
		public void demo4() {
			Reporter.log("Demo4",true);	
		}
		@Test(invocationCount = -1)
		public void demo5( ){
			Reporter.log("Demo5",true);	
		}
		
}
