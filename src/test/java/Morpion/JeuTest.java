package Morpion;

import org.junit.Assert;
import org.junit.Test;

public class JeuTest {

    @Test
    public void testSetPositionVide(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur("*", "joueur");

        jeu.setPosition(1,1,joueur);
        Assert.assertEquals("joueur", jeu.getPosition(1,1));
    }

    @Test
    public void testSetPositionPlein(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();
        Joueur joueur1 = new Joueur("*", "joueur2");

        Joueur[][] tab = {{joueur,joueur,joueur},{joueur,joueur,joueur},{joueur,joueur,joueur}};
        jeu.setTableau(tab);
        jeu.setPosition(1,1,joueur1);
        Assert.assertEquals("", jeu.getPosition(1,1));
    }

    @Test
    public void testLigneComplete(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();

        jeu.setPosition(0,0,joueur);
        jeu.setPosition(0,1,joueur);
        jeu.setPosition(0,2,joueur);
        Assert.assertEquals("", jeu.ligneGagnante());
    }

    @Test
    public void testLigneIncomplete(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();

        jeu.setPosition(0,0,joueur);
        Assert.assertEquals("false", jeu.ligneGagnante());
    }

    @Test
    public void testColonneComplete(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();

        jeu.setPosition(0,1,joueur);
        jeu.setPosition(1,1,joueur);
        jeu.setPosition(2,1,joueur);
        Assert.assertEquals("", jeu.colonneGagnante());
    }

    @Test
    public void testColonneNonGagnante(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();

        jeu.setPosition(0,0,joueur);
        Assert.assertEquals("false", jeu.colonneGagnante());
    }

    @Test
    public void testCroixGagnanteDe00(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();

        jeu.setPosition(0,0,joueur);
        jeu.setPosition(1,1,joueur);
        jeu.setPosition(2,2,joueur);
        Assert.assertEquals("", jeu.croixGagnante());
    }

    @Test
    public void testCroixGagnanteDe02(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();

        jeu.setPosition(0,2,joueur);
        jeu.setPosition(1,1,joueur);
        jeu.setPosition(2,0,joueur);
        Assert.assertEquals("", jeu.croixGagnante());
    }

    @Test
    public void testVictoireGlobal(){
        Jeu jeu = new Jeu();
        Joueur joueur = new Joueur();

        for (int x =0;x<3;x++){
            for (int y=0;y<3;y++){
                jeu.setPosition(x,y,joueur);
            }
        }
        Assert.assertEquals("", jeu.testVictoire());
    }


}