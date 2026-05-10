package com.pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//h5")
	WebElement titleText;

	@FindBy(xpath = "//button[text() = \" Login \"]")
	WebElement login;
	
	@FindBy(xpath = "//span[text() = \"Required\"]")
	List<WebElement> requires;
	
	@FindBy(xpath = "//p[text() = \"Invalid credentials\"]")
	WebElement invalidCredentials;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void setUsername(String name) {
		username.sendKeys(name);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickLogin() {
		login.click();
	}

	public String getTitleText() {
		return titleText.getText();
	}
	
	public int getRequires(){
		return requires.size();
	}
	
	public boolean isInvalidCredentials()
	{
		return invalidCredentials != null;
	}

	public void login(String name, String pass) {
		setUsername(name);
		setPassword(pass);
		clickLogin();
	}
}
