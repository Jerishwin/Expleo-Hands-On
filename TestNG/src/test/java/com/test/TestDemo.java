package com.test;

import org.testng.annotations.Test;

public class TestDemo {
  @Test(priority = 3)
  public void a() {
	  System.out.println("Test A");
  }
  
  @Test(priority = 1)
  public void b() {
	  System.out.println("Test B");
  }
  
  @Test(priority = 2)
  public void c() {
	  System.out.println("Test C");
  }
}
