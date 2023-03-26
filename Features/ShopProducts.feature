Feature: Verify Shoping Product

  @Smoke
  Scenario: Verify Add to Cart
  Given I land on login page and click on shop
  When I click on Express shop
  And I verify Express shop page
  And I select vanilla and chocolate
  Then I scroll the page and click on Add to Cart 
  
  
  