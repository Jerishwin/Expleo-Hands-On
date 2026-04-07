package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RelativeLocators {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement firstName = driver.findElement(By.).below();
		firstName.sendKeys("John",Keys.ENTER);
		Thread.sleep(3000);
		
		driver.close();
	}
}
