Feature: Cart on saucedemo.com
  Background:
    Given User have logged in
    And User in on the homepage

  Scenario: As User I want to see Cart page
    When Click on Cart Icon
    Then Cart page displayed

  Scenario: As User I want to add product to cart
    When Click on Add To Cart button
    Then Count number on Cart Icon appears
    And Click on Cart Icon
    Then Product appears on Cart List

  Scenario: I want to remove product on the cart page
    When Click on Cart Icon
    Then Cart page displayed
    When Click on Remove button
    Then Product removed from Cart List