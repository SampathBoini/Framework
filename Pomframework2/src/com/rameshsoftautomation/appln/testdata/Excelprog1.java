package com.rameshsoftautomation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelprog1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx");
	Workbook workbook = WorkbookFactory.create(fip);
 Sheet sheet = workbook.getSheet("Gmail_data");
	
   for(int i=0;i<=sheet.getLastRowNum(); i++) {
	  Row row = sheet.getRow(i);
	  
	   for(int j=0;j<row.getLastCellNum();j++) {
		   Cell cell = row.getCell(j);
		   
		   if(cell.getCellType()==CellType.STRING) {
			   String cellvalue = cell.getStringCellValue();
			   System.out.println(cellvalue);
			   
		   }else if(cell.getCellType()==CellType.NUMERIC) {
			   double cellvalue1 = cell.getNumericCellValue();
			   System.out.println(cellvalue1);
			   
		   }else if(cell.getCellType()==CellType.BOOLEAN ) {
			   boolean cellvalue2 = cell.getBooleanCellValue();
			   System.out.println(cellvalue2);
		   }
	   }
   }
	
	 
	  
}
}
