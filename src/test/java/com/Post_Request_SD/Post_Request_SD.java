package com.Post_Request_SD;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
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
	    .post("https://reqres.in/api/users");
	   }
	@Then("validate user created")
	public void validate_user_created() {
	    String AllResp = response.asString();
	    	System.out.println("All Details = "+AllResp); 
	    	System.out.println("Status code = " +response.getStatusCode() );
			Assert.assertTrue(response.getStatusCode() == 201);;
			
			
	}
	
	@Then("validate user ID have non null value")
	public void validate_user_id_have_non_null_value() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
		
	@Given("create user {string} with data from file")
	public void create_user_with_data_from_file(String name) throws IOException {
	 String jsonData = new String(Files.readAllBytes(Paths.get("src/test/resources/com/Post_Request_FF/user.json")));  //json read and converted to string 
	 JSONObject jsonObj = new JSONObject(jsonData);      //using jsonobject class from org.json libraries to update json
	 jsonObj.put("name", name);
	 
	 
	 String actualJson = jsonObj.toString();       //converted jsonObj to String using toString()method
	 System.out.println("Json Before post  ="+actualJson);
	 response = RestAssured
			    .given()
			    .relaxedHTTPSValidation()
			    .accept(ContentType.JSON)
			    .body(actualJson)				//actual json passed though the body
			    .post("https://reqres.in/api/users");	
	 }


	@Given("create user with data from file")
	public void create_user_with_data_from_file1() throws IOException {
	 String jsonData = new String(Files.readAllBytes(Paths.get("src/test/resources/com/Post_Request_FF/user.json")));  //json read and converted to string 
	 JSONObject jsonObj = new JSONObject(jsonData);      //using jsonobject class from org.json libraries to update json
	 jsonObj.put("name", "Priyanka");
	 
	 String actualJson = jsonObj.toString();       //converted jsonObj to String using toString()method
	 System.out.println("Json Before post  ="+actualJson);
	 response = RestAssured
			    .given()
			    .relaxedHTTPSValidation()
			    .accept(ContentType.JSON)
			    .body(actualJson)				//actual json passed though the body
			    .post("https://reqres.in/api/users");	
	 }
	@Then ("Validate all headers")
	public void Validate_all_headers() {
		Headers allHeaders = response.getHeaders();
		List<Header> listHeaders = allHeaders.asList();
		for(Iterator iterator= listHeaders.iterator(); iterator.hasNext();) {
			Header header = (Header) iterator.next();
				System.out.println(header.toString());
	}
		
		
	}
}


