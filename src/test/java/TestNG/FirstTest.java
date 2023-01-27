package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;


  //The class name should be module name ending with Test

public class FirstTest extends BaseClass{

	//The test name should be manual test case name ending with test
	@Test
	public void first1Test() {
		System.out.println("first1Test");
	}
	
	@Test
	public void first2Test() {
		System.out.println("first2Test");
	}
	
	
}

