@US13
Feature:
  Background:login in viceAdmin account
    Given user is on "managementonschoolsurl" page
    When user clicks on the Login button
    Then enters the user name as "viceadmin"
    And enters the password as "password"
    And clicks on the Login button
    And user wait 2 sn
    And user clicks on the Menu button
    And clicks on the Teacher Management link


  Scenario: ViceDeanÖğretmenOlusturma
    And select the Choose Lessons
    And clik name
    And clik page
    Then If NameRequiredText visibilities enters name in NameTextBox
    Then If SurnameRequiredText visibilities enters surname in SurNameTextBox
    Then If BirtPlaceRequiredText visibilities enters birthplace in BirtPlaceRequiredText
    Then If PhoneRequiredText visibilities enters phonenumber in PhoneBox
    And Chooses  gender
    Then If DateOfBirthRequiredText visibilities enters dateofbirth in DateOfBirthBox
    Then If SsnRequiredText visibilities enters ssn in SsnBox
    Then If UserNameRequiredText visibilities enters username in UserNameText
    Then If PasswordRequiredText visibilities enters password in PasswordBox
    And Clicks the BottomRegisterButton
    Then  Then Verifies the visibility of the GuestUserRegisteredText




