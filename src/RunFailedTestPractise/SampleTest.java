package RunFailedTestPractise;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import RerunFailedTest.RetryAnalyzer;

public class SampleTest {
	
	@Test
	public void test1(){
		
		System.out.println("Running Test1");
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(false, true);
		System.out.println("Running Test2");
	}
	
	@Test
	public void test3(){
		Assert.assertEquals(false, true);
		System.out.println("Running Test3");
	}
	
	@Test
	public void test4(){
		System.out.println("Running Test4");
	}

}
