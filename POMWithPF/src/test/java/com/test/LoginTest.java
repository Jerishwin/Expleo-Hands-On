package com.test;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;


@Listeners(com.utils.Listener.class)
public class LoginTest extends BaseTest{


	@Test
	public void loginTest() {

		loginPage = new LoginPage(driver.get());

		String loginTitle = "Login";

		Assert.assertEquals(loginPage.getTitleText(), loginTitle);

	}
	
	@Test(dataProvider = "validDataSet", dataProviderClass = DPExcel.class)
	public void validLoginTest(String username, String password) {

		loginPage = new LoginPage(driver.get());
		loginPage.login(username, password);

		dbPage = new DashboardPage(driver.get());
		String dbTitle = "Dashboard";
		Assert.assertEquals(dbPage.getTitleText(), dbTitle);
	}
	
	@Test(dataProvider = "invalidDataSet", dataProviderClass = DPExcel.class)
	public void invalidLoginTest(String username, String password) {

		loginPage = new LoginPage(driver.get());
		
		loginPage.login(username, password);

		dbPage = new DashboardPage(driver.get());
		String dbTitle = "Dashboard";
		
		if(username.equals("") && password.equals(""))
		{
			Assert.assertEquals(2, loginPage.getRequires());
		} else if(username.equals("") || password.equals(""))
		{
			Assert.assertEquals(1, loginPage.getRequires());
		} else
		{
			Assert.assertTrue(loginPage.isInvalidCredentials());
		}
	}

}
