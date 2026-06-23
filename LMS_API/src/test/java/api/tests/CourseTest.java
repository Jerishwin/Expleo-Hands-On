package api.tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import api.services.CourseService;
import io.restassured.response.Response;

public class CourseTest {
	
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void getCourseTestWithToken()
	{
		Response response = CourseService.courseService(true);
		
		response
		.then()
		.statusCode(200)
		.body("message[0].key", equalTo("success"))
		.body("data", notNullValue());
	}
	
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void getCourseTestWithoutToken()
	{
		Response response = CourseService.courseService(false);
		
		response
		.then()
		.statusCode(401);
	}
}
