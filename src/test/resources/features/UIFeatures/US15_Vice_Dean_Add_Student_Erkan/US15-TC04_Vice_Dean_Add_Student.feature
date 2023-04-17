@US15-TC04

  Feature: US15-TC04 Vice Dean Add Student

    Background: Vice_Dean_Login
      Given user goes to website
      Then user clicks login button on the homepage
      Then user enters vice dean username and password
      Then user clicks login button
      Then user clicks menu button
      Then user clicks Student Management button

      Scenario: Vice_Dean_Add_Student
        Given user choose an advisor teacher
        Then user enters a name
        Then user enters a surname
        Then user enters a birth place
        Then user enters an email address
        Then user enters a phone number
        Then user chooses gender
        Then user enters date of birth
        Then user enters a valid SSN number
        Then user enters an username
        Then user enters a father name
        Then user enters a mother name
        Then user enters a valid password
        Then user clicks submit button
        Then user confirms that the student has been saved
        And close the browser

