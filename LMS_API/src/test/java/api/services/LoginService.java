package api.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import api.endpoints.Routes;
import api.payload.LoginRequest;

public class LoginService {
	
	public static Response loginservice(LoginRequest payload) {
		
		Response response = BaseService
					.request(false)
					.contentType(ContentType.JSON)
					.body(payload)
					.when()
					.post(Routes.LOGIN_URL);
		
		return response;			
	}	
}
