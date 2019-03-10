import Morpion.Jeu;
import Morpion.Joueur;
import Morpion.Ordi;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class DefenseCentre {
    private Jeu jeu;
    private Joueur joueur;
    private Ordi ordi;
    private boolean succes;

    @Given("^joue au centre possible$")
    public void joueAuCentrePossible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        jeu = new Jeu();
        joueur = new Joueur("1", "1");
        ordi = new Ordi("0", "Bot");
        }

    @When("^La case central est vide$")
    public void laCaseCentralEstVide() throws Throwable {
        if (jeu.getPosition(1,1) == null){
            int[] tab = ordi.joue(jeu.getTableau(), joueur);
            jeu.setPosition(tab[0], tab[1], ordi);
        }
    }

    @Then("^L'ordi a prit la case central$")
    public void odiJoueCaseCentral() throws Throwable {
        Assert.assertSame(jeu.getPosition(1, 1), ordi);
    }


}
