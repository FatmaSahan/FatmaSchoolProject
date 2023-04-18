@US01_TC03

Feature:
  Scenario:TC03_Password_Negatif_Test
    Given User goes to home page
    When Clicks the TopRegisterButon
    And Enters 7 characters in PasswordBox
    Then Verifies visibility of  PasswordWarningText
    Then close driver
