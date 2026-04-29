package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	
	By dashboard = By.xpath("//div[@class='oxd-topbar-header-title']//h6");
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getHomepageText() {
		return driver.findElement(dashboard).getText();
	}

}
