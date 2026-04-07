package com.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WindowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Count of Windows: "+allWindows.size());
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> newAllWindows = driver.getWindowHandles();
		System.out.println("Count of Windows: "+newAllWindows.size());
		
		String ParentHandle = driver.getWindowHandle();
		System.out.println("Parent Window: "+ParentHandle);
		
		Iterator<String> iterator = newAllWindows.iterator();
		String mainWindow = iterator.next();
		String childWindow = iterator.next();
		System.out.println("Main Window: "+mainWindow);
		System.out.println("Child Window: "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text in Child Window: "+text.getText());
		
		driver.close();
		
		driver.switchTo().window(ParentHandle);
		System.out.println("Title of Parent Window: "+driver.getTitle());
		driver.quit();
	}

}
