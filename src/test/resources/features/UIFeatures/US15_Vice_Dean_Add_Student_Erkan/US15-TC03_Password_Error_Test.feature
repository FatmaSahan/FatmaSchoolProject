@US15-TC03

  Feature: US15-TC03 Password Error Test

    Background: Vice_Dean_Login
      Given user goes to website
      Then user clicks login button on the homepage
      Then user enters vice dean username and password
      Then user clicks login button
      Then user clicks menu button
      Then user clicks Student Management button

      Scenario: Password_Error_Test
        Given user choose an advisor teacher
        Then less than eight characters are entered in the password field
        Then password error message should be displayed
        And close the browser

