package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPage;
import com.utlities.HelperClass;

public class LoginPageActions {
	LoginPage loginPageLocators = null;
	String username,password;
	
	public LoginPageActions() {
		this.loginPageLocators = new LoginPage();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	
	public void setUsername(String username) {
		loginPageLocators.username.sendKeys(username);
	}
	
	public void setPassword(String password) {
		loginPageLocators.password.sendKeys(password);
	}
	
	public void clickLogin() {
		loginPageLocators.loginPassword.click();
	}
	
	public void login() {
		File file = new File("E:\\Expleo\\Reporting\\src\\test\\resources\\testData.properties");
		
		FileInputStream fileInput = null;
		
		try {
			fileInput = new FileInputStream(file);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}
		username = prop.getProperty("username");
		password = prop.getProperty("password");
		this.setUsername(username);
		this.setPassword(password);
		this.clickLogin();
	}
}
