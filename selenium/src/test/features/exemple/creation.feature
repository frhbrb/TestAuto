
@tag
Feature: Creation compte facebook
  as a user I can create a facebook account
  
  @tag1
  Scenario: Creation compte facebook valide
    Given ouvrir navigateur
    And saisir url "https://www.facebook.com/"
    When cliquer sur le bouton creation d un nouveau compte
    And saisir prenom "zeaaaa"
    And saisir nom "aubert"
    And saisir e-mail "valenza85628horchak@fakemail.io"
    And saisir e-mail de confirmation "valenza85628horchak@fakemail.io"
    And saisir Nouveau mot de passe "d54569866"
    And choisir birthday_day "15"
    And choisir birthday_month "8"
    And choisir birthday_year "1996"
    And choisir genre "homme"
    And cliquer sur le bouton s inscrire
    Then verifier linscription

  @tag2
  Scenario: Creation compte facebook valide avec genre personnalise
    Given ouvrir navigateur
    And saisir url "https://www.facebook.com/"
    When cliquer sur le bouton creation d un nouveau compte
    And saisir prenom "zeaaaa"
    And saisir nom "aubert"
    And saisir e-mail "valenza85628horchak@fakemail.io"
    And saisir e-mail de confirmation "valenza85628horchak@fakemail.io"
    And saisir Nouveau mot de passe "d54569866"
    And choisir birthday_day "15"
    And choisir birthday_month "8"
    And choisir birthday_year "1996"
    And choisir genre "Personnalise" et choisir "2"
    And cliquer sur le bouton s inscrire
    Then verifier linscription