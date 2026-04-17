package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	public WebDriver driver;
	public WebDriverWait wait;
	public SoftAssert soft;

	@AfterMethod(groups = {"GroupA"})
	public void afterTest() {
		driver.quit();
	}

	@Test(groups = {"GroupA"})
	public void Login() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys("Banton");
		driver.findElement(By.id("loginpassword")).sendKeys("JeriJose");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		soft = new SoftAssert();
		WebElement id = wait.until(ExpectedConditions.elementToBeClickable(By.id("nameofuser")));
		soft.assertEquals(id.getText(), "Welcome Banton");
		WebElement is = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout2")));
		soft.assertEquals(is.getText(), "Log out");
		soft.assertAll();

	}

	@Test(groups={"GroupB"})
	public void WrongLoginPassword() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys("Banton");
		driver.findElement(By.id("loginpassword")).sendKeys("Jeri");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		soft = new SoftAssert();
		soft.assertEquals(alert.getText(), "Wrong password.");
		soft.assertAll();

	}
	
	
	@Test(groups={"GroupB"})
	public void WrongLoginUser() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys("ab1232e1");
		driver.findElement(By.id("loginpassword")).sendKeys("JeriJose");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		// driver.switchTo().alert().dismiss();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		soft = new SoftAssert();
		soft.assertEquals(alert.getText(), "User does not exist.");
		soft.assertAll();

	}

	@BeforeMethod(groups = {"GroupA"})
	public void beforeTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}
