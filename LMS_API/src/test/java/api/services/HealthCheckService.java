package api.services;

import io.restassured.response.Response;

public class HealthCheckService {
	
	public static Response healthCheckService() {
		
		Response response = BaseService
				.request(false)
				.when()
				.get("/");
		
		return response;
	}
}
