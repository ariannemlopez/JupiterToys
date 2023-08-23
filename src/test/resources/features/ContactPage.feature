Feature: Contact Page
  As a user, I want to submit feedback about the experience of using Jupiter Toys

  Scenario: CONTACT-001 - Verify form error messages are displayed for required fields
    Given the user opens the home page
    And the user clicks on Contact link from the header
    When the user clicks the Submit button
    Then the error messages being displayed informing the user to fill out the required fields is "TRUE"
    When the user populates "John" "Doe" "email@test.com" "0211234567" "sample message" fields
    And the user clicks the Submit button
    Then the error messages being displayed informing the user to fill out the required fields is "FALSE"

  Scenario Outline: CONTACT-002 - Verify feedback is successfully submitted
    Given the user opens the home page
    And the user clicks on Contact link from the header
    When the user populates "<forename>" "<surname>" "<email>" "<telephone>" "<message>" fields
    And the user clicks the Submit button
    Then the user sees a message that the feedback is submitted successfully

    Examples:
      | forename  | surname | email              | telephone   | message                     |
      | John      | Doe     | test1@email.com    | 0211234567  | This is a sample message !  |
      | Jane      | Lopez   | test2@email.com    | 0211111111  | This is a sample message !  |
      | Juan      | David   | test3@email.com    | 0234534567  | This is a sample message !  |
      | Mark      | Jose    | test4@email.com    | 0211444567  | This is a sample message !  |
      | Julia     | Cruz    | test5@email.com    | 0212124567  | This is a sample message !  |