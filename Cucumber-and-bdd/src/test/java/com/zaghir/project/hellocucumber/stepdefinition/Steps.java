package com.zaghir.project.hellocucumber.stepdefinition;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	@Given("^I have deposited \\$(\\d+) in my account$")
	public void iHaveDeposited$InMyAccount(int amount) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I request \\$(\\d+)$")
	public void iRequest$(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
