#Author: Ozgen
#Completed
Feature: Creating a new Profile with details


  Scenario: Create new profile
    When User log into Mahara webpage by using account information
    When User click menu button
    Then User click content button
    Then User click profile button
    And in the new page user enter "This is new group project" into introduction part
    And click Save Profile
    And click Contact Information
    And user enter "www.cybertekschool.com" into official website address box
    And user enter "7925 Jones Branch Dr" into postal address box
    And user enter "Mc Lean" into city/region box
    And user select "United States" from country dropdown list
    Then user enter mobile phone number "5182565797"
    And click Save Profile
    Then user click General part
    And enter "SDET" into the occupation part
    And click Save Profile
    Then user should see "Profile saved successfully"


  Scenario: Adding new profile photo on new account
    When User log into Mahara webpage by using account information
    When User click menu button
    Then User click content button
    Then user click profile pictures
    And in the new page click choose file and upload new picture
    And user enter "Group photo" in the image title box
    Then user click Upload button
