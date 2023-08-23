package step_definitions;

import io.cucumber.java.en.And;

public class HeaderSteps extends AbstractSteps {

    @And("the user clicks on Contact link from the header")
    public static void theUserClicksOnContactLinkFromTheHeader() {
        headerMethods.clickContactLink();
    }
}
