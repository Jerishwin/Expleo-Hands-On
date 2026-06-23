package com.test;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginTest {

    @Test
    public void validLogin() {

        JSONObject login = new JSONObject();
        login.put("email", "sam@gmail.com");
        login.put("password", "123");

        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(login.toString())
                .when()
                .post("https://lms-server-3-wedg.onrender.com/user/login");

        res.then().log().all();

        String token = res.jsonPath().getString("token");
        System.out.println("Token: " + token);
        
        String JWT_REGEX = "^eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9\\.eyJ[A-Za-z0-9_-]+\\.[A-Za-z0-9_-]+$";
        Pattern pattern = Pattern.compile(JWT_REGEX);
        Matcher matcher = pattern.matcher(token);
        boolean isValidJWT = matcher.matches();

        System.out.println("Is Valid JWT : " + isValidJWT);

        Assert.assertTrue(isValidJWT, "Token is NOT a valid JWT! Received: " + token);
    }
    
    
    @Test
    public void invalidLogin() {

        JSONObject login = new JSONObject();
        login.put("email", "sam@gma.com");
        login.put("password", "123");
        
        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(login.toString())
                .when()
                .post("https://lms-server-3-wedg.onrender.com/user/login");

        res.then().log().all();
        
        
        Assert.assertEquals(res.getStatusCode(),400);
    }
}