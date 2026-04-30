package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="login2")
	public WebElement Loginbutton;
	
	@FindBy(id="loginusername")
	public WebElement username;
	
	@FindBy(id="loginpassword")
	public WebElement password;
	
	@FindBy(id="nameofuser")
	public WebElement titleText;
	
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement login;
	
	@FindBy(id="logout2")
	public WebElement Logout;
	
	public void login(String name,String pass) {
		Loginbutton.click();
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(name);
		password.sendKeys(pass);
		login.click();
	}
	
	public String getLoginText() {
		 wait.until(ExpectedConditions.visibilityOf(titleText));
		return titleText.getText();
	}
	

}
