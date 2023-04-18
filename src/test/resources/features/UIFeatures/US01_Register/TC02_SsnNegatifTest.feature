@US01_TC02

Feature:
  Scenario:TC02_Ssn_Negatif_Test
    Given User goes to home page
    When Clicks the TopRegisterButon
    And Enter ssn without - character in SSN field
    Then Verify visibility of  SsnWarningText
    Then close driver