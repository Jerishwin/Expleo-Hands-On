package com.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bstackdemo.com/");
		WebElement UiAuto = driver.findElement(By.xpath("//div[contains(@class,'sort')]/child::select"));
		Select dropdown = new Select(UiAuto);
		List<WebElement> list = dropdown.getOptions();
		System.out.println("Total options: " + list.size());
		
		for(WebElement ls:list) {
			System.out.println(ls.getText());
		}
		
		Boolean multiple = dropdown.isMultiple();
		
		System.out.println("Is multiple: " + multiple);
		dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Lowest to highest");
	}

}
