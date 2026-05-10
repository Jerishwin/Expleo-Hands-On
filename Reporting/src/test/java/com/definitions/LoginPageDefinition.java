package com.definitions;

import com.actions.HomePageActions;
import com.actions.LoginPageActions;
import com.utlities.HelperClass;

import io.cucumber.java.en.*;

public class LoginPageDefinition {
	HomePageActions hpa = new HomePageActions();
	LoginPageActions lpa = new LoginPageActions();
	
	@Given("User is on Login Page {string}")
	public void user_is_on_login_page(String string) {
	    
		HelperClass.openPage(string);
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		lpa.login();
	}

	@Then("User should be able to login sucessfully and see the Dashboard")
	public void user_should_be_able_to_login_sucessfully_and_see_the_dashboard() {
		System.out.println(hpa.getHomePageText());
	}
}
