Feature: Cart on saucedemo.com
  //Background:
    //Given User in the homepage

  Scenario: As User I want to see Cart page
    Given Open web url "https://www.saucedemo.com/"
    And Input username "standard_user" and "secret_sauce"
    When Click on Login button
    Then Successfully login and navigate to Homepage
    When Click on Cart Icon
    Then Cart page displayed

  Scenario: As User I want to add product to cart
    Given Open web url "https://www.saucedemo.com/"
    And Input username "standard_user" and "secret_sauce"
    When Click on Login button
    Then Successfully login and navigate to Homepage
    When Click on Add To Cart button
    Then Count number on Cart Icon appears
    And Click on Cart Icon
    Then Product appears on Cart List

  Scenario: I want to remove product on the cart page
    Given Open web url "https://www.saucedemo.com/"
    And Input username "standard_user" and "secret_sauce"
    When Click on Login button
    Then Successfully login and navigate to Homepage
    When Click on Cart Icon
    Then Cart page displayed
    When Click on Remove button
    Then Product removed from Cart List