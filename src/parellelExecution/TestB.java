package parellelExecution;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestB {
	@Test()
	public void testB1() throws InterruptedException{
	System.out.println("testB1 starts");
	Thread.sleep(2000);
	System.out.println("testB1 ends");
	}
	
	
	/*@Test()
	public void testB2() throws InterruptedException{
		System.out.println("testB2 starts");
		Thread.sleep(2000);
		System.out.println("testB2 ends");
	}
	
	@Test()
	public void testB3() throws InterruptedException{
		System.out.println("testB3 starts");
		Thread.sleep(2000);
		System.out.println("testB3 ends");
	}*/
	
	
	
	

}
