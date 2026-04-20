package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedDemo {
	
	public WebDriver driver;
	public WebDriverWait wait;

	  @AfterMethod
	    public void afterTest() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	@Test
	@Parameters({"validName","validPass"})
	public void Login(String name,String pass) {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys(name);
		driver.findElement(By.id("loginpassword")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement id = wait.until(ExpectedConditions.elementToBeClickable(By.id("nameofuser")));
		Assert.assertEquals(id.getText(), "Welcome Banton");

	}

	@Test(dataProvider="login" , dataProviderClass = Login.class)
	public void WrongLogin(String name,String pass) {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginusername")).sendKeys(name);
		driver.findElement(By.id("loginpassword")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

	@BeforeMethod
	@Parameters({"browser","URL"})
	public void beforeTest(String browser,String URL) {
		if(browser.equalsIgnoreCase("firefox")) {
			
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			
			driver = new FirefoxDriver(options);
			
		}else if(browser.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--headless");
			options.setCapability("unhandledPromptBehavior", "ignore");
            driver = new ChromeDriver(options);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
	}
}
