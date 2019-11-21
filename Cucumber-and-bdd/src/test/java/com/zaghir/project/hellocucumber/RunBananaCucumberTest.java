package com.zaghir.project.hellocucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
					"pretty",
					"html:target/cucumber-html-report",
					"json:target/cucumber-json-report.json" 
				 } ,
		snippets = SnippetType.CAMELCASE,
		glue = "src/test/resources/stepdefinition",
		features = {"src/test/resources/bananaBdd.feature"}		
		)											
public class RunBananaCucumberTest {

}
