package com.rameshsoftautomation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excelprog {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	   //Workbook wb =	WorkbookFactory.create(new File("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx"));
	   FileInputStream fip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx");
       Workbook wb =	WorkbookFactory.create(fip);
	   //workbook is an interface which is specially designed in excel package
	   //workbook is a collection of sheets
       
      List list = wb.getAllNames();
      
     int noofsheets =  wb.getNumberOfSheets();
     System.out.println("noof sheets : "+noofsheets); 
      
  // Sheet sheet =  (Sheet) wb.getSheetAt(0);
     org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Sheet1");
     
     int noofrows =  sheet.getLastRowNum();
     System.out.println("Noof rows are: "+noofrows);
      
      Row row0 =sheet.getRow(0); 
     int noofcells =  row0.getLastCellNum();
     System.out.println("noof cells: "+noofcells);
     
      org.apache.poi.ss.usermodel.Cell  cell00 =  row0.getCell(0);
     String cell00val = cell00.getStringCellValue();
      System.out.println("cell value:"+cell00val);
      
      org.apache.poi.ss.usermodel.Cell  cell01 =  row0.getCell(1);
      if(cell01.getCellType() == CellType.STRING) {
    	  String cell01val = cell01.getStringCellValue();
          System.out.println("cell value:"+cell01val);
      }else if(cell01.getCellType()== CellType.NUMERIC) {
    	 double val= cell01.getNumericCellValue();
    	 System.out.println("oth row 2nd cell data is: "+val);
    	 
      }else if(cell01.getCellType()== CellType.NUMERIC) {
     	 boolean val= cell01.getBooleanCellValue();
     	 System.out.println("oth row 2nd cell data is: "+val);
     	 
       }
      
    
       
       
       org.apache.poi.ss.usermodel.Cell  cell02 =  row0.getCell(2);
       String cell02val = cell02.getStringCellValue();
        System.out.println("cell value:"+cell02val);
        
        Row row1 = sheet.getRow(1);
       int row1cell = row1.getLastCellNum();       
       System.out.println("row1count is: "+row1cell);
       
      org.apache.poi.ss.usermodel.Cell cell10 = row1.getCell(0);
       String cell10val = cell10.getStringCellValue();
       System.out.println("1stroww 0cell is: "+cell10val);
       
       org.apache.poi.ss.usermodel.Cell cell11 = row1.getCell(1);
       String cell11val = cell11.getStringCellValue();
       System.out.println("1stroww 0cell is: "+cell11val);
       
       org.apache.poi.ss.usermodel.Cell cell12 = row1.getCell(2);
       String cell12val = cell12.getStringCellValue();
       System.out.println("1stroww 0cell is: "+cell12val);
       
       
       
       
       
       
       
       
       
       
}
}
