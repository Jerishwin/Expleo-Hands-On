package com.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class LoginTest {
  @Test
  public void loginTest() 
  
  {
	    Map<String, String> loginPayload = new HashMap<>();
	    
	    baseURI = "http://localhost:5000";
	    
	    loginPayload.put("username","admin");
        loginPayload.put("password","admin123");
	    
	    Response res = given()
	    		       .contentType(ContentType.JSON)
	    		       .body(loginPayload)
	    		       .when().post("/login");
	    
	    Assert.assertEquals(res.prettyPrint().contains("token"), true);

  }
}
