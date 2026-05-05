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
	Scenario: Login with invalid password
	
		Then User enters invalid credentials and login is unsessfull
				|user   |pass    |error									 |
				|Banton |asda    |Wrong password.						 |
				|asd12  |asdasda |User does not exist.    				 |
				|.       |aaa     |Please fill out Username and Password. |
