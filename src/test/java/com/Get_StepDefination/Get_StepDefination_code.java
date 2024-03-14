package com.Get_StepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_StepDefination_code {
	
	Response response = null;
	@Given("hit the book store Api")
	public void hit_the_book_store_api() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");

	}
	@Then("Validate As Status Code")
	public void validate_as_status_code() {
	    int statuscode = response.getStatusCode();
	    Assert.assertTrue("Status Code Not Matching", statuscode == 200);
	}
	@Then("Validate Git Pocket Guide is Present")
	public void validate_git_pocket_guide_is_present() {
		String jsonpathString =response.getBody().asString();
		System.out.println("Json = " + jsonpathString);
		String bookTitle = response.getBody().jsonPath().getString("books[0].title");
		Assert.assertTrue("Title not matching" , bookTitle.equals("Git Pocket Guide"));
	}


	@Then("Learning JavaScript Design Patterns is Present")
public void learning_java_script_design_patterns_is_present() {
		String jsonpathString = response.getBody().asString();
		System.out.println("Json = "+jsonpathString);
		String bookTitle = response.getBody().jsonPath().getString("books[1].title");
		System.out.println("Book Title   = " + bookTitle);
		Assert.assertTrue("Book Title Not Matching", bookTitle.equals("Learning JavaScript Design Patterns"));
		
	}
	

	@Then("validate {string} at jsonpath {string} title present")
	public void validate_at_jsonpath_title_present(String title, String jsonPath) {
	String JsonDataString = response.getBody().asString();
	System.out.println("JSON =" + JsonDataString );
	String actualBookTitle  = response.getBody().jsonPath().getString(jsonPath);
	Assert.assertTrue("Title not Matching", actualBookTitle.equals(title) );
	
	
	    
	}



}


