#test ran and passed
@US03_TC04

Feature: US03_Contact

  Scenario Outline: TC04_Email_Negatif_Test
    Given User goes to home page
    When Clicks the top ContactButon
    And Enter name in the NameBox
    And Enters "<email>" in the EmailBox
    And Enters "<subject>" in the SubjectBox
    And Enters "<message>" in the MessageBox
    And Clicks the Send SendMessageButton
    Then Verifies the visibility of the  InvalidEmailMessage
    Then close driver
    Examples: Data
       |subject  |message     |
      |inform   |Hi everyone!|