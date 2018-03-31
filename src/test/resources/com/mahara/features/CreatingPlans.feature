#Author Tamara

Feature: Creating Plans 
 
 
 Scenario: Creating new Plan
    When User log into Mahara webpage by using account information
    When User clicks on main menu button
    Then User clicks on content button
    And User clicks on Plans button
    Then User clics on New plan button
    When  user fills up Title field with "Plan"
    And user fills up Description field with"Lets do it"
    Then User click Save plan button
    

   
  