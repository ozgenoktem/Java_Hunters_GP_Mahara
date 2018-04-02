#Author: Ozgen
Feature: Smoke test for Mahara website

  Scenario: Smoke Test
    When User log into Mahara webpage by using account information
    When User click menu button
    Then User click content button
    Then User click profile button
    And verify first name and user name input boxes
    When User click menu button
    Then User click content button
    And User clicks on Plans button
    Then User clics on New plan button
    When user fills up Title field with "Plan"
    And user fills up Description field with"Lets do it"
    Then User click Save plan button
    When User click menu button
    And User clicks Portfolio button
    And User clicks Export button
    Then Under Choose an export format choose Leap2A
    And Click Generate Export
    Then User click Profile Page button
    And click LogOut
    And verify you have been logged out successfully
