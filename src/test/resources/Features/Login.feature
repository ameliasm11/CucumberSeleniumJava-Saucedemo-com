Feature: Login on saucedemo.com

  Scenario: As user I want to Login with valid credentials
    Given Open web url "https://www.saucedemo.com/"
    And Input username "standard_user" and "secret_sauce"
    When Click on Login button
    Then Successfully login and navigate to Homepage

  Scenario Outline: As user I want to Login with invalid credentials
    Given Open web url "https://www.saucedemo.com/"
    And Input username "<username>" and "<password>"
    When Click on Login button
    Then Login failed and error message appears
  Examples:
    |username|password|
    |standard_user|non_secret_sauce|
    |just_user    |secret_sauce    |

  Scenario Outline: As user I want to Login without input one of some credentials or without any credentials
    Given Open web url "https://www.saucedemo.com/"
    And Input username "<username>" and "<password>"
    When Click on Login button
    Then Login failed and error message appears based on which null fields
    Examples:
      |username|password|
      |standard_user||
      ||secret_sauce|
      |||