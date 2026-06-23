package api.services;

import api.endpoints.Routes;
import io.restassured.response.Response;

public class RolesService {
	public static Response roleService(boolean isAuthRequired) {
		
		Response response = BaseService
					.request(isAuthRequired)
					.when()
					.get(Routes.GET_ALL_ROLES_URL);
		
		return response;			
	}	
}
