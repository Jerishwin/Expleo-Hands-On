package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class BaseTest {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	LoginPage loginPage;
	DashboardPage dbPage;
	
	public static void setDriver(WebDriver webDriver)
	{
		driver.set(webDriver);
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}

	@BeforeMethod
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");

		setDriver(new ChromeDriver(options));
		driver.get().get("https://opensource-demo.orangehrmlive.com/");
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		

	}

	@AfterMethod
	public void teardown() {
		if(getDriver() != null)
		{
			driver.get().close();
			driver.remove();
		}
	}
}
