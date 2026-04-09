package com.JSpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('firstName').value='Jerish'");
		js.executeScript("document.getElementById('lastName').value='Joseph'");
		js.executeScript("document.getElementById('malerb').click()");
		js.executeScript("document.getElementById('englishchbx').click()");
		js.executeScript("document.getElementById('frenchchbx').click()");
		js.executeScript("document.getElementById('email').value='jj@gmail.com'");
		js.executeScript("document.getElementById('password').value='JeriJose'");
		js.executeScript("document.getElementById('registerbtn').click()");
	}

}
