Feature: Vice Dean should be able to create courses

  Scenario: Lesson name should not get an invalid value

    Given User goes to the home page
    Then User clicks the login button
    Then User enters user name
    Then User enters user password
    Then User clicks the login button2
    Then User clicks on the lessons button
    And  User enters an invalid value in the lessons name textbox
    Then User enters a valid value in the credit score text box
    Then User clicks the submit button
    Then User sees the error message