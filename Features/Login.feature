Feature: Login
@Regression
  Scenario: Succesfull login with valid credentials
    Given Launch chrome browser
    And Click on SignIn
    When User enters Email as  "nischitha.hs89@gmail.com" and Password as "Nischitha@123"
    Then Click on Submit
    And Page title should be "Fast weight loss. Lasting change."
    And close browser
   
