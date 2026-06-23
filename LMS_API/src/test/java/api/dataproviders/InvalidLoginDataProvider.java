package api.dataproviders;

import org.testng.annotations.DataProvider;
import api.utilities.ExcelReader;

public class InvalidLoginDataProvider {
	
	@DataProvider(name = "invalidLoginData", parallel = true)
	public Object[][] getData(){
		
		return ExcelReader.getData("InvalidLoginData.xlsx", "InvalidLoginData");
	}
}
