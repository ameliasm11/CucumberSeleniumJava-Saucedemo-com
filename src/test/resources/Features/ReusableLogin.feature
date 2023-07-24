Feature: Reausable Login on saucedemo.com

  Scenario: As user I want to Login to the app
    Given Open web url "https://www.saucedemo.com/"
    And Input username "standard_user" and "secret_sauce"
    And Click on Login button
    And Successfully login and navigate to Homepage