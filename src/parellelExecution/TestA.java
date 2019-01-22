package parellelExecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA {
	@Test
	public void testA1() throws InterruptedException{
		System.out.println("Test A1 Starts");
		Thread.sleep(2000);
		System.out.println("Test A1 Ends");
	}
	
	/*@Test
	public void testA2() throws InterruptedException{
		System.out.println("Test A2 Starts");
		Thread.sleep(2000);
		System.out.println("Test A2 Ends");
	}
	
	@Test
	public void testA3() throws InterruptedException{
		System.out.println("Test A3 Starts");
		Thread.sleep(2000);
		System.out.println("Test A3 Ends");
	}*/
	
	/*@BeforeTest
	public void beforeTest(){
		System.out.println("Inside Before Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("Inside After Test");
	}*/
	
	
	
	/*@BeforeSuite
	public void initialize(){
		System.out.println("In Before Suite Method");
	}
	
	@AfterSuite
	public void flush(){
		System.out.println("In After Suite Method");
	}*/
	
	/*@BeforeClass
	public void beforeClass(){
		System.out.println("Inside Before Class");
	}

	
	@AfterClass
	public void afterClass(){
		System.out.println("Inside After Class");
	}*/
	
	/*@BeforeMethod
	public void beforeMethod(){
		System.out.println("Inside Before Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Inside After Method");
	}*/
}
