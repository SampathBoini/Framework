package com.rameshsoftautomation.appln.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Excelprog2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	   //Workbook wb =	WorkbookFactory.create(new File("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx"));
	   FileInputStream fip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx");
       Workbook wb =	WorkbookFactory.create(fip);
	   //workbook is an interface which is specially designed in excel package
	   //workbook is a collection of sheets
       
        
  // Sheet sheet =  (Sheet) wb.getSheetAt(0);
     org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Gmail_data");
     
     Row row0 = sheet.getRow(0);
     org.apache.poi.ss.usermodel.Cell cell0 =   row0.createCell(4);
       cell0.setCellValue("practice man");
     
       Row row4 =   sheet.getRow(4);
     org.apache.poi.ss.usermodel.Cell cell43 =  row4.createCell(3);
       cell43.setCellValue("subject");
       
       Row row5 =sheet.createRow(5);
       org.apache.poi.ss.usermodel.Cell cell05 = row5.createCell(5);
       cell05.setCellValue("workman");
       
       org.apache.poi.ss.usermodel.Cell cell51 = row5.createCell(1);
       cell51.setCellValue("please man");
       
       FileOutputStream fop = new FileOutputStream("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx");
       wb.write(fop);
          
}
}
