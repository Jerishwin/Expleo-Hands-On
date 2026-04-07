package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		WebElement iframeElement = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(iframeElement);
		
		
		driver.switchTo().defaultContent();
		String mainPage = driver.findElement(By.xpath("//")).getText();
	}

}
