package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import ui.pages.HomePage;
import ui.utilities.ReusableMethods;
import static org.junit.Assert.*;

public class ShoppingListSteps {

    HomePage homePage = new HomePage();

    @Then("Clicks on create a list on Hello, TEAM15 text.")
    public void clicks_on_create_a_list_on_hello_team15_text() {

        ReusableMethods.hover(homePage.accountLists);
        homePage.createAList.click();

    }

    @Then("Clicks the Create a list button.")
    public void clicks_the_create_a_list_button() {

        ReusableMethods.waitFor(5);
        homePage.createAListButton.click();

    }

    @Then("Verifies the resulting list by seeing the title of Shopping List")
    public void verifies_the_resulting_list_by_seeing_the_title_of_shopping_list() {

        assertTrue(homePage.shoppingListHeader.isDisplayed());

    }
    @Then("Clicks more on the right of the Shopping List page, and then click manage list.")
    public void clicks_more_on_the_right_of_the_shopping_list_page_and_then_click_manage_list() {

        ReusableMethods.waitFor(10);
        homePage.more.click();
        homePage.manageList.click();

    }
    @Then("Clicks on Delete list and confirm and perform the delete operation.")
    public void clicks_on_delete_list_and_confirm_and_perform_the_delete_operation() {

        homePage.deleteList.click();
        ReusableMethods.waitFor(10);
        assertTrue(homePage.confirmDelete.isDisplayed());
        homePage.yesButton.click();

    }

}
