package com.rameshsoft.automation.basepackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.utilities.Driverspath;
import com.rameshsoft.automation.utilities.ScreenshotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.rrameshsoft.automation.customized.exceptions.FrameworkException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

//import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

@Data

public class BaseTest {
	@Getter private static WebDriver driver;
	@Getter private static String curDir;
	@Getter private static  String tcName;
	@Getter private static ExtentReports extentreports;
	@Getter private static ExtentTest extenttest;
	 @Parameters({"browser"})
	 @BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {
		 
		  curDir = System.getProperty("user.dir");
      if(browser.equalsIgnoreCase("ie")) {
    	  System.setProperty(Driverspath.ieKey, Driverspath.ieValue);
    	   driver = new InternetExplorerDriver();
    	   init();
    	       }
      else if(browser.equalsIgnoreCase("chrome")) {
    	  System.setProperty(Driverspath.chromeKey, Driverspath.chromeValue);
    	   driver = new ChromeDriver();
    	  
    	   init()  ;   
    	   }
      else if(browser.equalsIgnoreCase("firefox")) {
    	  System.setProperty(Driverspath.geckoKey,Driverspath.geckoValue);
    	   driver = new FirefoxDriver();
    	   init();
      }else if(browser.equalsIgnoreCase("edge")) {
    	  System.setProperty(Driverspath.edgeKey, Driverspath.edgeValue);
    	   driver = new EdgeDriver();
    	   init();
      }
	
	}
	 public void init() {
		 driver.manage().window().maximize();
   	  driver.manage().deleteAllCookies();
   	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	  

	}
	 @AfterSuite
	public void closeBrowser() throws FrameworkException {
       if(driver!=null) {
    	   driver.close();
       }
       else {
    	   //throw exception
    	   FrameworkException exception = new FrameworkException("driver is pointing to null");
    	   System.out.println("driver is pointing to null");
    	   throw exception;
    	   
       }
	}
	@BeforeMethod
	 public void beforeTCExecution(Method method) {
      tcName =  method.getName();
     System.out.println("current execution testcase name is: "+tcName);
    extenttest =	extentreports.startTest(tcName);
	extenttest.log(LogStatus.PASS, "current execution testcasename is: "+tcName);
	}
	
	
	 @AfterMethod
	 public void afterTCexecution(ITestResult result) throws IOException {
       if(result.getStatus() == ITestResult.SUCCESS) {
    	   System.out.println("TC is passed : "+result.getName());
    		extenttest.log(LogStatus.PASS, "TC is passed: "+result.getName());

       }else if (result.getStatus() == ITestResult.FAILURE){
       System.out.println("TC is failed : "+result.getName());
       String imagepath = ScreenshotUtility.takeScreenshots();
		extenttest.log(LogStatus.FAIL, "TC is failed: "+result.getName());
		extenttest.log(LogStatus.FAIL, result.getThrowable());
       extenttest.addScreenCapture(imagepath);
		
       }else if(result.getStatus() == ITestResult.SKIP) {
    	   System.out.println("TC is skipped : "+result.getName());
    	   String imagepath = ScreenshotUtility.takeScreenshots();
   		extenttest.log(LogStatus.SKIP, "TC is skipped: "+result.getName());
       extenttest.log(LogStatus.SKIP, result.getThrowable());
       extenttest.addScreenCapture(imagepath);
       }
       extentreports.endTest(extenttest);
       extentreports.flush();
	}
	 
	 

	 @BeforeTest
	 public void initReports() {
		 extentreports = new ExtentReports(System.getProperty("user.dir")+"\\Results\\reports.html");

	}
	 @AfterTest
	 public void closeReports() throws FrameworkException {
		if(extentreports!=null) {
			extentreports.close();
			
		}else{
			FrameworkException exception = new FrameworkException("Extentreports object is pointing to null");
		throw exception;
		}

	}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
