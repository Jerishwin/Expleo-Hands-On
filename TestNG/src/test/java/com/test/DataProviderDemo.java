package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderDemo {
	private static final ThreadLocal <WebDriver> driver = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void setUp() {
		System.out.println();
		driver.set(new ChromeDriver());
		
	}
	
	@Test(dataProvider="TestData" , dataProviderClass = TestData.class )
	public void search(String key) {
		WebDriver driver1 = driver.get();
		driver1.get("https://www.bing.com/");
		
		WebElement txtbox = driver1.findElement(By.id("sb_form_q"));
		txtbox.sendKeys(key);
		System.out.println(key);
		txtbox.sendKeys(Keys.ENTER);
		System.out.println("Search is displayed");
	}
	
	@AfterMethod
	public void teardon() {
		WebDriver driver1 = driver.get();
		System.out.println("After method ID: "+Thread.currentThread().getId());
		if(driver1!=null) {
			driver1.quit();
		}
	}
	
}
