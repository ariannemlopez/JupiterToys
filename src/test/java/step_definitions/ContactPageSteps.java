package step_definitions;

import component.FormMessages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactPageSteps extends AbstractSteps {

    @When("the user clicks the Submit button")
    public static void theUserClicksTheSubmitButton() {
        contactPageMethods.clickSubmitButton();
    }

    @Then("the error messages being displayed informing the user to fill out the required fields is {string}")
    public static void theErrorMessagesBeingDisplayedInformingTheUserToFillOutTheRequiredFieldsIs(String isDisplayed) {
        if (Boolean.parseBoolean(isDisplayed)) {
            assertThat(contactPageMethods.getHeaderErrorMessage())
                    .as("Verify header error message is displayed")
                    .contains(FormMessages.HEADER_ERROR_MESSAGE.getMessage());

            assertThat(contactPageMethods.getSpecificErrorMessage("forename"))
                    .as("Verify forname error message is displayed")
                    .contains(FormMessages.FORENAME_ERROR_MESSAGE.getMessage());

            assertThat(contactPageMethods.getSpecificErrorMessage("email"))
                    .as("Verify email error message is displayed")
                    .contains(FormMessages.EMAIL_ERROR_MESSAGE.getMessage());

            assertThat(contactPageMethods.getSpecificErrorMessage("message"))
                    .as("Verify messagebox error message is displayed")
                    .contains(FormMessages.MESSAGEBOX_ERROR_MESSAGE.getMessage());
        }
        else {
            theUserSeesAMessageThatTheFeedbackIsSubmittedSuccessfully();
        }
    }

    @Then("the user sees a message that the feedback is submitted successfully")
    public static void theUserSeesAMessageThatTheFeedbackIsSubmittedSuccessfully() {
        assertThat(contactPageMethods.isSuccessfulSubmissionDisplayed())
                .as("Verify that the message is displayed for submitted feedbacks")
                .isTrue();
    }

    @When("the user populates {string} {string} {string} {string} {string} fields")
    public static void theUserPopulatesFields(String forename, String surname, String email, String telephone, String message) {
        contactPageMethods.setForename(forename);
        contactPageMethods.setSurname(surname);
        contactPageMethods.setEmail(email);
        contactPageMethods.setTelephone(telephone);
        contactPageMethods.setMessage(message);
    }
}
