package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {
	
	
	@Test
	public void dashboardTest() {

		loginPage = new LoginPage(driver.get());
		String loginTitle = "Login";
		Assert.assertEquals(loginPage.getTitleText(), loginTitle);
		loginPage.login("Admin", "admin123");

		dbPage = new DashboardPage(driver.get());
		String dbTitle = "Dashboard";
		Assert.assertEquals(dbPage.getTitleText(), dbTitle);
	}

}
