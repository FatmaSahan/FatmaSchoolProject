@US03_TC03

Feature: US03_Contact
  Scenario Outline: TC03_Email_Negatif_Test
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
      |email             |subject| message     |
      |fatma123gmail.com |inform |Hi everyone! |
