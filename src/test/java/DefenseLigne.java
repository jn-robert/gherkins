import Morpion.Jeu;
import Morpion.Joueur;
import Morpion.Ordi;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DefenseLigne {
    private Jeu jeu;
    private Joueur joueur;
    private Ordi ordi;
    private boolean succes;

    @Given("^le joueur a 2 case sur une ligne$")
    public void caseDoubleLigne() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        jeu = new Jeu();
        joueur = new Joueur("1", "1");
        ordi = new Ordi("0", "Bot");
        jeu.setPosition(0,0,joueur);
        jeu.setPosition(0,1,joueur);
    }

    @When("^2 case au joueurs l'ordi le contre$")
    public void laCaseCentralEstVide() throws Throwable {
        int[] tab = ordi.joue(jeu.getTableau(), joueur);
        jeu.setPosition(tab[0], tab[1], ordi);
    }

    @Then("^l'ordi a jouer a la place libre$")
    public void odiJoueCaseCentral() throws Throwable {
        Assert.assertSame(jeu.getPosition(0, 2), ordi);
    }
}
