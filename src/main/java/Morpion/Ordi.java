package Morpion;

public class Ordi extends Joueur {

    public Ordi(String symbol, String nom){
        super(symbol, nom);
    }

    public int[] joue(Joueur[][] tab, Joueur joueur){

        int[] pos = new int[2];
        if (tab[1][1] == null){
            pos[0] = 1;
            pos[1] = 1;
            return pos;
        }

        contreCroi(pos, tab, joueur);
        contreVerti(pos, tab, joueur);
        contreHori(pos, tab, joueur);

        return pos;
    }

    public int[] contreHori(int[] pos , Joueur[][] tab, Joueur joueur){
        int cptJoueur = 0;
        int nbvide = 0;
        for (int x = 0; x<=2 ; x++){
            for (int y = 0 ; y<=2 ; y++){
                if (tab[x][y] == joueur){
                    cptJoueur++;
                }
                if (tab[x][y] == null){
                    nbvide++;
                }
            }
            if (cptJoueur == 2 && nbvide == 1){
                for (int y = 0 ; y<=2 ; y++){
                    if (tab[x][y] == null){
                        pos[0] = x;
                        pos[1] = y;
                        return pos;
                    }
                }
            }
            cptJoueur = 0;
            nbvide = 0;
        }
        return pos;
    }

    public int[] contreVerti(int[] pos, Joueur[][] tab, Joueur joueur){
        int cptJoueur = 0;
        int nbvide = 0;
        for (int y = 0 ; y<=2 ;y++){
            for (int x = 0; x<=2 ;x++){
                if (tab[x][y] == joueur){
                    cptJoueur++;
                }
                if (tab[x][y] == null){
                    nbvide++;
                }
            }
            if (cptJoueur == 2 && nbvide == 1){
                for (int x = 0; x<=2 ;x++){
                    if (tab[x][y] == null){
                        pos[0] = x;
                        pos[1] = y;
                        return pos;
                    }
                }
            }
            cptJoueur = 0;
            nbvide = 0;
        }
        return pos;
    }

    public int[] contreCroi(int[] pos, Joueur[][] tab, Joueur joueur){
        if (tab[0][0] == joueur && tab[2][2] == null){
            pos[0] = 2;
            pos[1] = 2;
            return pos;
        }
        if (tab[2][2] == joueur && tab[0][0] == null){
            pos[0] = 0;
            pos[1] = 0;
            return pos;
        }
        if (tab[0][2] == joueur && tab[2][0] == null){
            pos[0] = 2;
            pos[1] = 0;
            return pos;
        }
        if (tab[2][0] == joueur && tab[0][2] == null){
            pos[0] = 0;
            pos[1] = 2;
            return pos;
        }
        return pos;
    }

}
