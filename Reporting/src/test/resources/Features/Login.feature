Feature: Login to HRM Application 
	
	@valid
	Scenario: Login with valid credentials
		Given User is on Login Page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
		When User enter username and password
		Then User should be able to login sucessfully and see the Dashboard 