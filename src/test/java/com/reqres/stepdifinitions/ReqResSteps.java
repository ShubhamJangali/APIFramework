package com.reqres.stepdifinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqResSteps {

	public String Endpoint;
	public Response resp;
	
	@Given("User should be {string}")
	public void user_should_be(String string) {
	    Endpoint = string;
	}
	@When("user perform GET operation")
	public void user_perform_get_operation() {
	    resp = RestAssured.get(Endpoint);
	}
	@Then("user can validate status code")
	public void user_can_validate_status_code() {
	    System.out.println(resp.getStatusCode());
	    System.out.println();
	}
	@Then("user can validate API response")
	public void user_can_validate_api_response() {
	    System.out.println(resp.getBody().asPrettyString());
	}
	
}
