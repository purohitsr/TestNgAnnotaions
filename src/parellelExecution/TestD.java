package parellelExecution;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestD {
	
	@Test(dataProvider="getData",invocationCount=2,threadPoolSize=2)
	public void login(String username,String password) throws InterruptedException{
		
		System.out.println("UserName is "+username);
		Thread.sleep(10000);
		System.out.println("Password is "+password);
	}
	
	
	@DataProvider(parallel=true)
	public Object[][] getData(){
		
		Object[][] obj = new Object[2][2];
		obj[0][0]="saurav";
		obj[0][1]="saurav123";
		obj[1][0]="milan";
		obj[1][1]="milan123";
		
		return obj;
		
	}

}
