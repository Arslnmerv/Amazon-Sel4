Feature: US_03 The user should be able to select any category from the ALL menu and see the subcategories listed.

  Scenario: US_03_TC_001 The user should be able to select any category from the ALL menu and see the subcategories listed.
    When  User goes to url.
    Then Clicks on All.
    Then Selects any category.
    Then Displays the list of subcategories belonging to the selected category.
    And Closes the page