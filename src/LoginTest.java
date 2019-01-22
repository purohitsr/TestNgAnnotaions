import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="regtestDataProviders")
	public void doLoginTest(String un,String pwd,String email){
		System.out.println(un+" "+pwd+" "+email);
		
	}
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="loginTestDataProvider")
	public void doRegister(String Un,String pwd){
		
	}

}
