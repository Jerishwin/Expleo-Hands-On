package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPostTest {
	@Test
	public void getPost(){
		Response res = RestAssured.given()
				.when()
				.get("https://jsonplaceholder.typicode.com/posts/1");
		
		System.out.println("Status code: "+res.statusCode());
		res.prettyPrint();
		Assert.assertEquals(res.statusCode(), 200);
	}
}
