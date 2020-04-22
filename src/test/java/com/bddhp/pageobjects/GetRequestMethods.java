package com.bddhp.pageobjects;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestMethods {
	
	RestAssured baseURI;
	Response response;
	RequestSpecification httpRequest;
	String responseBody;
	int statusCode;
		
	public void openURI(String URI) {
		RestAssured.baseURI = URI;
		httpRequest = RestAssured.given();
		
			
	}
	
	public void getResponse(String resource) {
		
		response = httpRequest.request(Method.GET, resource);
		responseBody = response.getBody().asString();
		
		
	}
	
	public void readResponseGetStatusCode(int expectedStatusCode) {
		
		statusCode = response.getStatusCode();
		System.out.println("Expected: " + expectedStatusCode + " But actual is "+statusCode);
	}
	/*
	 * void getweatherDetails() { // Specify base URI RestAssured.baseURI =
	 * "http://restapi.demoqa.com/utilities/weather/city";
	 * 
	 * // Request object
	 * 
	 * 
	 * // print response in console window
	 * 
	 * String responseBody = response.getBody().asString();
	 * System.out.println("Response Body is:" + responseBody);
	 * 
	 * // status code validation int statusCode = response.getStatusCode();
	 * System.out.println("Status code is: " + statusCode);
	 * Assert.assertEquals(statusCode, 200);
	 * 
	 * // status line verification String statusLine = response.getStatusLine();
	 * System.out.println("Status line is:" + statusLine);
	 * Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	 * 
	 * }
	 */
}
