package com.rameshsoft.automation.utilities;

import com.rameshsoft.automation.basepackage.BaseTest;

public interface Driverspath {

	 String ieKey ="webdriver.ie.driver";
	 String ieValue = BaseTest.getCurDir() +"\\Drivers\\IEDriverServer.exe";
	 
	 String chromeKey ="webdriver.chrome.driver";
	 String chromeValue = BaseTest.getCurDir() + "\\Drivers\\chromedriver.exe";
	 
	 String edgeKey ="webdriver.edge.driver";
	 String edgeValue =  BaseTest.getCurDir() +"\\Drivers\\msedgedriver.exe";
	 
	 String geckoKey ="webdriver.gecko.driver";
	 String geckoValue = BaseTest.getCurDir() +"\\Drivers\\geckodriver.exe";
	 
	
	 
}
