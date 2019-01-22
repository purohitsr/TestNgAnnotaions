package RerunFailedTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	
	
//@Test(priority=1)
		@Test(retryAnalyzer = RerunFailedTest.RetryAnalyzer.class)
		public void Test1()
		{
			System.out.println("Test1");
			Assert.assertEquals(false, true);
		}

@Test(retryAnalyzer = RerunFailedTest.RetryAnalyzer.class,priority=2)
public void Test2()
{
	System.out.println("Test2");
//	Assert.assertEquals(false, true);
	System.out.println("Running Test2");
	
}
		@Test(priority=3)
		public void Test3()
		{
			System.out.println("Test3");
//			Assert.assertEquals(false, true);
		}
		
		@Test(priority=4)
		public void Test4()
		{
			System.out.println("Test4");
//			Assert.assertEquals(false, true);
		}
		
		@Test(priority=5)
		public void Test5()
		{
			System.out.println("Test5");
//			Assert.assertEquals(false, true);
		}
	}


