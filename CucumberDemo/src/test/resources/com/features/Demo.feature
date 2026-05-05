Feature: Login to HRM Application

	@Validation
	Scenario: Login with valid credentials
	
	Given User is on Homepage
	When User enters username as "Admin"
	And User enters password as "admin123"
	Then User should be able to Login Successfully