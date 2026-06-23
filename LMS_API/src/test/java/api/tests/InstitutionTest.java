package api.tests;

import org.testng.annotations.Test;

import api.services.InstitutionService;
import io.restassured.response.Response;

public class InstitutionTest {
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void allInstitutuionTest() {
		Response response = InstitutionService.institutionService();
		
		response
		.then()
		.statusCode(200);
	}
}
