package com.Post_Request_SD;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post_Request_SD {
	Response response;
	@Given("create user with data")
	public void create_user_with_data() {
	   response = RestAssured
	    .given()
	    .relaxedHTTPSValidation()
	    .accept(ContentType.JSON)
	    .body("{\r\n"
	    		+ "\"name\" : \"anilkale\",\r\n"
	    		+ "\"job\" : \"Manager\" ,\r\n"
	    		+ "\"dept\" : \"QA automation\",\r\n"
	    		+ "\"mob\" : \"111\"\r\n"
	    		+ "}")
	    .post("https://reqres.in/api/users");	}
	@Then("validate user created")
	public void validate_user_created() {
	    String AllResp = response.asString();
	    	System.out.println("All Details = "+AllResp); 
	    	System.out.println("Status code = " +response.getStatusCode() );
			Assert.assertTrue(response.getStatusCode() == 201);;
	}
	
	@Then("validate user ID have non null value")
	public void validate_user_ID_have_non_null_value() {
		String actID = response.body().jsonPath().getString("id");
		Assert.assertTrue(Integer.parseInt(actID)>0);
		Assert.assertTrue(actID != null);
	}

}
