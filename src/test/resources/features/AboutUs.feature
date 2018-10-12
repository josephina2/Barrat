Feature: navigate the website
  navigate the headers on the website

  Scenario: Valid AboutUs
    Given I navigate to the website
    When I click on About Us
    And I click on Who we are
    And I click on Our Brand
    And I click on geographic spread
    And I click on Our people
    And I click on our suppliers
    And I click on our partnership
    And I click on our award
    Then the page opens
    And I close