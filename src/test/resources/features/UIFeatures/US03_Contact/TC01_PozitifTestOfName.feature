@US03_TC01
  #Ran and passed

Feature: US03_Contact

  Scenario Outline: TC01_Name_Pozitif_Test
    Given User goes to home page
    When Clicks the top ContactButon
    And Enters at least one character "<name>" in the NameBox
    And Enters email in the EmailBox
    And Enters "<subject>" in the SubjectBox
    And Enters "<message>" in the MessageBox
    And Clicks the Send SendMessageButton
    Then Verifies the visibility of the ConfirmMessage
    Then close driver
    Examples: Data
   |name   |subject|message|
   |a      |inform |Hi everyone!|













