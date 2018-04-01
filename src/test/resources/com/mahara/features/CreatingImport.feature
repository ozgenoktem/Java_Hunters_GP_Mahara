#Author: Muhammad

Feature: Creating Import
	
	Scenario: Importing Your Portfolio
	
		When User log into Mahara webpage by using account information
    When User click menu button
    And User clicks Portfolio button
    And User clicks Import button
    Then Import your portfolio page should be displayed
    Then On the Import your portfolio page, Fields marked by '*' are required. Must be displayed 
    Then Click Import
    Then There was an error with submitting this form. Please check the marked fields and try again. Message must be displaed
    And This field is required. Must be displayed
    
    
    
