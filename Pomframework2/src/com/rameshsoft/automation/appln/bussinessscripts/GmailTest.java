package com.rameshsoft.automation.appln.bussinessscripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.rameshsoft.automation.basepackage.BaseTest;
import com.rameshsoft.automation.utilities.PojoEReader;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends BaseTest{
   @Test
      public void gmailtest() throws IOException {
	
     
   
       String url = PojoEReader.getConfpr().getvalue("qa_url");
         getDriver().get(url);
          getExtenttest().log(LogStatus.PASS, "URL is entered as : "+url);
        
        
//      String id =  PojoEReader.getOrpr().getvalue("qa_un_id");
//        
//        WebElement un = getDriver().findElement(By.id(id));
//        un.sendKeys("Sampath");

}	
	
}
