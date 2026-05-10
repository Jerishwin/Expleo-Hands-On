package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;

public class CommonStepDefinitions {
	WebDriver driver = Hooks.getDriver();

    @Given("the user launches the application")
    public void the_user_launches_the_application() {
        driver.get("https://tutorialsninja.com/demo/");
    }

}
