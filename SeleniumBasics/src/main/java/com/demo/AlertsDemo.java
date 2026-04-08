package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		alertButton = driver.findElement(By.id("timerAlertButton"));
		alertButton.click();
		Thread.sleep(6000);
		alert.accept();
		alertButton = driver.findElement(By.id("confirmButton"));
		alertButton.click();
		Thread.sleep(2000);
		alert.dismiss();
		alertButton = driver.findElement(By.id("promtButton"));
		alertButton.click();
		Thread.sleep(2000);
		alert.sendKeys("Selenium");
		alert.accept();
	}

}
