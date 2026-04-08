package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/search?q=table");
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='table1']//td"));
		
		int i=1;
			for(WebElement element:table) {
				String data = element.getText();
				System.out.print(data + " ");
				if(i==3) {
					System.out.println();
					i=0;
				}
				i++;
				
			}
			System.out.println();
		
	}

}
