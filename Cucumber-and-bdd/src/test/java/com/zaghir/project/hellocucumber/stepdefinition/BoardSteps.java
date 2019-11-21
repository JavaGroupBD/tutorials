package com.zaghir.project.hellocucumber.stepdefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BoardSteps {

	private List<List<String>> board;
	private DataTable actualDataTable ; 

	@Given("^a board like this:$")
	public void aBoardLikeThis(DataTable table) throws Throwable {
		// table.raw(); n'est plus suporter dans la nouvelle version de cucumber >= 2 on
		// utilise asLists
		
		//board = table.asLists(String.class);
		List<List<String>> boardTmp = new ArrayList();
		for(List<String> row : table.asLists()) {
			boardTmp.add( new ArrayList<String>(row));
		}
		
		actualDataTable = DataTable.create(boardTmp);
	}

	@When("^player x plays in row (\\d+), column (\\d+)$")
	public void playerXPlaysInRowColumn(int row, int col) throws Throwable {
		//actualDataTable.row(row).set(col, "X"); //get(row).set(col, "x");
		
		System.out.println("--------------> "+actualDataTable.row(row).set(col, "X"));
	}

	@Then("^the board should look like this:$")
	public void theBoardShouldLookLikeThis(DataTable expectedTable) throws Throwable {
		expectedTable.diff(actualDataTable);
	}
}
