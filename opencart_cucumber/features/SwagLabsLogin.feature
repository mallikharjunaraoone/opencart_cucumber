Feature: Login with Valid Credentials
   @sanity @regresstion
  Scenario: Successful Login with Valid Credentials
    Given the user navigates to swag login page
    When user enters the username as "standard_user" and password as "secret_sauce"
    And the user clicks on the Login swag button
    Then the user should be redirected to the SwagLabs Page