Feature: Login Functionality

  Scenario: Valid Login
    Given User is on Login Page
    When User enters "standard_user" and "secret_sauce"
    Then User should be logged in successfully
