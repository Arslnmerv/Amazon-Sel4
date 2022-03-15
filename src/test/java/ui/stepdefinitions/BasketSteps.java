package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import ui.pages.HomePage;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class BasketSteps {

    HomePage homePage = new HomePage();
    Random rnd = new Random();
    List<String> priceList = new ArrayList<>();
    List<String> lastPriceList = new ArrayList<>();

    @Then("Selects the product and clicks the add to cart button.")
    public void selects_the_product_and_clicks_the_add_to_cart_button() {

        int random = rnd.nextInt(homePage.resultsList.size());

        for (int i = 0; i < homePage.resultsList.size(); i++) {
            homePage.resultsList.get(random).click();
            break;
        }
        homePage.addToCartButton.click();
    }

    @Then("Verifies that the total in the cart is equal to the sum of the prices of the items.")
    public void verifies_that_the_total_in_the_cart_is_equal_to_the_sum_of_the_prices_of_the_items() {

        homePage.cartIcon.click();
        int count = Integer.parseInt(homePage.cartItemCount.getText());

        for (int i = 0; i < count; i++) {
            priceList.add(homePage.itemCountPriceList.get(i).getText());
        }

        for (int i = 0; i < count; i++) {
            String str1 = priceList.get(i).replace("$", "");
            lastPriceList.add(str1);
        }

        double toplam = 0;
        for (int i = 0; i < count; i++) {
            Double sayi1 = Double.parseDouble(lastPriceList.get(i));
            toplam += sayi1;
        }

        String str2 = homePage.subTotalText.getText().replace("$", "");
        DecimalFormat df = new DecimalFormat("###.##");
        Double dblToplam = Double.valueOf(df.format(toplam));
        Double dblStr2 = Double.valueOf(str2);

        assertEquals(dblToplam, dblStr2);
    }
}
