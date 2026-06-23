package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class delete {
  @Test
  public void deleteTrainee() 
  
  {
		baseURI = "http://localhost:3000";
		Response res = when().delete("/trainees/2");
		
		res.prettyPrint();
		
		Assert.assertEquals(res.getStatusCode(), 200);
  }
}
