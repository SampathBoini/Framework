package com.rameshsoft.automation.supporters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonreader {
  private String filePath;
  private JSONParser jsp;
  private  JSONObject job;
   private   String value;
   private  Set set;
   
  public Jsonreader(String filePath) throws FileNotFoundException, IOException, ParseException {
	  
	  this.filePath = filePath;
	  JSONParser jsp = new JSONParser();
	Object obj =  jsp.parse(new FileReader(filePath));
	  JSONObject job = (JSONObject) obj;
	  
	  
  }
  
  
  
  
  public String getJsonValue(String key) {
      if(job!=null) {
    	  value = (String) job.get(key);
    	  
      }else {
    	  System.out.println("Jsonobject is pointing null ");
      }
	  return value;
	  
}
  public String getJsonValue(String key,String defaultvalue) {
      if(job!=null) {
    	  value = (String) job.get(key);
    	  if(value == null) {
    		  value = defaultvalue;
    	  }
      }else {
    	  System.out.println("Jsonobject is pointing null ");
      }
	  return value;
	  
  }
  public Map<String, String> getJsonKeyValue() {
	Map<String , String > map =new HashMap<String, String>();
	 if(job!=null) {
   	   set =  job.keySet();
   	  for(Object obj : set) {
   		  String key = (String) obj;
   		 value =  (String) job.get(key);
   		map.put(key, value);
   	  }
     }else {
   	  System.out.println("Jsonobject is pointing null ");
     }
	  
	  
	  
	  return map;

}
  
}
