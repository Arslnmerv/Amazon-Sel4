package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;
import java.util.List;
import java.util.Random;

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

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allMenu;

    @FindBy (className = "hmenu-item")
    public List<WebElement> headersInAll;

    @FindBy (xpath = "(//a[@class='hmenu-item hmenu-compressed-btn'])[1]")
    public WebElement seeAll;

    @FindBy (xpath = "//ul[@data-menu-id='1']")
    public WebElement parentAllMenu;

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (className = "sg-col-inner")
    public List<WebElement> list;
}

