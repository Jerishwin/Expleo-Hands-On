package com.test;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	static WebDriver driver;
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@Before
	public void setup() {
		System.out.println("------Before Executing------");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		driver.get("https://demoblaze.com/index.html");
	    System.out.println("Step1");
	    throw new io.cucumber.java.PendingException();
	}

	@Given("clicks the login button")
	public void clicks_the_login_button() {
	    driver.findElement(By.id("login2")).click();
	    driver.wait(ExpectedConditions.((WebElement) By.id("loginusername")));
	}

	@When("User enters valid username as {string}")
	public void user_enters_valid_username_as(String string) {
		driver.findElement(By.id("loginusername")).sendKeys("Banton");
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid password as {string}")
	public void user_enters_valid_password_as(String string) {
		driver.findElement(By.id("loginpassword")).sendKeys("JeriJose");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to Login Successfully")
	public void user_should_be_able_to_login_successfully() {
		WebElement str = driver.findElement(By.id(""));
		Assert.assertEquals("",str.getText());
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters invalid password as {string}")
	public void user_enters_invalid_password_as(String string) {
		driver.findElement(By.id("loginpassword")).sendKeys("JeriJ123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should face an alert saying {string}")
	public void user_should_face_an_alert_saying(String string) {
		 Alert alert = driver.switchTo().alert();
		 Assert.assertEquals(alert.getText(),"Wrong password." );
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters invalid username as {string}")
	public void user_enters_invalid_username_as(String string) {
		driver.findElement(By.id("loginusername")).sendKeys("asasd");
	    throw new io.cucumber.java.PendingException();
	}


}
