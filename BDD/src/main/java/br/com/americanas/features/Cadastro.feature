Feature: Cadastro americanas com sucesso 

Scenario: Subscribe page access 
	Given I am on home page 
	When I click on buttton Cliente novo? Cadastrar 
	Then The subscribe page must be loaded 
	
	
Scenario Outline: Cadastro 
	Given Que estou na tela de cadastro 
	And Insiro <email> <senha> <cpf> <nome> <nascimento> <telefone> validos 
	And Clico no botao 
	Then Cadastro deve ser concluido com sucesso 
	
	Examples: 
		| email              | senha      | cpf              | nome         | nascimento   | telefone    |
		| "email2@email.com" | "Senha1!@" | "837.775.580-79" | "Luis Prado" | "11/08/1996" | "1199998888" |
		
		
Scenario: Cadastro sem os campos obrigatorios 
	Given Que estou na tela de cadastro 
	When Eu nao preencho nenhum campo 
	And Clico no botao 
	Then Deve apresentar mensagens de cmapos obrigatorios