Feature: Automação de Login

  Background:
    Given que eu estou na página principal de automação
    And eu acesso a opção Interactions with simple elements
    When eu clico na opção Go to login page
    Then sou redirecionado para a página de login

  Scenario: Teste de login com credenciais em branco
    When clico no campo de e-mail
    And clico no campo senha e clico fora do campo
    Then é apresentado um erro para cada campo
    When clico em Sign in
    Then o login é recusado e apresenta o erro

  Scenario: Teste de login com credenciais incorretas
    When insiro o e-mail "a@a.com"
    And insiro a senha "aaaa"
    And clico em Sign in
    Then o login é recusado e apresenta o erro

  Scenario: Teste de login com crendenciais corretas
    When insiro o e-mail "rodrigogarro10@gmail.com"
    And insiro a senha "rgarro10"
    And clico em Sign in
    Then o login é aceito