package component;

import common.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartMethods extends PageObject {
    public CartMethods(WebDriver driver) {
        super(driver);
    }

    public static By getSpecificPriceText(String product) {
        return By.xpath(String.format("//td[contains(normalize-space(), '%s')]/following-sibling::td[1]", product));
    }
    public static By getSpecificSubtotalText(String product) {
        return By.xpath(String.format("//td[contains(normalize-space(), '%s')]/following-sibling::td[3]", product));
    }
    public static By TOTAL_AMOUNT_TEXT = By.cssSelector(".total.ng-binding");


    public static String getSpecificPrice(String product) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(getSpecificPriceText(product)));
        return driver.findElement(getSpecificPriceText(product)).getText();
    }

    public static String getSpecificSubtotal(String product) {
        return driver.findElement(getSpecificSubtotalText(product)).getText();
    }

    public static String getTotalAmount() {
        return driver.findElement(TOTAL_AMOUNT_TEXT).getText();
    }
}
