package component;

import common.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderMethods extends PageObject{
    public HeaderMethods(WebDriver driver) {
        super(driver);
    }

    private static By CART_PAGE = By.cssSelector("li#nav-cart");
    private static By CONTACT_PAGE = By.cssSelector("li#nav-contact");

    public static void clickContactLink() {
        click(CONTACT_PAGE);
    }

    public static void clickCartButton() {
        click(CART_PAGE);
    }
}
