package api.tests;

import org.testng.annotations.Test;

import api.dataproviders.GetAllNotesDataProvider;
import api.services.NotesServive;

import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class GetAllNotesTest {

	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest", dataProvider = "validDataSet", dataProviderClass = GetAllNotesDataProvider.class)
	public void getAllNodesWithValidParamsTest(boolean isAuthRequired, int page, int limit, String search, String tags,
			boolean isPinned, String sortBy, String sortOrder) {

		Response response = NotesServive.getAllNotes(isAuthRequired, page, limit, search, tags, isPinned, sortBy,
				sortOrder);

		response.then().statusCode(200).body("success", is(true)).body("data", notNullValue()).body("pagination",
				notNullValue());
	}

	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void getAllNodesWithNoParamsTest() {

		Response response = NotesServive.getAllNotesWithNoParams(true);

		response.then().statusCode(200).body("success", is(true)).body("data", notNullValue()).body("pagination",
				notNullValue());

	}

	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest", dataProvider = "invalidDataSet", dataProviderClass = GetAllNotesDataProvider.class)
	public void getAllNodesWithInvalidParamsTest(boolean isAuthRequired, int page, int limit, String search,
			String tags, boolean isPinned, String sortBy, String sortOrder, int expectedStatusCode,
			String expectedMessage) {

		Response response = NotesServive.getAllNotes(isAuthRequired, page, limit, search, tags, isPinned, sortBy,
				sortOrder);

		response.then().statusCode(expectedStatusCode);

		if (expectedMessage != null && !expectedMessage.isBlank()) {

			response.then().body("message", equalTo(expectedMessage));
		}
	}

	@Test
	public void getAllNodesWithoutToken() {

		Response response = NotesServive.getAllNotesWithNoParams(false);

		response.then().statusCode(401);
	}

}
