Feature: Trello_testi

  Scenario: Create_attachment
    Given Send POST request for create "deneme" attachment
    Then  Assert for create attachment status code is 200
    And Assert attachment name is "deneme"
