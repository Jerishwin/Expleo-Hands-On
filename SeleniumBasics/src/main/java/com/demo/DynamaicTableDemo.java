package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamaicTableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com");
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("jerishwinj@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("JeriJose");
		WebElement login = driver.findElement(By.id("submit"));
		login.click();
		
		Thread.sleep(2000);
		List<WebElement> contactNames = driver.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));
		int contactCount = contactNames.size();
		System.out.println("Total contacts: " + contactCount);
		
		for (WebElement contact : contactNames) {
		    System.out.println(contact.getText());
		}
		
		int i=1;
		for (WebElement contact : contactNames) {
		    if (contact.getText().equals("Jasper Laden")) {
		        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='myTable']/tr[" + (i) + "]"));
		        for (WebElement data : rowData) {
		            System.out.println(data.getText());
		        }
		    }
		    i++;
		}
		driver.quit();
	}

}
