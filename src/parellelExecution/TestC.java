package parellelExecution;

import org.testng.annotations.Test;

public class TestC {
	@Test
	public void testC1() throws InterruptedException{
		System.out.println("Test C1 Starts");
		Thread.sleep(2000);
		System.out.println("Test C1 Ends");
	}

}
