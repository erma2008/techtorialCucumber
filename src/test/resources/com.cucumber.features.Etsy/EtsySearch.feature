Feature: Validation of Search in Etsy
  Background:
    Given navigate to etsy website


  Scenario: Validation of WoodenSpoon
    Then enter in search bar "Wooden spoon"
    And click search button
    Then validate the title is "Wooden spoon | Etsy"

    Scenario: Validation of Make Up organizer
      Then enter in search bar "Make Up organizer"
      And click search button
      Then validate the title is "Make up organizer | Etsy"