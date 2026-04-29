package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest {
	public static WebDriver driver;
	LoginPage objLogin;
	DashboardPage objDash;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	@Test(priority=2)
	  public void DashTest() {
		  objDash = new DashboardPage(driver);
		  objLogin = new LoginPage(driver);
		  objLogin.login("Admin", "admin123");
		  String dashTitle = objDash.getHomepageText();
		  Assert.assertTrue(dashTitle.contains("Dashboard"));
	  }
}
