package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class BaseTest {
	public static WebDriver driver;
	LoginPage objLogin;
	DashboardPage objDash;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
  @Test(priority=1)
  public void loginTest() {
	  objLogin = new LoginPage(driver);
	  String loginTitle = objLogin.getLoginTitle();
	  Assert.assertTrue(loginTitle.contains("Login"));
	  objLogin.login("Admin", "admin123");
	  
  }
}
