Feature: Newsletter

  Scenario: Validar titulo da funcionalidade Newsletter
    Given que o usuário esteja na página demo do PHPTRAVELS
    When encontrar o componente de Newsletter
    Then o titulo apresentado deve ser Join Our Newsletter

  Scenario: Validar subtitulo da funcionalidade Newsletter
    Given que o usuário esteja na página demo do PHPTRAVELS
    When encontrar o componente de Newsletter
    Then o subtitulo apresentado deve ser And stay updated

  Scenario: Validar exibição de campo email do Newsletter
    Given que o usuário esteja na página demo do PHPTRAVELS
    When encontrar o componente de Newsletter
    Then um campo texto deve ser exibido para preenchimento do email

  Scenario: Validar preenchimento do campo email Newsletter
    Given que o usuário esteja na página demo do PHPTRAVELS
    When encontrar o componente de Newsletter
    And preencher com o email "maria.francisco@mjv.com.br"
    Then o preenchimento do campo email "maria.francisco@mjv.com.br" é validado


  Scenario: Validar click no Subscribe do Newsletter
    Given que o usuário esteja na página demo do PHPTRAVELS
    When encontrar o componente de Newsletter
    And preencher com o email "maria.francisco@mjv.com.br"
    Then o usuario clica no botão Subscribe
