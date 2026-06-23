package api.tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import api.services.RolesService;
import io.restassured.response.Response;

public class RoleTest {
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void allInstitutuionTestWithToken() {
		Response response = RolesService.roleService(true);
		
		response
		.then()
		.statusCode(200)
		.body("roles", notNullValue());
	}
	
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void allInstitutuionTestWithoutToken() {
		Response response = RolesService.roleService(false);
		
		response
		.then()
		.statusCode(401);
	}
}
