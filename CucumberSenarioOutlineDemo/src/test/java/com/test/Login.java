package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setup() {
		System.out.println("------Before Executing------");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
	
	@After
	public void tearDown() {
		System.out.println("------After Executing------");
		driver.quit();
	}
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		driver.get("https://demoblaze.com/");
	    System.out.println("Step1");
	}
	@Given("clicks the login button")
	public void clicks_the_login_button() {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login2"))).click();
	}
	@When("User enters invalid username as {string}")
	public void user_enters_invalid_username_as(String string) {
	    WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
	    user.sendKeys(string);
	    
	}
	@When("User enters invalid password as {string}")
	public void user_enters_invalid_password_as(String string) {
	    driver.findElement(By.id("loginpassword")).sendKeys(string);
	}
	
	@When("User clicks the login Button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    
	}
	
	@Then("User should face an alert saying {string}")
	public void user_should_face_an_alert_saying(String string) {
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    alert=driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    
	}
}
