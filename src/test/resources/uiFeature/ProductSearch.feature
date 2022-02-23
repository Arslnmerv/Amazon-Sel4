Feature: US_04 When the user searches for a product, all listed products must contain the searched word

  Scenario Outline: US_04_TC_001 When the user searches for a product, all listed products must contain the searched word
    When  User goes to url.
    Then It then enters a "<product name>" in the search box and verifies that the results contain the searched word.
    And Closes the page

    Examples:
      | product name |
      | Java         |


