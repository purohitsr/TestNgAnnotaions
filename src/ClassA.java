import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class ClassA {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("In Before Suite of A");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("In Before Class of A");
	}

}
