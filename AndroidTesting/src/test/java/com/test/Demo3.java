package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Demo3 {

    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public static void main(String[] args) throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setUdid("emulator-5554");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println("App Launched");

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("App"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Activity"))).click();

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Custom Title\"))")).click();

        List<WebElement> fields = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.className("android.widget.EditText")));

        List<WebElement> buttons = driver.findElements(AppiumBy.className("android.widget.Button"));


        String leftTitle = "Hello Raja";
        fields.get(0).clear();
        fields.get(0).sendKeys(leftTitle);
        System.out.println("Typed in left field: " + leftTitle);
        buttons.get(0).click();
        System.out.println("Clicked left button");
        
        String rightTitle = "Hello Jasper";
        fields.get(1).clear();
        fields.get(1).sendKeys(rightTitle);
        System.out.println("Typed in right field: " + rightTitle);
        buttons.get(1).click();
        System.out.println("Clicked right button");

        if (fields.get(0).getText().equals(leftTitle)) {
            System.out.println("PASS - Left field: " + fields.get(0).getText());
        } else {
            System.out.println("FAIL - Left field expected: " + leftTitle + " but got: " + fields.get(0).getText());
        }

        if (fields.get(1).getText().equals(rightTitle)) {
            System.out.println("PASS - Right field: " + fields.get(1).getText());
        } else {
            System.out.println("FAIL - Right field expected: " + rightTitle + " but got: " + fields.get(1).getText());
        }

        driver.quit();
    }
}