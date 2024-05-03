package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rameshsoft.automation.basepackage.BaseTest;

public interface ScreenshotUtility {
public static String takeScreenshots() throws IOException
{
	 TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
     File file = ts.getScreenshotAs(OutputType.FILE);
     String imagepath = BaseTest.getCurDir()+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";
     FileUtils.copyFile(file, new File(imagepath));
	return imagepath;
     
}
public static String takeScreenshots(String tcName) throws IOException
{
	 TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
     File file = ts.getScreenshotAs(OutputType.FILE);
     String imagepath = BaseTest.getCurDir()+"\\Screenshots\\"+tcName+".jpeg";
     FileUtils.copyFile(file, new File(imagepath));
	return imagepath;
     
}
}
