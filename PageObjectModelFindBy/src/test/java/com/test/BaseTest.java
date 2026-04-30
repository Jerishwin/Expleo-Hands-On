package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

@Listeners(Listner.class)

public class BaseTest {
	public static WebDriver driver;
	LoginPage objLogin;
	DashboardPage objDash;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoblaze.com/index.html");
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
  @Test(priority=1)
  public void loginTest() {
	  objLogin = new LoginPage(driver);
	  objLogin.login("Banton", "Jer");
	  Assert.assertTrue(objLogin.getLoginText().contains("Welcome Banton"));
	  
  }
  
  @Test(priority=0)
  public void invalidloginTest() {
	  objLogin = new LoginPage(driver);
	  objLogin.login("aedadd2", "JeriJose");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	  
	  Assert.assertTrue(alert.getText().contains("User does not exist."));
	  alert.accept();
	  
  }
  
  
  
}
