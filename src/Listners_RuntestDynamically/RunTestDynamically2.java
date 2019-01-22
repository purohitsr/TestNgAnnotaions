package Listners_RuntestDynamically;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IClassListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RunTestDynamically2 implements IClassListener{
	
//	private final int counter;
	
	/*public RunTestDynamically(){
		 String count = System.getProperty("count", "5");
		    counter = Integer.parseInt(count);
	}*/
	

	
	

	@Override
	public void onBeforeClass(ITestClass testClass) {
		
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
		// TODO Auto-generated method stub
		testClass.getTestMethods();
		
	}

}
