Feature: Cart on saucedemo.com
  Background: User logged in
    Given User open web url "https://www.saucedemo.com/"
    And User input username "standard_user" and "secret_sauce"
    When User click on Login button
    Then User successfully login and navigate to Homepage

  Scenario: As User I want to see Cart page
    When Click on Cart Icon
    Then Cart page displayed