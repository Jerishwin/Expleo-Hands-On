package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdatePostTest {
	@Test
	public void updatePost(){
		int id = 1;
		
		Map<String, Object> payload = new HashMap<>(); 
			
		payload.put("userId", 1);
		payload.put("id", 1);
		payload.put("title", "Changing title");
		payload.put("body", "API testing is a type of software testing that involves testing application programming interfaces directly and as part of integration testing to determine if they meet expectations for functionality, reliability, performance, and security. Since APIs lack a GUI, API testing is performed at the message layer.");
		
		Response res = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.put("https://jsonplaceholder.typicode.com/posts/"+id);
		
		System.out.println("Status code: "+res.statusCode());
		res.prettyPrint();
		Assert.assertEquals(res.statusCode(), 200);
	}
}
