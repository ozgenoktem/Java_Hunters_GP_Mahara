#Author: Muhammad

Feature: Creating Export

  Scenario: Exporting Your Portfolio
  
    When User log into Mahara webpage by using account information
    When User click menu button
    And User clicks Portfolio button
    And User clicks Export button
    Then Export your portfolio page should be displayed
    Then Under Choose an export format choose Leap2A
    Then Under What do you want to export? choose Just some of my pages
    Then After choosing Just some of my pages Pages to export should be displayed
    And Under Pages to export choose Hunters
    And Click Generate Export
    Then Export your portfolio page should be displayed
    Then Export generated successfully. Continue should be displayed
