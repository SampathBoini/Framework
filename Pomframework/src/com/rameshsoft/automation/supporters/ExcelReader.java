package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.rrameshsoft.automation.customized.exceptions.FrameworkException;

import org.apache.poi.ss.usermodel.Cell;

    public class ExcelReader {
      private String filePath;
      private FileInputStream fip;
      private Workbook wb; 
	 private Sheet sheet;
	 private Row row;
	 private Cell cell;
	 private String cellValue;
	 
	   public ExcelReader(String filePath) throws EncryptedDocumentException, IOException {
	this.filePath= filePath;
	 fip = new FileInputStream(filePath);
	wb = WorkbookFactory.create(fip);
}
	   public Sheet getSheetObj(String how, String howValue) throws FrameworkException {
      
		   if(wb!=null) {
    	  if(how.equalsIgnoreCase("sheetname")) {
    		 sheet =  (Sheet) wb.getSheet(howValue);
    	  }else if(how.equalsIgnoreCase("index")) {
    		int indx =  Integer.parseInt(howValue);
    		  wb.getSheetAt(indx);
    	  }
    	  
      }else {
    	  FrameworkException exception = new FrameworkException("workbook is pointing null");
    	  System.out.println("workbook is pointing null");
    	  throw exception;
      }
      return sheet;
	}
	   
	   public Row getROwobj(String how, String howValue,int rowNum) throws FrameworkException {
		   if(wb!=null) {
		    sheet =	 getSheetObj(how, howValue);
		    if(sheet!=null) {
		    	 row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowNum);
		    }else {
		    	  System.out.println("Sheet is pointing null");
		      }
		      }else {
		    	  System.out.println("workbook is pointing null");
		      }
		   return row;
	}
	   public String getCellData(String how, String howValue,int cellNum, int i) throws FrameworkException {
		   if(wb!=null) {
			    sheet =	 getSheetObj(how, howValue);
			    if(sheet!=null) {
			    	 row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(cellNum);
			    	 if(row!=null) {
			    	 cell =	 (Cell) row.getCell(cellNum);
			    	 if(cell!=null) {
			    		 if((cell).getCellType()==CellType.STRING) {
					    		cellValue =   cell.getStringCellValue();  
					    	 }else if(( cell).getCellType()==CellType.NUMERIC) {
						    		cellValue =   cell.getNumericCellValue()+"";
						    		
					    	 }else if(( cell).getCellType()==CellType.BOOLEAN) {
						    		cellValue =   cell.getBooleanCellValue()+""; 
			    	 }
			    	
			    	 }else {
				    	  System.out.println("cell is pointing null");
				    	  
			    	 }
			    	 }
			    	 else {
				    	  System.out.println("row is pointing null");
 
			    	 }
			    }else {
			    	  System.out.println("Sheet is pointing null");
			      }
			      }else {
			    	  System.out.println("workbook is pointing null");
			      }
	return cellValue;
	   
	   }
	   
	   public List<String> getRowData(String how, String howValue,int rowNum) throws FrameworkException {
		   List<String> rowData = new ArrayList<String>();
		   if(wb!=null) {
			    sheet =	 getSheetObj(how, howValue);
			    if(sheet!=null) {
			    	 row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowNum);
			    	 if(row!=null) {
			    		 for(int i=0;i<=row.getLastCellNum();i++) {
			    			 cell = row.getCell(i);
			    			 if(cell!=null) {
					    		 if((cell).getCellType()==CellType.STRING) {
							    		cellValue =   cell.getStringCellValue();  
							    		rowData.add(cellValue);
							    	 }else if(( cell).getCellType()==CellType.NUMERIC) {
								    		cellValue =   cell.getNumericCellValue()+"";
								    		rowData.add(cellValue);

							    	 }else if(( cell).getCellType()==CellType.BOOLEAN) {
								    		cellValue =   cell.getBooleanCellValue()+""; 
								    		rowData.add(cellValue);

							    	 }
					    	
					    	 }else {
						    	  System.out.println("cell is pointing null");
						    	  
					    	 }
			    		 }
			    	 }else {
				    	  System.out.println("Row is pointing null");

			    	 }
			    	 
			    }else {
			    	  System.out.println("Sheet is pointing null");
			      }
			      }else {
			    	  System.out.println("workbook is pointing null");
			      }
		return rowData;
	}
	   
	   public List<String> getSheetData(String how, String howValue) throws FrameworkException {
		   List<String> sheetData = new ArrayList<String>();
       sheet =   getSheetObj(how, howValue);
       if(sheet!=null) {
    	   for(int i=0;i<= sheet.getLastRowNum();i++) {
    		  row = sheet.getRow(i);
    		  if(row!=null) {
 	    		 for(int j=0;j<=row.getLastCellNum();j++) {
 	    			 cell = row.getCell(j);
 	    			 if(cell!=null) {
 			    		 if((cell).getCellType()==CellType.STRING) {
 					    		cellValue =   cell.getStringCellValue();  
 					    		sheetData.add(cellValue);
 					    	 }else if(( cell).getCellType()==CellType.NUMERIC) {
 						    		cellValue =   cell.getNumericCellValue()+"";
 						    		sheetData.add(cellValue);

 					    	 }else if(( cell).getCellType()==CellType.BOOLEAN) {
 						    		cellValue =   cell.getBooleanCellValue()+""; 
 						    		sheetData.add(cellValue);

 					    	 }
 			    	
 			    	 }else {
 				    	  System.out.println("cell is pointing null");
 				    	  
 			    	 }
 	    		 }
 	    	 }else {
 		    	  System.out.println("Row is pointing null");

 	    	 }
 	    	 
    	   }
    	  
	      }return sheetData;
	}
	   
	   public Set<String> getuniqueSheetData(String how, String howValue) throws FrameworkException {
		 List<String> list = getSheetData(how, howValue);
		  Set<String> set = new HashSet<String>(list);
		
		return set;
          
	}

	   
	   
	   public static void main(String[] args) throws EncryptedDocumentException, IOException, FrameworkException {
		   	
		   ExcelReader er = new ExcelReader("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoftautomation\\appln\\testdata\\TestData.xlsx");
		   
		   er.getSheetObj("index", "0");
	}
	   
	   
	   
	   
	   
}
