Feature: View All Orders Validations

  @order @smoke
  Scenario: View All Orders Validations positive testing
    Given the user navigate to the web orders page
    When the user provide valid username
    And the user provide valid password
    Then the user should see home page
    And the user click on View All Orders
    Then validate "List of All Orders" header is displayed