package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PDFUploadDemo {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pdf2doc.com/");
		driver.findElement(By.xpath("//span[text()='UPLOAD FILES']")).click();
		Thread.sleep(50000);
		Runtime.getRuntime().exec("C:\\Users\\Jerishwin Joseph\\OneDrive\\Desktop\\autoItDemo.exe");

	}

}
