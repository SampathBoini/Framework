package com.rameshsoft.automation.appln.bussinessscripts;

import java.io.IOException;
import org.testng.annotations.Test;
import com.rameshsoft.automation.basepackage.BaseTest;
import com.rameshsoft.automation.utilities.PojoEReader;
import com.relevantcodes.extentreports.LogStatus;

public class fbTest extends BaseTest{
	@Test
    public void fbtest() throws IOException {

		     String url = PojoEReader.getConfpr().getvalue("fb_url");
	         getDriver().get(url);
	          getExtenttest().log(LogStatus.PASS, "URL is entered as : "+url);


	}	
	
	
}
