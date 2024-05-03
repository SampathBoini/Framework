package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {
 
	private String filePath;
    private  FileInputStream fip;
    private  Properties prop;
	private String value;
	
 public PropertiesReader(String filePath) throws IOException {
	 this.filePath = filePath;
	  fip = new FileInputStream(filePath);
	  prop = new Properties();
	  prop.load(fip);
 }
 public String getvalue(String  key) {
     if(prop!=null) {
   	 value = (String) prop.getProperty(key) ;
     }else {
   	  System.out.println("properties object is point to null");
     }
     return value;

}
 public String getvalue(String key, String defaultvalue) {
      if(prop!=null) {
    	 value = prop.getProperty(key) ;
    	 if(value == null) {
    		 value = defaultvalue;
    	 }
      }else {
    	  System.out.println("properties object is point to null");
      }
      return value;

}
 
 public String getvalue(Object key) {
     if(prop!=null) {
   	 value = (String) prop.get(key) ;
     }else {
   	  System.out.println("properties object is point to null");
     }
     return value;

}
 public String getvalue(Object key, Object defaultvalue) {
     if(prop!=null) {
   	 value = (String) prop.getOrDefault(key,defaultvalue) ;
   	 if(value == null) {
   		 value = (String) defaultvalue;
   	 }
     }else {
   	  System.out.println("properties object is point to null");
     }
     return value;

}
 public void writeKeyvalue(String key,String value) throws IOException {
	    if(prop!=null) {
        prop.setProperty(key, value);
        FileOutputStream fop = new FileOutputStream(filePath);
        prop.store(fop, "file saved successfull");
	    
	    
	    }else {
	      	  System.out.println("properties object is point to null");
	        }
	   }
 
public void writeKeyvalue(Object key,Object value) throws IOException {
    if(prop!=null) {
    prop.put(key, value);
    FileOutputStream fop = new FileOutputStream(filePath);
    prop.store(fop, "file saved successfull");
    
    
    }else {
      	  System.out.println("properties object is point to null");
        }
   }

public Set getAllkeys() {
	Set setKeys = null;
	
	    if(prop!=null) {
        setKeys = prop.keySet();
	   
	    }else {
	      	  System.out.println("properties object is point to null");
	        }
	 return setKeys;
	   }
    public List getAllvalues() {
       List lis = new ArrayList();
    	    if(prop!=null) {
           Set setKeys = prop.keySet();
    	   for (Object obj : setKeys) {
			String key = (String) obj;
			lis.add(key);
		}
    	    }else {
    	      	  System.out.println("properties object is point to null");
    	        }
    	return lis;
         	}
           public Map<String, String> getKeysValues() {
        	   Map<String, String> map = new HashMap<String, String>();
        	   if(prop!=null) {
        	         Set setKeys = prop.keySet();
        		   for (Object obj : setKeys) {
					String key = (String) obj;
					 value = prop.getProperty(key);
					 map.put(key, value);
					 
				}
        		    }else {
        		      	  System.out.println("properties object is point to null");
        		        }
			return map; 
		}

}  

















 


