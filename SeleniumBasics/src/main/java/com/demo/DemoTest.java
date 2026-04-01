package com.demo;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium",Keys.ENTER);
		System.out.print("Page title is: "+driver.getTitle());
		driver.close();
	}

}
