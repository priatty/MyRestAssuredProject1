package com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CheckGoogleUp {
	//response is datatype 
	Response  RespObj = null;   // Global/class/instace Variable As it is declared inside class but outside method
	@Given("Open Google")
	public void open_google() {
		System.out.println("In open google method");
	    RespObj =  RestAssured.get("https://www.google.com");   
	    System.out.println("End-Open Google Method");
	    }
	@Then("Check Google Up And Running")
	public void check_google_up_and_running() {
		int statusCode = RespObj.statusCode();
		System.out.println("Status Code ="+statusCode);
		Assert.assertTrue(statusCode == 200);
	}



}
