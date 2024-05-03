package com.rameshsoft.automation.supporters;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProg {
public static void main(String[] args) throws ParseException, IOException {
	
	 JSONParser js = new JSONParser();
	//Object obj = js.parse("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\gmail.json");
	
	 FileReader fr = new FileReader("C:\\Users\\Hp\\eclipse-workspace\\Pomframework\\gmail.json");
	Object obj =  js.parse(fr);
	 JSONObject job = (JSONObject) obj;
	 
   String val =	 (String) job.get("un_id");
   System.out.println(val);
   
  String val1 = (String) job.get("nxt_id");
	 System.out.println(val1);
	 
	 String val2 = (String) job.get("pwd_name");
	 System.out.println(val2);
	 
	 String val3 = (String) job.get("signin_id");
	 System.out.println(val3);
	 
	 String val4 = (String) job.getOrDefault("signin_id456", "JOB");
	 System.out.println(val4);
}
}
