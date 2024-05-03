package com.rrameshsoft.automation.customized.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FinallyProg2 {
public static void main(String[] args) throws IOException  {
	
	try(FileInputStream fip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace456\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fip);){
		 
	}
	catch(Exception ex) {
		System.out.println("catch block");
		ex.printStackTrace();
	}
	

	
}
}
