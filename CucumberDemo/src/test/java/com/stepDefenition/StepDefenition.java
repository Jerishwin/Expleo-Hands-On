package com.stepDefenition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefenition {
	public static WebDriver driver;
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    System.out.println("Step1");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
		System.out.println("Step2");
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		System.out.println("Step3");
	}

	@Then("User should be able to Login Successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("Step4");
	}
}
