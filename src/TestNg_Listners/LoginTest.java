package TestNg_Listners;

import static org.testng.Assert.assertThrows;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void TestA(){
		System.out.println("Test Passes");
	}
	
	@Test
	public void TestB(){
		Assert.assertEquals("A", "B");
		System.out.println("Test Fails");
		
	}
	
	@Test
	public void TestC(){
		throw new SkipException("Skipping the Test");
//		System.out.println("Test Skipped");
		
	}
	
	

}
