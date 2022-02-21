package ui.stepdefinitions;

import io.cucumber.java.en.*;
import ui.pages.HomePage;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import static org.junit.Assert.*;

public class LoginSteps {

    HomePage homePage = new HomePage();

    @When("User goes to url.")
    public void userGoesToUrl() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("Clicks the sign in button on the Account & Lists article")
    public void clicksTheSignInButtonOnTheAccountListsArticle() {

        homePage.accountLists.click();

    }

    @Then("Enters the valid data into the e-mail box and click the continue button.")
    public void entersTheValidDataIntoTheEMailBoxAndClickTheContinueButton() {

        homePage.emailBox.sendKeys(ConfigReader.getProperty("validMail"));
        homePage.continueButton.click();

    }

    @Then("Enters the valid data in the password box and click the sign in button.")
    public void entersTheValidDataInThePasswordBoxAndClickTheSignInButton() {

        homePage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        homePage.signInButton.click();

    }

    @And("The user logs in successfully.")
    public void theUserLogsInSuccessfully() {

        assertTrue(homePage.accountLists.getText().contains(ConfigReader.getProperty("validPassword")));

    }

    @Then("Enters the invalid data into the e-mail box and clicks the continue button.")
    public void entersTheInvalidDataIntoTheEMailBoxAndClicksTheContinueButton() {

        homePage.emailBox.sendKeys(ConfigReader.getProperty("invalidMail"));
        homePage.continueButton.click();

    }

    @Then("Sees There was a problem")
    public void seesThereWasAProblem() {

        assertTrue(homePage.thereWasAProblem.isDisplayed());

    }

    @Then("Enters the invalid data in the password box and clicks the sign in button.")
    public void entersTheInvalidDataInThePasswordBoxAndClicksTheSignInButton() {

        homePage.passwordBox.sendKeys(ConfigReader.getProperty("invalidPassword"));
        homePage.signInButton.click();

    }

    @And("User cannot login successfully.")
    public void userCannotLoginSuccessfully() {

        assertTrue(homePage.yourPasswordIsIncorrect.isDisplayed());

    }

    @Then("Closes the page")
    public void closesThePage() {

        Driver.closeDriver();

    }


}
