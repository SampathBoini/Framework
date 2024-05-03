package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class TCActivity implements ITestListener {
	@Override
	 public void onFinish(ITestContext arg0) {
		 System.out.println("Suite execution is completed");
	 }
	 @Override
	 public void onStart(ITestContext arg0) {
		 System.out.println("Suite execution is Started");
	 }
	 @Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		 
	 }
	 @Override
	 public void onTestFailure(ITestResult arg0) {
		 System.out.println("TC is failed : "+arg0.getName());
		 try {
			ScreenshotUtility.takeScreenshots(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 @Override
	 public void onTestSkipped(ITestResult arg0) {
		 System.out.println("TC is skipped : "+arg0.getName());
		 try {
				ScreenshotUtility.takeScreenshots(arg0.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 @Override
	 public void onTestStart(ITestResult arg0) {
		 System.out.println("TC is Started : "+arg0.getName());
	 }
     @Override
	 public void onTestSuccess(ITestResult arg0) {
    	 System.out.println("TC is Success : "+arg0.getName());
	 }
	 
	 
	 
}
