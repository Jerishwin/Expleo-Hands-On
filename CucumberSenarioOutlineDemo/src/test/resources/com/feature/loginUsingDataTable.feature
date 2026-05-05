Feature: Login
	This feature is used to validate the valid and invalid login 
	
	Background:
		Given User is on Homepage
		And clicks the login button

	@valid
	Scenario: Login with valid credentials
	
		When User enters valid username and password
			|user |Banton  |
			|pass |JeriJose|
		And User clicks the login Button
		Then User should be able to Login Successfully
	
	@invalid
	Scenario Outline: Login with invalid password
	
		When User enters invalid username as "<user>"
		And User enters invalid password as "<pass>"
		And User clicks the login Button
		Then User should face an alert saying "<error>"
		
		Examples:
				|user   |pass    |error									 |
				|Banton |asda    |Wrong password.						 |
				|asd12  |asdasda |User does not exist.    				 |
				|       |aaa     |Please fill out Username and Password. |
