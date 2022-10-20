Feature: Test the add to cart functionality

  Background: 
    Given I have launched the application
    And I entered correct username as "standard_user" and password as "secret_sauce"
    And I click on Login button

  @regression
  Scenario Outline: Adding The product to cart
    When I want to select product as "<ProductName>" to add to cart
    Then Basket item number should be 1

    Examples: 
      | ProductName             |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
