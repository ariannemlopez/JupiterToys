Feature: Cart
  As a user, I want to view and choose products so that I can decide
    which products to purchase and see the correct prices and amount to be paid

  Scenario: CART-001 - Verify prices of added items and total amount to be paid
    Given the user opens the shop page
    And the user adds "2" "Stuffed Frog" to cart
    And the user adds "5" "Fluffy Bunny" to cart
    And the user adds "3" "Valentine Bear" to cart
    When the user proceeds to cart
    Then the price and subtotal for "2" "Stuffed Frog" is correct
    And the price and subtotal for "5" "Fluffy Bunny" is correct
    And the price and subtotal for "3" "Valentine Bear" is correct
    And the total amount is correct