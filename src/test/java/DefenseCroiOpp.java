import Morpion.Jeu;
import Morpion.Joueur;
import Morpion.Ordi;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DefenseCroiOpp {
    private Jeu jeu;
    private Joueur joueur;
    private Ordi ordi;

    @Given("^le joueur prend le coin sup gauche$")
    public void joueAuCentrePossible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        jeu = new Jeu();
        joueur = new Joueur("1", "1");
        ordi = new Ordi("0", "Bot");
        jeu.setPosition(1,1,joueur);
        jeu.setPosition(0,0,joueur);
    }

    @When("^l'ordi joue en bas a droite$")
    public void laCaseCentralEstVide() throws Throwable {
        int[] tab = ordi.joue(jeu.getTableau(), joueur);
        jeu.setPosition(tab[0], tab[1], ordi);
    }

    @Then("^l'ordi a jouer en bas a droite$")
    public void odiJoueCaseCentral() throws Throwable {
        Assert.assertSame(jeu.getPosition(2, 2), ordi);
    }
}
