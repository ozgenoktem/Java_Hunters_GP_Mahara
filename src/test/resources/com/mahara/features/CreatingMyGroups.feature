#Author: Muhammad

Feature: My groups

  Scenario: Creating My Groups
  
    When User log into Mahara webpage by using account information
    When User click menu button
    Then Dashboard, Content, Portfolio and Groups must be displayed
    And User clicks Groups
    And User clicks My groups
    And My groups page is displayed
    And On My groups page click Create group
    And Create group page is displayed
    Then User enters group name "Java Hunters Best Team"
    Then In group description user enters "We are the best"
    Then Under Setting Membership, Content, Visibility, Editability, and General should be displayed 
    And Under Membership Open, Request, Friend Invitations, Recommendations should be displayed
    And Under Content Create and edit should be displayed and choose Everyone except ordinary members
    And Under Visibility in Publicly viewable group choose YES
    And Under General in Shared page notifications choose Group administrators
    Then Click Save group
    And About | Java Hunters Best Team should be displayed
    Then User clicks menu button
    And User clicks Groups
    And User clicks My groups
    And My groups page is displayed
    And In My groups page Results should be displayed
    And Under Results Java Hunters Best Team group must be displayed
    Then Click Delete to delete the group
    And Java Hunters Best Team page is displayed
    And On Java Hunters Best Team page Delete group 'haha' should be displayed
    And Click Yes inorder to delete
    And My groups page is displayed
    And In My groups page searching for groups link should be displayed
    
    
    
    
    
    
    
    
    
    
