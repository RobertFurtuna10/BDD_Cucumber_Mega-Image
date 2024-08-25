Feature: Search feature

  Background:
    Given I am a user on Mega Image home page
    Then I validate cookie header and click accept cookie button


  Scenario: User can search for a product
    When I enter "lapte" in the search bar
    And I press Enter in the search bar
    Then I validate I am redirected to the search results page for "lapte"

  Scenario: User searches for a non-existent product
    When I enter "xyz123223" in the search bar
    And I press Enter in the search bar
    Then I validate no results are displayed

  Scenario: User uses auto-suggestions to search
    When I enter "bisc" in the search bar
    And I select the first auto-suggestion from the list
    Then I validate I am redirected to the product details page for the selected suggestion

  Scenario: User searches and applies a filter
    When I enter "suc" in the search bar
    And I press Enter in the search bar
    And I apply the filter 'branduri proprii'
    Then I validate the search results page displays only 'Gusturi romanesti' brand products

  Scenario: User searches with mixed case input
    When I enter "CioCOlAtA" in the search bar
    And I press Enter in the search bar
    Then I validate the search results page displays products related to 'ciocolata' regardless of case