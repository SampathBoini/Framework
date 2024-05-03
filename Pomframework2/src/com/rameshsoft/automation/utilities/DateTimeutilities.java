package com.rameshsoft.automation.utilities;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeutilities {

	public static  String  getcurYMD() {
      LocalDate ld = LocalDate.now();
    
	return ld.toString();
		
	}
	
	
	public static String getcurTime() {
		
		LocalTime lt = LocalTime.now();
		return lt.toString();
		
	}
	
	
	
	
	
}
