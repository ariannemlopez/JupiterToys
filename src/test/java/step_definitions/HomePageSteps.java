package step_definitions;

import io.cucumber.java.en.Given;

public class HomePageSteps extends AbstractSteps {

    @Given("the user opens the home page")
    public static void theUserOpensTheHomePage() {
        homePageMethods.openHomePage();
    }
}
