#Author: Orkhan

Feature: Mahara Webpage Portfolio and Groups options

  Scenario: Verify Portfolio options
    Given User log into Mahara webpage by using account information
    When User click menu button
    Then User click to drop down box which next to Portfolio
		Then following menu options should be visible for Portfolio option
		| Pages and collections |
		| Shared by me |
		| Shared with me |
		| Export |
		| Import |

  Scenario Outline: Verify Groups options
  Given User log into Mahara webpage by using account information
    When User click menu button
    Then User click to drop down box which next to Groups
		Then following menu options should be visible for Groups option
		| My Groups |
		| Find Groups |
		| My friends |
		| Find people |
		| Institution membership |
		| Topics |
