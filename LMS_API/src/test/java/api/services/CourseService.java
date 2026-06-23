package api.services;

import api.endpoints.Routes;
import io.restassured.response.Response;

public class CourseService {
	
	public static Response courseService(boolean isAuthRequired) {
		Response response = BaseService
							.request(isAuthRequired)
							.when()
							.get(Routes.GET_ALL_COURSE_STRUCTURES_URL);
		
		return response;
	}
}
