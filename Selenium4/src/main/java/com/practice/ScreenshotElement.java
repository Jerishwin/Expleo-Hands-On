package com.practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		try {
			WebElement logo = driver.findElement(By.xpath("//header/nav/a[1]"));
			File Source =((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("./Screenshots/logo"+System.currentTimeMillis()+".png"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Screenshot taken");
		driver.quit();
	}

}
