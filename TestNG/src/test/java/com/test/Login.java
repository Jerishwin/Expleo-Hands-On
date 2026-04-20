package com.test;

import org.testng.annotations.DataProvider;

public class Login {
	
	@DataProvider(name="login", parallel=true)
	public Object[][] dataProfunc(){
		return new Object[][]{
			{"Banton","asdada"},
			{"Banton","JeriJoseadkhcdj"}
		};
	}

}
