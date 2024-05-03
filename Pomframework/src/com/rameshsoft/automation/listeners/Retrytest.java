package com.rameshsoft.automation.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retrytest {
	
	@Test(retryAnalyzer = ReRunFailedTC.class)
public void login() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selcom\\Drivers\\chromedriver.exe");
	
	WebDriver drive = new ChromeDriver();
	drive.manage().window().maximize();
	drive.manage().deleteAllCookies();

	drive.get("https://www.gmail.com");
	    WebElement un =  drive.findElement(By.id("identifier"));
	un.clear();
	un.sendKeys("boinisampath1524@gmail.com");
	 
}
}
