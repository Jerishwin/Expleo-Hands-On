package com.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
features="src/test/resources/com/feature/login.feature",
glue="com.cucumber.MyCucumberProject.definitions")

public class JUnitRunner {

}
