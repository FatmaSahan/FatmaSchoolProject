@US01_TC01

Feature:
  Scenario: Register
    Given User goes to home page
    When Clicks the TopRegisterButon
    And cliks name
    And cliks page
    Then If NameRequiredText visibilities enters name in NameTextBox
    Then If SurnameRequiredText visibilities enters surname in SurNameTextBox
    Then If BirtPlaceRequiredText visibilities enters birthplace in BirtPlaceRequiredText
    Then If PhoneRequiredText visibilities enters phonenumber in PhoneBox
    And Chooses  gender
    Then If DateOfBirthRequiredText visibilities enters dateofbirth in DateOfBirthBox
    Then If SsnRequiredText visibilities enters ssn in SsnBox
    Then If UserNameRequiredText visibilities enters username in UserNameText
    Then If PasswordRequiredText visibilities enters 8 character password in PasswordBox
    And Clicks the BottomRegisterButton
    Then  Then Verifies the visibility of the GuestUserRegisteredText
    Then close driver
