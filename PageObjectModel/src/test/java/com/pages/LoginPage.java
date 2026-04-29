package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By userName = By.name("username");
	By password = By.name("password");
	By titleText = By.xpath("//div[@class='orangehrm-login-slot']/h5");
	By login = By.xpath("//button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setUserName(String name) {
		driver.findElement(userName).sendKeys(name);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public String getLoginTitle() {
		return driver.findElement(titleText).getText();
	}
	
	public void login(String name,String pass) {
		this.setUserName(name);
		this.setPassword(pass);
		this.clickLogin();
	}

}
