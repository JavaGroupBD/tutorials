package com.zaghir.project.hellocucumber;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FizzBuzz.feature",
		glue="com.zaghir.project.hellocucumber.stepdefinition.FizzBuzzStepDefs",
		monochrome = false,
		tags = {},
		plugin= {"html:target/cucumber-html-report",
				"json:target/cucumber-json-report.json" })
public class FizzBuzzCucumberTest {

}
