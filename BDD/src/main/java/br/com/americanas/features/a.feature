Feature: Cadastro americanas com sucesso

  Scenario Outline: Cadastro
    Given Estou na tela inicial
    When Eu clico no botao CLiente novo? Cadastrar
    And Insiro <email> <senha> <cpf> <nome> <nascimento> <telefone> validos
    And Clico no botao
    Then Cadastro deve ser concluido com sucesso

    Examples: 
      | email              | senha      | cpf              | nome         | nascimento   | "telefone    |
      | "email2@email.com" | "Senha1!@" | "837.775.580-79" | "Luis Prado" | "11/08/1996" | "1199998888" |
