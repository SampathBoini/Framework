package com.rameshsoft.automation.gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.basepackage.ActionEngine;

public class GmailPwdPages extends ActionEngine{

	static {
		PageFactory.initElements(getDriver(), GmailPwdPages.class);
	}
	@FindBy(name="Passwd")
	private static WebElement password;
	
	@FindBy(id="passwordNext")
	private static WebElement signIn;
	
	@FindBy(xpath="//span[text()='Forgot password?']")
	private static WebElement frgtpwd;
	
	@FindBy(xpath="//div[text()='Show password']")
	private static WebElement showpwd;
	
	
	public static void enterpasswordtxt(String pwdData) {
	       
		DTA(password, pwdData, "Password");
		
	}
	
	public static void clicksignInBtn() {

		clickElement(signIn, "sign In", null);
		
	}
	public static void clickfrgtpwdBtn() {

		clickElement(frgtpwd, "forgot password", null);
		
	}
	public static void clickshowpwdBtn() {

		clickElement(showpwd, "show password", null);
		
	}
	
}
