@US11_TC01
Feature: ViceDean should be able to see created Lesson Program

  Scenario:login in viceDean account
    Given user is on "managementonschoolsurl" page
    When user clicks on the Login button
    Then enters the user name as "viceDeanUser"
    And enters the password as "password"
    And clicks on the Login button
    And user wait 2 sn

  Scenario: create Lesson Program
    Given user clicks on the Menu button
    When clicks on the Lesson Management link
    And clicks on the Lessons tab and create lesson
    And user wait 2 sn
    And clicks on the Lesson Program tab on the page
    And selects a lesson from the Created Lesson dropdown list
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

  Scenario: see created Lesson Program
    And find the lesson name from the Lesson Program List
    And Selects the line with the lesson name
    And user wait 2 sn
    And verify Lesson name found
    And verify Day name found
    And verify Start Time found
    And verify Stop Time found
    And user wait 2 sn
    And close page

