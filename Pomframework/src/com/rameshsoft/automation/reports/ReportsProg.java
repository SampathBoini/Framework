package com.rameshsoft.automation.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsProg {
public static void main(String[] args) {
	  
	ExtentReports er = new ExtentReports("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\Results\\reports.html");
	
	ExtentTest et = er.startTest("flipkart");
	
	et.log(LogStatus.PASS, "chrome browser is opened");
	et.log(LogStatus.PASS, "URL is entered as https://www.gmail.com");
	et.log(LogStatus.PASS, "Dta is done on username with testdata rameshsoft.9177791456");
	et.log(LogStatus.PASS, "clicked on next button");
	et.log(LogStatus.PASS, "Dta is done on password with testdata rameshsoft.9177791456");
	et.log(LogStatus.PASS, "closed the browser");

     er.endTest(et);
     er.flush();
     er.close();
	
	
	
}
}
