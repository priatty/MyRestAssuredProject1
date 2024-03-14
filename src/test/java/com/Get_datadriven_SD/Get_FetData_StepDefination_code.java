package com.Get_datadriven_SD;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_FetData_StepDefination_code {
	
	Response response = null;
	@Given("Hit the book store API")
	public void hit_the_book_store_api() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	  
	}
	@Then("validate as status code")
	public void validate_as_status_code() {
	    int StatusCode = response.getStatusCode();
	    Assert.assertTrue("Status Code Not Matching", StatusCode==200);
	}
	@Then("validate data {string} from {string} response")
	public void validate_data_from_response(String ExpValue, String jsonpath ) {
		String ActualValue = response.getBody().jsonPath().getString(jsonpath);
		Assert.assertTrue("Value not matching", ExpValue.equals(ActualValue));
	    
	}
	
	
	
}
	
