package api.tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import api.dataproviders.CreateNoteDataProvider;
import api.payload.Note;
import api.services.NotesServive;
import io.restassured.response.Response;

public class CreateNoteTest {
	
	@Test(dataProvider = "createNoteData", dataProviderClass = CreateNoteDataProvider.class, dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void validCreateNoteTest(String title, String content, String color, String tags, String isPlanned)
	{
		Note note = new Note(title, content, color, tags.split("|"), Boolean.valueOf(isPlanned));
		
		Response response = NotesServive.createNoteService(note, true);
		
		response
		.then()
		.statusCode(201)
		.body("success", is(true))
		.body("message", equalTo("Note created successfully"));
	}
	
	@Test(dependsOnMethods = "validCreateNoteTest")
	public void createNoteWithAllFields()
	{
		Note note = new Note();
		
		Response response = NotesServive.createNoteService(note, false);
		response
		.then()
		.statusCode(401);
	}
}
