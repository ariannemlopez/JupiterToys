package step_definitions;

import component.ShopMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Map;

public class ShopSteps extends AbstractSteps {

    public static Map<String, String> priceLists = new HashMap<>();

    @Given("the user opens the shop page")
    public static void theUserOpensTheShopPage() {
        shopMethods.openShopPage();
    }

    @And("the user adds {string} {string} to cart")
    public static void theUserAddsToCart(String quantity, String product) {
        ShopMethods.addSpecificProductToCart(quantity, product);
        priceLists.put(product, shopMethods.getSpecificPrice(product));
    }

    @When("the user proceeds to cart")
    public static void theUserProceedsToCart() {
        headerMethods.clickCartButton();
    }
}
