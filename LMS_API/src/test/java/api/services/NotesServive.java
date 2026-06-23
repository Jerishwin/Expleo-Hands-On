package api.services;

import api.endpoints.Routes;
import api.payload.Note;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class NotesServive {
	
	public static Response createNoteService(Note payload, boolean isAuthRequired) {
		
		Response response = BaseService.request(isAuthRequired)
							.contentType(ContentType.JSON)
							.body(payload)
							.when()
							.post(Routes.CREATE_NOTE_URL);
		
		return response;
	}
	
	public static Response getAllNotes(boolean isAuthRequired, int page, int limit, String search, String tags, boolean isPinned, String sortBy, String sortOrder) {
		Response response = BaseService.request(isAuthRequired)
							.queryParam("page", page)
							.queryParam("limit", limit)
							.queryParam("search", search)
							.queryParam("tags", tags)
							.queryParam("isPinned", isPinned)
							.queryParam("sortOrder", sortOrder)
							.queryParam("sortBy", sortBy)
							.when()
							.get(Routes.GET_ALL_NOTES_URL);
		
		return response;
	}
	
	
	public static Response getAllNotesWithNoParams(boolean isAuthRequired) {
		Response response = BaseService.request(isAuthRequired)
							.when()
							.get(Routes.GET_ALL_NOTES_URL);
		
		return response;
	}

	
	public static Response getNoteById(boolean isAuthRequired, int id) {
		
		Response response = BaseService.request(isAuthRequired)
							.queryParam("id", id)
							.when()
							.get(Routes.GET_NOTES_BY_ID_URL);
		
		return response;
	}
}
