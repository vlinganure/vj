Feature: validation of ux page

  @Test10
  Scenario: To Verify if user is able to login when parameters are passed with examples
    Given I have url of Ultimatix
    When I set username
    And i set password
    Then I am able to login application successfully
  #  And I click on TimesheetEntry link
   # And I am able to navigate to TimesheetEntry page
    # And I insert "9" in allocation
    #And I click on submit button

    # this is feature file class