package runfailedtest1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int maxRetry=3;
	int retry=0;

	@Override
	public boolean retry(ITestResult result) {
		
		if(retry<maxRetry){
			retry++;
			return true;
		}
		return false;
	}

}
