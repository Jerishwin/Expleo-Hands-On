package api.services;

import api.endpoints.Routes;
import io.restassured.response.Response;

public class InstitutionService {
	
	public static Response institutionService() {
			
			Response response = BaseService
						.request(false)
						.when()
						.get(Routes.GET_ALL_INSTITUTION_URL);
			
			return response;			
		}	
	
}
