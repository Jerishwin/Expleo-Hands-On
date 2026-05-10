package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
//	public static WebDriver driver;
//    public static WebDriverWait wait;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();
    
    @Before
    public void setup() {
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver.set(new ChromeDriver(options));                          
        wait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(10)));
    }
    
    @After
    public void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();   
            driver.remove();       
            wait.remove();         
        }
    }

    
    public static WebDriver getDriver() {
        return driver.get();
    }

    public static WebDriverWait getWait() {
        return wait.get();
    }
}
