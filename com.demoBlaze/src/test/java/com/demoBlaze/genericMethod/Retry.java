package com.demoBlaze.genericMethod;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
int count=0;
int max=2;
	
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(count<(max)) {
				count++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			}else {
				result.setStatus(ITestResult.FAILURE);
			}
			}else {
				result.setStatus(ITestResult.SUCCESS);
			}
		return false;
	}

}
