package com.practice.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	
	private int retryCount =0;
	
    //You could mentioned maxRetryCnt (Maximiun Retry Count) as per your requirement. Here I took 2, If any failed testcases then it runs two times
	private int maxRetryCount = 2;

	@Override
    //This method will be called everytime a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(maxRetryCount<retryCount)
		{
			System.out.println("Retrying "+result.getName() +" again and retry count is  "+ (retryCount+1));
			retryCount++;
			return true;
		}
		return false;
	}

}
