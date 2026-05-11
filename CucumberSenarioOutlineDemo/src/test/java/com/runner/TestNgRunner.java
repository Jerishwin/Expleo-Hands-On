package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"usage"},
features="src\\test\\resources\\com\\feature\\MultipleDataTable.feature",
glue="com.test")

public class TestNgRunner extends AbstractTestNGCucumberTests{

}
