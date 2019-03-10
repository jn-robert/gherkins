package Morpion;

public class Jeu {

    private Joueur[][] tableau;

    public Jeu(){
        tableau = new Joueur[3][3];
    }


    public void setPosition(int x, int y, Joueur joueur) {
        if (tableau[x][y] == null) tableau[x][y] = joueur;
    }

    public String ligneGagnante() {
        for (int x = 0 ; x<tableau.length ; x++){
            if (tableau[x][0] != null && tableau[x][1] != null && tableau[x][2] != null){
                if (tableau[x][0].equals(tableau[x][1]) && tableau[x][0].equals(tableau[x][2])) {
                    return tableau[x][0].getNom();
                }
            }
        }
        return "false";
    }

    public String colonneGagnante() {
        for (int y = 0 ; y<3 ; y++){
            if (tableau[0][y] != null && tableau[1][y] != null && tableau[2][y] != null){
                if (tableau[0][y].equals(tableau[1][y]) && tableau[0][y].equals(tableau[2][y])) {
                    return tableau[0][y].getNom();
                }
            }
        }
        return "false";
    }

    public String croixGagnante() {
        if (tableau[0][0] != null && tableau[1][1] != null && tableau[2][2] != null){
            if (tableau[0][0].equals(tableau[1][1]) && tableau[0][0].equals(tableau[2][2])){
                return tableau[0][0].getNom();
            }
        }
        if (tableau[0][2] != null && tableau[1][1] != null && tableau[2][0] != null){
            if (tableau[0][2].equals(tableau[1][1]) && tableau[0][2].equals(tableau[2][0])){
                return tableau[0][2].getNom();
            }
        }
        return "false";
    }

    public String testVictoire(){
        if (!ligneGagnante().equals("false")){
            return ligneGagnante();
        }
        else if (!colonneGagnante().equals("false")){
            return colonneGagnante();
        }
        else if (!croixGagnante().equals("false")){
            return croixGagnante();
        }
        else {
            return "false";
        }
    }

    public String toString(){
        String str = "";
        for (int x = 0 ; x<3 ; x++){
            for (int y = 0 ; y <3 ; y++){
                if (tableau[x][y] == null){
                    str += " ";
                }
                else {
                    str += tableau[x][y].getSymbol();
                }
                if (y < 2){
                    str += " | ";
                }
            }
            str += "\n";
        }
        return str;
    }

    public String getPosition(int x, int y) {
        return tableau[x][y].getNom();
    }

    public Joueur[][] getTableau() {
        return tableau;
    }

    public void setTableau(Joueur[][] tableau) {
        this.tableau = tableau;
    }
}
