Feature: Checkout product on saucedemo.com
  Scenario: As User I want to checkout the product
    Given I'm on Cart page
    When Click on Checkout button
    Then Checkout form displayed
    And Input firstname "Tester" lastname "ABC" and zipcode "123321"
    When Click on Continue button
    Then Checkout Overview page displayed
    When Click on Finish button
    Then Thank you page displayed


