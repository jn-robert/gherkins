package Morpion;

public class Joueur {
    private String symbol;
    private String nom;

    public Joueur(String symbol, String nom){
        this.symbol = symbol;
        this.nom = nom;
    }

    public Joueur(){
        this.symbol = "";
        this.nom = "";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
