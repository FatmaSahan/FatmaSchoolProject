Feature: Vice Dean should be able to create courses

  Scenario: Credit Score should not be left blank

    Given User goes to the home page
    Then User clicks the login button
    Then User enters user name
    Then User enters user password
    Then User clicks the login button
    Then User clicks on the lessons button
    Then User enters a valid value in the lesson name text box
    Then User clicks the submit button
    Then User sees the error message