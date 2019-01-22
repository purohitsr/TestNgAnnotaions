package runTestProgrametically2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {
	
	@Test
	public void testB1(){
		
		Assert.assertEquals("Selenium", "Selenium");
	}
	
	@Test
	public void testB2(){
		Assert.assertEquals("Qtp", "Selenium");
	}
	
	
	@Test
	public void testB3(){
		Assert.assertEquals("QTP", "QTP");
	}

}
