package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
  @Test
  public void f() {
	  
	  String str1 = new String("TestNG");
		String str2 = new String("TestNG");
		String str3 = null;
		String str4 = "TestNG";
		String str5 = "TestNG";
		String str6 = new String("not_TestNG");
		
		int val1 =5;
		int val2 = 6;
		
		Assert.assertEquals(str1,str2);
		System.out.println("Equals Assertion is successful");
		
		Assert.assertFalse(val1>val2);
		System.out.println("False Assertion is successful");
		
		Assert.assertNotNull(str1);
		System.out.println("Not null Assertion is successful");
		
		Assert.assertNull(str3);
		System.out.println("Null Assertion is successful");
		
		Assert.assertSame(str4, str5);
		System.out.println("Same Assertion is successful");
		
		Assert.assertNotSame(str1, str3);
		System.out.println("not same Assertion is successful");
  }
}
