@US03_TC05
  #test ran and passed

Feature: US03_Contact

  Scenario Outline: TC05-PozitifTest_With_ValidData
    Given User goes to home page
    When Clicks the top ContactButon
    And Enter name in the NameBox
    And Enters email in the EmailBox
    And Enters "<subject>" in the SubjectBox
    And Enters "<message>" in the MessageBox
    And Clicks the Send SendMessageButton
    Then Verifies the visibility of the ConfirmMessage
    Then close driver

    Examples: Data
      |subject|message|
      |inform|Hi everyone!|