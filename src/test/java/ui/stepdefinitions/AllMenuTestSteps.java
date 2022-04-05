package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import ui.pages.HomePage;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class AllMenuTestSteps {
    HomePage homePage = new HomePage();

    @Then("Clicks on All.")
    public void clicks_on_all() {

        homePage.allMenu.click();

    }

    @Then("Selects any category.")
    public void selects_any_category() {

        Random rnd = new Random();
        int random = rnd.nextInt(26);
        homePage.seeAll.click();
        homePage.headersInAll.get(random).click();

    }

    @Then("Displays the list of subcategories belonging to the selected category.")
    public void displays_the_list_of_subcategories_belonging_to_the_selected_category() {

        assertTrue(homePage.parentAllMenu.getAttribute("class").contains("translateX-left"));

    }
}
