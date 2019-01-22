package runTestProgrametically2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test
	public void testA1(){
		Assert.assertEquals("automation", "automation");
	}

	
	@Test
	public void testA2(){
		Assert.assertEquals("Automation", "automation");
	}
	
	@Test
	public void testA3(){
		Assert.assertEquals("Selenium", "Selenium");
	}
}
