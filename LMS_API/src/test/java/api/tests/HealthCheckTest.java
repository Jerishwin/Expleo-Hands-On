package api.tests;

import org.testng.annotations.Test;

import api.services.HealthCheckService;
import io.restassured.response.Response;

public class HealthCheckTest {
	
	@Test
	public void healthCheckTest() {
		Response response = HealthCheckService.healthCheckService();
		
		response
		.then()
		.statusCode(200);
	}
}
