package runfailedtests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int max_count =3;
	int retry_count=1;
	
	public boolean retry(ITestResult result) {
		if(retry_count<=3){
			retry_count++;
			return true;
		}
		return false;
	}

}
