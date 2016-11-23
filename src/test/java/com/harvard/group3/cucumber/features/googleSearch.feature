Feature: Google Search

  Scenario: Search for cheese!
    Given I am on the Google search page
    And I search for cheese!
    Then I should see search results for cheese!
