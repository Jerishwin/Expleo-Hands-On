package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//div[@class='orangehrm-login-slot']/h5")
	public WebElement titleText;
	
	@FindBy(xpath="//button")
	public WebElement login;
	
	@FindBy(xpath="//span")
	public WebElement error;
	
	@FindBy(xpath="//div[@class='oxd-alert-content oxd-alert-content--error']/p")
	public WebElement errormsg;
	
	public void login(String name,String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		login.click();
	}
	
	public String getLoginText() {
		return titleText.getText();
	}
	
	public String getError() {
		return error.getText();
	}
	
	public String getErrorMsg() {
		return errormsg.getText();
	}

}
