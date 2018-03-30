#Author: Ozgen
Feature: Mahara Webpage Menu and Content options

  Scenario: Verify Menu options
    
    When User log into Mahara webpage by using account information
    When User click menu button
    Then following menu options should be visible for Menu option
    
      | Dashboard |
      | Content   |
      | Portfolio |
      | Groups    |

  Scenario: Verify Content options
  
    When User log into Mahara webpage by using account information
    When User click menu button
    Then User click content button
    Then following menu options should be visible for Content option
      | Profile          |
      | Profile pictures |
      | Files            |
      | Journals         |
      | Resume           |
      | Plans            |
      | Notes            |
