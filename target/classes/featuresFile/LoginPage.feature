@authentification
Feature: Authentification sur l application SwagLabs
En tant que utilisateur, je souhaite naviguer

  @login_CasPassant 
  Scenario: Authentification sur l application SwagLabs - cas passant
    Given Je me connecte sur l application
    When Je saisis le username "standard_user"
    And Je saisis le password "secret_sauce"
    And Je clique sur le bouton login
    And test test
    Then Je me redirige vers la page home "PRODUCTS"