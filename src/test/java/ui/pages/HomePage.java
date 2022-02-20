package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement accountLists;

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "signInSubmit")
    public WebElement signInButton;

    @FindBy(tagName = "h4")
    public WebElement thereWasAProblem;

    @FindBy(className = "a-list-item")
    public WebElement yourPasswordIsIncorrect;


}
