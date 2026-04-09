package com.JSpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String fname = js.executeScript("return document.getElementsByName('name')[0].value='Jerish'").toString();
		String lname = js.executeScript("return document.getElementsByName('name')[1].value='Jose'").toString();
		String email = js.executeScript("return document.getElementsByTagName('input')[2].value='jj@gmail.com'").toString();
		String pass = js.executeScript("return document.getElementsByTagName('input')[3].value='JeriJose'").toString();
		js.executeScript("document.getElementsByTagName('input')[4].value='JeriJose'");
		js.executeScript("document.getElementsByClassName('btn')[0].click()");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(pass);
		
		Thread.sleep(2000);
		System.out.println(js.executeScript("return document.URL"));
		
		
	}

}
