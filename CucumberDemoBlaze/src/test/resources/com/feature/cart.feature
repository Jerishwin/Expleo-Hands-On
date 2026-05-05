Feature: Cart
	
	

	Scenario: Adding a single product
	
		Given User is on Homepage
		When User enters clicks on the product "Samsung Galaxy s6"
		Then User is taken to product page
		When User clicks Add to cart
		Then User should face an alert saying "Product added"
		And the cart should contain that product
		
	Scenario: Deleting product in cart
	
		Given User is on the cart page
		And the cart contains 3 products
		When User clicks on the delete button on one product
		Then That product is deleted
		And the price of the product is reduced from the total price
		
	Scenario: Deleting all product in cart
	
		Given User is on the cart page
		And the cart contains 3 products
		When User clicks on the delete button on all product
		Then That products are deleted
		And the total price should not be viewed
		
		