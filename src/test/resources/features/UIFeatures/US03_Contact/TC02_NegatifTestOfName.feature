@US03_TC02

Feature: US03_Contact
  Scenario Outline: TC02_Name_Negatif_Test
    Given User goes to home page
    When Clicks the top ContactButon
    And Enter "<name>" in the NameBox
    And Enters email in the EmailBox
    And Enters "<subject>" in the SubjectBox
    And Enters "<message>" in the MessageBox
    And Clicks the Send SendMessageButton
    Then Verifies the invisibility of the InvalidNameMessage
    Then close driver
    Examples: Data
      | name |subject |  message     |
      |      |inform  |Hi everyone!  |