
@tag
Feature: Authentification
  I want to use this template for my feature file

  @tag1
  Scenario: Authentification valide
    Given Saisir URLL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Remplir champs prenom "Admin"
    And Remplir champs mot de passe "admin123"
    And Cliquer sur bouton login
    Then acces sur la page home 

 
