Feature: Login page 

Scenario: Login sucess 
	Given I am on home page 
	When I click on login link 
	And I fill in the fields 
	Then Login must be done 
	
Scenario: Login with no subscritpion 
	Given I am on home page 
	When I click on login link 
	And I fill in the fields 
	Then Message "Usuário e/ou senha inválidos." must appear 
	
	
Scenario: Login with wrong password 
	Given I am on home page 
	When I click on login link 
	And I fill in the fields 
	Then Message "Usuário e/ou senha inválidos." must appear 
	
Scenario: Required fields 
	Given I am on home page 
	When I click on login link 
	And I fill in only email field 
	Then Message "Campo Obrigatório." must appear