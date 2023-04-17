Feature: Vice Dean should be able to see the course list and make updates

  Scenario: Vice Dean should be able to delete the course he created

    Given User goes to the home page
    Then User clicks the login button
    Then User enters user name
    Then User enters user password
    Then User clicks the login button
    Then User clicks on the lessons button
    Then User clicks the next button at the bottom of the Lesson List
    Then The user sees the lesson added at the end of the list
    And  User deletes the lesson by clicking the delete button