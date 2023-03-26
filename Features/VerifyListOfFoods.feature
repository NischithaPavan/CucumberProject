Feature: Shop our foods
  @smoke @regression @important
  Scenario: Verify all the foods
    Given I launch My chrome browser
    When I click on Shops
    And I go to our foods
    Then I verify all the foods
    
    
    
