#Author: Ozgen

Feature: Uploading new files and new journals
@os
  Scenario: Uploading new files in account
    When User log into Mahara webpage by using account information
    When User click menu button
    Then User click content button
    And user click on Files button
    And click Choose Files
    And upload two different files which are related to group project
    Then user click create a folder button and named it "Project Docume"
    Then user click edit file button
    And user change Comments radio button from Off to On
   Then user click Save Changes
    

  Scenario: Uploading new journals in account
    When User log into Mahara webpage by using account information
    When User click menu button
    Then User click content button
    And user click on Journals button
    Then user click New Entry button 
    Then user enter "Project Process" into Title inbox
    And user click bold button in entry box
    Then user enter "First week process is going well, We are all about to finish our feature files" into entry box
    Then user click Save Entry
    
    
    
    
