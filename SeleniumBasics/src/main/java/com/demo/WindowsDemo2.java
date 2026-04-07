package com.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WindowsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.id("j_idt88:new")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		
		Set<String> AllWindow = driver.getWindowHandles();
		
		System.out.println("Count of Windows: "+AllWindow.size());
		
		Iterator<String> iterator = AllWindow.iterator();
		
		
			while(iterator.hasNext()){
				if(driver.getTitle().equals("Window")) {
					driver.close();
					driver.switchTo().window(iterator.next());
				}
			}
	}

}
