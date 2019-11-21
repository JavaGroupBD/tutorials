Feature: FizzBuzz Game play
	
	Scenario: Play FizBuzz to get "Fizz"
		Given Create a FizzBus game play
		When I play with number 3
		Then The result is "Fizz"
		
	Scenario: Play FizBuzz to get "Buzz"
		Given Create a FizzBus game play
		When I play with number 5
		Then The result is "Buzz"	
		
	Scenario: Play FizBuzz to get "FizzBuzz"
		Given Create a FizzBus game play
		When I play with number 15
		Then The result is "FizzBuzz"		