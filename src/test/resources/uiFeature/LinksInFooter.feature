Feature: US_07 The user must make sure that any of the links at the bottom of the homepage lead to the correct page.

  Scenario: US_07_TC_001 The user must make sure that any of the links at the bottom of the homepage lead to the correct page.
    When User goes to url.
    Then  Logs in with valid data
    Then Sees the links at the bottom of the homepage.
    Then Verifies that the links are active and point to the relevant page.
    And Closes the page