
@tag
Feature: Authentification
  

  @tag1
  Scenario: Authentification valide
    Given ouvrir navigateur chrome 
    And saisir lurl "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir username "Admin"
    And saisir password "admin123"
    And cliquer sur bouton login
    Then verifier lacces "Paul Collings"
    
    
  @tag2
  Scenario Outline: Authetification
    Given ouvrir navigateur chrome 
    And saisir lurl "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir username "<username>"
    And saisir password "<password>"
    And cliquer sur bouton login
    Then verifier lacces "<message>"
    

    Examples: 
      | username  | password | message |
      | Admin  |    admin123 |Paul Collings   |
      | adin |     admin123 |    Invalid credentials    |
      | Admin |     adm2 |    Invalid credentials      |
     
    

 
