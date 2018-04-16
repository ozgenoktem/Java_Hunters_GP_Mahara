#Author: Ozgen
Feature: Smoke test for Mahara website

  @smoke
  Scenario: Smoke Test
    When User log into Mahara webpage by using account information
    When User click menu button
    Then User click content button
    Then User click profile button
    And verify first name and user name input boxes
    When User click menu button
    Then User click content button
    Then User click content button
    And User clicks on Plans button
    Then User clics on New plan button
    When user fills up Title field with "Plan"
    And user fills up Description field with"Lets do it"
    Then User click Save plan button
    When User click menu button
    Then User click Portfolio Page button
    Then User click Add button
    Then User click on Page
    Then User enter Page title "My new page"
    Then User enter Page description "At this time is going to be different..."
    Then User click on Save button
    And click LogOut and verify you have been logged out successfully
