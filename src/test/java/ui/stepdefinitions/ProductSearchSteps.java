package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ui.pages.HomePage;
import static org.junit.Assert.assertTrue;

public class ProductSearchSteps {

    HomePage homePage = new HomePage();


    @Then("It then enters a {string} in the search box and verifies that the results contain the searched word.")
    public void itThenEntersAInTheSearchBoxAndVerifiesThatTheResultsContainTheSearchedWord(String productName) {

        homePage.searchBox.sendKeys(productName + Keys.ENTER);

        for (WebElement w: homePage.resultsList) {
            assertTrue(w.getText().contains(productName));

        }


    }
}
