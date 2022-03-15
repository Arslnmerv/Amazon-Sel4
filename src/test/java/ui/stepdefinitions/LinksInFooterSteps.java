package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import ui.pages.HomePage;
import ui.utilities.ReusableMethods;
import static org.junit.Assert.*;

public class LinksInFooterSteps {

    HomePage homePage = new HomePage();

    @Then("Sees the links at the bottom of the homepage.")
    public void sees_the_links_at_the_bottom_of_the_homepage() {

        ReusableMethods.scrollDown();
        for (int i = 0; i < homePage.headersInFooter.size(); i++) {
            assertTrue(homePage.headersInFooter.get(i).isDisplayed());
        }
    }

    @Then("Verifies that the links are active and point to the relevant page.")
    public void verifies_that_the_links_are_active_and_point_to_the_relevant_page() {

        for (int i = 0; i < homePage.headersInFooter.size(); i++) {
            assertTrue(homePage.headersInFooter.get(i).isEnabled());
        }

    }

}
