package com.rameshsoft.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTC implements IRetryAnalyzer{

	int retryCount = 0;
	int maxRetryCount =4;
	
	
	
	@Override
	public boolean retry(ITestResult result) {
     
		if(ITestResult.FAILURE==result.getStatus()&&retryCount<=maxRetryCount)
		{
			try {
				Thread.sleep(3000);
				System.out.println("count is = "+retryCount+ "executing tc : "+result.getName());
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		return false;
	}

	

}
