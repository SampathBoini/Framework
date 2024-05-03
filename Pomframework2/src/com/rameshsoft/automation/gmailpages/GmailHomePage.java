package com.rameshsoft.automation.gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.basepackage.ActionEngine;

public class GmailHomePage extends ActionEngine{
	
	static {
		PageFactory.initElements(getDriver(), GmailHomePage.class );
	}
     
	@FindBy(id="identifierId")
	private static WebElement username;
	
	@FindBy(id="identifierNext")
	private static WebElement nxt;
	
	@FindBy(xpath="//span[text()='Create account']")
	private static WebElement createacc;
	
	@FindBy(xpath="//span[text()='to continue to Gmail']")
	private static WebElement continuetogmail;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private static WebElement signin;
	
	public static void enterUserNametxt(String unData) {
       
		DTA(username, unData, "UserName");
		
	}
	
	public static void clickNextBtn() {

		clickElement(nxt, "Next", null);
		
	}
	
	public static void clickCreateaccbtn() {

		clickElement(createacc, "Create Account", null);
		
	}
	
	public static void clickContinuetoGmialbtn() {

		clickElement(continuetogmail, "Continue to gmail button", null);
		
	}
	
	
	
	
	
	
	
	
	
}
