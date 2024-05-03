package com.rrameshsoft.automation.customized.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FinallyProg {
public static void main(String[] args) throws IOException  {
	FileInputStream fip = null;
	Workbook wb = null;
	try {
		 fip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace456\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx");
		 wb = WorkbookFactory.create(fip);
	}
	catch(Exception ex) {
		System.out.println("catch block");
		ex.printStackTrace();
	}
	finally {
		System.out.println("finally finished");
		if(wb!=null) {
			wb.close();
	
		}else {
			System.out.println("workbook is pointing to null");
		}
	}
	
	
	
	
	
}
}
