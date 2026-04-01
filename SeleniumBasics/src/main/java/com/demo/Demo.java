package com.demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		int length = title.length();
		System.out.println("Page title: "+title);
		System.out.println("Page title length: "+length);
		if(title.equals(driver.getCurrentUrl())) {
			System.out.println("True");
		}
		String source = driver.getPageSource();
		int len= source.length();
//		System.out.println(source);
		System.out.println("Source Length: "+len);
		
		driver.close();
	}

}
