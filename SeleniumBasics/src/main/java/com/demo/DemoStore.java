package com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement Login= driver.findElement(By.id("login2"));
		Login.click();
		 WebElement username = driver.findElement(By.id("loginusername"));
		 WebElement password = driver.findElement(By.id("loginpassword"));
		 WebElement loginButton = driver.findElement(By.xpath("//button[contains(@onclick,\"logIn()\")]"));
		 
		 username.sendKeys("banton");
		 password.sendKeys("1234");
		 loginButton.click();
		 
		 System.out.println("Login Successful");
		
		 WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout2")));
		 logout.click();
		 System.out.println("Logout Successful");
		 
		 driver.close();
		
		
		
		
		
		
	}

}
