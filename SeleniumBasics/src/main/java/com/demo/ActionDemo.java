package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement element = driver.findElement(By.id("form:drag_content"));
		WebElement des = driver.findElement(By.id("form:drop_content"));
		Actions act = new Actions(driver);
		act.dragAndDrop(element, des).build().perform();
		
		WebElement drag = driver.findElement(By.id("form:conpnl_content"));
		act.dragAndDropBy(drag, 90, 0).build().perform();
		
	}

}
