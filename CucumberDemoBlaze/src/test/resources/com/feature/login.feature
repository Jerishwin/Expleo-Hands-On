Feature: Login
	This feature is used to validate the valid and invalid login 
	
	Background:
		Given User is on Homepage
		And clicks the login button

	@valid
	Scenario: Login with valid credentials
	
		When User enters valid username as "Banton"
		And User enters valid password as "JeriJose"
		Then User should be able to Login Successfully
	
	@invalid
	Scenario: Login with invalid password
	
		When User enters valid username as "Banton"
		And User enters invalid password as "Jeri123"
		Then User should face an alert saying "Wrong password."
		
	@invalid
	Scenario: Login with unregestered username
	
		When User enters invalid username as "abe123"
		And User enters invalid password as "Jeri123"
		Then User should face an alert saying "User does not exist."
		
	