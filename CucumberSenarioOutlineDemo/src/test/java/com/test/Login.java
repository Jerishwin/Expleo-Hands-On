package com.test;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
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
	
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password(DataTable dataTable) {
	    List<List<String>> form = dataTable.asLists(String.class);
	    String user = form.get(0).get(1);
	    String pass = form.get(1).get(1);
	    WebElement use = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
	    use.sendKeys(user);
	    driver.findElement(By.id("loginpassword")).sendKeys(pass);
	}

	@Then("User should be able to Login Successfully")
	public void user_should_be_able_to_login_successfully() {
		WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
		System.out.println(msg.getText());
	}
	
	@Then("User enters invalid credentials and login is unsessfull")
	public void user_enters_invalid_credentials_and_login_is_unsessfull(DataTable dataTable) {
		List<Map<String,String>> user = dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:user) {
			String username = form.get("user");
			System.out.println(username);
		    WebElement use = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		    use.sendKeys(username);
		    
		    String pass = form.get("pass");
			System.out.println(pass);
		    driver.findElement(By.id("loginpassword")).sendKeys(pass);
		    
		    String error = form.get("error");
			System.out.println(error);
		    driver.findElement(By.xpath("//button[text()='Log in']")).click();
		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		    alert=driver.switchTo().alert();
		    System.out.println(alert.getText());
		    alert.accept();
		    driver.findElement(By.id("loginpassword")).clear();
		    driver.findElement(By.id("loginusername")).clear();
		}
	}

}
