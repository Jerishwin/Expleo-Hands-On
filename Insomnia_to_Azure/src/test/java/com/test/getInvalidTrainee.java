package com.test;

import org.testng.annotations.Test;
import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class getInvalidTrainee {
  @Test
  public void invalidCase() 
  
  {
	  
	baseURI = "http://localhost:3000";
	
	Response res = when().patch("/trainees/999");
	
	res.prettyPrint();
	
	String actual = res.asString();
	
	Assert.assertTrue(actual.contains("error"));
	
	
  }
}
