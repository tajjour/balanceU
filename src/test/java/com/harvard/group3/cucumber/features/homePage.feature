Feature: Home Page
  In order to view class reports
  As a guest
  I want to directly visit the application

  Scenario: Visit the application
    When I follow the URL to the application
    Then I should see the application

  Scenario: View application welcome and instructions
    Given I am on the home page
    Then I should see the welcome and instructions
