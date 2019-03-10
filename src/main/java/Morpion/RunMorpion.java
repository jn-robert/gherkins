package Morpion;

import java.util.Scanner;

public class RunMorpion {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();
        Ordi ordi = new Ordi("0", "Ia");

        System.out.println("Symbol du joueur :");
        joueur.setSymbol(sc.nextLine());
        System.out.println();
        System.out.println("Nom du joueur :");
        joueur.setNom(sc.nextLine());
        System.out.println();

        while (jeu.testVictoire().equals("false")){
            System.out.println(jeu);

            System.out.println("x,y");
            int x = sc.nextInt();
            int y = sc.nextInt();
            jeu.setPosition(x,y,joueur);

            int[] tab = ordi.joue(jeu.getTableau(), joueur);
            jeu.setPosition(tab[0], tab[1], ordi);
        }

        System.out.println(jeu);
        System.out.println("Le joueur " + jeu.testVictoire() + " a gagné");

    }
}
