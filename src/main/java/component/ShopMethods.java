package component;

import common.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopMethods extends PageObject {
    public ShopMethods(WebDriver driver) {
        super(driver);
    }

    private static By getSpecificBuyButton(String product) {
        return By.xpath(
                String.format("//h4[contains(normalize-space(), '%s')]/ancestor::li//a", product));
    }

    private static By getSpecificPriceLabel(String product) {
        return By.xpath(
                String.format("//h4[contains(normalize-space(), '%s')]/ancestor::li//span", product));
    }

    public static void openShopPage() {
        open("https://jupiter.cloud.planittesting.com/#/shop");
    }

    public static void addSpecificProductToCart(String quantity, String product) {
        for (int i=0; i < Integer.parseInt(quantity); i++) {
            driver.findElement(getSpecificBuyButton(product)).click();
        }
    }

    public static String getSpecificPrice(String product) {
        return driver.findElement(getSpecificPriceLabel(product)).getText();
    }
}
