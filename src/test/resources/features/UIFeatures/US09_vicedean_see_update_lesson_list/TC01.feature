Feature: Vice Dean should be able to see the course list and make updates

  Scenario: Vice Dean should be able to see Lesson Name, Compulsory and Credit Score data

    Given User goes to the home page
    Then User clicks the login button
    Then User enters user name
    Then User enters user password
    Then User clicks the login button
    Then User clicks on the lessons button
    Then User clicks the next button below the Course List
    And  User sees the lesson added at the end of the list