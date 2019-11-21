package com.zaghir.project.hellocucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"} ,
		snippets = SnippetType.CAMELCASE,
		glue = "src/test/resources/stepdefinition",
		features = {"src/test/resources/hellocucumber.feature"}		
		)											
public class RunCucumberTest {

}
