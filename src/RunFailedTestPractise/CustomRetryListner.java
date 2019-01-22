package RunFailedTestPractise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class CustomRetryListner implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		//here we are checking retryAnalizer of testannotation
		IRetryAnalyzer  retry =annotation.getRetryAnalyzer();
		//if retry is null then associate out retry listner with the method
		if(retry==null){
			annotation.setRetryAnalyzer(RetryListner.class);
		}
	}

}
