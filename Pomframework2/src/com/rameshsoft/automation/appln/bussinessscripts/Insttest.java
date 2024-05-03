package com.rameshsoft.automation.appln.bussinessscripts;

import java.io.IOException;

import org.testng.annotations.Test;
import com.rameshsoft.automation.basepackage.BaseTest;
import com.rameshsoft.automation.utilities.PojoEReader;
import com.relevantcodes.extentreports.LogStatus;

public class Insttest extends BaseTest{
	@Test
    public void insttest() throws IOException {
   
		     String url = PojoEReader.getConfpr().getvalue("inst_url");
	         getDriver().get(url);
	          getExtenttest().log(LogStatus.PASS, "URL is entered as : "+url);


	}	
}
