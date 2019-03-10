Feature: Bloquer une victoire sur une ligne

  Scenario: Si le joueur a 2 casse a lui sur une ligne l'ordi le contre
    Given le joueur a 2 case sur une ligne
    When 2 case au joueurs l'ordi le contre
    Then l'ordi a jouer a la place libre