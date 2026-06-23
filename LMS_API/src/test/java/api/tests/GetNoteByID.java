package api.tests;

import org.testng.annotations.Test;

import api.services.NotesServive;
import io.restassured.response.Response;

public class GetNoteByID {
	
	@Test
	public void getNoteByValidId(){
		
		Response response = NotesServive.getNoteById(true, 1);
		
		
	}
}
