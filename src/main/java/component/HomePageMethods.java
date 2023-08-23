package component;

import common.PageObject;
import org.openqa.selenium.WebDriver;

public class HomePageMethods extends PageObject {

    public HomePageMethods(WebDriver driver) {
        super(driver);
    }

    public static void openHomePage() {
        open("http://jupiter.cloud.planittesting.com");
    }
}
