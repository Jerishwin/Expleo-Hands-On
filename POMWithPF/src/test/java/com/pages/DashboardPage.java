package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	By title = By.xpath("//h6");

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public String getTitleText() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(title));
		return driver.findElement(title).getText();
	}

}
