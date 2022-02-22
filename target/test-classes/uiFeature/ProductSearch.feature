Feature: US_04 When the user searches for a product, all listed products must contain the searched word

#  Scenario: US_04_TC_001 When the user searches for a product, all listed products must contain the searched word
#    When  User goes to url.
#    Then Enters a product name in the search box.
#    Then Sees that the opened results contain the entered product name.
#    And Closes the page

  Scenario Outline: tC
    When  User goes to url.
 Then Enters a "<product name>" in the search box.
    Examples:
    |product name|
  |java |
#  |samsung |
#  |nutella |


#   And Closes the page