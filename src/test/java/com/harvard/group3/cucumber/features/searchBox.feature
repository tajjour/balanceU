Feature: Search Box
  As a student or teacher,
  I want to search for classes
  so I can minimize the amount of time spent finding a class in the class list.

  Scenario: Search class list by title
    Given I am on the search class page
    When Type a class title into the search box
    Then I should see the class list filtered by that title

  Scenario: Search class list by course number
    Given I am on the search class page
    When Type a course number into the search box
    Then I should see the class list filtered by that course number