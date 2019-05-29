Feature: Making an order 


Scenario: Make a success order 
	Given I am logged 
	When I insert a product on cart 
	And I click in Finalizar button 
	And I finish the order 
	Then The order must be done 
