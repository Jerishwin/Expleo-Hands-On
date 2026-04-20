package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedDemo {
	
	private static final ThreadLocal <WebDriver> driver = new ThreadLocal<WebDriver>();
	public WebDriverWait wait;

	@AfterMethod
	public void teardon() {
		WebDriver driver1 = driver.get();
		if(driver1!=null) {
			driver1.quit();
		}
	}

	@Test
	@Parameters({"validName","validPass"})
	public void Login(String name,String pass) {
		WebDriver driver1 = driver.get();
		wait = new WebDriverWait(driver.get(), Duration.ofSeconds(20));
		driver1.findElement(By.xpath("//a[text()='Log in']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
		driver1.findElement(By.id("loginusername")).sendKeys(name);
		driver1.findElement(By.id("loginpassword")).sendKeys(pass);
		driver1.findElement(By.xpath("//button[text()='Log in']")).click();
		WebElement id = wait.until(ExpectedConditions.elementToBeClickable(By.id("nameofuser")));
		Assert.assertEquals(id.getText(), "Welcome Banton");

	}

	@Test(dataProvider="login" , dataProviderClass = Login.class)
	public void WrongLogin(String name,String pass) throws InterruptedException {
		WebDriver driver1 = driver.get();
		wait = new WebDriverWait(driver1, Duration.ofSeconds(20));
		driver1.findElement(By.xpath("//a[text()='Log in']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
		driver1.findElement(By.id("loginusername")).sendKeys(name);
		driver1.findElement(By.id("loginpassword")).sendKeys(pass);
		driver1.findElement(By.xpath("//button[text()='Log in']")).click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver1.switchTo().alert();
		Assert.assertEquals(alert.getText(), "Wrong password.");
	}

	@BeforeMethod
	@Parameters({"browser","URL"})
	public void beforeTest(String browser,String URL) {
		if(browser.equalsIgnoreCase("firefox")) {
			
			driver.set(new FirefoxDriver());
			
		}else if(browser.equalsIgnoreCase("chrome")) {
			
			driver.set(new ChromeDriver());
		}
		
		WebDriver driver1 = driver.get();
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get(URL);
		
	}
}
