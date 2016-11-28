Feature: University Menu

  Scenario: View university menu
    Given I am on the Class List page
    And I view the university drop-down menu
    Then I should see the list of universities that have reviews

  Scenario: Select university
    Given I am on the Class List page
    And I select Harvard University from the university drop-down menu
    Then I should see the list of reviewed Harvard University classes
