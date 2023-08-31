package step_definitions;

import common.PageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks extends PageObject {
    public Hooks(WebDriver driver) {
        super(driver);
    }

    @Before
    public static void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @After
    public static void tearDown() {
        driver.quit();
    }
}
