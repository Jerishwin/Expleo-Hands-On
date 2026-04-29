package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='oxd-topbar-header-title']//h6")
	public WebElement dashTitle;
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public String getHomepageText() {
		return dashTitle.getText();
	}

}
