package com.rameshsoft.automation.appln.objectrepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Propertiesprog  {
public static void main(String[] args) throws IOException {
	
	
	FileInputStream fip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\config.properties");
	 
	Properties prop = new Properties();
	prop.load(fip);
	
	String val = prop.getProperty("qa_url");
	System.out.println(val);
	
	String val1 = prop.getProperty("qa_un");
	System.out.println(val1);
	
	String val2 = prop.getProperty("qa_pwd");
	System.out.println(val2);
	
	String val3 = prop.getProperty("dev_url");
	System.out.println(val3);
	
	String val4 = prop.getProperty("dev_urln","job");
	System.out.println(val4);

	Object obj = prop.get("qa_url");
     String val5 = (String) obj;
     System.out.println(val5);
	
	Set<?> keys= prop.keySet();
	System.out.println(keys);
	
   Set<?> entries   = prop.entrySet();
	System.out.println(entries);
	
	
	
	

//	prop.setProperty("practice", "job");
//	prop.setProperty("hardwork", "jobs");
//	prop.setProperty("practicehrs", "9");
//	prop.setProperty("sal", "sol");
//	prop.put("job", "job");
//	
//	
//	
//	FileOutputStream fop = new FileOutputStream("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\config.properties");
//
//    prop.store(fop, "saved");	
//	
////	
	
	
}
}
