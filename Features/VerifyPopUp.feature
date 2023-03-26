Feature: Verify Popup details

  @Smoke
  Scenario: Verify all the details in Popup
    Given I launch chrome browser
    When Click on getoffer without emailid and verify error message 
    And I capture the popup header text "Time Limited Offer text"
    And Verify Terms of use link
   
