#Author:Orkhan
Feature: Creating Portfolio


  Scenario: Creating new Collections
 		When User log into Mahara webpage by using account information
    Then User click menu button
    Then User click to drop down box which next to Portfolio
    Then User click "Pages and collections"
    Then User click Add button 
    Then User click on Collection
    Then User enter Collection name "Mix resources"
    Then User enter Collection description "This is only for expperiment"
 		Then User click on Next:Edit collection pages button
 		Then User click Done button
 		Then User should see created data


  Scenario: Creating new Pages
  When User log into Mahara webpage by using account information
    Then User click menu button
   	Then User click to drop down box which next to Portfolio
    Then User click "Pages and collections"
    Then User click Add button
    Then User click on Page
    Then User enter Page title "My new page"
    Then User enter Page description "This time is going to be different..."
    Then User click on Save button
  		Then User click on Display page button
  		Then User add comment "This is long steps"
  		Then User upload a file
  		Then User click on Comment button
  		Then User should see created page and written comment
 
