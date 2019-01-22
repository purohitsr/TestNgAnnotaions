import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extent.ExtentManager;

public class RegTest {
	SoftAssert softAssert = new SoftAssert();
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test;
	@Test
	public void doRegisterTest(){
//		try{
	    test = rep.startTest("Reg test");
	    test.log(LogStatus.INFO, "Starting the test");
		String expectedTitles="Actual";
		String actualTitle="Actual";
//		Assert.assertEquals(expectedTitles, actualTitle);
		System.out.println("A");
		softAssert.assertTrue(2<1, "Softaeerting");
//		Assert.assertTrue(2<1, "TestPassing ");
		System.out.println("B");
		test.log(LogStatus.PASS, "Test Paased");
//		softAssert.assertAll();
		/*}catch(Exception e){
			e.printStackTrace();
		}*/
		
		rep.endTest(test);
		rep.flush();
	}

}
