Feature: Is it Spanish?
  People want to know if it's Spanish
  Scenario: Language is not spanish
    Given I have chosen a film
    When Film is not in "Spanish"
    Then I should be told "No"
