@US05_TC02
Feature: Admin should be able to delete Deans

  Scenario:login in admin account
    Given user is on "managementonschoolsurl" page
    When user clicks on the Login button
    Then enters the user name as "adminUser"
    And enters the password as "password"
    And clicks on the Login button
    And user wait 2 sn

  Scenario: delete in the Dean List table
    Given user clicks on the Menu button
    When clicks on the Dean Management link
    And user wait 2 sn
    And Selects the line with the name "T18Dean02"
    And user wait 3 sn
    And user clicks the Delete button
    And user waits for the message to be displayed
    And verifies dean deleted
    And close page


