import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassB extends ClassA {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("In Before Class of B");
	}
	
	@Test
	public void test(){
		System.out.println("In test of B");
	}
	
	@Test
	public void test1(){
		System.out.println("In test1 method");
	}
	
	@Test
	public void test2(){
		System.out.println("In test2 method");
	}

}
