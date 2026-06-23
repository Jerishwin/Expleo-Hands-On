package com.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class put {
  @Test
  public void putDemo() 
  {
	          baseURI = "http://localhost:3000";
	          
	          String update = """
	          		 {
				      "name": "Raj",
				      "email": "raj123@gmail.com",
				      "company": "Microsoft",
	          		  }
	          		""";
	          Response res = given().contentType("application/json").body(update).when().put("/trainees/2");
	          
	          res.prettyPrint();
	          
	          Assert.assertEquals(res.getStatusCode(), 200);
	          
	          Assert.assertEquals(res.jsonPath().getString("name"), "rams");
	          
	          
	          
	          
  }
}
