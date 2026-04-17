package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void Login() {
		driver.findElement(By.xpath("//a[text()='Log i']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys("Banton");
		driver.findElement(By.id("loginpassword")).sendKeys("JeriJose");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

	@Test(dependsOnMethods = "Login")
	public void WrongLoginPassword() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys("Banton");
		driver.findElement(By.id("loginpassword")).sendKeys("Jeri");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}
	
	
	@Test(dependsOnMethods = "Login")
	public void WrongLoginUser() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys("Jack123");
		driver.findElement(By.id("loginpassword")).sendKeys("JeriJose");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		// driver.switchTo().alert().dismiss();

	}

	@BeforeMethod
	public void beforeTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

}
