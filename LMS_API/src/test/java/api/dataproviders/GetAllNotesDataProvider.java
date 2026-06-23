package api.dataproviders;

import org.testng.annotations.DataProvider;

import api.utilities.ExcelReader;

public class GetAllNotesDataProvider {
	
	@DataProvider(name = "validDataSet")
	public Object[][] getValidData() {
		
		return ExcelReader.getData("GetAllNotesParamsData.xlsx", "ValidDataSet");
	}
	
	@DataProvider(name = "invalidDataSet")
	public Object[][] getInvalidData() {
		
		return ExcelReader.getData("GetAllNotesParamsData.xlsx", "InvalidDataSet");
	}
	
	
}
