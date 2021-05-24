@tag
Feature: Desafio Técnico - App Tricentis

  @tag1
  Scenario: Validar mensagem Sending e-mail success
    Given que eu esteja na tela home inicial
    And faço preenchimento dos campos do formulário da aba Enter Vehicle Data
    And faço preenchimento dos campos do formulário da aba Enter Insurant Data
    And faço preenchimento dos campos do formulário da aba Enter Product Data
    And seleciono uma opção de preço da aba Select Price Option
    And faço preenchimento dos campos do formulário da aba Send Quote
    When clico no botão Send
    Then valido a mensagem Send e-mail success!