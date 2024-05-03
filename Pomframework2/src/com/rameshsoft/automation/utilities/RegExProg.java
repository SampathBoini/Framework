package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProg {
public static void main(String[] args) {
	
	String str ="java @$programjavajava java java456";
  Pattern pt =	Pattern.compile("java");
	
    Matcher mt = pt.matcher(str);
    
    int count =0;
    
    while(mt.find()) {
    	count++;
      String grp =  mt.group();
      System.out.println(grp);
      int startIndx =  mt.start();
      System.out.println(startIndx);
     int endIndx =  mt.end();
      System.out.println(endIndx);
      System.out.println("---------------------------------------------");
    }
    
    System.out.println("no of occurences of a count is: "+count);
    
    
}
}
