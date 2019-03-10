Feature: Une des meilleurs défense et de jouer au centre

  Scenario: Si la case central est libre alors l'ordi la joue
    Given joue au centre possible
    When La case central est vide
    Then L'ordi a prit la case central