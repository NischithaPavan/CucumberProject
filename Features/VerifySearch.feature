
Feature: I want to search the recepies
  
  Scenario: I want to search my favorite receipes
    Given I launch my chrome browser
    When I click on support tab
    Then I click on Receipes tab 
    And I Search the Recepies "Cake shake"
