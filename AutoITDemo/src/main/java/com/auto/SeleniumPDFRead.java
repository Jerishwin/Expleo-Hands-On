package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumPDFRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions(); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://pdf2doc.com/");
		driver.findElement(By.xpath("//span[text()='UPLOAD FILES']")).sendKeys("C:/Users/Jerishwin Joseph/Downloads/ilovepdf_merged_organized.pdf");
	}

}
