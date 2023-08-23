package component;

public enum FormMessages {
    HEADER_ERROR_MESSAGE("We welcome your feedback - but we won't get it unless you complete the form correctly."),
    HEADER_SUCCESS_MESSAGE("Thanks John, we appreciate your feedback."),
    FORENAME_ERROR_MESSAGE("Forename is required"),
    EMAIL_ERROR_MESSAGE("Email is required"),
    MESSAGEBOX_ERROR_MESSAGE("Message is required");

    private final String message;
    FormMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}

