import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	
	@DataProvider(name="regtestDataProviders")
	public static Object[][] getData(){
		Object[][] obj = new Object[2][3];
		obj[0][0] = "U1";
		obj[0][1] = "P1";
		obj[0][2] = "abc@gmail.com";
		
		obj[1][0]= "U2";
		obj[1][1]= "P2";
		obj[1][2]= "xyz@gmail.com";
		
		return obj;
		
	}
	
	@DataProvider(name="loginTestDataProvider")
	public static Object[][] getloginData(){
		Object[][] obj= new Object[2][2];
		obj[0][0] = "U3";
		obj[0][1] = "P3";
		
		obj[1][0] = "U3";
		obj[1][1] = "P3";
		
		return obj;
		
		
		
		
	}
	
	
	@DataProvider(name="sameDataProvider")
	public static Object[][] getData1(Method m){
		Object[][] obj =null;
		if(m.getName().equals("TestA")){
			obj= new Object[2][2];
			obj[0][0]="User01";
			obj[0][1]="user@123";
			obj[1][0]="User02";
			obj[1][1]="user@123";
		}else if(m.getName().equals("TestB")){
		
		obj= new Object[2][3];
		obj[0][0]="User01";
		obj[0][1]="user@123";
		obj[0][2]="xyz@123";
		
		obj[1][0]="User02";
		obj[1][1]="user@123";
		obj[1][2]="abc@123";
		}
		
		return 	obj;
	}
	

}
