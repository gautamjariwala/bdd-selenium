package com.bddhp.testdf;

import com.bddhp.pageobjects.GetRequestMethods;

//import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredStepDef {
	GetRequestMethods grm = new GetRequestMethods();

	@Given("I set API endpoint as {string}")
	public void i_set_API_endpoint(String url1) {
		grm.openURI(url1);

	}

	@When("I add {string} resource to end point and submit the request")
	public void i_add_resource_to_end_point(String resource) {
		grm.getResponse(resource);

	}

	@Then("I receive {int} status code")
	public void i_receive_status_code(int int1) {
		grm.readResponseGetStatusCode(int1);

	}

}
