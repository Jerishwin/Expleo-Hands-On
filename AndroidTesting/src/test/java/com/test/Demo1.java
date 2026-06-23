package com.test;

import java.net.URL;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Demo1 {

    public static void main(String[] args) {

        AndroidDriver driver = null;

        try {

            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");

            options.setUdid("emulator-5554");

            options.setAppPackage("io.appium.android.apis");
            options.setAppActivity("io.appium.android.apis.ApiDemos");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

            System.out.println("Application Launched Successfully");

            driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();

            System.out.println("Clicked Accessibility");

            Thread.sleep(2000);

            // Click Accessibility Node Provider
            driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Node Provider']")).click();

            System.out.println("Clicked Accessibility Node Provider");

            Thread.sleep(3000);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (driver != null) {
                driver.quit();
            }
        }
    }
}