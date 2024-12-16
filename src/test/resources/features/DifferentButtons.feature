@ignore
Feature: Clicando em botões usando diferentes seletores

  Background:
    Given que eu estou na página principal de automação utilizada
    And eu acesso novamente a opção Interactions with simple elements

  Scenario: Botão por ID
    When clico no botão utilizando o id
    Then sou redirecionado para o tela de sucesso

  Scenario: Botão por ClassName
    When clico no botão utilizando o ClassName
    Then sou redirecionado para o tela de sucesso

  Scenario: Botão por name
    When clico no botão utilizando o name
    Then sou redirecionado para o tela de sucesso

  Scenario: Botão por link text
    When clico no botão utilizando o link text
    Then sou redirecionado para o tela de sucesso do link