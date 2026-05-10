package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestReporting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriver driver = new ChromeDriver();
		ExtentTest test = extent.createTest("Search Test");
		
		try {
			driver.get("https://www.google.com");
			test.pass("Navigated to google");
		}catch(Exception e) {
			test.fail("Test failed due to exception: "+e.getMessage());
		}finally {
			driver.quit();
			extent.flush();
		}

	}

}
