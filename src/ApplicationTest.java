import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import extent.ExtentManager;

public class ApplicationTest {
	
	ExtentReports extent = ExtentManager.getInstance();
	ExtentTest test;
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Executing Suite");
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("After Executing Suite");
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("Before Executing testcase");
		//open browser though selenium
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After executing testcase");
		//close the browser 
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method");
	}
	@Test(priority=1)
	public void doLogin(){
		//webdriver code
//		throw new SkipException("Skippign the method");
		System.out.println("Login Test Execution");
	}
	
	@Test(priority=2,dependsOnMethods={"doLogin"})
	public void doPasswordChange(){
		System.out.println("Changing password");
	}
	
	@Test(priority=3,dependsOnMethods={"doPasswordChange"})
	public void logout(){
		System.out.println("Logging out of Application");
	}

}
