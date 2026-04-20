package com.test;

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider(name="TestData" ,parallel=true)
	public Object[][] dataProfunc(){
		return new Object[][]{
			{"Selenium"},{"TestNG"},{"Java Core"},{"Manual Testing"}
		};
	}
}
