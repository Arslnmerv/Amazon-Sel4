package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;
import java.util.List;

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
    public List <WebElement> headersInAll;

    @FindBy (xpath = "(//a[@class='hmenu-item hmenu-compressed-btn'])[1]")
    public WebElement seeAll;

    @FindBy (xpath = "//ul[@data-menu-id='1']")
    public WebElement parentAllMenu;

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> resultsList;

    //Filter & List

    @FindBy (id = "s-result-sort-select")
    public WebElement sortBy;

    @FindBy (xpath = "//*[contains(@id, 'browse-bin-title')]")
    public List <WebElement> filtersHeader;

    @FindBy (className = "a-dropdown-item")
    public List <WebElement> sortbyDropdown;

    @FindBy (xpath = "//i[@class='a-icon a-icon-checkbox']")
    public List <WebElement> filtersInner;

    @FindBy (className = "a-dropdown-prompt")
    public WebElement sortByIcon;

    @FindBy (xpath = "//i[@class='a-size-medium a-color-base a-text-normal']")
    public List <WebElement> resultsAfterFilter;

    //Basket

    @FindBy (id = "add-to-cart-button")
    public  WebElement addToCartButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    public WebElement cartItemCount;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    public List <WebElement> itemCountPriceList;

    @FindBy(xpath = "//a[@id='nav-cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")
    public WebElement subTotalText;

    //Links In Footer

    @FindBy (xpath = "//ul/li/a")
    public List <WebElement> headersInFooter;
}


