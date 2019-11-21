package com.zaghir.project.hellocucumber.stepdefinition;


import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaghir.project.hellocucumber.bean.Checkout;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BananaCucumberTest {
	
	public static Logger logger = LoggerFactory.getLogger(BananaCucumberTest.class);
	
	private int bananaPrice = 0 ;
	private Checkout checkout ;
	@Given("the price of a {string} is {int}c")
	public void thePriceOfAIsC(String name, Integer price) {
	    logger.info(" ----------- thePriceOfAIsC  --> "+name +"  --  "+price);
	    Assert.assertEquals(40 ,price.intValue() );
	    bananaPrice = price ;
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer itemCount, String itemName) {
	    //logger.info(" ----------- Checkout");
	    checkout = new Checkout();
	    checkout.add(itemCount, bananaPrice);
	    
	}

	@Then("the total price should be {int}c")
	public void theTotalPriceShouldBeC(Integer total) {
	    //logger.info(" ----------- theTotalPriceShouldBeC");
	    Assert.assertEquals(checkout.getTotal(), total.intValue());
	    
	}


}
