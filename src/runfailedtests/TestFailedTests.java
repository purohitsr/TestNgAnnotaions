package runfailedtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailedTests {
	
	
	@Test(groups="group1")
	public void test1(){
		int a=5;
		int b=6;
		Assert.assertTrue(a==b);
	}
	
	@Test(groups="group2")
	public void test2(){
		int a=5;
		int b=5;
		Assert.assertTrue(a==b);
	}
	
	@Test(groups="group1")
	public void test3(){
		String name="saurav";
		String name1="saurav";
		
		Assert.assertTrue(name.equals(name1));
	}
	
	@Test(groups="group2")
	public void test4(){
		String name="saurav";
		String name1="aayansh";
		
		Assert.assertTrue(name.equals(name1));
	}

}
