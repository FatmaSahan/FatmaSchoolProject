@US05_TC01
Feature: Admin should be able to see and delete Deans

  Scenario:login in admin account
    Given user is on "managementonschoolsurl" page
    When user clicks on the Login button
    Then enters the user name as "adminUser"
    And enters the password as "password"
    And clicks on the Login button
    And user wait 2 sn

  Scenario: User views Dean Management table
    Given user clicks on the Menu button
    When clicks on the Dean Management link
    And user wait 2 sn
    And user press page dowm key
    Then checks the Name Surname field
    And checks the Gender field
    And user wait 2 sn
    And checks the Phone Number field
    And checks the Ssn field
    And user wait 2 sn
    And checks the User Name field
    And close page