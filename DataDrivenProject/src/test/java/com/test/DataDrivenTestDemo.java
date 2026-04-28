package com.test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class DataDrivenTestDemo {
	public WebDriver driver;
	public WebDriverWait wait; 
	public static Logger log = LogManager.getLogger(DataDrivenTestDemo.class);

	@AfterMethod
	public void teardon() {
		driver.quit();
		log.info("The Browser is closed");
	}

	@Test(dataProvider="validExcelData" , dataProviderClass = com.utilities.ExcelUtils.class)

	public void Login(String name,String pass) {
		
		log.info("The valid login is Started");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='top-links']/ul/li[2]/ul/li[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-email"))).sendKeys(name);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement id = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[1]")));
		Assert.assertEquals(id.getText(), "My Account");
		log.info("Login is sucessfull");

	}
	
	@Test(dataProvider="invalidExcelData" , dataProviderClass = com.utilities.ExcelUtils.class)
	public void WrongLoginUser(String name,String pass) {
		
		log.info("The invalid login is Started");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='top-links']/ul/li[2]/ul/li[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-email"))).sendKeys(name);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement id = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='alert alert-danger alert-dismissible']")));
		if(id.getText().equals("Warning: No match for E-Mail Address and/or Password.")) {
			Assert.assertEquals(id.getText(), "Warning: No match for E-Mail Address and/or Password.");
		}else {
			Assert.assertEquals(id.getText(), "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
		}
		
		log.warn("Login is unsucessfull");

	}
	
	@Test
	@Parameters({"validName"})
	public void validSearch(String name) {
		
		log.info("The valid Search is Started");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.ENTER);
		WebElement id = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2")));
		Assert.assertEquals(id.getText(), "Products meeting the search criteria");
		log.info("Search is Sucessfull");

	}
	
	@Test
	@Parameters({"invalidName"})
	public void invalidSearch(String name) {
		
		log.info("The invalid Search is Started");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.ENTER);
		WebElement id = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='content']/p[2]")));
		Assert.assertEquals(id.getText(), "There is no product that matches the search criteria.");
		log.error("Product are not found");
	}
	

	@BeforeMethod
	public void beforeTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		log.info("Driver is opened");
		
	}
}
