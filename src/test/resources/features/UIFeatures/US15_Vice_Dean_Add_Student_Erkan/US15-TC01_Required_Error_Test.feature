@US15-TC01
  Feature: US15-TC01 Required Error Test

    Background: Vice_Dean_Login
      Given user goes to website
      Then user clicks login button on the homepage
      Then user enters vice dean username and password
      Then user clicks login button
      Then user clicks menu button
      Then user clicks Student Management button

      Scenario: Required_Error_Test
        Given user choose an advisor teacher
        Then user checks all required errors out
        And close the browser

