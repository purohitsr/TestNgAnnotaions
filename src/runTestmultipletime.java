import org.testng.annotations.Test;

public class runTestmultipletime {
	
	@Test(invocationCount =6,threadPoolSize=2)
	public void sampleTest(){
		System.out.println("Hello World");
		System.out.println(Thread.currentThread().getId());
		System.out.println("*************************");
	}

}
