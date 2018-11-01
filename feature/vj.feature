Feature: SMoke testing of facebook login page

  @Test10
  Scenario Outline: To Verify if user is able to login when parameters are passed with examples
    Given I have url of Ultimatix
    When I set username as <Username>
    And i set password as <Password>
    Then I am able to login application successfully
    And I click on TimesheetEntry link
    And I am able to navigate to TimesheetEntry page
   # And I insert "9" in allocation
    And I click on submit button

    #And I am able to close the browser
    Examples: 
      | Username | Password |
      |585907    | T@ta12345|
