package com.rameshsoft.automation.appln.bussinessscripts;

import org.testng.Assert;

//import org.testng.asserts.SoftAssert;

public class Softassertprog {
public static void main(String[] args) {
	int num1 = 65 ,num2 =45;
	
  // SoftAssert sa = new SoftAssert();
	
	System.out.println("1");
	System.out.println("2");
	Assert.assertEquals(num1, num2);
	System.out.println("3");
	
	System.out.println("4");
	
}
}
