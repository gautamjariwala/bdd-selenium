package com.bddhp.testdf;

import org.junit.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hptestdef {
	int sum = 0;
	Calculator calc = new Calculator();

	@Given("I have a calculator")
	public void openCalc() throws Throwable {
		// System.out.println("Open Calc");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sum = calc.add(int1, int2);

		// System.out.println("Sum is "+sum);

	}

	@Then("I should get {int}")
	public void i_should_get(int sum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Assert.assertEquals(sum, 3);
		Assert.assertEquals(3, sum);
		// System.out.println("I should get 3");

	}

}
