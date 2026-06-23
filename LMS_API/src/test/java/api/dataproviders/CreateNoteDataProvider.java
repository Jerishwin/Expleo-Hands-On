package api.dataproviders;

import org.testng.annotations.DataProvider;
import api.utilities.CSVReader;

public class CreateNoteDataProvider {
	
	@DataProvider(name = "createNoteData", parallel = true)
	public Object[][] getData(){
		
		return CSVReader.getData("CreateNoteTestData.csv");
	}
}
