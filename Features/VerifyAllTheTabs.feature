Feature: Verify Page Title

  @Sanity
  Scenario: Verify Title
    Given I open chrome browser
    When title of the login page is "Fast weight loss. Lasting change."
    And Verify How it works tab
    Then verify Success Stories tab
    And Verify Support tab
    Then Verify Add to cart
    Then Verify SignIn tab
    