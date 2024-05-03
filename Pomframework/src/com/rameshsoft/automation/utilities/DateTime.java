package com.rameshsoft.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
public static void main(String[] args) {
	

	 
	LocalDate ld = LocalDate.now();
	System.out.println(ld);
	
	LocalDate ld1 = ld.plusDays(2);
	System.out.println(ld1);

	LocalDate ld2 = ld.minusDays(2);
		System.out.println(ld2);
			
			
			
			
			
			
	
	
}
}
