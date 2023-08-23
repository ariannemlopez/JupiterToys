package component;

import common.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactPageMethods extends PageObject {

    public ContactPageMethods(WebDriver driver) {
        super(driver);
    }

    private static By FORENAME_FIELD = By.id("forename");
    private static By SURNAME_FIELD = By.id("surname");
    private static By EMAIL_FIELD = By.id("email");
    private static By TELEPHONE_FIELD = By.id("telephone");
    private static By MESSAGE_FIELD = By.id("message");
    private static By SUBMIT_BUTTON = By.linkText("Submit");

    private static By HEADER_SUCCESS_MESSAGE_TEXT = By.cssSelector(".alert alert-success");
    private static By SUBMISSION_SUCCESS_SECTION = By.xpath("//div[@ui-if='contactValidSubmit']");

    /*START - Error messages*/
    private static By HEADER_ERROR_MESSAGE_TEXT = By.id("header-message");
    private static By SENDING_FEEDBACK = By.xpath("//h1[text()='Sending Feedback']");
    private static By getErrorMessage(String field) {
        return By.id(String.format("%s-err", field));
    }
    /*END - Error messages*/

    public static void clickSubmitButton() {
        click(SUBMIT_BUTTON);
    }

    public static String getSpecificErrorMessage(String field) {
        return driver.findElement(getErrorMessage(field)).getText();
    }

    public static String getHeaderErrorMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HEADER_ERROR_MESSAGE_TEXT));
        return driver.findElement(HEADER_ERROR_MESSAGE_TEXT).getText();
    }

    public static boolean isSuccessfulSubmissionDisplayed() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(SENDING_FEEDBACK));
        return driver.findElement(SUBMISSION_SUCCESS_SECTION).isDisplayed();
    }

    public static void setForename(String value) {
        setValue(value, FORENAME_FIELD);
    }

    public static void setSurname(String value) {
        setValue(value, SURNAME_FIELD);
    }

    public static void setEmail(String value) {
        setValue(value, EMAIL_FIELD);
    }

    public static void setTelephone(String value) {
        setValue(value, TELEPHONE_FIELD);
    }

    public static void setMessage(String vallue) {
        setValue(vallue, MESSAGE_FIELD);
    }
}
