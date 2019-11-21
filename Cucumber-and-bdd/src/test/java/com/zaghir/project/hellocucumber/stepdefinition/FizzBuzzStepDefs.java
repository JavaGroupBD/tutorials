package com.zaghir.project.hellocucumber.stepdefinition;

import org.junit.Assert;

import com.zaghir.project.hellocucumber.bean.FizzBuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FizzBuzzStepDefs {
	
	FizzBuzz fizzBuzz;
	String result ; 

	@Given("Create a FizzBus game play")
	public void create_a_FizzBus_game_play() {
		fizzBuzz = new FizzBuzz();
	}

	@When("I play with number {int}")
	public void i_play_with_number(Integer number) {
		result = fizzBuzz.play(number);
	}

//	@Then("The result is Fizz")
//	public void the_result_is_Fizz() {
//	    Assert.assertEquals(result, "Fizz");
//	}
	
	@Then("The result is {string}")
	public void the_result_is(String resultString) {
		Assert.assertEquals(result, resultString);
	}

}
