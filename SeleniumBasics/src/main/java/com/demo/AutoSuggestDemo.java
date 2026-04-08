package com.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement searchBox = driver.findElement(By.id("j_idt87:auto-complete_input"));
		searchBox.sendKeys("Selenium");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(@id,'j_idt87:auto-complete_panel')]/ul/li")));
		
		for(WebElement option : suggestions) {
			
				if(option.getText().equals("Selenium WebDriver")||option.getText().equals("AWS")) {
					option.click();
				}
			
		}
		
		
		
	}

}