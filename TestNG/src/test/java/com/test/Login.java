package com.test;

import org.testng.annotations.DataProvider;

public class Login {
	
	@DataProvider(name="login")
	public Object[][] dataProfunc(){
		return new Object[][]{
			{"Banton","asdada"},
			{"asd122e","JeriJose"}
		};
	}

}
