import org.testng.annotations.Test;

public class LoginTest1 {
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="sameDataProvider")
	public void TestA(String UN,String Pwd){
		
		System.out.println("UserName is "+UN+" Password is "+Pwd);
	}
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="sameDataProvider")
	public void TestB(String UN,String Pwd,String emailId){
		
		System.out.println("UserName is "+UN+" Password is "+Pwd+" Email Id is"+emailId);
	}

}
