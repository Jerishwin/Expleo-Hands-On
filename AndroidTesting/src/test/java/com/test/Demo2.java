package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobilePlatform;

public class Demo2 {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");

        options.setUdid("emulator-5554");

        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        System.out.println("Application Launched Successfully");
        
        driver.findElement(AppiumBy.accessibilityId("Content")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Clipboard"))).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Data Types"))).click();
        
        
        String text = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("io.appium.android.apis:id/styled_text"))).getText();
        
        System.out.println("Text is: " + text);
        
        
		
	}

}
