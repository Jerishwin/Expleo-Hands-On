package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());

        WebDriver driver = BaseTest.driver;
        takeScreenshot(driver, result.getName());
    }

    public void takeScreenshot(WebDriver driver, String testName) {
        try {
        	
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);


            String folderPath = System.getProperty("user.dir") + "/screenshots/";

            Files.createDirectories(Paths.get(folderPath));

            String filePath = folderPath + testName + "_" + System.currentTimeMillis() + ".png";

            try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
                fos.write(screenshotBytes);
            }

            System.out.println("Screenshot saved at: " + filePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}