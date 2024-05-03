package com.rameshsoft.automation.basepackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

abstract public class ActionEngine extends BaseTest{

		public static void enterUrl(String url) {
			try {
				getDriver().get(url);
				getExtenttest().log(LogStatus.PASS, "URL is entefred as : "+url);
				
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "URL is NOT entefred as : "+url);

			}
		
		}
		public static void enterUrl(URL url) {
			try {
				getDriver().navigate().to(url);
				getExtenttest().log(LogStatus.PASS, "URL is entefred as : "+url);
				
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "URL is NOT entefred as : "+url);

			}
		
		}
		public static void navigateUrl(String url) {
			try {
				getDriver().navigate().to(url);
				getExtenttest().log(LogStatus.PASS, "URL is entefred as : "+url);
				
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "URL is NOT entefred as : "+url);

			}
		
		}
		public static void enterUrlJs(String url) {
			try {
				getDriver().navigate().to(url);
				JavascriptExecutor jse = (JavascriptExecutor) getDriver();
				jse.executeScript(url);
				
				getExtenttest().log(LogStatus.PASS, "URL is entefred as : "+url);
				
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "URL is NOT entefred as : "+url);

			}
		
		}
	 
		public  static void DTA(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				webelement.clear();
				getExtenttest().log(LogStatus.PASS, "Element is cleared: "+elementName);
				webelement.sendKeys(testData);
				getExtenttest().log(LogStatus.PASS, "Data typing action is done on:  "+elementName+ "with test data is: "+testData);

				
			
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is NOT displayed: "+elementName);

			}

		}
		
		public  static void DTAActions(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				Actions actions = new Actions(getDriver());
				actions.sendKeys(webelement, testData).build().perform();
				
				getExtenttest().log(LogStatus.PASS, "Data typing action is done on:  "+elementName+ "with test data is: "+testData);

				
			
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is NOT displayed: "+elementName);

			}

		}

		
		public  static void DTAActions1(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				Actions actions = new Actions(getDriver());
				actions.click(webelement).sendKeys(testData).build().perform();
				
				getExtenttest().log(LogStatus.PASS, "Data typing action is done on:  "+elementName+ "with test data is: "+testData);

				
			
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is NOT displayed: "+elementName);

			}

		}

		
		public static void clickElement(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			    webelement.click();
				getExtenttest().log(LogStatus.PASS, "click action is  done on: "+elementName);

			    
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}

		}
		
		public static void clickByJs(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			    webelement.click();
				getExtenttest().log(LogStatus.PASS, "click action is  done on: "+elementName);

			    
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}

		}
		
		public static void clickByActions(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				Actions actions = new Actions(getDriver());
				actions.click(webelement).build().perform();
				webelement.click();
				getExtenttest().log(LogStatus.PASS, "click action is  done on: "+elementName);

			    
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}

		}
		
		public static void clickByActions1(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				Actions actions = new Actions(getDriver());
				actions.doubleClick(webelement).build().perform();
				webelement.click();
				getExtenttest().log(LogStatus.PASS, "click action is  done on: "+elementName);

			    
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}

		}
		public static void clickByActions2(WebElement webelement, String testData,String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				Actions actions = new Actions(getDriver());
				actions.sendKeys(webelement, Keys.ENTER).perform();
				webelement.click();
				getExtenttest().log(LogStatus.PASS, "click action is  done on: "+elementName);

			    
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}

		}
		
		
		public static void mouseHoverACtions(WebElement webelement, String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				Actions actions = new Actions(getDriver());
				actions.moveToElement(webelement).build().perform();
				webelement.click();
				getExtenttest().log(LogStatus.PASS, "click action is  done on: "+elementName);

			    
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}
		}
		
		public static void mouseHoverACtionsJs(WebElement webelement, String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
				Actions actions = new Actions(getDriver());
				actions.moveToElement(webelement).build().perform();
				webelement.click();
				getExtenttest().log(LogStatus.PASS, "click action is  done on: "+elementName);

			    
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}
		}
		
		
		public static void handleDropDown(WebElement webelement,String how,String howValue, String elementName) {
			try {
				Assert.assertTrue(webelement.isDisplayed()&&webelement.isEnabled());
				getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			//	Actions actions = new Actions(getDriver());
				Select select = new Select(webelement);
				if(how.equalsIgnoreCase("text")) {
					select.selectByVisibleText(howValue);
					getExtenttest().log(LogStatus.PASS, "DD is selected throught text"+howValue);

				}else if(how.equalsIgnoreCase("value")) {
					select.selectByValue(howValue);
					getExtenttest().log(LogStatus.PASS, "DD is selected throught value"+howValue);

				}else if(how.equalsIgnoreCase("Index")) {
				  int index =	Integer.parseInt(howValue);
					
					select.selectByIndex(index);
					getExtenttest().log(LogStatus.PASS, "DD is selected throught index"+howValue);

				}
				
			}catch(Exception exception) {
				getExtenttest().log(LogStatus.FAIL, "Element is Not displayed: "+elementName);

			}
		}
		
		    public void miniSleep(WebElement webelement,String elementName) throws InterruptedException {
                
		    	for(int i=0; i<9; i++) {
		    		Thread.sleep(1000);
		    		if(webelement.isDisplayed()&&webelement.isEnabled()) {
		    			getExtenttest().log(LogStatus.PASS, "Element is displayed: "+elementName);
		    			break;
		    		}else {
		    			;;;;;;;;;;
		    		}
		    		
		    		
		    	}
		    	
		    	
			}
		 
		public static String handleWindow(int index) {
			String curWin="";
			try {
				
				Set<String> setWins = getDriver().getWindowHandles();
				List<String> listwin = new ArrayList<String>(setWins);
		    String winname   =		listwin.get(index);
			getDriver().switchTo().window(winname);
			curWin = getDriver().getWindowHandle();
			
				
			}catch(Exception exception){
				
			}
			return curWin;

		}
		
		
		
		
	
	
}
