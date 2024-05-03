package com.rameshsoft.automation.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.parser.ParseException;

import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.Jsonreader;
import com.rameshsoft.automation.supporters.PropertiesReader;

public class PojoEReader {

	public static PropertiesReader getConfpr() throws IOException {
		PropertiesReader prconf = new PropertiesReader(Filpaths.confpath);
		return prconf;
	}

	public static PropertiesReader getOrpr() throws IOException {
		PropertiesReader prOr = new PropertiesReader(Filpaths.orPath);
		return prOr;
	}

	public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException {
		ExcelReader excelReader = new ExcelReader(Filpaths.excelPath);
		
		return excelReader;
		
	}
	
	
	public static Jsonreader getJsonObj() throws FileNotFoundException, IOException, ParseException {
  
		Jsonreader jsr = new Jsonreader(Filpaths.jsonPath);

		return jsr;
	}
	
	
}
