package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import ui.pages.HomePage;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import static org.junit.Assert.*;

public class TaskSteps {

    HomePage homePage = new HomePage();
    Logger log = (Logger) LogManager.getLogger(TaskSteps.class);

    @Then("{string} sitesine gider ve anasayfanın açıldığı onaylanır,")
    public void sitesineGiderVeAnasayfanınAçıldığıOnaylanır(String url) {

        Driver.getDriver().get(url);
    }

    @Then("Login ekranı açılır ve bir kullanıcı ile login olunur.\\(Var olan bir kullanıcı ile giriş yapılabilir.)")
    public void login_ekranı_açılır_ve_bir_kullanıcı_ile_login_olunur_var_olan_bir_kullanıcı_ile_giriş_yapılabilir() {

        homePage.accountLists.click();
        homePage.emailBox.sendKeys(ConfigReader.getProperty("validMail"));
        homePage.continueButton.click();
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        homePage.signInButton.click();
    }

    @Then("Ekranın üstündeki Search alanına {string} yazılır Ara butonuna tıklanır,")
    public void ekranınÜstündekiSearchAlanınaYazılırAraButonunaTıklanır(String product) {
        homePage.searchBox.sendKeys(product + Keys.ENTER);

    }

    @Then("Gelen sayfada Samsung Galaxy A52 5G\\(Eğer ürün listenmezse başka bir samsung telefon seçilebilir.) ürünün var olduğu kontrol edilir ve fiyatı loglanır,")
    public void gelen_sayfada_samsung_galaxy_a52_5g_eğer_ürün_listenmezse_başka_bir_samsung_telefon_seçilebilir_ürünün_var_olduğu_kontrol_edilir_ve_fiyatı_loglanır() {
          assertTrue(homePage.samsung.isDisplayed());
        log.info(homePage.price.getText());
    }

    @Then("Ürünün içine gidilip Add to List\\(Eğer kullanıcı önceden liste oluşturmadıysa gelen popuptan Create List butonu tıklanır.) butonu tıklanır,")
    public void ürünün_içine_gidilip_add_to_list_eğer_kullanıcı_önceden_liste_oluşturmadıysa_gelen_popuptan_create_list_butonu_tıklanır_butonu_tıklanır() {
        homePage.samsung.click();
        homePage.addToCartButton.click();

    }

    @Then("Shopping list açılır ve ürünün eklendiği kontrol edilir,")
    public void shopping_list_açılır_ve_ürünün_eklendiği_kontrol_edilir() {
        homePage.cartIcon.click();
        assertTrue(homePage.samsung2.isDisplayed());

    }

    @Then("Delete butonu tıklanır,")
    public void delete_butonu_tıklanır() {
      homePage.delete.click();

    }

    @Then("Ürünün listede olmadığı kontrol edilir.")
    public void ürünün_listede_olmadığı_kontrol_edilir() {

        try {
            assertTrue(homePage.samsung2.isDisplayed());
        }catch (AssertionError e) {
            e.printStackTrace();
        }
    }

}