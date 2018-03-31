#Author: Tamara

Feature: Creating Professional Profile
 

  Scenario: Verify Resume tab options 
    When User log into Mahara webpage by using account information
    When User clicks on main menu button
    Then User clicks on content button
    And User clicks on Resume button
    Then following tab options should be visible for Resume:
    
      | Introduction            |
      | Education and employment|
      | Achievements            |
      | Goals and Skills        |
      | Interests               |

   
    Scenario: Fill out Introduction page options
    Given User is on Resume page
    When Introduction option is selected #default
    And user selects date of birth as "05/03/1900" 
    And user selects Gender identity as "Woman" at the gender 
    Then user clicks Save Button
 
  
    
    Scenario: Fill out Education and employment page
    Given User is on Resume page
    When Education and employment option is selected
    And Under Education history tab user clicks on Add button
    And Under Employment history tab user clicks on Add button
    Then user fills up the following fields in Education history tab:   :
                      
      | start date | Jan2008  |
      | end date   | May2010  |    
      
  	Then user fills up the following fields in Employment history tab:
  	
      | start date | Oct2005          |
      | Employer   | Northrop Grumman |    
      
    And Under Education history tab user clicks on Choose File button
    And User uploads Resume
    Then User click Save button
 

   
