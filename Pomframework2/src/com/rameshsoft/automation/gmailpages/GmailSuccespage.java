package com.rameshsoft.automation.gmailpages;

import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.basepackage.ActionEngine;

public class GmailSuccespage extends ActionEngine{
static {
	PageFactory.initElements(getDriver(), getCurDir());
}
}
