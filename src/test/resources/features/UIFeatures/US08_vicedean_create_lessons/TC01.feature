@US08_TC01
Feature: Vice Dean should be able to create courses

  Scenario: Lesson name must be valid

    Given User goes to the home page
    Then User clicks the login button
    Then User enters user name
    Then User enters user password
    Then User clicks the login button2
    Then User clicks on the lessons button
    And  User enters a valid value in the lesson name text box
    Then User enters a valid value in the credit score text box
    Then User clicks the submit button
    Then User sees the message lesson created