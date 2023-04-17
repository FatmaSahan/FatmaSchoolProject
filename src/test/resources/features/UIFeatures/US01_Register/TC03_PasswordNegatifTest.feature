@US01-TC03
Feature:

  Scenario:TC03_Password_Negatif_Test
    Given User goes to home page
    When Clicks the TopRegisterButon
    And Enters yedi characters in PasswordBox
    Then Verifies visibility of  PasswordWarningText
    Then close driver
