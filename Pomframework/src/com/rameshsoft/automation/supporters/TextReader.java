package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextReader {

	private String  filePath;
	private File file;
	private  FileWriter fw ;
	private BufferedWriter bw;
	private FileReader fr;
	private  BufferedReader br;
	
	public TextReader(String  filePath) throws IOException {
		  file = new File("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\src\\com\\rameshsoft\\automation\\supporters\\Hardwork");
		   boolean status = file.createNewFile();
		   if(status) {
			   System.out.println("File created newly!");
		   }else {
			   System.out.println("Return existing file!");
		   }
		    fw =new FileWriter(file);
		    bw = new BufferedWriter(fw);
		  
		    fr =new FileReader(file);
		    br = new BufferedReader(fr);
		   
		    
			}
	
	 public void writeData(String data) throws IOException {
   if(bw!=null) {
	   bw.write(data);
	   bw.flush();
	}else {
		System.out.println("BW is poiniting to null");
	}
	 }
   public void writeData(int data) throws IOException {
	   if(bw!=null) {
		   bw.write(data);
		   bw.flush();
		}else {
			System.out.println("BW is poiniting to null");
		}
	}
	
   
   public String getData() throws IOException {
	  String data ="";
	   if(bw!=null) {
		   bw.write(data);
		   bw.flush();
		}else {
			System.out.println("BW is poiniting to null");
		}
	return data;
	}
	
}
