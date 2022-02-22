package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ui.pages.HomePage;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.junit.Assert.assertTrue;

public class ProductSearchSteps {

    HomePage homePage = new HomePage();

    @Then("Enters a product name in the search box.")
    public void enters_a_product_name_in_the_search_box() {



    }

    @Then("Sees that the opened results contain the entered product name.")
    public void sees_that_the_opened_results_contain_the_entered_product_name() {


    }

    @Then("Enters a {string} in the search box.")
    public void entersAInTheSearchBox(String pn) {
        Random rnd = new Random();
        int random = rnd.nextInt(20);
        homePage.searchBox.sendKeys(pn + Keys.ENTER);

        for (int i = 0; i < homePage.list.size(); i++) {
            assertTrue(homePage.list.get(random).toString().contains("java"));
        }


    }


}
