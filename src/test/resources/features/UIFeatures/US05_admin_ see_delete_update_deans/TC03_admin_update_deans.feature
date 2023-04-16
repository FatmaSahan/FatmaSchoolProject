@US05_TC03
Feature: Admin should be able to delete Deans

  Scenario:login in admin account
    Given user is on "managementonschoolsurl" page
    When user clicks on the Login button
    Then enters the user name as "adminUser"
    And enters the password as "password"
    And clicks on the Login button
    And user wait 2 sn

  Scenario: updates in the Dean List table
    Given user clicks on the Menu button
    When clicks on the Dean Management link
    And user wait 2 sn
    And Selects the line with the name "T18Dean03"
    And user wait 2 sn
    And user clicks the Edit button
    And user wait 2 sn
    And updates the Name field
    And user wait 2 sn
    And updates the Surname field
    And user wait 2 sn
    And updates the Gender field
    And user wait 2 sn
    And updates the Phone Number field
    And user wait 2 sn
    And updates the Ssn field
    And user wait 2 sn
    And updates the User Name field
    And user wait 2 sn
    And updates the password fied
    And user wait 2 sn
    And user clicks the submit button
    And user wait 2 sn
    And user waits for the message to be displayed
    And user wait 2 sn
    And verifies dean updated
    And user wait 2 sn
    And close page
