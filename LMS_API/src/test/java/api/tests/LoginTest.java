package api.tests;

import org.testng.annotations.Test;

import api.dataproviders.*;
import api.payload.LoginRequest;

import api.services.LoginService;
import api.utilities.ConfigReader;
import api.utilities.TestContext;

import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class LoginTest {
	
	@Test(dependsOnMethods = "api.tests.HealthCheckTest.healthCheckTest")
	public void validLoginTest()
	{
		LoginRequest payload = new LoginRequest(ConfigReader.getProperty("admin.email"), ConfigReader.getProperty("admin.password"));
		
		Response response = LoginService.loginservice(payload);
		response
		.then()
		.statusCode(201)
		.body("token", notNullValue())
		.body("message[0].key", equalTo("success"))
		.body("message[0].value", equalTo("Admin logged in successfully"));
		
		TestContext.setToken(response.jsonPath().getString("token"));
	}
	
	@Test(dataProvider = "invalidLoginData" ,dataProviderClass = InvalidLoginDataProvider.class, dependsOnMethods = "api.tests.HealthCheckTest.healthCheckTest")
	public void invalidLoginTest(String testcase, String email, Object password)
	{
		LoginRequest payload = new LoginRequest(email, String.valueOf(password));
		
		Response response = LoginService.loginservice(payload);
		response
		.then()
		.statusCode(400);
	}
}
