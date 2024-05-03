package com.rameshsoft.automation.appln.bussinessscripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\Drivers\\chromedriver.exe");
            
            WebDriver lol = new ChromeDriver();
            
            lol.manage().window().maximize();
            lol.manage().deleteAllCookies();
            lol.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            
            lol.get("https://www.gmail.com");
            
            TakesScreenshot ts = (TakesScreenshot) lol;
            File file = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\Screenshots\\GMHP.jpeg"));
	
	        Thread.sleep(2000);
	        lol.findElement(By.id("identifierId")).sendKeys("RAMESHSOFT");
	
	
	        File file1= ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1,new File("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\Screenshots\\GMHP.jpeg"));
	

	        Thread.sleep(2000);
	        lol.close();

	
	
	
	}

}




