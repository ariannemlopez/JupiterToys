package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps extends AbstractSteps {

    static List<Double> subtotals = new ArrayList<>();

    @Then("the price and subtotal for {string} {string} is correct")
    public static void thePriceAndSubtotalForIsCorrect(String quantity, String product) {
        String price = ShopSteps.priceLists.get(product);
        assertThat(cartMethods.getSpecificPrice(product))
                .as("Verify the price of added products is correct")
                .contains(price);

        double subtotal = Double.parseDouble(quantity) * Double.parseDouble(price.replace("$", ""));
        assertThat(cartMethods.getSpecificSubtotal(product))
                .as("Verify the subtotal is correct")
                .contains(String.valueOf(subtotal));
        subtotals.add(subtotal);
    }

    @And("the total amount is correct")
    public static void theTotalAmountIsCorrect() {
        double totalAmount = 0.00;
        for (double total : subtotals) {
            totalAmount = totalAmount + total;
        }
        assertThat(cartMethods.getTotalAmount())
                .as("Verify the total amount is correct")
                .contains(String.valueOf(totalAmount));
    }
}
