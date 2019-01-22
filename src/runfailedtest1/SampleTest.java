package runfailedtest1;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	
	@Test()
	public void test1(){
		System.out.println("test1");
			Assert.assertEquals("hi", "Hi");
	
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
		Assert.assertEquals("saurav", "saurav");
	}
	
	@Test
	public void test3(){
		System.out.println("test3");
		Assert.assertEquals(5, 6);
	}

}
