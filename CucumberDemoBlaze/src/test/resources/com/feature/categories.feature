Feature: Category 
	Filtering the product base on Category
	
	Background:
		Given User is on Homepage

	Scenario: Choosing the Mobile Category
	
		When User clicks the button phones
		Then The page should only show phones
		
	Scenario: Choosing the Laptop Category
	
		When User clicks the button Laptops
		Then The page should only show Laptops
		
	Scenario: Choosing the Monitor Category
	
		When User clicks the button Monitors
		Then The page should only show Phones