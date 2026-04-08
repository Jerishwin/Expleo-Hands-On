package com.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        String parentWindow = driver.getWindowHandle();

        WebElement compendumDeVlink = driver.findElement(By.linkText("compendiumdev"));

        // ✅ Fix: Scroll the element into view before Actions touches it
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block: 'center'});", compendumDeVlink
        );

        Thread.sleep(500); // Small pause to let scroll settle

        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(compendumDeVlink).keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                System.out.println("Child Window Title: " + driver.getTitle());
            }
        }

    }

}