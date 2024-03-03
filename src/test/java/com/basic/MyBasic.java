package com.basic;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyBasic {
	
	@Given("Login to HRMS system with valid user")
	public void login_to_hrms_system_with_valid_user() {
	    System.out.println("Login");
	}
	@When("go to PIM tab")
	public void go_to_pim_tab() {
	    System.out.println("Go to PIM");
	}
	@Then("add button check")
	public void add_button_check() {
	    System.out.println("Validate Add button");
	}

	@When("go to admin tab")
	public void go_to_admin_tab() {
	    System.out.println("Go to admin");
	}
	@Then("delete button check")
	public void delete_button_check() {
		System.out.println("Validate delete Button");
	
		
	}
	
	

}
