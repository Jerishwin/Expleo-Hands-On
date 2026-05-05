package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"pretty","html:target/cucumber-reports/Cucumber.html"},
features="src\\test\\resources\\com\\feature\\login.feature",
glue="com.test",
tags= "@invalid")

public class TestNgRunner extends AbstractTestNGCucumberTests{

}
