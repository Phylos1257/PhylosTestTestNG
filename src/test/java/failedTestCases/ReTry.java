package failedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTry implements IRetryAnalyzer{

	int maxTry = 1;
	// 
	//int count  = 0;
	
	// support for parallel 
	ThreadLocal<Integer> count = ThreadLocal.withInitial(()->0) ;

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess())
		{
//			if(count < maxTry) {
//				count++;
//				return true;
//			}
			if(count.get()<maxTry) {
				count.set(count.get()+1);
				return true;
			}
		}
		return false;
	}

}
