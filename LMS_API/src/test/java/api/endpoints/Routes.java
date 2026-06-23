package api.endpoints;

public class Routes {
	public static final String BASE_URL = "https://lms-server-3-wedg.onrender.com";
	public static final String LOGIN_URL = BASE_URL + "/user/login";
	public static final String GET_ALL_INSTITUTION_URL= BASE_URL + "/getAll/institution";
	public static final String GET_ALL_ROLES_URL= BASE_URL + "/roles/getAll";
	public static final String GET_ALL_COURSE_STRUCTURES_URL= BASE_URL + "/courses-structure/getAll";
	public static final String CREATE_NOTE_URL= BASE_URL + "/create/notes";
	public static final String GET_ALL_NOTES_URL= BASE_URL + "/getAll/notes";
	public static final String GET_NOTES_BY_ID_URL= BASE_URL + "/getById/notes/";
	public static final String UPDATE_NOTE_URL= BASE_URL + "/update/notes/";
	public static final String TOGGLE_PIN_URL= BASE_URL + "/toggle-pin/notes/";
	public static final String DELETE_NOTE_URL= BASE_URL + "/delete/notes/ById/";
}	
