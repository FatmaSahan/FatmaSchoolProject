@US15-TC02

  Feature: US15-TC02 SSN Error Test

    Background: Vice_Dean_Login
      Given user goes to website
      Then user clicks login button on the homepage
      Then user enters vice dean username and password
      Then user clicks login button
      Then user clicks menu button
      Then user clicks Student Management button

      Scenario: SSN_Error_Test
        Given user choose an advisor teacher
        Then user enters an invalid number in the SSN section
        Then ssn error message should be displayed
        And close the browser

