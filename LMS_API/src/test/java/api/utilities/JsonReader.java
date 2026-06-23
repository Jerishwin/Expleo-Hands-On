package api.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonReader {
	public static String getJson(String filename)
	{
		try {
			FileReader reader = new FileReader("src/test/resources/testData/"+filename);
			JSONTokener data = new JSONTokener(reader);
			JSONObject payload =  new JSONObject(data);
			return payload.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
