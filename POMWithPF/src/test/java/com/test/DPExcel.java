package com.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.utils.ExcelData;

public class DPExcel {
  
	@DataProvider(name = "invalidDataSet")
	public Object[][] getInvalidLoginData() throws IOException{
		return ExcelData.getData("dataset.xlsx", "InvalidData");
	}
	
	@DataProvider(name = "validDataSet")
	public Object[][] getValidLoginData() throws IOException{
		return ExcelData.getData("dataset.xlsx", "ValidData");
	}
}
