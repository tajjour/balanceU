Feature: Visit Application
  In order to view class reports
  As a guest
  I want to directly visit the application

  Scenario: Visiting the  application
    Given I am a guest
    When I follow the URL to the application
    Then I should see the application