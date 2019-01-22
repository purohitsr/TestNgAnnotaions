package runfailedtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParrallelTests2 {

	
	@Test(groups="group1")
	public void test1() throws InterruptedException{
		System.out.println("In test1");
		Thread.sleep(5000);
		System.out.println("test1 ends");
	}
	
	@Test(groups="group2")
	public void test2() throws InterruptedException{
		System.out.println("In test2");
		Thread.sleep(5000);
		System.out.println("test2 ends");
	}
	
	@Test(groups="group1")
	public void test3() throws InterruptedException{
		System.out.println("In test3");
		Thread.sleep(5000);
		System.out.println("test3 ends");
	}
	
	@Test(groups="group2")
	public void test4() throws InterruptedException{
		System.out.println("In test4");
		Thread.sleep(5000);
		System.out.println("test4 ends");
	}
}
