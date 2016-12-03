Feature: Class List
  As a student
  I want to view an aesthetically list of classes that have been reported on
  to know what classes are available for review

  Scenario: View the class list
    Given I am on the home page
    When I follow the URL to the class list
    Then I should see the class list