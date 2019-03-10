Feature: Bloquer une victoire sur une colonne

  Scenario: Si le joueur a 2 casse a lui sur une colonne l'ordi le contre
    Given le joueur a 2 case sur une colonne
    When 2 case sur une colonne au joueurs l'ordi le contre
    Then l'ordi a jouer a la place libre sur la colonne