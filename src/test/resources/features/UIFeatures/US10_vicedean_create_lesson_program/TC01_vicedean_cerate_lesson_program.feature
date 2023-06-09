@US10_TC01
Feature: ViceDean should be able to create Lesson Program

  Scenario:login in viceDean account
    Given user is on "managementonschoolsurl" page
    When user clicks on the Login button
    Then enters the user name as "viceDeanUser"
    And enters the password as "password"
    And clicks on the Login button
    And user wait 2 sn

  Scenario: Creating a Lesson Program
    Given user clicks on the Menu button
    When clicks on the Lesson Management link
    And clicks on the Lesson Program tab on the page
    And user wait 2 sn
    And selects a lesson from the Choose Lesson dropdown list
    And selects a term from the Choose Term dropdown list
    And verifies that the Start Time textbox displays the text Required
    And verifies that the Stop Time textbox displays the text Required
    And selects a day from the Choose Day dropdown list
    And user wait 2 sn
    And enters a valid start time in the Start Time textbox
    And enters a valid stop time in the Stop Time textbox
    And clicks on the Submit button
    And waits for the message to be displayed
    And user wait 2 sn
    Then confirms that the lesson program is created successfully
    And user wait 2 sn
    And close page