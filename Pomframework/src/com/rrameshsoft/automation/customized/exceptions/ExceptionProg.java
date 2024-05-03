package com.rrameshsoft.automation.customized.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionProg {
public static void main(String[] args) {
	   
	System.out.println("1");
	System.out.println("2");
	try {
	FileInputStream fip = new FileInputStream("C:\\Users\\Hp\\eclipse05-workspace\\Pomframework\\config.properties");
	}
	catch(FileNotFoundException fnfe) {
		System.out.println("FNFE ");
	}
	catch(Exception fe){
		System.out.println("catch block");
		//fe.printStackTrace();
   // System.out.println( fe.toString());
	System.out.println(fe.getMessage());
	}
	System.out.println("3");
	
	
	
	  
}
}
