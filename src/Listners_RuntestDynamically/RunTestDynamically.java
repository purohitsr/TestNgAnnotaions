package Listners_RuntestDynamically;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestNGListener;
import org.testng.annotations.ITestAnnotation;

public class RunTestDynamically implements IAnnotationTransformer{
	
//	private final int counter;
	
	/*public RunTestDynamically(){
		 String count = System.getProperty("count", "5");
		    counter = Integer.parseInt(count);
	}*/
	

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setInvocationCount(5);
		
	}

}
