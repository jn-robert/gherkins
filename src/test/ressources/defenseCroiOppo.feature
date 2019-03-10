Feature: Bloquer victoire croi opposée

  Scenario: Si le joueur prend un des coins l'ordi prend l'opposé
    Given le joueur prend le coin sup gauche
    When l'ordi joue en bas a droite
    Then l'ordi a jouer en bas a droite